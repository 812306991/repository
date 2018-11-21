package cn.itcast.mybatis.first;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;











import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import cn.itcast.mybatis.dao.EacodeDao;
import cn.itcast.mybatis.dao.EacodeDaoImpl;
import cn.itcast.mybatis.dao.PoePersoninfoDao;
import cn.itcast.mybatis.dao.PoePersoninfoDaoImp;
import cn.itcast.mybatis.po.Conservation;
import cn.itcast.mybatis.po.Eacode;
import cn.itcast.mybatis.po.PoePersoninfo;
import cn.itcast.mybatis.first.ImgUtils;

public class Pmain {

	public static void main(String[] args) throws Exception {
		timer();
	}
	
	public static void timer() {
		Timer timer = new Timer();
		timer.schedule(new TimerTask() {
			public void run() {
				PoePersoninfoDao dao=new PoePersoninfoDaoImp();
				List<PoePersoninfo> list;
				System.out.println("-------------【娱乐场所从业人员信息补全服务】-----------");
				try {
					list = dao.queryByPersonData();
					for(int i=0;i<list.size();i++){
						PoePersoninfo po=list.get(i);
						//byte[] data=po.getFphoto();
						String cardCode=po.getFcardcode(); 
						//获取常口信息
						if(!ImgUtils.isEmpty(cardCode)){
//							InputStream in=new ByteArrayInputStream(data);
//							String base64Str=ImgUtils.generateImageBase64Str(in);
							//调用数据补全服务
							SAXReader reader = new SAXReader();
							Document document = reader.read(new File(Pmain.class.getResource("").getFile() + "\\config.xml"));
							Element aynPath = (Element) document.selectSingleNode("/root/aynPath");
							String url=aynPath.getTextTrim();
							String param="{\"sfzh\":\""+cardCode+"\"}";
							String result=HttpClientBuilder.restFullPost(url, param);
							if(!ImgUtils.isEmpty(result)){
								ObjectMapper mapper=new ObjectMapper();
								mapper.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);
								Conservation conservateion=mapper.readValue(result, Conservation.class);
								EacodeDao eacode=new EacodeDaoImpl();
								//名族
								Eacode mz=eacode.queryByCode(conservateion.getMz(), "NATION");
								PoePersoninfo poePersoninfo=new PoePersoninfo();
								poePersoninfo.setFcardcode(cardCode);
								poePersoninfo.setFname(conservateion.getXm());
								poePersoninfo.setFsex(conservateion.getXb().equals("1")?"男":"女");
								poePersoninfo.setFaddress(conservateion.getZzxz());
								String csrq=conservateion.getCsrq().substring(0,4)+"-"+conservateion.getCsrq().substring(4,6)+"-"+conservateion.getCsrq().substring(6,8);
								//出生日期
								SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd");
								Date csrqDat=df.parse(csrq);
								poePersoninfo.setFbrithdate(csrqDat);
								if(conservateion.getSg()!=null){
									poePersoninfo.setFstature(new BigDecimal(conservateion.getSg()));
								}
								//国际
								poePersoninfo.setFnationality(conservateion.getJggj());
								poePersoninfo.setFnation(mz.getCodedesc());
								poePersoninfo.setFadministrative(conservateion.getHkszd());
								poePersoninfo.setFmarriage(conservateion.getHyzk());
								poePersoninfo.setFphoto(ImgUtils.generateBase64Byte(conservateion.getXp()));
								poePersoninfo.setfTransmit(new BigDecimal(1));
								//更新补全后的数据
								int count=dao.updatePersonData(cardCode, poePersoninfo);
								System.out.println("~~~~~~身份证号【"+cardCode+"】信息补全~~~~~~~");
							}
							
						}
					}
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}, 2000, 10000);
	}

}
