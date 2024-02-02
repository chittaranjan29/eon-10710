package com.test.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext ioc=new ClassPathXmlApplicationContext("metadata.xml");
       
       System.out.println(ioc.getBean("student1"));
       System.out.println(ioc.getBean("student2"));
    
    }
}
