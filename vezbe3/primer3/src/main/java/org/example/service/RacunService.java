package org.example.service;

import org.example.model.Racun;
import org.example.repository.RacunRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RacunService {
    @Autowired
    private RacunRepository racunRepository;

    public RacunService(){

    }
    public RacunService(RacunRepository racunRepository) {
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
