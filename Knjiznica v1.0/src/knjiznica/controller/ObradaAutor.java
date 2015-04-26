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
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import knjiznica.model.Autor;
import knjiznica.utility.Baza;

/**
 *
 * @author Mario
 */
public class ObradaAutor {
    
    private PreparedStatement komanda;

    public List<Autor> dohvati(String uvjet) {
        List<Autor> l = new ArrayList<>();
        try {
            komanda = Baza.getVeza().prepareStatement("select sifra, ime, prezime, datumrodenja from autor"
                    + " where ime like? or prezime like?");
                  
            komanda.setString(1, "%" + uvjet + "%");
            komanda.setString(2, "%" + uvjet + "%");
            ResultSet rs = komanda.executeQuery();
            
            Autor a;
            
            while (rs.next()) {

                a = new Autor();
                
                a.setSifra(rs.getInt("sifra"));
                a.setIme(rs.getString("ime"));
                a.setPrezime(rs.getString("prezime"));
                try {
                     a.setDatumrodenja(new Date(rs.getDate("datumrodenja").getTime()));
                } catch (Exception e) {
                    a.setDatumrodenja(null);
                }
                         
                l.add(a);
            }
            rs.close();
   
        } catch (Exception e) {
            Logger.getLogger(ObradaAutor.class.getName()).log(Level.SEVERE, null, e);
        }

        return l;

    }

    public Autor dodaj(Autor a) {
        try {
            komanda = Baza.getVeza().prepareStatement("insert into autor (ime,prezime,datumrodenja"
                    + ") values (?,?,?)", Statement.RETURN_GENERATED_KEYS);

            komanda.setString(1, a.getIme());
            komanda.setString(2, a.getPrezime());
            if(a.getDatumrodenja()==null){
                komanda.setDate(3, null);
            }else{
                 komanda.setDate(3,new java.sql.Date(a.getDatumrodenja().getTime()));
            }
            
            komanda.executeUpdate();

            ResultSet rs = komanda.getGeneratedKeys();
            rs.next();
            a.setSifra(rs.getInt(1));

            
        } catch (Exception e) {
            Logger.getLogger(ObradaAutor.class.getName()).log(Level.SEVERE, null, e);
            return null;
        }
        return a;
    }

    public boolean promjeni(Autor a) {
        boolean vrati = false;
        try {
            Connection veza = Baza.getVeza();
            veza.setAutoCommit(false);
            komanda = veza.prepareStatement("update autor set ime=?, prezime=?, datumrodenja=? where sifra=?");

            
            komanda.setString(1, a.getIme());
            komanda.setString(2, a.getPrezime());
            if(a.getDatumrodenja()==null){
                komanda.setDate(3, null);
            }else{
                 komanda.setDate(3,new java.sql.Date(a.getDatumrodenja().getTime()));
            }
            komanda.setInt(4, a.getSifra());
            
            komanda.executeUpdate();

            if (komanda.executeUpdate() == 1) {
                vrati = true;
            }
            
            veza.commit();

        } catch (Exception e) {
            Logger.getLogger(ObradaAutor.class.getName()).log(Level.SEVERE, null, e);

        }

        return vrati;
    }

    public boolean obrisi(Autor a) {
        boolean brisiKlijent = false;

        try {
            Connection veza = Baza.getVeza();
            veza.setAutoCommit(false);
            komanda = veza.prepareStatement("delete from autor "
                    + " where sifra=?");
            komanda.setInt(1, a.getSifra());

            if (komanda.executeUpdate() == 1) {
                brisiKlijent = true;
            }

            veza.commit();

        } catch (Exception e) {
            Logger.getLogger(ObradaAutor.class.getName()).log(Level.SEVERE, null, e);
        }
        return brisiKlijent;
    }
    
}
