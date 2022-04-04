package com.te.springcore.module1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.te.springcore.module1.beans.Student;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext  applicationContext= new ClassPathXmlApplicationContext("beans.xml");
        Student bean =(Student) applicationContext.getBean("student01");
        Student bean1 =(Student) applicationContext.getBean("student01");
        Student bean2 =(Student) applicationContext.getBean("student01");
        Student bean3 =(Student) applicationContext.getBean("student01");
        System.out.println("->" +bean.hashCode());
        System.out.println("->" +bean1.hashCode());
        System.out.println("->" +bean2.hashCode());
        System.out.println("->" +bean3.hashCode());
    }
}
