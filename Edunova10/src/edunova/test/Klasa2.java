/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.test;

import edunova.utility.Baza;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Edunova
 */
public class Klasa2 {

    public Klasa2() {
       
        try {
            //koristim bazu
            //želim na bazu
            PreparedStatement komanda=Baza.getVeza().prepareStatement("");
        } catch (SQLException ex) {
            Logger.getLogger(Klasa2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
}
