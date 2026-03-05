package org.example.model;

public class Racun {
    private String brojRacuna;
    private Double stanje;
    private Korisnik vlasnik;

    public Racun() {
        super();
    }

    public Racun(String brojRacuna, Double stanje) {
        this.brojRacuna = brojRacuna;
        this.stanje = stanje;
    }

    public Racun(String brojRacuna, Double stanje, Korisnik vlasnik) {
        this.brojRacuna = brojRacuna;
        this.stanje = stanje;
        this.vlasnik = vlasnik;
    }

    public String getBrojRacuna() {
        return brojRacuna;
    }

    public void setBrojRacuna(String brojRacuna) {
        this.brojRacuna = brojRacuna;
    }

    public Double getStanje() {
        return stanje;
    }

    public void setStanje(Double stanje) {
        this.stanje = stanje;
    }

    public Korisnik getVlasnik() {
        return vlasnik;
    }

    public void setVlasnik(Korisnik vlasnik) {
        this.vlasnik = vlasnik;
    }
}
