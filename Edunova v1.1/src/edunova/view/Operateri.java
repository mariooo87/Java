/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.view;

import edunova.controller.ObradaOperater;
import edunova.model.Operater;
import edunova.utility.Pomocno;
import java.awt.Color;
import java.awt.Component;
import java.util.Arrays;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Mario
 */
public class Operateri extends javax.swing.JInternalFrame {

    private ObradaOperater obradaOperater;
    private Operater odabrano;
    /**
     * Creates new form Operateri2
     */
    public Operateri() {
        initComponents();
        obradaOperater=new ObradaOperater();
        //setLocationRelativeTo(null);
       lista.setModel(new DefaultListModel<Operater>());
       setTitle("Operateri");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        akcijaOdustani = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lista = new javax.swing.JList();
        uvjet = new javax.swing.JTextField();
        akcijaTrazi = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        korisnik = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        lozinka = new javax.swing.JPasswordField();
        prezime = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ime = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        lozinkaPonovo = new javax.swing.JPasswordField();
        jPanel3 = new javax.swing.JPanel();
        akcijaDodajNovi = new javax.swing.JButton();
        akcijaObrisi = new javax.swing.JButton();
        akcijaPromjeni = new javax.swing.JButton();

        setBorder(null);

        akcijaOdustani.setIcon(new javax.swing.ImageIcon(getClass().getResource("/slike/back.png"))); // NOI18N
        akcijaOdustani.setText("Nazad");
        akcijaOdustani.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                akcijaOdustaniActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Pretraga (* za sve)"));

        lista.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lista);

