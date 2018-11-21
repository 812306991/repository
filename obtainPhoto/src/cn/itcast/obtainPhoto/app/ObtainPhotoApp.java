package cn.itcast.obtainPhoto.app;

import java.util.Timer;
import java.util.TimerTask;

import org.apache.log4j.Logger;

import cn.itcast.obtainPhoto.Utils.PropertyUtil;
import cn.itcast.obtainPhoto.service.PhotoService;
import cn.itcast.obtainPhoto.service.impl.PhotoServiceImpl;

public class ObtainPhotoApp {
	
	private static final Logger logger = Logger.getLogger(ObtainPhotoApp.class);
	
	public static void main(String[] args) throws Exception {
		run();
	}
	
	public static void run() {
		int taskTime=Integer.parseInt(PropertyUtil.getProperty("obtainPhoto.taskTime"));
		if(taskTime>0){
			Timer timer = new Timer();
			timer.schedule(new TimerTask() {
				@Override
				public void run() {
					PhotoService photoService=new PhotoServiceImpl();
					//开始执行
					photoService.selectByExampleWithBLOBs();
				}
			}, taskTime, 10000);
		}else{
			logger.error("定时任务执行时间未设置");
		}
	}

}
