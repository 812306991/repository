package cn.yufei.ssm.system.mapper;

import java.util.List;

import cn.yufei.ssm.system.po.Items;
import cn.yufei.ssm.system.po.Vo.ItemsQueryVo;

public interface ItemsOMapper {

	public List<Items> findItemsList(ItemsQueryVo itemsQueryVo) throws Exception;
	
	public Items findItemsById(ItemsQueryVo itemsQueryVo) throws Exception; 
	            
	
}
