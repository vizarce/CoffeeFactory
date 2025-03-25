package com.coffee.factory.sceduler;

import java.util.Date;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.JobKey;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.coffee.factory.serialization.ObjectsWriterReader;
import com.coffee.factory.warehouse.CaffeeWareHouse;
import com.coffee.factory.warehouse.CaffeeWareHouse.AdditionalIngredients;

public class MySerializationJobObject implements Job {
	
	private static Logger _log = LoggerFactory.getLogger(MySerializationJobObject.class);
    
    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        ObjectsWriterReader objectsWriterReader = new ObjectsWriterReader();
        CaffeeWareHouse.MainIngredients cwhMain = new CaffeeWareHouse.MainIngredients();
        CaffeeWareHouse.AdditionalIngredients cwhAdd = new AdditionalIngredients();
        CaffeeWareHouse cwhouse = new CaffeeWareHouse(cwhMain, cwhAdd); 
        objectsWriterReader.serialize(cwhouse, "cwhouse-new-scheduled.ser");
        objectsWriterReader.deSerialize("cwhouse-new-scheduled.ser");
        Date date = new Date();
        System.out.println("Job was executed successfully at " + date);
        JobKey jobKey = context.getJobDetail().getKey();
        _log.info("MySerializationJob status: " + jobKey + " executing at " + new Date());
    

    }


}