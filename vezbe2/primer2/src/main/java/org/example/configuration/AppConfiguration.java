package org.example.configuration;

import org.example.repo.RacunRepository;
import org.example.service.RacunService;
import org.example.view.RacunView;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration {
    @Bean
    public RacunRepository racunRepository() {
        return new RacunRepository();
    }

    @Bean
    public RacunService racunService(RacunRepository rr){
        return new RacunService(rr);
    }

    @Bean
    public RacunView racunView(RacunService racunService, RacunRepository racunRepository){
        RacunView racunView = new RacunView(racunService);
        racunView.setRacunRepository(racunRepository);

        return racunView;
    }
}
