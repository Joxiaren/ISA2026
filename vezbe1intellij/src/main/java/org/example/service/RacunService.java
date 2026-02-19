package org.example.service;

import org.example.repo.RacunRepository;

public class RacunService {
    private RacunRepository racunRepository;

    public RacunService(){
        System.out.println("Default");
    }
    public RacunService(RacunRepository racunRepository) {
        System.out.println("Not Default");
        this.racunRepository = racunRepository;
    }

    public RacunRepository getRacunRepository() {
        return racunRepository;
    }

    public void setRacunRepository(RacunRepository racunRepository) {
        this.racunRepository = racunRepository;
    }
}
