/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Edunova
 */

//ovaku klasu zovemo singleton
public class Baza {
    
    private static Connection veza;
    
    public static Connection getVeza(){
        if(veza==null){
            System.out.println("spajam se na bazu");
           try {
            //povezivanje na bazu
            Class.forName("com.mysql.jdbc.Driver");
            
               Properties prop = new Properties();
               prop.load(new FileInputStream(new File("konfiguracija.properties")));
 
            
             veza = DriverManager
          .getConnection("jdbc:mysql://" + prop.getProperty("server") +"/" + prop.getProperty("imeBaze") +"?"
              + "user=" + prop.getProperty("korisnik") +"&password=" + prop.getProperty("lozinka") +"&useUnicode=yes&characterEncoding=utf8");
        } catch (ClassNotFoundException | SQLException e) {
            Logger.getLogger(Baza.class.getName()).log(Level.SEVERE, null, e);
        }   catch (IOException ex) {
                Logger.getLogger(Baza.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        try {
            if(veza.isClosed()){
                veza=null;
                getVeza();
            }
        } catch (SQLException e) {
            Logger.getLogger(Baza.class.getName()).log(Level.SEVERE, null, e);
        }
        
        return veza;
    }
    
}
