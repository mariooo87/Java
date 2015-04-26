/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.controller;

import edunova.model.Grupa;
import edunova.model.Polaznik;
import edunova.model.Predavac;
import edunova.model.Smjer;
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

/**
 *
 * @author Profesor
 */
public class ObradaGrupa {

    private PreparedStatement komanda;

    public List<Grupa> dohvati(String uvjet) {
        List<Grupa> l = new ArrayList<>();
        try {
            komanda = Baza.getVeza().prepareStatement(" select  "
                    + " a.sifra as sifraGrupe, "
                    + " a.naziv as nazivGrupe, "
                    + " a.brojpolaznika, "
                    + " a.datumpocetka, "
                    + " b.sifra as sifraSmjera, "
                    + " b.naziv as nazivSmjera, "
                    + " b.trajanje, "
                    + " b.cijena, "
                    + " c.sifra as sifraPredavaca, "
                    + " c.iban, "
                    + " d.sifra as sifraOsobe, "
                    + " d.oib, "
                    + " d.ime, "
                    + " d.prezime, "
                    + " d.email, "
                    + " d.aktivan "
                    + " from grupa a  "
                    + " inner join smjer b on a.smjer=b.sifra "
                    + " inner join predavac c on a.predavac=c.sifra "
                    + " inner join osoba d on c.osoba=d.sifra "
                    + " where a.naziv like ? ");
            komanda.setString(1, "%" + uvjet + "%");

            ResultSet rs = komanda.executeQuery();
            Grupa o;
            Smjer s;
            Predavac p;
            while (rs.next()) {
                o = new Grupa();
                o.setSifra(rs.getInt("sifraGrupe"));
                o.setNaziv(rs.getString("nazivGrupe"));
                o.setBrojPolaznika(rs.getInt("brojpolaznika"));
                try {
                     o.setDatumPocetka(new Date(rs.getDate("datumpocetka").getTime()));
                } catch (Exception e) {
                    o.setDatumPocetka(null);
                }
               

                s = new Smjer();
                s.setSifra(rs.getInt("sifraSmjera"));
                s.setNaziv(rs.getString("nazivSmjera"));
                s.setTrajanje(rs.getInt("trajanje"));
                s.setCijena(rs.getBigDecimal("cijena"));
                
                o.setSmjer(s);
                
                
                p=new Predavac();
                 p.setSifraOsobe(rs.getInt("sifraosobe"));
                p.setSifra(rs.getInt("sifrapredavaca"));
                p.setIban(rs.getString("iban"));
                p.setOib(rs.getString("oib"));
                p.setIme(rs.getString("ime"));
                p.setPrezime(rs.getString("prezime"));
                p.setEmail(rs.getString("email"));
                p.setAktivan(rs.getBoolean("aktivan"));
                
                o.setPredavac(p);

                l.add(o);
            }
            
            rs.close();
            ObradaPolaznik op =  new ObradaPolaznik();
            for (Grupa grupa : l) {
                grupa.setPolaznici(op.dohvatiPoGrupi(grupa));
            }
            
            
            
            
        } catch (Exception e) {
            Logger.getLogger(ObradaGrupa.class.getName()).log(Level.SEVERE, null, e);
        }

        return l;
    }

    public Grupa dodaj(Grupa o) {
        try {
            
            Connection veza = Baza.getVeza();
            veza.setAutoCommit(false);
            komanda = veza.prepareStatement("insert into grupa (smjer,predavac, naziv,"
                    + "brojpolaznika,datumpocetka) values (?,?,?,?,?)", Statement.RETURN_GENERATED_KEYS);
            komanda.setInt(1, o.getSmjer().getSifra());
            komanda.setInt(2, o.getPredavac().getSifra());
            komanda.setString(3, o.getNaziv());
            komanda.setInt(4, o.getBrojPolaznika());
            if(o.getDatumPocetka()==null){
                komanda.setDate(5, null);
            }else{
                 komanda.setDate(5,new java.sql.Date(o.getDatumPocetka().getTime()));
            }
            
            komanda.executeUpdate();
            ResultSet rs = komanda.getGeneratedKeys();
            rs.next();
            o.setSifra(rs.getInt(1));
            
           
            komanda = veza.prepareStatement("insert into clan (grupa,polaznik) values (?,?)");
            for (Polaznik p  : o.getPolaznici()) {
                komanda.setInt(1, o.getSifra());
            komanda.setInt(2, p.getSifra());
             komanda.executeUpdate();
            }
            
            veza.commit();
            
        } catch (Exception e) {
            Logger.getLogger(ObradaGrupa.class.getName()).log(Level.SEVERE, null, e);
        }
        return o;
    }

    public boolean promjeni(Grupa o) {
        boolean vrati=true;
        try {
            
            Connection veza = Baza.getVeza();
            veza.setAutoCommit(false);
            komanda = veza.prepareStatement("update grupa set smjer=?,predavac=?, naziv=?,"
                    + "brojpolaznika=?,datumpocetka=? where sifra=?");
            komanda.setInt(1, o.getSmjer().getSifra());
            komanda.setInt(2, o.getPredavac().getSifra());
            komanda.setString(3, o.getNaziv());
            komanda.setInt(4, o.getBrojPolaznika());
            if(o.getDatumPocetka()==null){
                komanda.setDate(5, null);
            }else{
                 komanda.setDate(5,new java.sql.Date(o.getDatumPocetka().getTime()));
            }
            komanda.setInt(6, o.getSifra());
            
            if(komanda.executeUpdate()<1){
                vrati=false;
            }
            komanda = veza.prepareStatement("delete from clan where grupa=?");
            komanda.setInt(1, o.getSifra());
            komanda.executeUpdate();
           
            komanda = veza.prepareStatement("insert into clan (grupa,polaznik) values (?,?)");
            for (Polaznik p  : o.getPolaznici()) {
                komanda.setInt(1, o.getSifra());
            komanda.setInt(2, p.getSifra());
             if(komanda.executeUpdate()<1){
                vrati=false;
            }
            }
            
            veza.commit();
            
        } catch (Exception e) {
            Logger.getLogger(ObradaGrupa.class.getName()).log(Level.SEVERE, null, e);
            vrati=false;
        }
     

        return vrati;
    }

    public boolean obrisi(Grupa o) {
        boolean vrati=true;
        try {
            
            Connection veza = Baza.getVeza();
            veza.setAutoCommit(false);
            komanda = veza.prepareStatement("delete from clan where grupa=?");
            
            komanda.setInt(1, o.getSifra());
            
            komanda.executeUpdate();
            
            komanda = veza.prepareStatement("delete from grupa where sifra=?");
            komanda.setInt(1, o.getSifra());
          
             if(komanda.executeUpdate()<1){
                vrati=false;
            }
            
            
            veza.commit();
            
        } catch (Exception e) {
            Logger.getLogger(ObradaGrupa.class.getName()).log(Level.SEVERE, null, e);
            vrati=false;
        }
     

        return vrati;
    }

}
