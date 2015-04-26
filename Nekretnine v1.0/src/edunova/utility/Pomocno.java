/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.utility;

import edunova.model.Agent;

/**
 *
 * @author Mario
 */
public class Pomocno {
    
    private static Agent agent;
    
    public static final String FORMAT_DATUM = "dd. MMMM YYYY.";
    public static final String FORMAT_DATUM_UNOS="dd.MM.YYYY.";
    public static final String FORMAT_DATUM_VRIJEME="dd.MM.YYYY. HH:mm:ss";
    
    
    public static void setAgent(Agent o){
        agent=o;
    }
    
    public static Agent getAgent(){
        
        return agent;
                
    }
    
}
