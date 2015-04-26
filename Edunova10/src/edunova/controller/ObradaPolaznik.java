/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.controller;

import edunova.model.Grupa;
import edunova.model.Polaznik;
import edunova.utility.Baza;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Profesor
 */
public class ObradaPolaznik {

    private PreparedStatement komanda;

    public List<Polaznik> dohvati(String uvjet) {
        List<Polaznik> l = new ArrayList<>();
        try {
            komanda = Baza.getVeza().prepareStatement("select a.sifra, a.brojugovora, b.sifra as sifraosobe,"
                    + "b.oib,b.ime,b.prezime,b.email,b.aktivan from polaznik a inner join osoba b on a.osoba=b.sifra where concat(b.ime, ' ', b.prezime) like ?");
            komanda.setString(1, "%" + uvjet + "%");

            l=dohvatiPolaznike();
        } catch (Exception e) {
            Logger.getLogger(ObradaPolaznik.class.getName()).log(Level.SEVERE, null, e);
        }

        return l;
    }
    
    
     public List<Polaznik> dohvatiPoGrupi(Grupa grupa) {
         List<Polaznik> l = new ArrayList<>();
        try {
            komanda = Baza.getVeza().prepareStatement("select a.sifra, a.brojugovora, b.sifra as sifraosobe,"
                    + "b.oib,b.ime,b.prezime,b.email,b.aktivan from polaznik a inner join osoba b on a.osoba=b.sifra inner join clan c on c.polaznik=a.sifra where c.grupa=?");
            komanda.setInt(1, grupa.getSifra());
            l=dohvatiPolaznike();
           
        } catch (Exception e) {
            Logger.getLogger(ObradaPolaznik.class.getName()).log(Level.SEVERE, null, e);
        }

        return l;
    }
     
     private List<Polaznik> dohvatiPolaznike(){
         List<Polaznik> l = new ArrayList<>();
          try {
           
            ResultSet rs = komanda.executeQuery();
            Polaznik o;
            while (rs.next()) {
                o = new Polaznik();
                o.setSifraOsobe(rs.getInt("sifraosobe"));
                o.setSifra(rs.getInt("sifra"));
                o.setBrojUgovora(rs.getString("brojugovora"));
                o.setOib(rs.getString("oib"));
                o.setIme(rs.getString("ime"));
                o.setPrezime(rs.getString("prezime"));
                o.setEmail(rs.getString("email"));
                o.setAktivan(rs.getBoolean("aktivan"));

                l.add(o);
            }
        } catch (Exception e) {
            Logger.getLogger(ObradaPolaznik.class.getName()).log(Level.SEVERE, null, e);
        }
          
          return l;
     }

    public Polaznik dodaj(Polaznik o) {
        try {
            Connection veza = Baza.getVeza();
            veza.setAutoCommit(false);
            komanda = veza.prepareStatement("insert into osoba (oib,ime,prezime,email,aktivan"
                    + ") values (?,?,?,?,?)",PreparedStatement.RETURN_GENERATED_KEYS);

            komanda.setString(1, o.getOib());
            komanda.setString(2, o.getIme());
            komanda.setString(3, o.getPrezime());
            komanda.setString(4, o.getEmail());
            komanda.setBoolean(5, o.isAktivan());
            komanda.executeUpdate();
            
            ResultSet rs = komanda.getGeneratedKeys();
            rs.next();
            o.setSifraOsobe(rs.getInt(1));

            komanda = veza.prepareStatement("insert into polaznik (osoba,brojugovora"
                    + ") values (?,?)", PreparedStatement.RETURN_GENERATED_KEYS);

            komanda.setInt(1, o.getSifraOsobe());
            komanda.setString(2, o.getBrojUgovora());
            komanda.executeUpdate();

            rs = komanda.getGeneratedKeys();
            rs.next();
            o.setSifra(rs.getInt(1));

            veza.commit();

        } catch (Exception e) {
            Logger.getLogger(ObradaPolaznik.class.getName()).log(Level.SEVERE, null, e);
            return null;
        }
        return o;
    }

    public boolean promjeni(Polaznik o) {
        boolean vrati = false;
        try {
            Connection veza = Baza.getVeza();
            veza.setAutoCommit(false);
            komanda = veza.prepareStatement("update polaznik set brojugovora=?"
                    + " where sifra=?");
            komanda.setString(1, o.getBrojUgovora());
            komanda.setInt(2, o.getSifra());
            komanda.executeUpdate();

            komanda = veza.prepareStatement("update osoba set oib=?, ime=?,"
                    + " prezime=?, email=?, aktivan=? where sifra=?");
            komanda.setString(1, o.getOib());
            komanda.setString(2, o.getIme());
            komanda.setString(3, o.getPrezime());
            komanda.setString(4, o.getEmail());
            komanda.setBoolean(5, o.isAktivan());
            komanda.setInt(6, o.getSifraOsobe());
            komanda.executeUpdate();

            veza.commit();

            if (komanda.executeUpdate() == 1) {
                vrati = true;
            }

        } catch (Exception e) {
            Logger.getLogger(ObradaPolaznik.class.getName()).log(Level.SEVERE, null, e);
        }

        return vrati;
    }

    public boolean obrisi(Polaznik o) {
        boolean brisiPolaznik = false;
        boolean brisiOsoba = false;
        try {
            Connection veza = Baza.getVeza();
            veza.setAutoCommit(false);
            komanda = veza.prepareStatement("delete from polaznik "
                    + " where sifra=?");
            komanda.setInt(1, o.getSifra());
            
            
            
            if (komanda.executeUpdate() == 1) {
                brisiPolaznik = true;
            }
            komanda = veza.prepareStatement("delete from osoba "
                    + " where sifra=?");
            komanda.setInt(1, o.getSifraOsobe());
            
            
            
            if (komanda.executeUpdate() == 1) {
                brisiOsoba = true;
            }
            
            
            veza.commit();
            
        } catch (Exception e) {
            Logger.getLogger(ObradaPolaznik.class.getName()).log(Level.SEVERE, null, e);
        }
        return brisiOsoba && brisiPolaznik;
    }

}
