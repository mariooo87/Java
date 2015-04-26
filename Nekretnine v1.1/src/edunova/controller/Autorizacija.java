/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.controller;

import edunova.model.Agent;
import edunova.utility.Baza;
import edunova.utility.Pomocno;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Mario
 */
public class Autorizacija {
    private PreparedStatement komanda;
    
    
     public Agent autoriziraj(String korisnik, String lozinka){
            Agent o=null;
            
            
            try {
             komanda=Baza.getVeza().prepareStatement("select * from agent where binary korisnik=? and lozinka=md5(?)");
             komanda.setString(1, korisnik);
             komanda.setString(2, lozinka);
             ResultSet rs = komanda.executeQuery();
             while(rs.next()){
             o= new Agent();
             o.setSifra(rs.getInt("sifra"));
             o.setIme(rs.getString("ime"));
             o.setPrezime(rs.getString("prezime"));
             o.setOib(rs.getString("oib"));
             o.setBrojtelefona(rs.getString("brojtelefona"));
             o.setEmail(rs.getString("email"));
             o.setKorisnik(rs.getString("korisnik"));
             o.setLozinkaMD5(rs.getString("lozinka"));
             }
         } catch (Exception e) {
             
         }
            
            if(o!=null){
                Pomocno.setAgent(o);
            }
            
            return o;
        }
}
