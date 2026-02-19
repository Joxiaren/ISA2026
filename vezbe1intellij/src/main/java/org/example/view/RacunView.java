package org.example.view;

import org.example.service.RacunService;

public class RacunView {
    private RacunService racunService;

    public RacunView(RacunService racunService) {
        this.racunService = racunService;
    }

    public RacunService getRacunService() {
        return racunService;
    }

    public void setRacunService(RacunService racunService) {
        this.racunService = racunService;
    }
}
