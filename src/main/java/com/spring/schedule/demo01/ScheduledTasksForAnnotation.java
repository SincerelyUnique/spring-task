package com.spring.schedule.demo01;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
@EnableScheduling
public class ScheduledTasksForAnnotation {

    private static final Logger log = LoggerFactory.getLogger(ScheduledTasksForAnnotation.class);

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    //每隔5s执行一次
    @Scheduled(fixedRate = 3000)
    //每天12点 24点执行
    //@Scheduled(cron = "0 0 12,0 * * ?")
    public void reportCurrentTime() {
        System.out.println("日志打印时间（Spring注解实现）："+dateFormat.format(new Date()));
    }

}
