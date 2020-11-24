package com.dubbo.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String [] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring.xml");
        User user = context.getBean("user",User.class);
        System.out.println(user);
    }
}
