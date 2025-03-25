package com.coffee.factory.sceduler;


import static org.quartz.CronScheduleBuilder.cronSchedule;
import static org.quartz.JobBuilder.newJob;
import static org.quartz.TriggerBuilder.newTrigger;

import org.quartz.Trigger;
import org.quartz.impl.StdSchedulerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;

import org.quartz.CronTrigger;
import org.quartz.DateBuilder;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.SchedulerException;
import org.quartz.Scheduler;
import org.quartz.SchedulerFactory;
import org.quartz.SchedulerMetaData;

public class CronTriggerExample {
    
	public final static Logger log = LoggerFactory.getLogger(CronTriggerExample.class);
    public void run() throws Exception {
    	//Logger log = LoggerFactory.getLogger(CronTriggerExample.class);
    	
    	log.info("------- Initializing -------------------");
    	
    	// First we must get a reference to a scheduler
        SchedulerFactory schedulerFactory = new StdSchedulerFactory();
        Scheduler scheduler = schedulerFactory.getScheduler();
        
        log.info("------- Initialization Complete --------");

        log.info("------- Scheduling Jobs ----------------");
        
        // jobs can be scheduled before sched.start() has been called

        // job 1 will run every 20 seconds
        JobDetail jobDetail = JobBuilder.newJob(MySerializationJobObject.class)
        		.withIdentity("mySerializationJob1", "group1")
        		.build();
        //Date startTime = todayAt(17, 42, 0);
        /*Trigger trigger = TriggerBuilder
        		.newTrigger()
        		.withIdentity("CronTriger")
        		.withSchedule(SimpleScheduleBuilder.simpleSchedule().withIntervalInSeconds(02).repeatForever())
        		.build();*/
        /*Trigger trigger = newTrigger()
                .withIdentity("myTrigger", "group1")
                .startAt(startTime)
                .withSchedule(cronSchedule("0/5 * * * * ?"))
                .build();*/
        CronTrigger trigger = newTrigger()
        		.withIdentity("trigger1", "group1")
        		.withSchedule(cronSchedule("0/20 * * * * ?"))
        		.build();
        
        
        Date ft = scheduler.scheduleJob(jobDetail, trigger);
        log.info(jobDetail.getKey() + " has been scheduled to run at: " + ft + " and repeat based on expression: "
                 + trigger.getCronExpression());
        
        
        // job 2 will run every minute (at 15 seconds past the minute)
        jobDetail = newJob(MySerializationJobObject.class)
        		.withIdentity("job2", "group1")
        		.build();

        trigger = newTrigger()
        		.withIdentity("trigger2", "group1")
        		.withSchedule(cronSchedule("15 0/1 * * * ?"))
        		.build();

        ft = scheduler.scheduleJob(jobDetail, trigger);
        log.info(jobDetail.getKey() + " has been scheduled to run at: " + ft + " and repeat based on expression: "
                 + trigger.getCronExpression());
        
        // job 3 will run every other minute on 45 second
        jobDetail = newJob(MySerializationJobObject.class)
        		.withIdentity("job3", "group1")
        		.build();

        trigger = newTrigger()
        		.withIdentity("trigger3", "group1")
        		.withSchedule(cronSchedule("0/45 * * * * ?"))
        		.build();

        ft = scheduler.scheduleJob(jobDetail, trigger);
        log.info(jobDetail.getKey() + " has been scheduled to run at: " + ft + " and repeat based on expression: "
                 + trigger.getCronExpression());
        
        log.info("------- Starting Scheduler ----------------");

        // All of the jobs have been added to the scheduler, but none of the
        // jobs
        // will run until the scheduler has been started
        scheduler.start();

        log.info("------- Started Scheduler -----------------");

        log.info("------- Waiting five minutes... ------------");
        
        SchedulerMetaData metaData = scheduler.getMetaData();
        log.info("Executed " + metaData.getNumberOfJobsExecuted() + " jobs.");
    

    }
    
    public static Date todayAt(int hour, int minute, int second) {
        return DateBuilder.todayAt(hour, minute, second);
    }
    
    public static void main(String[] args) throws Exception {

        CronTriggerExample example = new CronTriggerExample();
        example.run();
      }


}