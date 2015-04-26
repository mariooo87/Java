/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.utility;

import edunova.model.Operater;

/**
 *
 * @author Profesor
 */
public class Pomocno {
    
    private static Operater operater;
    
    public static final String FORMAT_DATUM_IZVJESTAJ="dd. MMMM YYYY.";
    public static final String FORMAT_DATUM_UNOS="dd.MM.YYYY.";
    public static final String FORMAT_DATUM_VRIJEME="dd.MM.YYYY. HH:mm:ss";
    
    public static void setOperater(Operater o){
        operater=o;
    }
    
    public static Operater getOperater(){
        
        return operater;
                
    }
    
}
