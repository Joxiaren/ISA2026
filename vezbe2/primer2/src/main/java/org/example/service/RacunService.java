package org.example.service;

import org.example.model.Racun;
import org.example.repo.RacunRepository;

import java.util.List;

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

    public List<Racun> findAll(){
        return this.racunRepository.findAll();
    }

    public Racun findById(int index){
        return this.racunRepository.findById(index);
    }

    public Racun save(Racun racun){
        return this.racunRepository.save(racun);
    }

    public Racun update(int index, Racun racun){
        return this.racunRepository.update(index, racun);
    }

    public Racun delete(Racun racun){
        return this.racunRepository.delete(racun);
    }

    public Racun delete(int index){
        return this.racunRepository.delete(index);
    }
}
