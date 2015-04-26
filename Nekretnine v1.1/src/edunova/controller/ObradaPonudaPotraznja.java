/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.controller;

import edunova.model.Agent;
import edunova.model.PonudaPotraznja;
import edunova.model.Klijent;
import edunova.model.Nekretnina;
import edunova.utility.Baza;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;

/**
 *
 * @author Mario
 */
public class ObradaPonudaPotraznja {

    private PreparedStatement komanda;
    
    
    public List<Nekretnina> dohvatiNekretnina(String uvjet) {
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
    

    public List<Klijent> dohvatiKlijent(String uvjet) {
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
        

    public List<PonudaPotraznja> dohvatiPonudaPotraznja(String uvjet) {
        List<PonudaPotraznja> l = new ArrayList<>();
        try {
            komanda = Baza.getVeza().prepareStatement(" select  "
                    + " a.sifra as sifraPonudePotraznje, "
                    + " a.naziv, "
                    + " a.datum, "
                    + " a.cijenasprovizijom, "
                    + " a.kupnjanekretnine, "
                    + " a.prodajanekretnine, "
                    + " b.sifra as sifraNekretnine, "
                    + " b.vrsta, "
                    + " b.godinaizgradnje, "
                    + " b.lokacija, "
                    + " b.stambenapovrsina, "
                    + " b.povrsinaokucnice, "
                    + " b.vrstagrijanja, "
                    + " b.cijena, "
                    + " b.brojetaza, "
                    + " b.brojsoba, "
                    + " b.vlasnickilist, "
                    + " b.gradevinskadozvola, "
                    + " b.uporabnadozvola, "
                    + " b.prodaja, "
                    + " b.kupnja, "
                    + " c.sifra as sifraKlijenta, "
                    + " c.ime as imeKlijenta, "
                    + " c.prezime as prezimeKlijenta, "
                    + " c.brojtelefona, "
                    + " c.provizija, "
                    + " c.iban, "
                    + " c.email "
                    + " from PonudaPotraznja a "
                    + " inner join nekretnina b on a.nekretnina=b.sifra " 
                    + " inner join klijent c on a.klijent=c.sifra "
                    + " where a.naziv like ? ");
            komanda.setString(1, "%" + uvjet + "%");

            ResultSet rs = komanda.executeQuery();

            PonudaPotraznja pp;
            Nekretnina n;
            Klijent k;

            while (rs.next()) {
                pp = new PonudaPotraznja();
                pp.setSifra(rs.getInt("sifraPonudePotraznje"));
                pp.setNaziv(rs.getString("naziv"));

                try {
                    pp.setDatum(new Date(rs.getDate("datum").getTime()));
                } catch (Exception e) {
                    pp.setDatum(null);
                }

                pp.setCijenasprovizijom(rs.getBigDecimal("cijenasprovizijom"));
                pp.setKupnjanekretnine(rs.getBoolean("kupnjanekretnine"));
                pp.setProdajanekretnine(rs.getBoolean("prodajanekretnine"));

                n = new Nekretnina();
                n.setSifra(rs.getInt("sifraNekretnine"));
                n.setVrsta(rs.getString("vrsta"));
                n.setGodinaizgradnje(rs.getInt("godinaizgradnje"));
                n.setLokacija(rs.getString("lokacija"));
                n.setStambenapovrsina(rs.getInt("stambenapovrsina"));
                n.setPovrsinaokucnice(rs.getInt("povrsinaokucnice"));
                n.setVrstagrijanja(rs.getString("vrstagrijanja"));
                n.setCijena(rs.getBigDecimal("cijena"));
                n.setBrojetaza(rs.getInt("brojetaza"));
                n.setBrojsoba(rs.getInt("brojsoba"));
                n.setVlasnickilist(rs.getBoolean("vlasnickilist"));
                n.setGradevinskadozvola(rs.getBoolean("gradevinskadozvola"));
                n.setUporabnadozvola(rs.getBoolean("uporabnadozvola"));
                n.setProdaja(rs.getBoolean("prodaja"));
                n.setKupnja(rs.getBoolean("kupnja"));

                pp.setNekretnine(n);

                k = new Klijent();
                k.setSifra(rs.getInt("sifraKlijenta"));
                k.setIme(rs.getString("imeKlijenta"));
                k.setPrezime(rs.getString("prezimeKlijenta"));
                k.setBrojtelefona(rs.getString("brojtelefona"));
                k.setProvizija(rs.getBigDecimal("provizija"));
                k.setIban(rs.getString("iban"));
                k.setEmail(rs.getString("email"));

                pp.setKlijenti(k);

                l.add(pp);
            }

            rs.close();

        } catch (Exception e) {
            Logger.getLogger(ObradaPonudaPotraznja.class.getName()).log(Level.SEVERE, null, e);
        }

        return l;
    }

    public PonudaPotraznja dodaj(PonudaPotraznja a) {
        try {

            Connection veza = Baza.getVeza();
            veza.setAutoCommit(false);
            komanda = veza.prepareStatement("insert into ponudapotraznja (naziv,datum,cijenasprovizijom, "
                    + " kupnjanekretnine,prodajanekretnine,klijent,nekretnina) values (?,?,?,?,?,?,?)", Statement.RETURN_GENERATED_KEYS);

            komanda.setString(1, a.getNaziv());
            komanda.setDate(2, new java.sql.Date(a.getDatum().getTime()));
            
            
            komanda.setBigDecimal(3, a.getCijenasprovizijom());
            komanda.setBoolean(4, a.getKupnjanekretnine());
            komanda.setBoolean(5, a.getProdajanekretnine());
            komanda.setInt(6, a.getKlijenti().getSifra());
            komanda.setInt(7, a.getNekretnine().getSifra());

            komanda.executeUpdate();

            ResultSet rs = komanda.getGeneratedKeys();
            rs.next();
            a.setSifra(rs.getInt(1));
            
            veza.commit();

        } catch (Exception e) {
            Logger.getLogger(ObradaPonudaPotraznja.class.getName()).log(Level.SEVERE, null, e);
        }
        return a;
    }

    public boolean obrisi(PonudaPotraznja a) {
        boolean vrati = true;
        try {

            Connection veza = Baza.getVeza();
            veza.setAutoCommit(false);

            komanda = veza.prepareStatement("delete from ponudapotraznja where sifra=?");
            komanda.setInt(1, a.getSifra());

            if (komanda.executeUpdate() < 1) {
                vrati = false;
            }

            veza.commit();

        } catch (Exception e) {
            Logger.getLogger(ObradaPonudaPotraznja.class.getName()).log(Level.SEVERE, null, e);
            vrati = false;
        }

        return vrati;
    }

}
