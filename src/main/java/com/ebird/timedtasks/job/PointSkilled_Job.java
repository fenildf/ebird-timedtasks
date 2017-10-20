package com.ebird.timedtasks.job;

import java.util.Date;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.quartz.QuartzJobBean;

import com.ebird.timedtasks.service.PointDetailService;
import com.smartframe.basics.util.DateUtil;

public class PointSkilled_Job extends QuartzJobBean {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(PointSkilled_Job.class);
	
	@Autowired
	private PointDetailService pointDetailService;

	@Override
	protected void executeInternal(JobExecutionContext context)
			throws JobExecutionException {
	}
	
	public void work_1(){
		System.out.println("定时任务执行中...........");
		LOGGER.info("执行开始时间:"+DateUtil.formatAll(new Date()));
	    
		   pointDetailService.conputSkilled();
	    
	    LOGGER.info("执行结束时间:"+DateUtil.formatAll(new Date()));
	}

}
