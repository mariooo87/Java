/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.controller;

import edunova.model.Agent;
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
 * @author Mario
 */
public class ObradaAgent {

    private PreparedStatement komanda;

    public List<Agent> dohvati(String uvjet) {
        List<Agent> l = new ArrayList<>();
        try {
            komanda = Baza.getVeza().prepareStatement("select * from agent where ime like ? or prezime like ?");
            komanda.setString(1, "%" + uvjet + "%");
            komanda.setString(2, "%" + uvjet + "%");
            ResultSet rs = komanda.executeQuery();
            Agent o;
            while (rs.next()) {
                o = new Agent();
                o.setSifra(rs.getInt("sifra"));
                o.setIme(rs.getString("ime"));
                o.setPrezime(rs.getString("prezime"));
                o.setOib(rs.getString("oib"));
                o.setBrojtelefona(rs.getString("brojtelefona"));
                o.setEmail(rs.getString("email"));
                o.setKorisnik(rs.getString("korisnik"));
                o.setLozinkaMD5(rs.getString("lozinka"));
                l.add(o);
            }
        } catch (Exception e) {
            Logger.getLogger(ObradaAgent.class.getName()).log(Level.SEVERE, null, e);
        }

        return l;

    }

    public boolean provjeraKorisnika(String korisnik) {

        try {
            komanda = Baza.getVeza().prepareStatement("select sifra from agent where korisnik=?");
            komanda.setString(1, korisnik);
            ResultSet rs = komanda.executeQuery();
            return !rs.next();

        } catch (Exception e) {
            Logger.getLogger(ObradaAgent.class.getName()).log(Level.SEVERE, null, e);
        }

        return false;
    }

    public Agent dodaj(Agent o) {
        try {
            komanda = Baza.getVeza().prepareStatement("insert into agent (korisnik,lozinka,"
                    + "ime,prezime,oib,brojtelefona,email) values (?,md5(?),?,?,?,?,?)", Statement.RETURN_GENERATED_KEYS);
            komanda.setString(1, o.getKorisnik());
            komanda.setString(2, o.getLozinka());
            komanda.setString(3, o.getIme());
            komanda.setString(4, o.getPrezime());
            komanda.setString(5, o.getOib());
            komanda.setString(6, o.getBrojtelefona());
            komanda.setString(7, o.getEmail());
            
            komanda.executeUpdate();
            ResultSet rs = komanda.getGeneratedKeys();
            rs.next();
            o.setSifra(rs.getInt(1));

        } catch (Exception e) {
            Logger.getLogger(ObradaAgent.class.getName()).log(Level.SEVERE, null, e);
        }
        return o;
    }

    public boolean promjeni(Agent o) {
        boolean vrati = false;
        try {
            if (o.getLozinka().length() > 0) {
                komanda = Baza.getVeza().prepareStatement("update agent set korisnik=?,"
                        + "lozinka=md5(?),"
                        + "ime=?,prezime=?,oib=?,brojtelefona=?,email=? where sifra=?");
                komanda.setString(1, o.getKorisnik());
                komanda.setString(2, o.getLozinka());
                komanda.setString(3, o.getIme());
                komanda.setString(4, o.getPrezime());
                komanda.setString(5, o.getOib());
                komanda.setString(6, o.getBrojtelefona());
                komanda.setString(7, o.getEmail());
                komanda.setInt(8, o.getSifra());

            } else {
                komanda = Baza.getVeza().prepareStatement("update agent set korisnik=?,"
                        + "ime=?,prezime=?,oib=?,brojtelefona=?,email=? where sifra=?");
                komanda.setString(1, o.getKorisnik());
                komanda.setString(2, o.getIme());
                komanda.setString(3, o.getPrezime());
                komanda.setString(4, o.getOib());
                komanda.setString(5, o.getBrojtelefona());
                komanda.setString(6, o.getEmail());
                komanda.setInt(7, o.getSifra());
            }

            if (komanda.executeUpdate() == 1) {
                vrati = true;
            }

        } catch (Exception e) {
            Logger.getLogger(ObradaAgent.class.getName()).log(Level.SEVERE, null, e);
        }

        return vrati;
    }

    public boolean obrisi(Agent o) {
        boolean vrati = false;
        try {
            komanda = Baza.getVeza().prepareStatement("delete from agent "
                    + " where sifra=?");
            komanda.setInt(1, o.getSifra());
            if (komanda.executeUpdate() == 1) {
                vrati = true;
            }
        } catch (Exception e) {
            Logger.getLogger(ObradaAgent.class.getName()).log(Level.SEVERE, null, e);
        }
        return vrati;
    }

}
