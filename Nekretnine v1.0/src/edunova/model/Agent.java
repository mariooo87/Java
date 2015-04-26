/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.model;

/**
 *
 * @author Mario
 */
public class Agent {
    private int sifra;
    private String ime;
    private String prezime;
    private String oib;
    private String brojtelefona;
    private String email;
    private String korisnik;
    private String lozinka;
    private String lozinkaMD5;

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

    public String getOib() {
        return oib;
    }

    public void setOib(String oib) {
        this.oib = oib;
    }

    public String getBrojtelefona() {
        return brojtelefona;
    }

    public void setBrojtelefona(String brojtelefona) {
        this.brojtelefona = brojtelefona;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getKorisnik() {
        return korisnik;
    }

    public void setKorisnik(String korisnik) {
        this.korisnik = korisnik;
    }

    public String getLozinka() {
        return lozinka;
    }

    public void setLozinka(String lozinka) {
        this.lozinka = lozinka;
    }

    public String getLozinkaMD5() {
        return lozinkaMD5;
    }

    public void setLozinkaMD5(String lozinkaMD5) {
        this.lozinkaMD5 = lozinkaMD5;
    }

      
    
    public String getImePrezime(){
        return this.ime + " " + this.prezime;
    }
    
    @Override
    public String toString() {
        return this.ime + " " + this.prezime;
    }
    
    
}
