package org.example;

import org.example.configuration.AppConfiguration;
import org.example.repo.RacunRepository;
import org.example.service.RacunService;
import org.example.view.RacunView;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);
        RacunRepository racunRepository = context.getBean(RacunRepository.class);
        RacunService racunService = context.getBean(RacunService.class);
        RacunView racunView = context.getBean(RacunView.class);

        System.out.println(racunRepository);
        System.out.println(racunService);
        System.out.println(racunService.getRacunRepository());
        System.out.println(racunView);
        System.out.println(racunView.getRacunRepository());
        System.out.println(racunView.getRacunService());

//        RacunService racunService = context.getBean("racunService", RacunService.class);
//        RacunView racunView = context.getBean("racunView", RacunView.class);
        System.out.println("Hello world!");
    }
}