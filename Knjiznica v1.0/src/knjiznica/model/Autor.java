/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knjiznica.model;

import java.util.Date;

/**
 *
 * @author Mario
 */
public class Autor {
    
    private int sifra;
    private String ime;
    private String prezime;
    private Date datumrodenja;

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

    public Date getDatumrodenja() {
        return datumrodenja;
    }

    public void setDatumrodenja(Date datumrodenja) {
        this.datumrodenja = datumrodenja;
    }
    
    public String getImePrezime(){
        return this.ime + " " + this.prezime;
    }
    
    @Override
    public String toString() {
        return this.ime + " " + this.prezime;
    }
    
}
