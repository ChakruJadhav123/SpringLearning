package com.example.autowiring.byType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("autoWiringType.xml");
        Car myCar= (Car)context.getBean("myCar");
        myCar.getDetails();

    }
}
