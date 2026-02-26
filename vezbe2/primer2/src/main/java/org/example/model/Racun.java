package org.example.model;

public class Racun {
    private String brojRacuna;
    private Double stanje;

    public Racun() {
        super();
    }

    public Racun(String brojRacuna, Double stanje) {
        this.brojRacuna = brojRacuna;
        this.stanje = stanje;
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
}
