/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.controller;

import edunova.model.Nekretnina;
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
 * @author Mario
 */
public class ObradaNekretnina {

    private PreparedStatement komanda;

    public List<Nekretnina> dohvati(String uvjet) {
        List<Nekretnina> l = new ArrayList<>();
        try {
            komanda = Baza.getVeza().prepareStatement("select * from nekretnina where vrsta like ? or godinaizgradnje like ? "
                    + " or lokacija like ? or stambenapovrsina like ? or povrsinaokucnice like ? or vrstagrijanja like ? "
                    + " or cijena like ? or brojetaza like ? or brojsoba like ? or vlasnickilist like ? or gradevinskadozvola like ? "
                    + " or uporabnadozvola like ? or prodaja like ? or kupnja like ? ");
            komanda.setString(1, "%" + uvjet + "%");
            komanda.setString(2, "%" + uvjet + "%");
            komanda.setString(3, "%" + uvjet + "%");
            komanda.setString(4, "%" + uvjet + "%");
            komanda.setString(5, "%" + uvjet + "%");
            komanda.setString(6, "%" + uvjet + "%");
            komanda.setString(7, "%" + uvjet + "%");
            komanda.setString(8, "%" + uvjet + "%");
            komanda.setString(9, "%" + uvjet + "%");
            komanda.setString(10, "%" + uvjet + "%");
            komanda.setString(11, "%" + uvjet + "%");
            komanda.setString(12, "%" + uvjet + "%");
            komanda.setString(13, "%" + uvjet + "%");
            komanda.setString(14, "%" + uvjet + "%");
            ResultSet rs = komanda.executeQuery();
            Nekretnina o;
            while (rs.next()) {
                o = new Nekretnina();

                o.setSifra(rs.getInt("sifra"));
                o.setVrsta(rs.getString("vrsta"));
                o.setGodinaizgradnje(rs.getInt("godinaizgradnje"));
                o.setLokacija(rs.getString("lokacija"));
                o.setStambenapovrsina(rs.getInt("stambenapovrsina"));
                o.setPovrsinaokucnice(rs.getInt("povrsinaokucnice"));
                o.setVrstagrijanja(rs.getString("vrstagrijanja"));
                o.setCijena(rs.getBigDecimal("cijena"));
                o.setBrojetaza(rs.getInt("brojetaza"));
                o.setBrojsoba(rs.getInt("brojsoba"));
                o.setVlasnickilist(rs.getBoolean("vlasnickilist"));
                o.setGradevinskadozvola(rs.getBoolean("gradevinskadozvola"));
                o.setUporabnadozvola(rs.getBoolean("uporabnadozvola"));
                o.setProdaja(rs.getBoolean("prodaja"));
                o.setKupnja(rs.getBoolean("kupnja"));

                l.add(o);
            }
        } catch (Exception e) {
            Logger.getLogger(ObradaNekretnina.class.getName()).log(Level.SEVERE, null, e);
        }

        return l;
    }

    public Nekretnina dodaj(Nekretnina o) {
        try {
            komanda = Baza.getVeza().prepareStatement("insert into nekretnina (vrsta,godinaizgradnje,lokacija,stambenapovrsina, "
                    + " povrsinaokucnice,vrstagrijanja,cijena,brojetaza,brojsoba,vlasnickilist,gradevinskadozvola,uporabnadozvola, "
                    + " prodaja,kupnja "
                    + " ) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?)", PreparedStatement.RETURN_GENERATED_KEYS);
            komanda.setString(1, o.getVrsta());
            komanda.setInt(2, o.getGodinaizgradnje());
            komanda.setString(3, o.getLokacija());
            komanda.setInt(4, o.getStambenapovrsina());
            komanda.setInt(5, o.getPovrsinaokucnice());
            komanda.setString(6, o.getVrstagrijanja());
            komanda.setBigDecimal(7, o.getCijena());
            komanda.setInt(8, o.getBrojetaza());
            komanda.setInt(9, o.getBrojsoba());
            komanda.setBoolean(10, o.isVlasnickilist());
            komanda.setBoolean(11, o.isGradevinskadozvola());
            komanda.setBoolean(12, o.isUporabnadozvola());
            komanda.setBoolean(13, o.isProdaja());
            komanda.setBoolean(14, o.isKupnja());

            komanda.executeUpdate();
            ResultSet rs = komanda.getGeneratedKeys();
            rs.next();
            o.setSifra(rs.getInt(1));

        } catch (Exception e) {
            Logger.getLogger(ObradaNekretnina.class.getName()).log(Level.SEVERE, null, e);
        }
        return o;
    }

    public boolean promjeni(Nekretnina o) {
        boolean vrati = false;
        try {
            Connection veza = Baza.getVeza();
            veza.setAutoCommit(false);

            komanda = veza.prepareStatement("update nekretnina set vrsta=?, godinaizgradnje=?, lokacija=?,"
                    + "stambenapovrsina=?, povrsinaokucnice=?, vrstagrijanja=?, cijena=?, brojetaza=?, brojsoba=?,"
                    + "vlasnickilist=?, gradevinskadozvola=?, uporabnadozvola=?, prodaja=?, kupnja =? where sifra=?");
            komanda.setString(1, o.getVrsta());
            komanda.setInt(2, o.getGodinaizgradnje());
            komanda.setString(3, o.getLokacija());
            komanda.setInt(4, o.getStambenapovrsina());
            komanda.setInt(5, o.getPovrsinaokucnice());
            komanda.setString(6, o.getVrstagrijanja());
            komanda.setBigDecimal(7, o.getCijena());
            komanda.setInt(8, o.getBrojetaza());
            komanda.setInt(9, o.getBrojsoba());
            komanda.setBoolean(10, o.isVlasnickilist());
            komanda.setBoolean(11, o.isGradevinskadozvola());
            komanda.setBoolean(12, o.isUporabnadozvola());
            komanda.setBoolean(13, o.isProdaja());
            komanda.setBoolean(14, o.isKupnja());
            komanda.setInt(15, o.getSifra());
            komanda.executeUpdate();

            veza.commit();

            if (komanda.executeUpdate() == 1) {
                vrati = true;
            }

        } catch (Exception e) {
            Logger.getLogger(ObradaNekretnina.class.getName()).log(Level.SEVERE, null, e);
        }

        return vrati;
    }

    public boolean obrisi(Nekretnina o) {
        boolean vrati = false;
        try {
            komanda = Baza.getVeza().prepareStatement("delete from nekretnina "
                    + " where sifra=?");
            komanda.setInt(1, o.getSifra());
            if (komanda.executeUpdate() == 1) {
                vrati = true;
            }
        } catch (Exception e) {
            Logger.getLogger(ObradaNekretnina.class.getName()).log(Level.SEVERE, null, e);
        }
        return vrati;
    }

}
