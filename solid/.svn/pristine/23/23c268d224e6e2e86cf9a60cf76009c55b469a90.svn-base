package cn.yufei.ssm.system.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.yufei.ssm.system.core.data.SimpleData;
import cn.yufei.ssm.system.exception.CustomException;
import cn.yufei.ssm.system.mapper.CommonMapper;
import cn.yufei.ssm.system.po.Common;
import cn.yufei.ssm.system.service.CommonService;
import cn.yufei.ssm.system.utils.FunctionTreeUtils;
import cn.yufei.ssm.system.utils.StringUtils;
import cn.yufei.ssm.system.utils.Tools;

@Service
public class CommonServiceImpl implements CommonService{
	
	@Autowired
	private CommonMapper commonMapper;

	@Override
	public SimpleData getCurrentDateTime(String flag) throws Exception {
		SimpleData simpleData=new SimpleData(commonMapper.getCurrentDateTime(flag));
		return simpleData;
	}

	@Override
	public SimpleData getCurrentDate(String flag) throws Exception {
		SimpleData simpleData=new SimpleData(commonMapper.getCurrentDateTime(flag));
		return simpleData;
	}

	@Override
	public SimpleData getUuid() {
		Common common=new Common();
		common.setUuid(Tools.getID());
		SimpleData simpleData=new SimpleData(common);
		return simpleData;
	}

	@Override
	public SimpleData getRandomNumber() {
		Common common=new Common();
		common.setRandomNumber(Tools.getRandomNumber());
		SimpleData simpleData=new SimpleData(common);
		return simpleData;
	}

	@Override
	public String getFunTreeStr() throws Exception {
		FunctionTreeUtils funTree=new FunctionTreeUtils();
		String treeStr=funTree.initFunctionTree("WEB-INF/fun_tree/");
		if(StringUtils.isEmpty(treeStr)){
			throw new CustomException("getFunTreeStr()---功能树为空");
		}
		return treeStr;
	}

}
