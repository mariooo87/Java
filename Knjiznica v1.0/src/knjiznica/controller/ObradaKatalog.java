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
import knjiznica.model.Izdavac;
import knjiznica.model.Katalog;
import knjiznica.model.Mjesto;
import knjiznica.utility.Baza;

/**
 *
 * @author Mario
 */
public class ObradaKatalog {

    private PreparedStatement komanda;

    public List<Katalog> dohvati(String uvjet) {
        List<Katalog> l = new ArrayList<>();
        try {
            komanda = Baza.getVeza().prepareStatement(" select  "
                    + " a.sifra as sifraKataloga, "
                    + " a.naslov, "
                    + " b.sifra as sifraAutora, "
                    + " b.ime, "
                    + " b.prezime, "
                    + " b.datumrodenja, "
                    + " c.sifra as sifraIzdavaca, "
                    + " c.naziv as nazivIzdavaca, "
                    + " c.aktivan, "
                    + " d.sifra as sifraMjesta, "
                    + " d.naziv as nazivMjesta, "
                    + " d.postanskiBroj, "
                    + " d.drzava "
                    + " from katalog a  "
                    + " inner join autor b on a.autor=b.sifra "
                    + " inner join izdavac c on a.izdavac=c.sifra "
                    + " inner join mjesto d on a.mjesto=d.sifra "
                    + " where a.naslov like ? ");
            komanda.setString(1, "%" + uvjet + "%");

            ResultSet rs = komanda.executeQuery();

            Katalog k;
            Autor a;
            Izdavac i;
            Mjesto mj;

            while (rs.next()) {

                k = new Katalog();
                k.setSifra(rs.getInt("sifraKataloga"));
                k.setNaslov(rs.getString("naslov"));

                a = new Autor();
                a.setSifra(rs.getInt("sifraAutora"));
                a.setIme(rs.getString("ime"));
                a.setPrezime(rs.getString("prezime"));
                try {
                    a.setDatumrodenja(new Date(rs.getDate("datumrodenja").getTime()));
                } catch (Exception e) {
                    a.setDatumrodenja(null);
                }

                k.setAutor(a);

                
                i = new Izdavac();
                i.setSifra(rs.getInt("sifraIzdavaca"));
                i.setNaziv(rs.getString("nazivIzdavaca"));
                i.setAktivan(rs.getBoolean("aktivan"));

                k.setIzdavac(i);
                
                
                mj = new Mjesto();
                mj.setSifra(rs.getInt("sifraMjesta"));
                mj.setNaziv(rs.getString("nazivMjesta"));
                mj.setPostanskiBroj(rs.getString("postanskiBroj"));
                mj.setDrzava(rs.getString("drzava"));
                
                k.setMjesto(mj);
                
                l.add(k);
            }

            rs.close();


        } catch (Exception e) {
            Logger.getLogger(ObradaKatalog.class.getName()).log(Level.SEVERE, null, e);
        }

        return l;
    }

    public Katalog dodaj(Katalog k) {
        try {

            Connection veza = Baza.getVeza();
            veza.setAutoCommit(false);
            komanda = veza.prepareStatement("insert into katalog (autor, naslov,"
                    + "izdavac,mjesto) values (?,?,?,?)", Statement.RETURN_GENERATED_KEYS);
            komanda.setInt(1, k.getAutor().getSifra());
            komanda.setString(2, k.getNaslov());
            komanda.setInt(3, k.getIzdavac().getSifra());
            komanda.setInt(4, k.getMjesto().getSifra());

            komanda.executeUpdate();
            ResultSet rs = komanda.getGeneratedKeys();
            rs.next();
            k.setSifra(rs.getInt(1));

            veza.commit();

        } catch (Exception e) {
            Logger.getLogger(ObradaKatalog.class.getName()).log(Level.SEVERE, null, e);
        }
        return k;
    }

    public boolean promjeni(Katalog k) {
        boolean vrati = true;
        try {

            Connection veza = Baza.getVeza();
            veza.setAutoCommit(false);
            komanda = veza.prepareStatement("update katalog set autor=?,naslov=?, izdavac=?,"
                    + "mjesto=? where sifra=?");
            komanda.setInt(1, k.getAutor().getSifra());
            komanda.setString(2, k.getNaslov());
            komanda.setInt(3, k.getIzdavac().getSifra());
            komanda.setInt(4, k.getMjesto().getSifra());
            komanda.setInt(5, k.getSifra());

            if (komanda.executeUpdate() < 1) {
                vrati = false;
            }

            veza.commit();

        } catch (Exception e) {
            Logger.getLogger(ObradaKatalog.class.getName()).log(Level.SEVERE, null, e);
            vrati = false;
        }

        return vrati;
    }

    public boolean obrisi(Katalog k) {
        boolean vrati = true;
        try {

            Connection veza = Baza.getVeza();
            veza.setAutoCommit(false);
 
            komanda = veza.prepareStatement("delete from katalog where sifra=?");
            komanda.setInt(1, k.getSifra());

            if (komanda.executeUpdate() < 1) {
                vrati = false;
            }

            veza.commit();

        } catch (Exception e) {
            Logger.getLogger(ObradaKatalog.class.getName()).log(Level.SEVERE, null, e);
            vrati = false;
        }

        return vrati;
    }

}
