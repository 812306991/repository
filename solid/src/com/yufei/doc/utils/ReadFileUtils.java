package com.yufei.doc.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedList;
import java.util.List;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.util.PDFTextStripper;
import org.apache.poi.POIXMLDocument;
import org.apache.poi.POIXMLTextExtractor;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hwpf.extractor.WordExtractor;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xwpf.extractor.XWPFWordExtractor;
import org.apache.poi.xwpf.usermodel.XWPFDocument;

public class ReadFileUtils {

	// 读取文本文件
	public static String readTxt(File file) {
		String result = "";
		try {
			// 构造一个bufferedReader类来读取文件
			BufferedReader br = new BufferedReader(new FileReader(file));
			String s = null;
			while ((s = br.readLine()) != null) {
				// 使用readLine,一次读一行
				result = result + "\n" + s;
			}
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
     
 //读取word2003	
	public static String readDoc(File file) {
		String result = "";
		try {
			FileInputStream fis = new FileInputStream(file);
			WordExtractor wordExtractor = new WordExtractor(fis);
			result = wordExtractor.getText();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
   //读取word2007...
	public static String readDocx(String filePath) {
		String result = "";
		try {
			OPCPackage op = POIXMLDocument.openPackage(filePath);
			XWPFDocument xwpf = new XWPFDocument(op);
			POIXMLTextExtractor ex = new XWPFWordExtractor(xwpf);
			result = ex.getText();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;

	}

	// 读取pdf文件
	public static String readPdf(File file) {
		String result = "";
		PDDocument document = null;
		try {
			document = PDDocument.load(file);
			// 获取页码
			int page = document.getNumberOfPages();
			// 读取文本内容
			PDFTextStripper stripper = new PDFTextStripper();
			// 设置按顺序输出
			stripper.setSortByPosition(true);
			stripper.setStartPage(1);
			stripper.setEndPage(page);
			result = stripper.getText(document);
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			if(document!=null){
				try {
					document.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return result;
	}
 
	//读取excel2003
	public static String readXls(File file) {
		String result = "";
		try {
			InputStream is = new FileInputStream(file);
			HSSFWorkbook hssfWorkbook = new HSSFWorkbook(is);
			StringBuilder sb = new StringBuilder();
			for (int numSheet = 0; numSheet < hssfWorkbook.getNumberOfSheets(); numSheet++) {
				HSSFSheet hssfSheet = hssfWorkbook.getSheetAt(numSheet);
				if (hssfSheet == null) {
					continue;
				}
				for (int rowNum = 1; rowNum <= hssfSheet.getLastRowNum(); rowNum++) {
					HSSFRow hssfRow = hssfSheet.getRow(rowNum);
					if (hssfRow == null) {
						continue;
					}
					for (int i = 0; i < hssfRow.getLastCellNum(); i++) {
						HSSFCell cell = hssfRow.getCell(i);
						if (cell != null) {
							sb.append(cell.toString());
						}
					}
				}
			}
			result += sb.toString();
			is.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	 
	public static List<Object> readXlsList(File file) {
		List<Object> list = null;
		try {
			InputStream is = new FileInputStream(file);
			HSSFWorkbook hssfWorkbook = new HSSFWorkbook(is);
			Object value = null;
			list = new LinkedList<Object>();
			for (int numSheet = 0; numSheet < hssfWorkbook.getNumberOfSheets(); numSheet++) {
				HSSFSheet hssfSheet = hssfWorkbook.getSheetAt(numSheet);
				if (hssfSheet == null) {
					continue;
				}
				for (int rowNum = 1; rowNum <= hssfSheet.getLastRowNum(); rowNum++) {
					HSSFRow hssfRow = hssfSheet.getRow(rowNum);
					if (hssfRow == null) {
						continue;
					}
					for (int k = 0; k < hssfRow.getLastCellNum(); k++) {
						HSSFCell cell = hssfRow.getCell(k);
						if (cell == null) {
							continue;
						}
						switch (cell.getCellType()) {
						case XSSFCell.CELL_TYPE_STRING:
							value = cell.getStringCellValue();
							break;
						case XSSFCell.CELL_TYPE_NUMERIC:
							value = cell.getNumericCellValue();
							break;
						case XSSFCell.CELL_TYPE_BOOLEAN:
							value = cell.getBooleanCellValue();
							break;
						default:
							value = cell.toString();
						}
						list.add(value);
					}
				}
			}
			is.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
  //读取excel2007....
	public static String readXlsx(File file) {
		String result = "";
		try {
			InputStream is = new FileInputStream(file);
			XSSFWorkbook xssfWorkbook = new XSSFWorkbook(is);
			StringBuilder sb = new StringBuilder();
			for (int numSheet = 0; numSheet < xssfWorkbook.getNumberOfSheets(); numSheet++) {
				XSSFSheet xssfSheet = xssfWorkbook.getSheetAt(numSheet);
				if (xssfSheet == null) {
					continue;
				}
				for (int rowNum = 1; rowNum <= xssfSheet.getLastRowNum(); rowNum++) {
					XSSFRow xssfRow = xssfSheet.getRow(rowNum);
					if (xssfRow == null) {
						continue;
					}
					for (int k = 0; k < xssfRow.getLastCellNum(); k++) {
						XSSFCell cell = xssfRow.getCell(k);
						if (cell != null) {
							sb.append(cell.toString());
						}
					}
				}
			}
			result += sb.toString();
			is.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	public static List<Object> readXlsxList(File file) {
		List<Object> list = null;
		try {
			InputStream is = new FileInputStream(file);
			XSSFWorkbook xssfWorkbook = new XSSFWorkbook(is);
			Object value = null;
			list = new LinkedList<Object>();
			for (int numSheet = 0; numSheet < xssfWorkbook.getNumberOfSheets(); numSheet++) {
				XSSFSheet xssfSheet = xssfWorkbook.getSheetAt(numSheet);
				if (xssfSheet == null) {
					continue;
				}
				for (int rowNum = 1; rowNum <= xssfSheet.getLastRowNum(); rowNum++) {
					XSSFRow xssfRow = xssfSheet.getRow(rowNum);
					if (xssfRow == null) {
						continue;
					}
					for (int k = 0; k < xssfRow.getLastCellNum(); k++) {
						XSSFCell cell = xssfRow.getCell(k);
						if (cell == null) {
							continue;
						}
						switch (cell.getCellType()) {
						case XSSFCell.CELL_TYPE_STRING:
							value = cell.getStringCellValue();
							break;
						case XSSFCell.CELL_TYPE_NUMERIC:
							value = cell.getNumericCellValue();
							break;
						case XSSFCell.CELL_TYPE_BOOLEAN:
							value = cell.getBooleanCellValue();
							break;
						default:
							value = cell.toString();
						}
						list.add(value);
					}
				}
			}
			is.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

}
