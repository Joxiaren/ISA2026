package org.example.view;

import org.example.repo.RacunRepository;
import org.example.service.RacunService;

public class RacunView {
    private RacunService racunService;
    private RacunRepository racunRepository;

    public RacunView(RacunService racunService) {
        this.racunService = racunService;
    }

    public RacunService getRacunService() {
        return racunService;
    }

    public void setRacunService(RacunService racunService) {
        this.racunService = racunService;
    }

    public RacunRepository getRacunRepository() {
        return racunRepository;
    }
    public void setRacunRepository(RacunRepository racunRepository) {
        this.racunRepository = racunRepository;
    }
}
