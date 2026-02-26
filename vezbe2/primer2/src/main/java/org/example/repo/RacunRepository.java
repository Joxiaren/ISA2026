package org.example.repo;

import org.example.model.Racun;

import java.util.ArrayList;
import java.util.List;

public class RacunRepository {
    ArrayList<Racun> racuni = new ArrayList<>();
    public RacunRepository() {
        super();
    }

    public ArrayList<Racun> getRacuni() {
        return racuni;
    }

    public void setRacuni(ArrayList<Racun> racuni) {
        this.racuni = racuni;
    }

    public Racun save(Racun racun){
        this.racuni.add(racun);
        return racun;
    }
    public Racun delete(int index){
        if(index < 0 || index > this.racuni.size()) {
            throw new IndexOutOfBoundsException();
        }
        return this.racuni.remove(index);
    }
    public Racun delete(Racun racun){
        return delete(this.racuni.indexOf(racun));
    }

    public List<Racun> findAll(){
        return this.racuni;
    }

    public Racun findById(int index){
        //TODO: implement using brojRacuna and clean it up a bit
        return this.racuni.get(index);
    }

    public Racun update(int index, Racun newRacun){
        Racun oldRacun = findById(index);
        oldRacun.setBrojRacuna(newRacun.getBrojRacuna());
        oldRacun.setStanje(newRacun.getStanje());
        return oldRacun;
    }
}
