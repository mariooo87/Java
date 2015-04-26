/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knjiznica.utility;

import knjiznica.model.Operater;

/**
 *
 * @author Mario
 */
public class Pomocno {
    
    private static Operater operater;
    
    public static final String FORMAT_DATUM_UNOS="dd.MM.YYYY.";

    public static Operater getOperater() {
        return operater;
    }

    public static void setOperater(Operater operater) {
        Pomocno.operater = operater;
    }
    
    
    
}
