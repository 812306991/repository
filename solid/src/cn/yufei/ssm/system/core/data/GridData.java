package cn.yufei.ssm.system.core.data;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.github.pagehelper.Page;

import cn.yufei.ssm.system.dal.object.Entity;

/**
 * 返回列表结果
 */
public class GridData implements Entity{
	
	private static final long serialVersionUID = 1L;

	private Logger log=Logger.getLogger(GridData.class);
	
	private long total;  
    private List rows = new ArrayList<>();  
    
    public GridData() {  
        super();  
    }  
    
    public GridData(long total, List rows) {  
        super();  
        this.total = total;  
        this.rows = rows;  
    }  

	public long getTotal() {
		return total;
	}

	public void setTotal(long total) {
		this.total = total;
	}

	public List getRows() {
		return rows;
	}

	public void setRows(List rows) {
		this.rows = rows;
	}

}
