package com.te.springcore.module1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.te.springcore.module1.beans.Student;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext  applicationContext= new ClassPathXmlApplicationContext("beans.xml");
        Student bean =(Student) applicationContext.getBean("student");
        System.out.println("->" +bean);
    }
}