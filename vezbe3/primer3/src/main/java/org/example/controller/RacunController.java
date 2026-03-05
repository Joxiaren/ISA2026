package org.example.controller;

import jakarta.websocket.server.PathParam;
import org.apache.coyote.Response;
import org.example.dto.KorisnikDTO;
import org.example.dto.RacunDTO;
import org.example.model.Korisnik;
import org.example.model.Racun;
import org.example.service.RacunService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(path = "/api/racuni")
public class RacunController {

    @Autowired
    private RacunService racunService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<RacunDTO>> primer(){
        //System.out.println(racunService.findAll());

        List<Racun> racuni = racunService.findAll();
        ArrayList<RacunDTO> racuniDTO = new ArrayList<RacunDTO>();

        for(Racun racun : racuni){
            racuniDTO.add(new RacunDTO(racun.getBrojRacuna(), racun.getStanje(),
                    new KorisnikDTO(racun.getVlasnik().getIme(),racun.getVlasnik().getPrezime())));
        }

        return new ResponseEntity<>(racuniDTO, HttpStatus.OK);
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<RacunDTO> findById(@PathVariable("id") int index){
        Racun racun = racunService.findById(index);

        RacunDTO racunDTO = new RacunDTO(racun.getBrojRacuna(), racun.getStanje(),
                new KorisnikDTO(racun.getVlasnik().getIme(), racun.getVlasnik().getPrezime()));

        return new ResponseEntity<>(racunDTO, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<RacunDTO> create(@RequestBody RacunDTO racunDTO){
        Racun racun = new Racun(racunDTO.getBrojRacuna(), racunDTO.getStanje(),
                new Korisnik(racunDTO.getVlasnik().getIme(), racunDTO.getVlasnik().getPrezime(), new ArrayList<>()));
        racun.getVlasnik().getRacuni().add(racun);

        Racun sacuvanRacun = racunService.save(racun);

        RacunDTO result = new RacunDTO(sacuvanRacun.getBrojRacuna(), sacuvanRacun.getStanje(),
                new KorisnikDTO(sacuvanRacun.getVlasnik().getIme(), sacuvanRacun.getVlasnik().getPrezime()));

        return new ResponseEntity<RacunDTO>(result, HttpStatus.CREATED);
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<RacunDTO> delete(@PathVariable("id") int index){
        try{
            Racun racun = racunService.findById(index);
        }
        catch(IndexOutOfBoundsException e){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        Racun racun = racunService.delete(index);

        RacunDTO result = new RacunDTO(racun.getBrojRacuna(), racun.getStanje(),
                new KorisnikDTO(racun.getVlasnik().getIme(), racun.getVlasnik().getPrezime()));

        return new ResponseEntity<RacunDTO>(result, HttpStatus.NO_CONTENT);
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.PUT)
    public ResponseEntity<RacunDTO> update(@PathVariable("id") int index, @RequestBody RacunDTO racunDTO){
        try{
            Racun raucn = racunService.findById(index);
        }
        catch(IndexOutOfBoundsException e){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        Korisnik updatedKorisnik = new Korisnik(racunDTO.getVlasnik().getIme(), racunDTO.getVlasnik().getPrezime(), new ArrayList<>());

        Racun updatedRacun = new Racun(racunDTO.getBrojRacuna(), racunDTO.getStanje(), updatedKorisnik);
        updatedKorisnik.getRacuni().add(updatedRacun);

        updatedRacun = racunService.update(index, updatedRacun);

        RacunDTO result = new RacunDTO(updatedRacun.getBrojRacuna(), updatedRacun.getStanje(),
                new KorisnikDTO(updatedRacun.getVlasnik().getIme(), updatedRacun.getVlasnik().getPrezime()));

        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}
