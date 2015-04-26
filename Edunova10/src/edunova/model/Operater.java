/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.model;

import edunova.utility.Pomocno;

/**
 *
 * @author Profesor
 */
public class Operater {
    
    
    public static final String ADMINISTRATOR="administrator";
    public static final String KORISNIK="korisnik";
    
    
    private int sifra;
    private String ime;
    private String prezime;
    private String korisnik;
    private String lozinka;
    private String lozinkaMD5;
    private String uloga;
    private String formatDatuma;

    public String getFormatDatuma() {
         if(formatDatuma==null)
            return Pomocno.FORMAT_DATUM_UNOS;
        return formatDatuma;
    }

    public void setFormatDatuma(String formatDatuma) {
        this.formatDatuma = formatDatuma;
    }
    
    
    

    public String getUloga() {
        if(uloga==null)
            return Operater.KORISNIK;
        return uloga;
    }

    public void setUloga(String uloga) {
 
        this.uloga = uloga;
    }
    
    

    public String getLozinka() {
        return lozinka;
    }

    public void setLozinka(String lozinka) {
        this.lozinka = lozinka;
    }

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

    public String getKorisnik() {
        return korisnik;
    }

    public void setKorisnik(String korisnik) {
        this.korisnik = korisnik;
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
