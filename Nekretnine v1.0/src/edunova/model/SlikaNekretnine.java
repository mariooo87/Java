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
public class SlikaNekretnine {
    
    private String putanja;
    private BufferedImage slika;

    public String getPutanja() {
        return putanja;
    }

    public void setPutanja(String putanja) {
        this.putanja = putanja;
    }

    public BufferedImage getSlika() {
        return slika;
    }

    public void setSlika(BufferedImage slika) {
        this.slika = slika;
    }

    @Override
    public String toString() {
     return putanja;
    }
   
    
}