        akcijaTrazi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/slike/Magnifier2.png"))); // NOI18N
        akcijaTrazi.setText("Traži");
        akcijaTrazi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                akcijaTraziActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(uvjet, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(akcijaTrazi, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(uvjet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(akcijaTrazi))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setText("Korisnik");

        jLabel3.setText("Lozinka");

        jLabel5.setText("Ime");

        jLabel4.setText("Lozinka ponovo");

        jLabel6.setText("Prezime");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2)
                    .addComponent(korisnik)
                    .addComponent(jLabel3)
                    .addComponent(lozinka)
                    .addComponent(jLabel4)
                    .addComponent(lozinkaPonovo)
                    .addComponent(jLabel5)
                    .addComponent(ime)
                    .addComponent(jLabel6)
                    .addComponent(prezime, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(korisnik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lozinka, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lozinkaPonovo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(prezime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        akcijaDodajNovi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/slike/plus.png"))); // NOI18N
        akcijaDodajNovi.setText("Dodaj novi");
        akcijaDodajNovi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                akcijaDodajNoviActionPerformed(evt);
            }
        });

        akcijaObrisi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/slike/delete.png"))); // NOI18N
        akcijaObrisi.setText("Obriši");
        akcijaObrisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                akcijaObrisiActionPerformed(evt);
            }
        });

        akcijaPromjeni.setIcon(new javax.swing.ImageIcon(getClass().getResource("/slike/ok.png"))); // NOI18N
        akcijaPromjeni.setText("Promjeni");
        akcijaPromjeni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                akcijaPromjeniActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(akcijaDodajNovi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(akcijaPromjeni, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(akcijaObrisi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(akcijaDodajNovi)
                .addGap(18, 18, 18)
                .addComponent(akcijaPromjeni)
                .addGap(18, 18, 18)
                .addComponent(akcijaObrisi)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(akcijaOdustani, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addComponent(akcijaOdustani)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void listaValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaValueChanged
        reset();
        odabrano = (Operater) lista.getSelectedValue();
        if(odabrano==null){
            return;
        }
        korisnik.setText(odabrano.getKorisnik());
        lozinka.setText("");
        lozinkaPonovo.setText("");
        ime.setText(odabrano.getIme());
        prezime.setText(odabrano.getPrezime());

    }//GEN-LAST:event_listaValueChanged

    private void akcijaOdustaniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_akcijaOdustaniActionPerformed
        dispose();
    }//GEN-LAST:event_akcijaOdustaniActionPerformed

    private void akcijaDodajNoviActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_akcijaDodajNoviActionPerformed
        reset();
        if(korisnik.getText().trim().isEmpty()){
            greska(korisnik, "Obavezno korisnik");
            return;
        }

        if(!obradaOperater.provjeraKorisnika(korisnik.getText().trim())){
            greska(korisnik, "Korisnik postoji u bazi, odabarite drugi");
            return;
        }

        if((new String(lozinka.getPassword())).trim().isEmpty()){
            greska(lozinka, "Obavezno lozinka");
            return;
        }
        if((new String(lozinkaPonovo.getPassword())).trim().isEmpty()){
            greska(lozinkaPonovo, "Obavezno ponovo lozinka");
            return;
        }

        if(!Arrays.equals(lozinka.getPassword(), lozinkaPonovo.getPassword())){
            greska(lozinka, "Lozinke ne odgovaraju");
            greska(lozinkaPonovo, "Lozinke ne odgovaraju");
            return;
        }

        if(ime.getText().trim().isEmpty()){
            greska(ime, "Obavezno ime");
            return;
        }
        if(prezime.getText().trim().isEmpty()){
            greska(prezime, "Obavezno prezime");
            return;
        }

        Operater o = new Operater();
        o.setKorisnik(korisnik.getText().trim());
        o.setLozinka(new String(lozinka.getPassword()));
        o.setIme(ime.getText().trim());
        o.setPrezime(prezime.getText().trim());

        o=obradaOperater.dodaj(o);

        DefaultListModel<Operater> m =(DefaultListModel<Operater>) lista.getModel();
        m.addElement(o);

        // System.out.println(o.getSifra());

    }//GEN-LAST:event_akcijaDodajNoviActionPerformed

    private void akcijaPromjeniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_akcijaPromjeniActionPerformed
        if(odabrano==null){
            return;
        }
        reset();
        //kontorle
        if(!odabrano.getKorisnik().equals(korisnik.getText().trim())){
            if(!obradaOperater.provjeraKorisnika(korisnik.getText().trim())){
                greska(korisnik, "Korisnik postoji, odaberite drugo korisničko ime");
                return;
            }

        }
        if(new String(lozinka.getPassword()).trim().length()>0 &&
            new String(lozinkaPonovo.getPassword()).trim().length()>0 &&
            !Arrays.equals(lozinka.getPassword(), lozinkaPonovo.getPassword()) ){
            greska(lozinka, "Lozinka i lozinka ponovo ne odgovaraju");
            greska(lozinkaPonovo, "Lozinka i lozinka ponovo ne odgovaraju");
        }

        if(ime.getText().trim().isEmpty()){
            greska(ime, "Obavezno ime");
            return;
        }
        if(prezime.getText().trim().isEmpty()){
            greska(prezime, "Obavezno prezime");
            return;
        }
        odabrano.setKorisnik(korisnik.getText().trim());
        odabrano.setLozinka(new String(lozinka.getPassword()));
        odabrano.setIme(ime.getText());
        odabrano.setPrezime(prezime.getText());

        //promjena u bazi
        if(!obradaOperater.promjeni(odabrano)){
            return;
        }

        //dodavanje/postavljanje
        //nekada ne radi dobro
        lista.repaint();
        //manje optimizirano
        // akcijaTraziActionPerformed(evt);
        /*
        DefaultListModel<Operater> m = (DefaultListModel<Operater>) lista.getModel();

        Enumeration<Operater> e = m.elements();
        Operater o;
        while(e.hasMoreElements()){
            o=e.nextElement();
            if(o.getSifra()==odabrano.getSifra()){
                System.out.println(" treba zamijeniti " + o.getPrezime() + " u " +
                    odabrano.getPrezime());
                break;
            }
        }
        */
    }//GEN-LAST:event_akcijaPromjeniActionPerformed

    private void akcijaObrisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_akcijaObrisiActionPerformed

        odabrano = (Operater) lista.getSelectedValue();
        if(odabrano==null){
            return;
        }
        
        if(odabrano.getSifra()==Pomocno.getOperater().getSifra()){
            JOptionPane.showMessageDialog(getParent(), "Nije moguće trenutno brisati: " + odabrano.getImePrezime(), "Upozorenje!", WIDTH);
            return;
        }
        
        if(JOptionPane.showConfirmDialog(getParent(), "Jeste li sigurni da želite obrisati " + odabrano.getImePrezime() + "?","Brisanje operatera",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE)==JOptionPane.NO_OPTION){
            return;
        }

        if(!obradaOperater.obrisi(odabrano)){
            return;
        }

        DefaultListModel<Operater> m = (DefaultListModel<Operater>) lista.getModel();
        m.removeElement(odabrano);
        lista.repaint();
        cistiPolja();
    }//GEN-LAST:event_akcijaObrisiActionPerformed

    private void akcijaTraziActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_akcijaTraziActionPerformed

        cistiPolja();

        List<Operater> operateri = obradaOperater.
        dohvati(uvjet.getText());

        DefaultListModel<Operater> m = new DefaultListModel<>();
        for (Operater operater : operateri) {
            m.addElement(operater);
        }
        lista.setModel(m);

    }//GEN-LAST:event_akcijaTraziActionPerformed

    private void cistiPolja(){
         korisnik.setText("");
        lozinka.setText("");
        lozinkaPonovo.setText("");
        ime.setText("");
        prezime.setText("");
    }
    
    private void reset() {
       
        for (Component c : this.getContentPane().getComponents()) {
            if (c instanceof JTextField || c instanceof JPasswordField){
                JComponent jc = (JComponent) c;
                jc.setBackground(Color.white);
                jc.setToolTipText("");
            }
        }
    }
    
    private void greska(JComponent komponenta, String obavijest){
           komponenta.setBackground(Color.red);
           komponenta.requestFocus();
           komponenta.setToolTipText(obavijest);
           
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton akcijaDodajNovi;
    private javax.swing.JButton akcijaObrisi;
    private javax.swing.JButton akcijaOdustani;
    private javax.swing.JButton akcijaPromjeni;
    private javax.swing.JButton akcijaTrazi;
    private javax.swing.JTextField ime;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField korisnik;
    private javax.swing.JList lista;
    private javax.swing.JPasswordField lozinka;
    private javax.swing.JPasswordField lozinkaPonovo;
    private javax.swing.JTextField prezime;
    private javax.swing.JTextField uvjet;
    // End of variables declaration//GEN-END:variables
}