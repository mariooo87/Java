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
public class Klijent {

    private int sifra;
    private String ime;
    private String prezime;
    private String brojtelefona;
    private BigDecimal provizija;
    private String iban;
    private String email;
    private Agent agenti;

    public int getSifra() {
        return sifra;
    }

    public void setSifra(int sifra) {
        this.sifra = sifra;
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

    public String getBrojtelefona() {
        return brojtelefona;
    }

    public void setBrojtelefona(String brojtelefona) {
        this.brojtelefona = brojtelefona;
    }

    public BigDecimal getProvizija() {
        return provizija;
    }

    public void setProvizija(BigDecimal provizija) {
        this.provizija = provizija;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Agent getAgenti() {
        return agenti;
    }

    public void setAgenti(Agent agenti) {
        this.agenti = agenti;
    }

    @Override
    public String toString() {
        return this.ime + " " + this.prezime;
    }

    public String getImePrezime() {
        return getIme() + " " + getPrezime();
    }

}
