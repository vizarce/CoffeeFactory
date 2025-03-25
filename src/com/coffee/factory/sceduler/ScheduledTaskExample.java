package com.coffee.factory.sceduler;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

import com.coffee.factory.serialization.ObjectsWriterReader;
import com.coffee.factory.warehouse.CaffeeWareHouse;
import com.coffee.factory.warehouse.CaffeeWareHouse.AdditionalIngredients;

public class ScheduledTaskExample {

   public static void main(String[] args) {

      Timer timer = new Timer();

      // Create a task to be scheduled
      TimerTask task = new TimerTask() {
         public void run() {
            System.out.println("Scheduled task is running...");
            ObjectsWriterReader objectsWriterReader = new ObjectsWriterReader();
            CaffeeWareHouse.MainIngredients cwhMain = new CaffeeWareHouse.MainIngredients();
            CaffeeWareHouse.AdditionalIngredients cwhAdd = new AdditionalIngredients();
            CaffeeWareHouse cwhouse = new CaffeeWareHouse(cwhMain, cwhAdd); 
            objectsWriterReader.serialize(cwhouse, "cwhouse-new.ser");
            Date date = new Date();
            System.out.println("Job was executed successfully at " + date);
            //CaffeeWareHouse cwhouse01 = (CaffeeWareHouse) 
            objectsWriterReader.deSerialize("cwhouse-new.ser");
            //System.out.println(cwhouse01);
         }
      };

      // Schedule the task to run after a delay of 5 seconds
      //timer.schedule(task, 5000);

      // Schedule the task to run repeatedly after an interval of 10 seconds
      timer.schedule(task, 10000, 10000);
   }
}