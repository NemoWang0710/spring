package com.wangkaijun;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Object person = context.getBean("person");
        Object person2 = context.getBean("humn");
        Object person3 = context.getBean("star");
        System.out.println(ToStringBuilder.reflectionToString(person));
        System.out.println(ToStringBuilder.reflectionToString(person2));
        System.out.println(ToStringBuilder.reflectionToString(person3));
    }

}
