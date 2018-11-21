package cn.yufei.ssm.system.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import cn.yufei.ssm.system.core.data.GridData;
import cn.yufei.ssm.system.exception.CustomException;
import cn.yufei.ssm.system.mapper.SysLogMapper;
import cn.yufei.ssm.system.po.SysLog;
import cn.yufei.ssm.system.po.SysLogExample;
import cn.yufei.ssm.system.po.SysLogExample.Criteria;
import cn.yufei.ssm.system.service.SysLogService;
import cn.yufei.ssm.system.utils.StringUtils;


@Service
@Scope("singleton")
public class SysLogServiceImpl implements SysLogService {
	
	@Autowired
	private SysLogMapper sysLogMapper;

	@Override
	public int addLog(SysLog log) throws Exception {
		if(log!=null)
			return sysLogMapper.insertSelective(log);
		return 0;
	}


	@Override
	public GridData findListData(String inputText, int page, int rows)
			throws Exception {
		SysLogExample logExample = new SysLogExample();
		if (!StringUtils.isEmpty(inputText)) {
			Criteria criteria = logExample.or();
			criteria.andSusernameLike("%" + inputText + "%");
			Criteria criteria1 = logExample.or();
			criteria1.andSdescriptionLike("%" + inputText + "%");
		}
		PageHelper.startPage(page, rows);
		PageHelper.orderBy("screatetime desc");
		PageInfo<SysLog> pageInfo = new PageInfo<SysLog>(sysLogMapper.selectByExample(logExample));
		GridData datagrid = new GridData(pageInfo.getTotal(),pageInfo.getList());
		return datagrid;
	}


	@Override
	public int deleteLogByID(String id) throws Exception {
		if(StringUtils.isEmpty(id)){
			throw new CustomException("authorize deleteById()---id不能为空");
		}
		String[] ids=id.split(",");
		int count=0;
		for(int i=0;i<ids.length;i++){
			count=sysLogMapper.deleteByPrimaryKey(ids[i]);
		}
		return count;
	}
		

}
