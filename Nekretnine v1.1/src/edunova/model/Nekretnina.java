/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.model;

import java.math.BigDecimal;

/**
 *
 * @author Mario
 */
public class Nekretnina {
    
    private int sifra;
    private String vrsta;
    private int godinaizgradnje;
    private String lokacija;
    private int stambenapovrsina;
    private int povrsinaokucnice;
    private String vrstagrijanja;
    private BigDecimal cijena;
    private int brojetaza;
    private int brojsoba;
    private boolean vlasnickilist;
    private boolean gradevinskadozvola;
    private boolean uporabnadozvola;
    private boolean prodaja;
    private boolean kupnja;

    public boolean isProdaja() {
        return prodaja;
    }

    public void setProdaja(boolean prodaja) {
        this.prodaja = prodaja;
    }

    public boolean isKupnja() {
        return kupnja;
    }

    public void setKupnja(boolean kupnja) {
        this.kupnja = kupnja;
    }

    public int getSifra() {
        return sifra;
    }

    public void setSifra(int sifra) {
        this.sifra = sifra;
    }

    public String getVrsta() {
        return vrsta;
    }

    public void setVrsta(String vrsta) {
        this.vrsta = vrsta;
    }

    public int getGodinaizgradnje() {
        return godinaizgradnje;
    }

    public void setGodinaizgradnje(int godinaizgradnje) {
        this.godinaizgradnje = godinaizgradnje;
    }

    public String getLokacija() {
        return lokacija;
    }

    public void setLokacija(String lokacija) {
        this.lokacija = lokacija;
    }

    public int getStambenapovrsina() {
        return stambenapovrsina;
    }

    public void setStambenapovrsina(int stambenapovrsina) {
        this.stambenapovrsina = stambenapovrsina;
    }

    public int getPovrsinaokucnice() {
        return povrsinaokucnice;
    }

    public void setPovrsinaokucnice(int povrsinaokucnice) {
        this.povrsinaokucnice = povrsinaokucnice;
    }

    public String getVrstagrijanja() {
        return vrstagrijanja;
    }

    public void setVrstagrijanja(String vrstagrijanja) {
        this.vrstagrijanja = vrstagrijanja;
    }

    public BigDecimal getCijena() {
        return cijena;
    }

    public void setCijena(BigDecimal cijena) {
        this.cijena = cijena;
    }

    public int getBrojetaza() {
        return brojetaza;
    }

    public void setBrojetaza(int brojetaza) {
        this.brojetaza = brojetaza;
    }

    public int getBrojsoba() {
        return brojsoba;
    }

    public void setBrojsoba(int brojsoba) {
        this.brojsoba = brojsoba;
    }

    public boolean isVlasnickilist() {
        return vlasnickilist;
    }

    public void setVlasnickilist(boolean vlasnickilist) {
        this.vlasnickilist = vlasnickilist;
    }

    public boolean isGradevinskadozvola() {
        return gradevinskadozvola;
    }

    public void setGradevinskadozvola(boolean gradevinskadozvola) {
        this.gradevinskadozvola = gradevinskadozvola;
    }

    public boolean isUporabnadozvola() {
        return uporabnadozvola;
    }

    public void setUporabnadozvola(boolean uporabnadozvola) {
        this.uporabnadozvola = uporabnadozvola;
    }

    

    @Override
    public String toString() {
        return this.vrsta + " " + this.lokacija;
    }
    
    
}
