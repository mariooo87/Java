/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.model;

import edunova.utility.Pomocno;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Mario
 */
public class PonudaPotraznja {
    
   
    
    private int sifra;
    private String naziv;
    private Date datum;
    private BigDecimal cijenasprovizijom;
    private Boolean kupnjanekretnine;
    private Boolean prodajanekretnine;
    private Klijent klijenti;
    private Nekretnina nekretnine;

    public int getSifra() {
        return sifra;
    }

    public void setSifra(int sifra) {
        this.sifra = sifra;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    public BigDecimal getCijenasprovizijom() {
        return cijenasprovizijom;
    }

    public void setCijenasprovizijom(BigDecimal cijenasprovizijom) {
        this.cijenasprovizijom = cijenasprovizijom;
    }

    public Boolean getKupnjanekretnine() {
        return kupnjanekretnine;
    }

    public void setKupnjanekretnine(Boolean kupnjanekretnine) {
        this.kupnjanekretnine = kupnjanekretnine;
    }

    public Boolean getProdajanekretnine() {
        return prodajanekretnine;
    }

    public void setProdajanekretnine(Boolean prodajanekretnine) {
        this.prodajanekretnine = prodajanekretnine;
    }

    public Klijent getKlijenti() {
        return klijenti;
    }

    public void setKlijenti(Klijent klijenti) {
        this.klijenti = klijenti;
    }

    public Nekretnina getNekretnine() {
        return nekretnine;
    }

    public void setNekretnine(Nekretnina nekretnine) {
        this.nekretnine = nekretnine;
    }

    

    @Override
    public String toString() {
        SimpleDateFormat df = new SimpleDateFormat(Pomocno.FORMAT_DATUM);
        return getNaziv() + " " + getSifra() + " | " + getNekretnine() + " | " + getKlijenti() + " | " + df.format(getDatum());
    }  
    
}
