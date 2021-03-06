/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.view;

import edunova.controller.ObradaAgent;
import edunova.model.Agent;
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
public class Agenti extends javax.swing.JInternalFrame {
    
    private ObradaAgent obradaAgent;
    private Agent odabrano;

    /**
     * Creates new form Agenti
     */
    public Agenti() {
        initComponents();
        obradaAgent = new ObradaAgent();
        lista.setModel(new DefaultListModel<Agent>());
        setTitle("Agenti: "
                + Pomocno.getAgent().getImePrezime());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        korisnik = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        brojtelefona = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        lozinkaPonovo = new javax.swing.JPasswordField();
        ime = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        oib = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        lozinka = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        prezime = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        akcijaObrisi = new javax.swing.JButton();
        akcijaPromjeni = new javax.swing.JButton();
        akcijaDodajNovi = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        uvjet = new javax.swing.JTextField();
        akcijaTrazi = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lista = new javax.swing.JList();
        jLabel10 = new javax.swing.JLabel();
        akcijaOdustani = new javax.swing.JButton();

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel5.setText("Ime");

        jLabel8.setText("Broj telefona");

        jLabel7.setText("OIB");

        jLabel4.setText("Lozinka ponovo");

        jLabel9.setText("e-mail");

        jLabel2.setText("Korisničko ime");

        jLabel6.setText("Prezime");

        jLabel3.setText("Lozinka");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(lozinka, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(korisnik, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lozinkaPonovo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7)
                    .addComponent(oib)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(prezime)
                    .addComponent(jLabel8)
                    .addComponent(brojtelefona)
                    .addComponent(jLabel9)
                    .addComponent(email)
                    .addComponent(ime, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(prezime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(oib, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(korisnik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lozinka, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lozinkaPonovo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(brojtelefona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        akcijaObrisi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/DeleteRed.png"))); // NOI18N
        akcijaObrisi.setText("Obriši");
        akcijaObrisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                akcijaObrisiActionPerformed(evt);
            }
        });

        akcijaPromjeni.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Pencil3.png"))); // NOI18N
        akcijaPromjeni.setText("Promjeni");
        akcijaPromjeni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                akcijaPromjeniActionPerformed(evt);
            }
        });

        akcijaDodajNovi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Plus__Orange.png"))); // NOI18N
        akcijaDodajNovi.setText("Dodaj novi");
        akcijaDodajNovi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                akcijaDodajNoviActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(akcijaDodajNovi, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(akcijaPromjeni, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(akcijaObrisi, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(akcijaPromjeni)
                    .addComponent(akcijaObrisi)
                    .addComponent(akcijaDodajNovi))
                .addContainerGap())
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Pretraga (* za sve)"));

        akcijaTrazi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Magnifier2.png"))); // NOI18N
        akcijaTrazi.setText("Traži");
        akcijaTrazi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                akcijaTraziActionPerformed(evt);
            }
        });

        lista.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lista);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(uvjet, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(akcijaTrazi)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(uvjet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(akcijaTrazi))
                .addGap(23, 23, 23)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/real_estate_picture.jpg"))); // NOI18N

        akcijaOdustani.setBackground(new java.awt.Color(51, 153, 255));
        akcijaOdustani.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/back.png"))); // NOI18N
        akcijaOdustani.setText("Nazad");
        akcijaOdustani.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                akcijaOdustaniActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(akcijaOdustani, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 58, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel10)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addGap(4, 4, 4)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(akcijaOdustani, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void akcijaObrisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_akcijaObrisiActionPerformed

        odabrano = (Agent) lista.getSelectedValue();
        if (odabrano == null) {
            return;
        }

        if(odabrano.getSifra()==Pomocno.getAgent().getSifra()){
            JOptionPane.showMessageDialog(getParent(), "Nije moguće trenutno brisati: " + odabrano.getImePrezime(), "Upozorenje!", WIDTH);
            return;
        }

        if (JOptionPane.showConfirmDialog(getParent(), "Jeste li sigurni da želite obrisati: " + odabrano.getImePrezime() + "?", "Brisanje agenta", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.NO_OPTION) {
            return;
        }

        if (!obradaAgent.obrisi(odabrano)) {
            return;
        }

        DefaultListModel<Agent> m = (DefaultListModel<Agent>) lista.getModel();
        m.removeElement(odabrano);
        lista.repaint();
        cistiPolja();
    }//GEN-LAST:event_akcijaObrisiActionPerformed

    private void akcijaDodajNoviActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_akcijaDodajNoviActionPerformed
        reset();
        if (korisnik.getText().trim().isEmpty()) {
            greska(korisnik, "Obavezno korisnik");
            return;
        }

        if (!obradaAgent.provjeraKorisnika(korisnik.getText().trim())) {
            greska(korisnik, "Korisnik postoji u bazi, odabarite drugi");
            return;
        }

        if ((new String(lozinka.getPassword())).trim().isEmpty()) {
            greska(lozinka, "Obavezno lozinka");
            return;
        }
        if ((new String(lozinkaPonovo.getPassword())).trim().isEmpty()) {
            greska(lozinkaPonovo, "Obavezno ponovo lozinka");
            return;
        }

        if (!Arrays.equals(lozinka.getPassword(), lozinkaPonovo.getPassword())) {
            greska(lozinka, "Lozinke ne odgovaraju");
            greska(lozinkaPonovo, "Lozinke ne odgovaraju");
            return;
        }

        if (ime.getText().trim().isEmpty()) {
            greska(ime, "Obavezno ime");
            return;
        }
        if (prezime.getText().trim().isEmpty()) {
            greska(prezime, "Obavezno prezime");
            return;
        }

        if (oib.getText().trim().isEmpty()) {
            greska(oib, "Obavezno OIB");
            return;
        }
        
        try {
            Integer.parseInt(oib.getText().trim());
        } catch (NumberFormatException e) {
            greska(oib, "OIB nije dobrog formata");
            return;
        }

        if (brojtelefona.getText().trim().isEmpty()) {
            greska(brojtelefona, "Obavezno broj telefona");
            return;
        }
        
        try {
            Integer.parseInt(brojtelefona.getText().trim());
        } catch (NumberFormatException e) {
            greska(brojtelefona, "Broj nije dobrog formata");
            return;
        }

        if (email.getText().trim().isEmpty()) {
            greska(email, "Obavezno e-mail");
            return;
        }

        Agent o = new Agent();
        o.setKorisnik(korisnik.getText().trim());
        o.setLozinka(new String(lozinka.getPassword()));
        o.setIme(ime.getText().trim());
        o.setPrezime(prezime.getText().trim());
        o.setOib(oib.getText().trim());
        o.setBrojtelefona(brojtelefona.getText().trim());
        o.setEmail(email.getText().trim());

        o = obradaAgent.dodaj(o);

        DefaultListModel<Agent> m = (DefaultListModel<Agent>) lista.getModel();
        m.addElement(o);
    }//GEN-LAST:event_akcijaDodajNoviActionPerformed

    private void akcijaOdustaniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_akcijaOdustaniActionPerformed
        dispose();
    }//GEN-LAST:event_akcijaOdustaniActionPerformed

    private void akcijaPromjeniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_akcijaPromjeniActionPerformed
        if (odabrano == null) {
            return;
        }
        reset();

        if (!odabrano.getKorisnik().equals(korisnik.getText().trim())) {
            if (!obradaAgent.provjeraKorisnika(korisnik.getText().trim())) {
                greska(korisnik, "Korisnik postoji, odaberite drugo korisničko ime");
                return;
            }

        }
        if (new String(lozinka.getPassword()).trim().length() > 0
            && new String(lozinkaPonovo.getPassword()).trim().length() > 0
            && !Arrays.equals(lozinka.getPassword(), lozinkaPonovo.getPassword())) {
            greska(lozinka, "Lozinka i lozinka ponovo ne odgovaraju");
            greska(lozinkaPonovo, "Lozinka i lozinka ponovo ne odgovaraju");
        }

        if (ime.getText().trim().isEmpty()) {
            greska(ime, "Obavezno ime");
            return;
        }
        if (prezime.getText().trim().isEmpty()) {
            greska(prezime, "Obavezno prezime");
            return;
        }
        if (oib.getText().trim().isEmpty()) {
            greska(oib, "Obavezno OIB");
            return;
        }
        
        try {
            Integer.parseInt(oib.getText().trim());
        } catch (NumberFormatException e) {
            greska(oib, "OIB nije dobrog formata");
            return;
        }
        
        if (brojtelefona.getText().trim().isEmpty()) {
            greska(brojtelefona, "Obavezno broj telefona");
            return;
        }
        
        try {
            Integer.parseInt(brojtelefona.getText().trim());
        } catch (NumberFormatException e) {
            greska(brojtelefona, "Broj nije dobrog formata");
            return;
        }
        
        if (email.getText().trim().isEmpty()) {
            greska(email, "Obavezno e-mail");
            return;
        }

        odabrano.setKorisnik(korisnik.getText().trim());
        odabrano.setLozinka(new String(lozinka.getPassword()));
        odabrano.setIme(ime.getText());
        odabrano.setPrezime(prezime.getText());
        odabrano.setOib(oib.getText());
        odabrano.setBrojtelefona(brojtelefona.getText());
        odabrano.setEmail(email.getText());

        if (!obradaAgent.promjeni(odabrano)) {
            return;
        }

        lista.repaint();
    }//GEN-LAST:event_akcijaPromjeniActionPerformed

    private void akcijaTraziActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_akcijaTraziActionPerformed

        cistiPolja();

        List<Agent> agenti = obradaAgent.
        dohvati(uvjet.getText());

        DefaultListModel<Agent> m = new DefaultListModel<>();
        for (Agent agent : agenti) {
            m.addElement(agent);
        }
        lista.setModel(m);

    }//GEN-LAST:event_akcijaTraziActionPerformed

    private void listaValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaValueChanged
        reset();
        odabrano = (Agent) lista.getSelectedValue();
        if (odabrano == null) {
            return;
        }
        korisnik.setText(odabrano.getKorisnik());
        lozinka.setText("");
        lozinkaPonovo.setText("");
        ime.setText(odabrano.getIme());
        prezime.setText(odabrano.getPrezime());
        oib.setText(odabrano.getOib());
        brojtelefona.setText(String.valueOf(odabrano.getBrojtelefona()));
        email.setText(odabrano.getEmail());

    }//GEN-LAST:event_listaValueChanged

    private void greska(JComponent komponenta, String obavijest) {
        komponenta.setBackground(Color.red);
        komponenta.requestFocus();
        komponenta.setToolTipText(obavijest);
        
    }
    
    private void reset() {
        
        for (Component c : this.getContentPane().getComponents()) {
            if (c instanceof JTextField || c instanceof JPasswordField) {
                JComponent jc = (JComponent) c;
                jc.setBackground(Color.white);
                jc.setToolTipText("");
            }
        }
    }
    
    private void cistiPolja() {
        korisnik.setText("");
        lozinka.setText("");
        lozinkaPonovo.setText("");
        ime.setText("");
        prezime.setText("");
        oib.setText("");
        brojtelefona.setText("");
        email.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton akcijaDodajNovi;
    private javax.swing.JButton akcijaObrisi;
    private javax.swing.JButton akcijaOdustani;
    private javax.swing.JButton akcijaPromjeni;
    private javax.swing.JButton akcijaTrazi;
    private javax.swing.JTextField brojtelefona;
    private javax.swing.JTextField email;
    private javax.swing.JTextField ime;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField korisnik;
    private javax.swing.JList lista;
    private javax.swing.JPasswordField lozinka;
    private javax.swing.JPasswordField lozinkaPonovo;
    private javax.swing.JTextField oib;
    private javax.swing.JTextField prezime;
    private javax.swing.JTextField uvjet;
    // End of variables declaration//GEN-END:variables
}
