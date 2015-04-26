/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knjiznica.controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import knjiznica.model.Operater;
import knjiznica.utility.Baza;
import knjiznica.utility.Pomocno;

/**
 *
 * @author Mario
 */
public class Autorizacija {
    
    private PreparedStatement komanda;
    
    public Operater autoriziraj(String korisnickoIme, String lozinka){
            Operater o=null;
            
            
            try {
             komanda=Baza.getVeza().prepareStatement("select * from operater where binary korisnickoIme=? and lozinka=md5(?)");
             komanda.setString(1, korisnickoIme);
             komanda.setString(2, lozinka);
             ResultSet rs = komanda.executeQuery();
             while(rs.next()){
             o= new Operater();
             o.setSifra(rs.getInt("sifra"));
             o.setIme(rs.getString("ime"));
             o.setPrezime(rs.getString("prezime"));
             o.setKorisnickoime(rs.getString("korisnickoIme"));
             o.setLozinkaMD5(rs.getString("lozinka"));
                 
             }
         } catch (Exception e) {
             
         }
            
            if(o!=null){
                Pomocno.setOperater(o);
            }
            
            return o;
        }
    
}
