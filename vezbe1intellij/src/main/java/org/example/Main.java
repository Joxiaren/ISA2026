package org.example;

import org.example.service.RacunService;
import org.example.view.RacunView;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//        RacunRepository racunRepository = context.getBean("racunRepository", RacunRepository.class);
//        Object racunRepository1 = context.getBean("racunRepository");

        RacunService racunService = context.getBean("racunService", RacunService.class);
        RacunView racunView = context.getBean("racunView", RacunView.class);
        System.out.println("Hello world!");

    }
}