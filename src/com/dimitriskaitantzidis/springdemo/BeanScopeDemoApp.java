package com.dimitriskaitantzidis.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {
    public static void main(String[] args) {

        // Load the spring configuration file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

        // Retrieve bean from spring container
        ICoach theCoach = context.getBean("myCoach", ICoach.class);

        ICoach alphaCoach = context.getBean("myCoach", ICoach.class);

        // Check if they are the same
        boolean result = (theCoach == alphaCoach);

        // Print hte results
        System.out.println("\nPointing to the same object: " + result);

        System.out.println("\nMemory location for theCoach: " + theCoach);

        System.out.println("\nMemory location for alphaCoach: " + alphaCoach);

        // close the cntext
        context.close();

    }
}
