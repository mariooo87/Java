/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knjiznica.model;

/**
 *
 * @author Mario
 */
public class Operater {
    
    private int sifra;
    private String ime;
    private String prezime;
    private String korisnickoime;
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

    public String getKorisnickoime() {
        return korisnickoime;
    }

    public void setKorisnickoime(String korisnickoime) {
        this.korisnickoime = korisnickoime;
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
