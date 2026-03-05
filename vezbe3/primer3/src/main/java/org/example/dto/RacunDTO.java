package org.example.dto;

import org.example.model.Korisnik;

public class RacunDTO {
    private String brojRacuna;
    private Double stanje;
    private KorisnikDTO vlasnik;

    public RacunDTO() {
    }

    public RacunDTO(String brojRacuna, Double stanje, KorisnikDTO vlasnik) {
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

    public KorisnikDTO getVlasnik() {
        return vlasnik;
    }

    public void setVlasnik(KorisnikDTO vlasnik) {
        this.vlasnik = vlasnik;
    }
}
