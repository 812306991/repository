package cn.yufei.ssm.system.po.Vo;

import cn.yufei.ssm.system.po.SysBasecode;

public class SysBasecodeVo extends SysBasecode{
	
	private static final long serialVersionUID = 1L;
	private String dataFlag;//数据状态标识

	public String getDataFlag() {
		return dataFlag;
	}

	public void setDataFlag(String dataFlag) {
		this.dataFlag = dataFlag;
	}
}
