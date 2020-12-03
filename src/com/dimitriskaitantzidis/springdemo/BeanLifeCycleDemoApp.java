package com.dimitriskaitantzidis.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {
    public static void main(String[] args) {

        // Load the spring configuration file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");

        // Retrieve bean from spring container
        ICoach theCoach = context.getBean("myCoach", ICoach.class);

        System.out.println(theCoach.getDailyWorkout());

        // close the context
        context.close();

    }
}
