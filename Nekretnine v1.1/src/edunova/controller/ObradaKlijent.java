/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.controller;

import edunova.model.Agent;
import edunova.model.Klijent;
import edunova.utility.Baza;
import edunova.utility.Pomocno;
import java.sql.Connection;
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
public class ObradaKlijent {

    private PreparedStatement komanda;

    public List<Klijent> dohvati(String uvjet) {
        List<Klijent> l = new ArrayList<>();
        try {
            komanda = Baza.getVeza().prepareStatement("select "
                    + " a.sifra as sifraKlijenta, "
                    + " a.ime as imeKlijenta, "
                    + " a.prezime as prezimeKlijenta, "
                    + " a.brojtelefona, "
                    + " a.provizija, "
                    + " a.iban, "
                    + " a.email, "
                    + " b.sifra as sifraAgenta, "
                    + " b.ime as imeAgenta, "
                    + " b.prezime as prezimeAgenta, "
                    + " b.oib, "
                    + " b.brojtelefona, "
                    + " b.email, "
                    + " b.korisnik, "
                    + " b.lozinka "
                    + " from klijent a "
                    + " inner join agent b on a.agent=b.sifra "
                    + " where a.ime like ? or a.prezime like ? ");
                  
            komanda.setString(1, "%" + uvjet + "%");
            komanda.setString(2, "%" + uvjet + "%");
            ResultSet rs = komanda.executeQuery();
            
            Klijent o;
            Agent a;
            
            while (rs.next()) {
                o = new Klijent();
                o.setSifra(rs.getInt("sifraKlijenta"));
                o.setIme(rs.getString("imeKlijenta"));
                o.setPrezime(rs.getString("prezimeKlijenta"));
                o.setBrojtelefona(rs.getString("brojtelefona"));
                o.setProvizija(rs.getBigDecimal("provizija"));
                o.setIban(rs.getString("iban"));
                o.setEmail(rs.getString("email"));
                
                
                a = new Agent();
                
                a.setSifra(rs.getInt("sifraAgenta"));
                a.setIme(rs.getString("imeAgenta"));
                a.setPrezime(rs.getString("prezimeAgenta"));
                a.setOib(rs.getString("oib"));
                a.setBrojtelefona(rs.getString("brojtelefona"));
                a.setEmail(rs.getString("email"));
                a.setKorisnik(rs.getString("korisnik"));
                a.setLozinka(rs.getString("lozinka"));
                
                
                o.setAgenti(a);
                
                l.add(o);
            }
            rs.close();
            
            
            
        } catch (Exception e) {
            Logger.getLogger(ObradaKlijent.class.getName()).log(Level.SEVERE, null, e);
        }

        return l;

    }

    public Klijent dodaj(Klijent o) {
        try {
            komanda = Baza.getVeza().prepareStatement("insert into klijent (ime,prezime,iban,brojtelefona,provizija,email,agent"
                    + ") values (?,?,?,?,?,?,?)", Statement.RETURN_GENERATED_KEYS);

            komanda.setString(1, o.getIme());
            komanda.setString(2, o.getPrezime());
            komanda.setString(3, o.getIban());
            komanda.setString(4, o.getBrojtelefona());
            komanda.setBigDecimal(5, o.getProvizija());
            komanda.setString(6, o.getEmail());
            komanda.setInt(7, Pomocno.getAgent().getSifra());
            komanda.executeUpdate();

            ResultSet rs = komanda.getGeneratedKeys();
            rs.next();
            o.setSifra(rs.getInt(1));

            //veza.commit();
        } catch (Exception e) {
            Logger.getLogger(ObradaKlijent.class.getName()).log(Level.SEVERE, null, e);
            return null;
        }
        return o;
    }

    public boolean promjeni(Klijent o) {
        boolean vrati = false;
        try {
            Connection veza = Baza.getVeza();
            veza.setAutoCommit(false);
            komanda = veza.prepareStatement("update klijent set agent=?, ime=?, prezime=?, brojtelefona=?,"
                    + " provizija=?, iban=?, email=?"
                    + " where sifra=?");

            komanda.setInt(1, o.getAgenti().getSifra());
            komanda.setString(2, o.getIme());
            komanda.setString(3, o.getPrezime());
            komanda.setString(4, o.getBrojtelefona());
            komanda.setBigDecimal(5, o.getProvizija());
            komanda.setString(6, o.getIban());
            komanda.setString(7, o.getEmail());
            komanda.setInt(8, o.getSifra());         
            komanda.executeUpdate();

            if (komanda.executeUpdate() == 1) {
                vrati = true;
            }
            
            veza.commit();

        } catch (Exception e) {
            Logger.getLogger(ObradaKlijent.class.getName()).log(Level.SEVERE, null, e);

        }

        return vrati;
    }

    public boolean obrisi(Klijent o) {
        boolean brisiKlijent = false;

        try {
            Connection veza = Baza.getVeza();
            veza.setAutoCommit(false);
            komanda = veza.prepareStatement("delete from klijent "
                    + " where sifra=?");
            komanda.setInt(1, o.getSifra());

            if (komanda.executeUpdate() == 1) {
                brisiKlijent = true;
            }

            veza.commit();

        } catch (Exception e) {
            Logger.getLogger(ObradaKlijent.class.getName()).log(Level.SEVERE, null, e);
        }
        return brisiKlijent;
    }

}
