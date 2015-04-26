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
public class Test {
    
    public static void main(String[] args) {
        try {
            //želim na bazu
            PreparedStatement komanda=Baza.getVeza().prepareStatement("");
        } catch (SQLException ex) {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
        }
        //koristim bazu
        new Klasa1();
    }
    
}
