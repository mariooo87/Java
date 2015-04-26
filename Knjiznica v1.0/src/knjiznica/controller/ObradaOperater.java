/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knjiznica.controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import knjiznica.model.Operater;
import knjiznica.utility.Baza;

/**
 *
 * @author Mario
 */
public class ObradaOperater {

    private PreparedStatement komanda;

    public List<Operater> dohvati(String uvjet) {
        List<Operater> l = new ArrayList<>();
        try {
            komanda = Baza.getVeza().prepareStatement("select * from operater where ime like ? or prezime like ?");
            komanda.setString(1, "%" + uvjet + "%");
            komanda.setString(2, "%" + uvjet + "%");
            ResultSet rs = komanda.executeQuery();
            Operater o;
            while (rs.next()) {
                o = new Operater();
                o.setSifra(rs.getInt("sifra"));
                o.setIme(rs.getString("ime"));
                o.setPrezime(rs.getString("prezime"));
                o.setKorisnickoime(rs.getString("korisnickoIme"));
                o.setLozinkaMD5(rs.getString("lozinka"));
                l.add(o);
            }
        } catch (Exception e) {
            Logger.getLogger(ObradaOperater.class.getName()).log(Level.SEVERE, null, e);
        }

        return l;
    }

    public boolean provjeraKorisnika(String korisnickoIme) {

        try {
            komanda = Baza.getVeza().prepareStatement("select sifra from operater where korisnickoIme=?");
            komanda.setString(1, korisnickoIme);
            ResultSet rs = komanda.executeQuery();
            return !rs.next();

        } catch (Exception e) {
            Logger.getLogger(ObradaOperater.class.getName()).log(Level.SEVERE, null, e);
        }

        return false;
    }

    public Operater dodaj(Operater o) {
        try {
            komanda = Baza.getVeza().prepareStatement("insert into operater (korisnickoIme,lozinka,"
                    + "ime,prezime) values (?,md5(?),?,?)", Statement.RETURN_GENERATED_KEYS);
            komanda.setString(1, o.getKorisnickoime());
            komanda.setString(2, o.getLozinka());
            komanda.setString(3, o.getIme());
            komanda.setString(4, o.getPrezime());
            komanda.executeUpdate();
            ResultSet rs = komanda.getGeneratedKeys();
            rs.next();
            o.setSifra(rs.getInt(1));

        } catch (Exception e) {
            Logger.getLogger(ObradaOperater.class.getName()).log(Level.SEVERE, null, e);
        }
        return o;
    }

    public boolean promjeni(Operater o) {
        boolean vrati = false;
        try {
            if (o.getLozinka().length() > 0) {
                komanda = Baza.getVeza().prepareStatement("update operater set korisnickoIme=?,"
                        + "lozinka=md5(?),"
                        + "ime=?,prezime=? where sifra=?");
                komanda.setString(1, o.getKorisnickoime());
                komanda.setString(2, o.getLozinka());
                komanda.setString(3, o.getIme());
                komanda.setString(4, o.getPrezime());
                komanda.setInt(5, o.getSifra());

            } else {
                komanda = Baza.getVeza().prepareStatement("update operater set korisnickoIme=?,"
                        + "ime=?,prezime=? where sifra=?");
                komanda.setString(1, o.getKorisnickoime());
                komanda.setString(2, o.getIme());
                komanda.setString(3, o.getPrezime());
                komanda.setInt(4, o.getSifra());
            }

            if (komanda.executeUpdate() == 1) {
                vrati = true;
            }

        } catch (Exception e) {
            Logger.getLogger(ObradaOperater.class.getName()).log(Level.SEVERE, null, e);
        }

        return vrati;
    }

    public boolean obrisi(Operater o) {
        boolean vrati = false;
        try {
            komanda = Baza.getVeza().prepareStatement("delete from operater "
                    + " where sifra=?");
            komanda.setInt(1, o.getSifra());
            if (komanda.executeUpdate() == 1) {
                vrati = true;
            }
        } catch (Exception e) {
            Logger.getLogger(ObradaOperater.class.getName()).log(Level.SEVERE, null, e);
        }
        return vrati;
    }

}
