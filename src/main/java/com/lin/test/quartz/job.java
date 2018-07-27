package com.lin.test.quartz;

import org.quartz.*;

import java.text.SimpleDateFormat;
import java.util.Date;

public class job implements Job {
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
           Date d=new Date();
        SimpleDateFormat sf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(sf.format(d));
        Trigger t=jobExecutionContext.getTrigger();
        System.out.println(sf.format(t.getStartTime()));
        JobKey key=t.getJobKey();
        System.out.println(key.getGroup()+ key.getGroup());
    }
}
