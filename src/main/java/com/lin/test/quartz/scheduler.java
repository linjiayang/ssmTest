package com.lin.test.quartz;

import org.junit.Test;
import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;

import java.text.SimpleDateFormat;
import java.util.Date;


public class scheduler {
    @Test
    public  void test() throws SchedulerException, InterruptedException {
        Date d=new Date();
        SimpleDateFormat sfe=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(sfe.format(d));
        JobDetail jobDetail=JobBuilder.newJob(job.class).withIdentity("myJob","group1").build();
        d.setTime(d.getTime()+3000);
        Date end=new Date();
        end.setTime(end.getTime()+6000);
        CronTrigger trigger=(CronTrigger) TriggerBuilder.newTrigger().withIdentity("myTrigger","group1").startAt(d).endAt(end).
                withSchedule(
                        CronScheduleBuilder.cronSchedule("* * * * * ?")
                ).build();
        SchedulerFactory sf=new StdSchedulerFactory();
        Scheduler scheduler=sf.getScheduler();
        scheduler.start();
        System.out.println(scheduler.scheduleJob(jobDetail,trigger));
        Thread.sleep(1000
        );
        scheduler.standby();

       Thread.sleep(1000);
       scheduler.start();
    }
}
