/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knjiznica.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import knjiznica.model.Izdavac;
import knjiznica.utility.Baza;

/**
 *
 * @author Mario
 */
public class ObradaIzdavac {
    
    private PreparedStatement komanda;

    public List<Izdavac> dohvati(String uvjet) {
        List<Izdavac> l = new ArrayList<>();
        try {
            komanda = Baza.getVeza().prepareStatement("select sifra, naziv, aktivan from izdavac"
                    + " where naziv like?");   
            komanda.setString(1, "%" + uvjet + "%");
            
            ResultSet rs = komanda.executeQuery();
            
            Izdavac i;
            
            while (rs.next()) {

                i = new Izdavac();
                
                i.setSifra(rs.getInt("sifra"));
                i.setNaziv(rs.getString("naziv"));
                i.setAktivan(rs.getBoolean("aktivan"));
                                 
                l.add(i);
            }
            rs.close();
   
        } catch (Exception e) {
            Logger.getLogger(ObradaIzdavac.class.getName()).log(Level.SEVERE, null, e);
        }

        return l;

    }

    public Izdavac dodaj(Izdavac i) {
        try {
            komanda = Baza.getVeza().prepareStatement("insert into izdavac (naziv,aktivan"
                    + ") values (?,?)", Statement.RETURN_GENERATED_KEYS);

            komanda.setString(1, i.getNaziv());
            komanda.setBoolean(2, i.isAktivan());
            
            
            komanda.executeUpdate();

            ResultSet rs = komanda.getGeneratedKeys();
            rs.next();
            i.setSifra(rs.getInt(1));

            
        } catch (Exception e) {
            Logger.getLogger(ObradaIzdavac.class.getName()).log(Level.SEVERE, null, e);
            return null;
        }
        return i;
    }

    public boolean promjeni(Izdavac i) {
        boolean vrati = false;
        try {
            Connection veza = Baza.getVeza();
            veza.setAutoCommit(false);
            komanda = veza.prepareStatement("update izdavac set naziv=?, aktivan=? where sifra=?");
            
            komanda.setString(1, i.getNaziv());
            komanda.setBoolean(2, i.isAktivan());
            komanda.setInt(3, i.getSifra());
      
            komanda.executeUpdate();

            if (komanda.executeUpdate() == 1) {
                vrati = true;
            }
            
            veza.commit();

        } catch (Exception e) {
            Logger.getLogger(ObradaIzdavac.class.getName()).log(Level.SEVERE, null, e);

        }

        return vrati;
    }

    public boolean obrisi(Izdavac i) {
        boolean brisiIzdavac = false;

        try {
            Connection veza = Baza.getVeza();
            veza.setAutoCommit(false);
            komanda = veza.prepareStatement("delete from izdavac "
                    + " where sifra=?");
            komanda.setInt(1, i.getSifra());

            if (komanda.executeUpdate() == 1) {
                brisiIzdavac = true;
            }

            veza.commit();

        } catch (Exception e) {
            Logger.getLogger(ObradaIzdavac.class.getName()).log(Level.SEVERE, null, e);
        }
        return brisiIzdavac;
    }
    
}
