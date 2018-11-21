package cn.yufei.ssm.system.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import cn.yufei.ssm.system.core.data.GridData;
import cn.yufei.ssm.system.core.data.SimpleData;
import cn.yufei.ssm.system.mapper.ItemsOMapper;
import cn.yufei.ssm.system.po.Items;
import cn.yufei.ssm.system.po.Vo.ItemsQueryVo;
import cn.yufei.ssm.system.service.ItemsService;

@Service
public class ItemsServiceImpl implements ItemsService {

	// 注入mapper
	@Autowired
	private ItemsOMapper itemsMapper;

	@Override
	public List<Items> findItemsList(ItemsQueryVo itemsQueryVo)
			throws Exception {
		return itemsMapper.findItemsList(itemsQueryVo);
	}

	@Override
	public GridData selectallList(ItemsQueryVo itemsQueryVo, int page,
			int rows) throws Exception {
		PageHelper.startPage(page, rows);
		PageHelper.orderBy("fcreatetime desc");
		PageInfo<Items> pageInfo = new PageInfo<Items>(itemsMapper.findItemsList(itemsQueryVo));
		GridData datagrid = new GridData(pageInfo.getTotal(),pageInfo.getList());
		return datagrid;
	}

	@Override
	public SimpleData findItemsById(ItemsQueryVo itemsQueryVo) throws Exception {
		Items items=itemsMapper.findItemsById(itemsQueryVo);
		SimpleData simpleData=new SimpleData(items);
		return simpleData;
	}

}
