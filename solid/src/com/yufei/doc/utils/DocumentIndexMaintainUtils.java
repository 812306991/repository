package com.yufei.doc.utils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.lucene.document.Document;
import org.apache.lucene.document.Field;
import org.apache.lucene.document.StoredField;
import org.apache.lucene.document.StringField;
import org.apache.lucene.document.TextField;
import org.apache.lucene.document.Field.Store;
import org.apache.lucene.index.DirectoryReader;
import org.apache.lucene.index.IndexReader;
import org.apache.lucene.index.IndexWriter;
import org.apache.lucene.index.IndexWriterConfig;
import org.apache.lucene.index.Term;
import org.apache.lucene.queryparser.classic.ParseException;
import org.apache.lucene.queryparser.classic.QueryParser;
import org.apache.lucene.search.IndexSearcher;
import org.apache.lucene.search.Query;
import org.apache.lucene.search.ScoreDoc;
import org.apache.lucene.search.TermQuery;
import org.apache.lucene.search.TopDocs;
import org.apache.lucene.store.Directory;
import org.apache.lucene.store.FSDirectory;
import org.wltea.analyzer.lucene.IKAnalyzer;

import com.yufei.doc.common.FileTypeCommon;
import com.yufei.doc.utils.ReadFileUtils;

import cn.yufei.ssm.system.utils.ContextUtils;
import cn.yufei.ssm.system.utils.Tools;

public class DocumentIndexMaintainUtils {
	
	
	
