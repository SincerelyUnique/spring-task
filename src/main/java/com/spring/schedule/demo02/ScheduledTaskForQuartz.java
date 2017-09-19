package com.spring.schedule.demo02;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class ScheduledTaskForQuartz {

    private static final Logger log = LoggerFactory.getLogger(ScheduledTaskForQuartz.class);

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    public void reportCurrentTime() {
        System.out.println("日志打印时间："+dateFormat.format(new Date()));
    }

}
