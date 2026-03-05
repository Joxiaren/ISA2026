package org.example.repository;

import org.example.model.Korisnik;
import org.example.model.Racun;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class RacunRepository {
    ArrayList<Racun> racuni = new ArrayList<>();
    public RacunRepository() {
        super();

        Korisnik korisnik = new Korisnik("Marko", "Markovic", new ArrayList<>());

        Racun r1 = new Racun("33", 124.0, korisnik);
        korisnik.getRacuni().add(r1);

        Racun r2 = new Racun("33", 124.0, korisnik);
        korisnik.getRacuni().add(r2);

        racuni.add(r1);
        racuni.add(r2);
//        racuni.add(new Racun("1245", 82822.0));
//        racuni.add(new Racun("1245", 82822.0));
//        racuni.add(new Racun("321", 143.0));
//        racuni.add(new Racun("221", 133.0));
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
