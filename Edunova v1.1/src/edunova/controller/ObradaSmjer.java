/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.controller;

import edunova.model.Operater;
import edunova.model.Smjer;
import edunova.utility.Baza;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Profesor
 */
public class ObradaSmjer {
    
    private PreparedStatement komanda;
    
     public List<Smjer> dohvati(String uvjet){
         List<Smjer> l = new ArrayList<>();
         try {
             komanda = Baza.getVeza().prepareStatement("select * from smjer where naziv like ?");
             komanda.setString(1, "%" + uvjet + "%");
             
             ResultSet rs = komanda.executeQuery();
             Smjer o;
             while(rs.next()){
                 o=new Smjer();
                 o.setSifra(rs.getInt("sifra"));
                 o.setNaziv(rs.getString("naziv"));
                 o.setTrajanje(rs.getInt("trajanje"));
                 o.setCijena(rs.getBigDecimal("cijena"));
               
                 l.add(o);
             }
         } catch (Exception e) {
              Logger.getLogger(ObradaSmjer.class.getName()).log(Level.SEVERE, null, e);
         } 
         
         return l;
        }
    
     
     public Smjer dodaj(Smjer o){
          try {
             komanda = Baza.getVeza().prepareStatement("insert into smjer (naziv,trajanje, cijena"
                     + ") values (?,?,?)", Statement.RETURN_GENERATED_KEYS);
             komanda.setString(1, o.getNaziv());
             komanda.setInt(2, o.getTrajanje());
             komanda.setBigDecimal(3, o.getCijena());
             
             komanda.executeUpdate();          
              ResultSet rs = komanda.getGeneratedKeys();
                rs.next();
                o.setSifra(rs.getInt(1));

         } catch (Exception e) {
              Logger.getLogger(ObradaSmjer.class.getName()).log(Level.SEVERE, null, e);
         } 
         return o;
     }
     
     public boolean promjeni(Smjer o){
         boolean vrati=false;
         try {
             
                  komanda = Baza.getVeza().prepareStatement("update smjer set naziv=?,"
                          + "trajanje=?,"
                     + "cijena=? where sifra=?");
             komanda.setString(1, o.getNaziv());
             komanda.setInt(2, o.getTrajanje());
             komanda.setBigDecimal(3, o.getCijena());
             komanda.setInt(4, o.getSifra());
                   
             
             
             if(komanda.executeUpdate()==1){
                 vrati=true;
             }
             

         } catch (Exception e) {
              Logger.getLogger(ObradaSmjer.class.getName()).log(Level.SEVERE, null, e);
         } 
         
         
         return vrati;
     }
     
     public boolean obrisi(Smjer o){
          boolean vrati=false;
         try {
                  komanda = Baza.getVeza().prepareStatement("delete from smjer "
                          + " where sifra=?");
             komanda.setInt(1, o.getSifra()); 
             if(komanda.executeUpdate()==1){
                 vrati=true;
             }
         } catch (Exception e) {
              Logger.getLogger(ObradaSmjer.class.getName()).log(Level.SEVERE, null, e);
         } 
         return vrati;
     }
    
}
