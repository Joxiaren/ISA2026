package org.example.model;

import java.util.ArrayList;

public class Korisnik {
    private String ime;
    private String prezime;
    private ArrayList<Racun> racuni = new ArrayList<>();

    public Korisnik() {
        super();
    }

    public Korisnik(String ime, String prezime, ArrayList<Racun> racuni) {
        this.ime = ime;
        this.prezime = prezime;
        this.racuni = racuni;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public ArrayList<Racun> getRacuni() {
        return racuni;
    }

    public void setRacuni(ArrayList<Racun> racuni) {
        this.racuni = racuni;
    }
}
