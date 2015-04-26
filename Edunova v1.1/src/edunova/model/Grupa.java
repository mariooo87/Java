/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.model;

import java.util.Date;
import java.util.List;

/**
 *
 * @author Edunova
 */
public class Grupa {
    
    private int sifra;
    private Smjer smjer;
    private Predavac predavac;
    private String naziv;
    private int brojPolaznika;
    private Date datumPocetka;
    private List<Polaznik> polaznici;

    public int getSifra() {
        return sifra;
    }

    public void setSifra(int sifra) {
        this.sifra = sifra;
    }

    public Smjer getSmjer() {
        return smjer;
    }

    public void setSmjer(Smjer smjer) {
        this.smjer = smjer;
    }

    public Predavac getPredavac() {
        return predavac;
    }

    public void setPredavac(Predavac predavac) {
        this.predavac = predavac;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getBrojPolaznika() {
        return brojPolaznika;
    }

    public void setBrojPolaznika(int brojPolaznika) {
        this.brojPolaznika = brojPolaznika;
    }

    public Date getDatumPocetka() {
        return datumPocetka;
    }

    public void setDatumPocetka(Date datumPocetka) {
        this.datumPocetka = datumPocetka;
    }

    public List<Polaznik> getPolaznici() {
        return polaznici;
    }

    public void setPolaznici(List<Polaznik> polaznici) {
        this.polaznici = polaznici;
    }

    @Override
    public String toString() {
       return naziv + " (" + getSmjer().getNaziv() + ")";
    }
    
    
    
}
