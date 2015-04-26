/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.model;

/**
 *
 * @author Edunova
 */
public class Osoba {
    
    private int sifraOsobe;
    private String oib;
    private String ime;
    private String prezime;
    private String email;
    private boolean aktivan;
    
 

    public int getSifraOsobe() {
        return sifraOsobe;
    }

    public void setSifraOsobe(int sifraOsobe) {
        this.sifraOsobe = sifraOsobe;
    }

    
    
    
    public String getOib() {
        return oib;
    }

    public void setOib(String oib) {
        this.oib = oib;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isAktivan() {
        return aktivan;
    }

    public void setAktivan(boolean aktivan) {
        this.aktivan = aktivan;
    }

    @Override
    public String toString() {
        return getIme() + " " + this.prezime;
    }
    
      public String getImePrezime(){
        return getIme() + " " + getPrezime();
    }
    
    
    
}
