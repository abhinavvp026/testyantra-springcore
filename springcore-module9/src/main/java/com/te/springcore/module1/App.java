package com.te.springcore.module1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.te.springcore.module1.beans.Student;
import com.te.springcore.module1.config.Config;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext  applicationContext= new AnnotationConfigApplicationContext(Config.class);
        Student bean =(Student) applicationContext.getBean("student");
        System.out.println("->" +bean);
    }
}
