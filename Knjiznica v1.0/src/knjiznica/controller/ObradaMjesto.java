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
import knjiznica.model.Mjesto;
import knjiznica.utility.Baza;

/**
 *
 * @author Mario
 */
public class ObradaMjesto {
    
    private PreparedStatement komanda;

    public List<Mjesto> dohvati(String uvjet) {
        List<Mjesto> l = new ArrayList<>();
        try {
            komanda = Baza.getVeza().prepareStatement("select sifra, naziv, postanskiBroj, drzava from mjesto"
                    + " where naziv like? or postanskiBroj like?");
                  
            komanda.setString(1, "%" + uvjet + "%");
            komanda.setString(2, "%" + uvjet + "%");
            ResultSet rs = komanda.executeQuery();
            
            Mjesto m;
            
            while (rs.next()) {

                m = new Mjesto();
                
                m.setSifra(rs.getInt("sifra"));
                m.setNaziv(rs.getString("naziv"));
                m.setPostanskiBroj(rs.getString("postanskiBroj"));
                m.setDrzava(rs.getString("drzava"));
                       
                l.add(m);
            }
            rs.close();
   
        } catch (Exception e) {
            Logger.getLogger(ObradaMjesto.class.getName()).log(Level.SEVERE, null, e);
        }

        return l;

    }

    public Mjesto dodaj(Mjesto m) {
        try {
            komanda = Baza.getVeza().prepareStatement("insert into mjesto (naziv,postanskiBroj,drzava"
                    + ") values (?,?,?)", Statement.RETURN_GENERATED_KEYS);

            komanda.setString(1, m.getNaziv());
            komanda.setString(2, m.getPostanskiBroj());
            komanda.setString(3, m.getPostanskiBroj());
            
            
            komanda.executeUpdate();

            ResultSet rs = komanda.getGeneratedKeys();
            rs.next();
            m.setSifra(rs.getInt(1));

            
        } catch (Exception e) {
            Logger.getLogger(ObradaMjesto.class.getName()).log(Level.SEVERE, null, e);
            return null;
        }
        return m;
    }

    public boolean promjeni(Mjesto m) {
        boolean vrati = false;
        try {
            Connection veza = Baza.getVeza();
            veza.setAutoCommit(false);
            komanda = veza.prepareStatement("update mjesto set naziv=?, postanskiBroj=?, drzava=? where sifra=?");
            
            komanda.setString(1, m.getNaziv());
            komanda.setString(2, m.getPostanskiBroj());
            komanda.setString(3, m.getDrzava());
            komanda.setInt(4, m.getSifra());
            
            komanda.executeUpdate();

            if (komanda.executeUpdate() == 1) {
                vrati = true;
            }
            
            veza.commit();

        } catch (Exception e) {
            Logger.getLogger(ObradaMjesto.class.getName()).log(Level.SEVERE, null, e);

        }

        return vrati;
    }

    public boolean obrisi(Mjesto m) {
        boolean brisiMjesto = false;

        try {
            Connection veza = Baza.getVeza();
            veza.setAutoCommit(false);
            komanda = veza.prepareStatement("delete from mjesto "
                    + " where sifra=?");
            komanda.setInt(1, m.getSifra());

            if (komanda.executeUpdate() == 1) {
                brisiMjesto = true;
            }

            veza.commit();

        } catch (Exception e) {
            Logger.getLogger(ObradaMjesto.class.getName()).log(Level.SEVERE, null, e);
        }
        return brisiMjesto;
    }
    
}
