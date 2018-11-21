package cn.itcast.mybatis.dao;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import cn.itcast.mybatis.first.ImgUtils;
import cn.itcast.mybatis.mapper.EacodeMapper;
import cn.itcast.mybatis.mapper.PoePersoninfoMapper;
import cn.itcast.mybatis.po.Eacode;
import cn.itcast.mybatis.po.EacodeExample;

public class EacodeDaoImpl implements EacodeDao {
	
	private SqlSessionFactory sqlSessionFactory;
	
	public EacodeDaoImpl(){
		// 配置文件（SqlMapConfig.xml）
				String resource = "SqlMapConfig.xml";
				// 加载配置文件到输入 流
				InputStream inputStream = null;
				try {
					inputStream = Resources.getResourceAsStream(resource);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		        // 创建会话工厂
				sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
	}

	@Override
	public Eacode queryByCode(String code, String type) throws Exception {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		Eacode eacode=null;
		if(!ImgUtils.isEmpty(code) && !ImgUtils.isEmpty(type)){
			EacodeMapper eacodeMapper=sqlSession.getMapper(EacodeMapper.class);
			EacodeExample example=new EacodeExample();
			EacodeExample.Criteria criteria=example.createCriteria();
			criteria.andFieldEqualTo(type);
			criteria.andCodeEqualTo(code);
			List<Eacode> list=eacodeMapper.selectByExample(example);
			if(list.size()>0){
				eacode=list.get(0);
			}
			sqlSession.close();
		}
		return eacode;
	}

}
