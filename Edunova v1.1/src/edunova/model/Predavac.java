/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.model;

import java.awt.image.BufferedImage;

/**
 *
 * @author Edunova
 */
public class Predavac extends Osoba{
    
    private String iban;
     private int sifra;
     private BufferedImage slika;

    public BufferedImage getSlika() {
        return slika;
    }

    public void setSlika(BufferedImage slika) {
        this.slika = slika;
    }



    public int getSifra() {
        return sifra;
    }

    public void setSifra(int sifra) {
        this.sifra = sifra;
    }
    
    

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }
    
    
  
    
    
}
