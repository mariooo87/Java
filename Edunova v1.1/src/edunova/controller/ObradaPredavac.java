/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.controller;

import edunova.model.Predavac;
import edunova.utility.Baza;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

/**
 *
 * @author Profesor
 */
public class ObradaPredavac {

    private PreparedStatement komanda;

    public List<Predavac> dohvati(String uvjet) {
        List<Predavac> l = new ArrayList<>();
        try {
            komanda = Baza.getVeza().prepareStatement("select a.slika, a.sifra, a.iban, b.sifra as sifraosobe,"
                    + "b.oib,b.ime,b.prezime,b.email,b.aktivan from predavac a inner join osoba b on a.osoba=b.sifra where concat(b.ime, ' ', b.prezime) like ?");
            komanda.setString(1, "%" + uvjet + "%");

            ResultSet rs = komanda.executeQuery();
            Predavac o;
            while (rs.next()) {
                o = new Predavac();
                o.setSifraOsobe(rs.getInt("sifraosobe"));
                o.setSifra(rs.getInt("sifra"));
                o.setIban(rs.getString("iban"));
                o.setOib(rs.getString("oib"));
                o.setIme(rs.getString("ime"));
                o.setPrezime(rs.getString("prezime"));
                o.setEmail(rs.getString("email"));
                o.setAktivan(rs.getBoolean("aktivan"));


                l.add(o);
            }
        } catch (Exception e) {
            Logger.getLogger(ObradaPredavac.class.getName()).log(Level.SEVERE, null, e);
        }

        return l;
    }

    public Predavac dodaj(Predavac o) {
        try {
            Connection veza = Baza.getVeza();
            veza.setAutoCommit(false);
            komanda = veza.prepareStatement("insert into osoba (ime,prezime,oib,email,aktivan"
                    + ") values (?,?,?,?,?)", PreparedStatement.RETURN_GENERATED_KEYS);

            komanda.setString(1, o.getIme());
            komanda.setString(2, o.getPrezime());
            komanda.setString(3, o.getOib());
            komanda.setString(4, o.getEmail());
            komanda.setBoolean(5, o.isAktivan());

            komanda.executeUpdate();

            ResultSet rs = komanda.getGeneratedKeys();
            rs.next();
            o.setSifraOsobe(rs.getInt(1));

            komanda = veza.prepareStatement("insert into predavac (osoba,iban"
                    + ") values (?,?)", PreparedStatement.RETURN_GENERATED_KEYS);

            komanda.setInt(1, o.getSifraOsobe());
            komanda.setString(2, o.getIban());
            komanda.executeUpdate();

            rs = komanda.getGeneratedKeys();
            rs.next();
            o.setSifra(rs.getInt(1));

            veza.commit();

        } catch (Exception e) {
            Logger.getLogger(ObradaPredavac.class.getName()).log(Level.SEVERE, null, e);
            return null;
        }
        return o;
    }

    public boolean promjeni(Predavac o) {
        boolean vrati = false;
        try {
            Connection veza = Baza.getVeza();
            veza.setAutoCommit(false);
            komanda = veza.prepareStatement("update predavac set iban=?"
                    + " where sifra=?");
            komanda.setString(1, o.getIban());
            komanda.setInt(2, o.getSifra());
            komanda.executeUpdate();

            komanda = veza.prepareStatement("update osoba set ime=?, prezime=?, oib=?, email=?, aktivan=? where sifra=?");

            komanda.setString(1, o.getIme());
            komanda.setString(2, o.getPrezime());
            komanda.setString(3, o.getOib());
            komanda.setString(4, o.getEmail());
            komanda.setBoolean(5, o.isAktivan());
            komanda.setInt(6, o.getSifraOsobe());

            komanda.executeUpdate();

            veza.commit();

            if (komanda.executeUpdate() == 1) {
                vrati = true;
            }

        } catch (Exception e) {
            Logger.getLogger(ObradaPredavac.class.getName()).log(Level.SEVERE, null, e);
        }

        return vrati;
    }

    

    public boolean obrisi(Predavac o) {
        boolean brisiPredavac = false;
        boolean brisiOsoba = false;
        try {
            Connection veza = Baza.getVeza();
            veza.setAutoCommit(false);
            komanda = veza.prepareStatement("delete from predavac "
                    + " where sifra=?");
            komanda.setInt(1, o.getSifra());

            if (komanda.executeUpdate() == 1) {
                brisiPredavac = true;
            }
            komanda = veza.prepareStatement("delete from osoba "
                    + " where sifra=?");
            komanda.setInt(1, o.getSifraOsobe());

            if (komanda.executeUpdate() == 1) {
                brisiOsoba = true;
            }

            veza.commit();

        } catch (Exception e) {
            Logger.getLogger(ObradaPredavac.class.getName()).log(Level.SEVERE, null, e);
        }
        return brisiOsoba && brisiPredavac;
    }

}
