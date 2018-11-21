package cn.yufei.ssm.system.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import cn.yufei.ssm.system.core.data.GridData;
import cn.yufei.ssm.system.core.data.SimpleData;
import cn.yufei.ssm.system.po.Items;
import cn.yufei.ssm.system.po.Vo.ItemsQueryVo;
import cn.yufei.ssm.system.service.ItemsService;

@Controller
@RequestMapping("/item")
public class ItemsController {
	// 注入service
	@Autowired
	private ItemsService itemsService;

	@RequestMapping("/queryItems")
	public ModelAndView queryItems() throws Exception {
		// ItemsQueryVo itemsQueryVo=new ItemsQueryVo();
		// ItemsCustom itemsCustom=new ItemsCustom();
		// itemsCustom.setFid("864354687465ijewr");
		// itemsQueryVo.setItemsCustom(itemsCustom);
		List<Items> list = itemsService.findItemsList(null);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("itemsList", list);
		modelAndView.setViewName("itemsList");
		return modelAndView;
	}
//
//	public ModelAndView getItems(ModelAndView modelAndView, int pageNum)
//			throws Exception {
//		int pageSize = 1;
//		PageHelper.startPage(pageNum, pageSize);// 当前页，页面大小
//		List<ItemsCustom> list = itemsService.findItemsList(null);
//		PageInfo<ItemsCustom> pageInfo = new PageInfo<ItemsCustom>(list);
//		modelAndView.addObject("listitems", list);
//		modelAndView.addObject("pageInfo", pageInfo);
//		modelAndView.setViewName("itemsListPage");
//		return modelAndView;
//	}

	@RequestMapping(value = "/queryItemPageList", method = { RequestMethod.GET,RequestMethod.POST })
	public @ResponseBody GridData getItems(ItemsQueryVo itemsQueryVo,@RequestParam(value = "page", defaultValue = "1", required = false) Integer page,@RequestParam(value = "rows", defaultValue = "20", required = false) Integer rows) throws Exception {
		GridData datagrid = itemsService.selectallList(itemsQueryVo, page, rows);
		return datagrid;
	}
	
	@RequestMapping(value = "/queryItemById", method = { RequestMethod.GET,RequestMethod.POST })
	public @ResponseBody SimpleData getItems(ItemsQueryVo itemsQueryVo) throws Exception {
		SimpleData simpleData = itemsService.findItemsById(itemsQueryVo);
		return simpleData;
	}

}