	private static IndexWriter getIndexWriter(){
		// 指定索引库存放的位置
		String indexPath = ContextUtils.getProperty("fileIndex");
		Directory directory;
		IndexWriter writer = null;
		try {
			// 将索引存放硬盘中
			directory = FSDirectory.open(Paths.get(indexPath));
			IKAnalyzer analyzer = new IKAnalyzer();
			IndexWriterConfig config = new IndexWriterConfig(analyzer);
			// 创建indexwriter对象
			writer = new IndexWriter(directory, config);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return writer;
	}
	
	// 合并索引文件
	public static void mergeIndexFile() {
		// 指定索引库存放的位置
		String indexPath = ContextUtils.getProperty("fileIndex");
		Directory directory = null;
		IndexWriter writer = null;
		try {
			// 将索引存放硬盘中
			directory = FSDirectory.open(Paths.get(indexPath));
			IKAnalyzer analyzer = new IKAnalyzer();
			IndexWriterConfig config = new IndexWriterConfig(analyzer);
			// 创建indexwriter对象
			writer = new IndexWriter(directory, config);
			writer.addIndexes(directory);
			writer.commit();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				writer.close();
				directory.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}
	
	/**
	 * 向索引库中添加一个document
	 * <p>Title: addOneDocument</p>
	 * <p>Description: </p>
	 * @throws IOException 
	 */
	public static String addOneDocument(File file) throws IOException{
		IndexWriter indexWriter=getIndexWriter();
		String docId=Tools.getID();
		if(indexWriter!=null){
			//文件内容
			String contentString="";
			//创建Document对象
			Document document = new Document();
			String fileType=file.getName().substring(file.getName().lastIndexOf(FileTypeCommon.POINT)+1);
			if(FileTypeCommon.DOCUMENT_Txt.equals(fileType)){
				contentString= ReadFileUtils.readTxt(file);
			}
			if(FileTypeCommon.OFFICE_WORD_2003.equals(fileType)){
				contentString=ReadFileUtils.readDoc(file);
			}
			if(FileTypeCommon.OFFICE_WORD_2007.equals(fileType)){
				contentString=ReadFileUtils.readDocx(file.getPath());
			}
			if(FileTypeCommon.DOCUMENT_PDF.equals(fileType)){
				contentString=ReadFileUtils.readPdf(file);
			}
			if(FileTypeCommon.OFFICE_EXCEL_2003.equals(fileType)){
				contentString=ReadFileUtils.readXls(file);
			}
			if(FileTypeCommon.OFFICE_EXCEL_2007.equals(fileType)){
				contentString=ReadFileUtils.readXlsx(file);
			}
			Field fieldName = new TextField("filename", file.getName(), Store.YES);
			Field fieldContent = new TextField("content", contentString, Store.YES);
			//文件路径
			Field fieldPath = new StoredField("path", file.getPath());
			//文件id唯一标识
			Field fileId=new StringField("fileid", docId,  Store.YES);
			document.add(fieldName);
			document.add(fieldContent);
			document.add(fieldPath);
			document.add(fileId);
			//把Document写入索引库
			indexWriter.addDocument(document);
			indexWriter.close();
		}
		return null;
	}
	
	/**
	 * 删除所有文档
	 * <p>Title: removeAllIndex</p>
	 * <p>Description: </p>
	 * @throws IOException 
	 */
	
	 public static void removeAllIndex() throws IOException{
		 IndexWriter indexWriter=getIndexWriter();
		 indexWriter.deleteAll();
		 indexWriter.commit();
		 indexWriter.close();
	 }
	 
	//更新索引
	 public static String updateIndex(String docId,File file) throws IOException{
		 //先删除后插入
		String deleteDocID=removeByIdIndex(docId);
		String newDocID=addOneDocument(file);
		return newDocID;
	 }
	 
	 /**
	  * 删除指定文档
	  * <p>Title: deleteIndex</p>
	  * <p>Description: </p>
	  * @throws IOException 
	  */
	 public static String removeByIdIndex(String docId) throws IOException{
		 IndexWriter indexWriter=getIndexWriter();
		 //创建一个查询
		 Query query=new TermQuery(new Term("fileid",docId));
		 indexWriter.deleteDocuments(query);
		 indexWriter.commit();
		 indexWriter.close();
		 return docId;
	 }
	 
	 
	 
	 //根据输入内容实现全文检索
	 public static List completeSearch(String inputText) throws IOException, ParseException{
		 List list=new ArrayList();
		 String indexPath = ContextUtils.getProperty("fileIndex");
		 Directory directory = FSDirectory.open(Paths.get(indexPath));
		 //创建reader
		 IndexReader indexReader=DirectoryReader.open(directory);
		 IKAnalyzer analyzer = new IKAnalyzer();
		 QueryParser parser=new QueryParser("content",analyzer);
		 Query query=parser.parse(inputText);
		 //使用indexsearcher查询
		 IndexSearcher indexSearcher=new IndexSearcher(indexReader);
		//创建一个查询
		//执行查询,最大返回100条记录
		 TopDocs topDocs=indexSearcher.search(query,100);
		 Map<String,String> map=new HashMap<String,String>();
		 if(topDocs.totalHits>0){
			for(ScoreDoc scoreDoc:topDocs.scoreDocs){
					Document document=indexSearcher.doc(scoreDoc.doc);
					map.put("fileid", document.get("fileid"));
					map.put("filename",document.get("filename"));
					map.put("content",document.get("content"));
					map.put("path",document.get("path"));
					list.add(map);
				}
		 }else{
			 QueryParser parser1=new QueryParser("filename",analyzer);
			 Query query1=parser.parse(inputText);
			 //使用indexsearcher查询
			 IndexSearcher indexSearche1r=new IndexSearcher(indexReader);
			//创建一个查询
			//执行查询,最大返回100条记录
			 TopDocs topDocs1=indexSearcher.search(query1,100);
			 Map<String,String> map1=new HashMap<String,String>();
			 if(topDocs1.totalHits>0){
				 for(ScoreDoc scoreDoc:topDocs1.scoreDocs){
						Document document=indexSearcher.doc(scoreDoc.doc);
						map.put("fileid", document.get("fileid"));
						map.put("filename",document.get("filename"));
						map.put("content",document.get("content"));
						map.put("path",document.get("path"));
						list.add(map);
					}
			 }
		 }
		indexReader.close();
		return list;	
	 }
	
	
}
