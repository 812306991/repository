package cn.itcast.mybatis.dao;

import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import cn.itcast.mybatis.mapper.PoePersoninfoMapper;
import cn.itcast.mybatis.po.PoePersoninfo;
import cn.itcast.mybatis.po.PoePersoninfoExample;

public class PoePersoninfoDaoImp implements PoePersoninfoDao {
	
	private SqlSessionFactory sqlSessionFactory;
	
	
	public  PoePersoninfoDaoImp(){
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
	public List<PoePersoninfo> queryByPersonData() throws Exception {
		// 创建SqlSession
		SqlSession sqlSession = sqlSessionFactory.openSession();
		PoePersoninfoMapper poePersoninfoMapper=sqlSession.getMapper(PoePersoninfoMapper.class);
		PoePersoninfoExample example=new PoePersoninfoExample();
		PoePersoninfoExample.Criteria criteria=example.createCriteria();
		criteria.andFTransmitEqualTo(new BigDecimal(0));
		criteria.andFphoneIsNotNull();
		List<PoePersoninfo> list=poePersoninfoMapper.selectByExampleWithBLOBs(example);
		sqlSession.close();
		return list;
	}

	@Override
	public int updatePersonData(String cardCode,PoePersoninfo poePersoninfo) throws Exception {
		// 创建SqlSession
		SqlSession sqlSession = sqlSessionFactory.openSession();
		PoePersoninfoMapper poePersoninfoMapper=sqlSession.getMapper(PoePersoninfoMapper.class);
		PoePersoninfoExample example=new PoePersoninfoExample();
		PoePersoninfoExample.Criteria criteria=example.createCriteria();
		criteria.andFcardcodeEqualTo(cardCode);
		int count=poePersoninfoMapper.updateByExampleSelective(poePersoninfo, example);
		sqlSession.commit();
		sqlSession.close();
		return count;
	}

}
