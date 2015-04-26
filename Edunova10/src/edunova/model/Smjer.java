/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.model;

import java.math.BigDecimal;

/**
 *
 * @author Profesor
 */
public class Smjer {
    
    private int sifra;
    private String naziv;
    private int trajanje;
    private BigDecimal cijena;

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

    public int getTrajanje() {
        return trajanje;
    }

    public void setTrajanje(int trajanje) {
        this.trajanje = trajanje;
    }

    public BigDecimal getCijena() {
        return cijena;
    }

    public void setCijena(BigDecimal cijena) {
        this.cijena = cijena;
    }

    @Override
    public String toString() {
        return naziv; 
    }
/*
    @Override
    public int hashCode() {
        return sifra;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Smjer other = (Smjer) obj;
        if (this.sifra != other.sifra) {
            return false;
        }
        return true;
    }
    Ako koristite smjerovi.setSelectedItem(odabrano.getSmjer());
    */
    

  
    
}
