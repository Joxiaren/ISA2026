package org.example.dto;

import java.util.ArrayList;

public class KorisnikDTO {
    private String ime;
    private String prezime;
    private ArrayList<RacunDTO> racuni;

    public KorisnikDTO() {
        super();
    }

    public KorisnikDTO(String ime, String prezime) {
        this.ime = ime;
        this.prezime = prezime;
    }

    public KorisnikDTO(String ime, String prezime, ArrayList<RacunDTO> racuni) {
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

    public ArrayList<RacunDTO> getRacuni() {
        return racuni;
    }

    public void setRacuni(ArrayList<RacunDTO> racuni) {
        this.racuni = racuni;
    }
}
