package com.hakimov.nadno;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                PersonConfig.class
        );



        Person person1 = context.getBean("spongeBob", Person.class);
//        Person person2 = context.getBean("Patrick", Person.class);
//        Person person3 = context.getBean("Squidward", Person.class);
//
        System.out.println(person1);
//        System.out.println(person2);
//        System.out.println(person3);

        context.close();

    }
}
