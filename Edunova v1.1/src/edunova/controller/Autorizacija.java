/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.controller;

import edunova.model.Operater;
import edunova.utility.Baza;
import edunova.utility.Pomocno;
import java.security.MessageDigest;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Profesor
 */
public class Autorizacija {
    
    private PreparedStatement komanda;
    
    
     public Operater autoriziraj(String korisnik, String lozinka){
            Operater o=null;
            
            
            try {
             komanda=Baza.getVeza().prepareStatement("select * from operater where binary korisnik=? and lozinka=md5(?)");
             komanda.setString(1, korisnik);
             komanda.setString(2, lozinka);
             ResultSet rs = komanda.executeQuery();
             while(rs.next()){
             o= new Operater();
             o.setSifra(rs.getInt("sifra"));
             o.setIme(rs.getString("ime"));
             o.setPrezime(rs.getString("prezime"));
             o.setKorisnik(rs.getString("korisnik"));
             o.setLozinkaMD5(rs.getString("lozinka"));
                 try {
                     o.setUloga(rs.getString("uloga"));
                    
                 } catch (Exception e) {
                     o.setUloga(Operater.KORISNIK);
                 }
                 
                  try {
                     o.setFormatDatuma(rs.getString("formatdatuma"));
                    
                 } catch (Exception e) {
                     o.setFormatDatuma(Pomocno.FORMAT_DATUM_UNOS);
                 }
                 
                  
             
             }
         } catch (Exception e) {
             
         }
            
            if(o!=null){
                Pomocno.setOperater(o);
            }
            
            return o;
        }
    
}
