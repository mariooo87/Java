/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.view;

import edunova.controller.ObradaAgent;
import edunova.controller.ObradaKlijent;
import edunova.model.Agent;
import edunova.model.Klijent;
import java.awt.Color;
import java.awt.Component;
import java.math.BigDecimal;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Mario
 */
public class Klijenti extends javax.swing.JInternalFrame {

    private ObradaKlijent obradaKlijent;
    private Klijent odabrano;

    /**
     * Creates new form Klijenti
     */
    public Klijenti() {
        initComponents();

        obradaKlijent = new ObradaKlijent();
        lista.setModel(new DefaultListModel<Klijent>());
        setTitle("Klijenti");

        ObradaAgent oag = new ObradaAgent();
        List<Agent> lag = oag.dohvati("");
        DefaultComboBoxModel<Agent> mag = new DefaultComboBoxModel<>();
        for (Agent l : lag) {
            mag.addElement(l);
        }

        sviAgenti.setModel(mag);
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
        email = new javax.swing.JTextField();
        prezime = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        iban = new javax.swing.JTextField();
        brojtelefona = new javax.swing.JTextField();
        ime = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        provizija = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        akcijaObrisi = new javax.swing.JButton();
        akcijaPromjeni = new javax.swing.JButton();
        akcijaDodajNovi = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        uvjet = new javax.swing.JTextField();
        akcijaTrazi = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lista = new javax.swing.JList();
        sviAgenti = new javax.swing.JComboBox();
        akcijaOdustani = new javax.swing.JButton();

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel9.setText("e-mail");

        jLabel10.setText("Provizija [%]");

        jLabel6.setText("Prezime");

        jLabel7.setText("IBAN");

        jLabel8.setText("Broj telefona");

        jLabel5.setText("Ime");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ime)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel5))
                        .addGap(0, 173, Short.MAX_VALUE))
                    .addComponent(prezime)
                    .addComponent(iban)
                    .addComponent(brojtelefona)
                    .addComponent(provizija)
                    .addComponent(email))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(prezime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(iban, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(brojtelefona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(provizija, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addGap(10, 10, 10)
                .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addContainerGap()
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
                    .addComponent(akcijaDodajNovi)
                    .addComponent(akcijaPromjeni)
                    .addComponent(akcijaObrisi))
                .addContainerGap())
        );

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/real_estate_picture.jpg"))); // NOI18N

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Pretraga (* za sve)"));

        akcijaTrazi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Magnifier2.png"))); // NOI18N
        akcijaTrazi.setText("Traži");
        akcijaTrazi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                akcijaTraziActionPerformed(evt);
            }
        });

        jLabel3.setText("Agent:");

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
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(uvjet)
                                .addGap(18, 18, 18)
                                .addComponent(akcijaTrazi, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sviAgenti, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(uvjet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(akcijaTrazi))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(8, 8, 8)
                .addComponent(sviAgenti, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(akcijaOdustani, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 67, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(akcijaOdustani, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(46, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void akcijaOdustaniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_akcijaOdustaniActionPerformed
        dispose();
    }//GEN-LAST:event_akcijaOdustaniActionPerformed

    private void akcijaObrisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_akcijaObrisiActionPerformed

        odabrano = (Klijent) lista.getSelectedValue();
        if (odabrano == null) {
            return;
        }
        if (JOptionPane.showConfirmDialog(getParent(), "Jeste li sigurni da želite obrisati " + odabrano.getImePrezime() + "?", "Brisanje klijenta", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.NO_OPTION) {
            return;
        }

        if (!obradaKlijent.obrisi(odabrano)) {
            return;
        }

        DefaultListModel<Klijent> m = (DefaultListModel<Klijent>) lista.getModel();
        m.removeElement(odabrano);
        lista.repaint();
        cistiPolja();
    }//GEN-LAST:event_akcijaObrisiActionPerformed

    private void akcijaPromjeniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_akcijaPromjeniActionPerformed
        if (odabrano == null) {
            return;
        }
        
        reset();

        if (ime.getText().trim().isEmpty()) {
            greska(ime, "Obavezno ime");
            return;
        }
        if (prezime.getText().trim().isEmpty()) {
            greska(prezime, "Obavezno prezime");
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

        if (provizija.getText().trim().isEmpty()) {
            greska(provizija, "Obavezno provizija");
            return;
        }

        try {
            NumberFormat.getInstance().parse(provizija.getText());
        } catch (ParseException e) {
            greska(brojtelefona, "Broj nije dobrog formata");
        }

        odabrano.setIme(ime.getText());
        odabrano.setPrezime(prezime.getText());
        odabrano.setIban(iban.getText());
        odabrano.setBrojtelefona(brojtelefona.getText());
        odabrano.setProvizija(new BigDecimal(provizija.getText()));
        odabrano.setEmail(email.getText());

        odabrano.setAgenti((Agent) sviAgenti.getSelectedItem());

        if (!obradaKlijent.promjeni(odabrano)) {
            return;
        }

        lista.repaint();
    }//GEN-LAST:event_akcijaPromjeniActionPerformed

    private void akcijaDodajNoviActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_akcijaDodajNoviActionPerformed
        reset();

        if (ime.getText().trim().isEmpty()) {
            greska(ime, "Obavezno ime");
            return;
        }
        if (prezime.getText().trim().isEmpty()) {
            greska(prezime, "Obavezno prezime");
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

        if (provizija.getText().trim().isEmpty()) {
            greska(provizija, "Obavezno provizija");
            return;
        }

        try {
            NumberFormat.getInstance().parse(provizija.getText());
        } catch (ParseException e) {
            greska(provizija, "Broj nije dobrog formata");
            return;
        }

        Klijent o = new Klijent();

        o.setIme(ime.getText().trim());
        o.setPrezime(prezime.getText().trim());
        o.setIban(iban.getText().trim());
        o.setBrojtelefona(brojtelefona.getText().trim());
        o.setProvizija(new BigDecimal(provizija.getText().trim()));
        o.setEmail(email.getText().trim());

        o = obradaKlijent.dodaj(o);

        o.setAgenti((Agent) sviAgenti.getSelectedItem());

        DefaultListModel<Klijent> m = (DefaultListModel<Klijent>) lista.getModel();
        m.addElement(o);

    }//GEN-LAST:event_akcijaDodajNoviActionPerformed

    private void akcijaTraziActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_akcijaTraziActionPerformed

        cistiPolja();

        List<Klijent> klijenti = obradaKlijent.dohvati(uvjet.getText());

        DefaultListModel<Klijent> m = new DefaultListModel<>();
        for (Klijent klijent : klijenti) {
            m.addElement(klijent);
        }
        lista.setModel(m);
    }//GEN-LAST:event_akcijaTraziActionPerformed

    private void listaValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaValueChanged
        reset();
        odabrano = (Klijent) lista.getSelectedValue();
        if (odabrano == null) {
            return;
        }

        ime.setText(odabrano.getIme());
        prezime.setText(odabrano.getPrezime());
        brojtelefona.setText(String.valueOf(odabrano.getBrojtelefona()));
        provizija.setText(String.valueOf(odabrano.getProvizija()));
        iban.setText(odabrano.getIban());
        email.setText(odabrano.getEmail());

        DefaultComboBoxModel<Agent> mag = (DefaultComboBoxModel<Agent>) sviAgenti.getModel();
        for (int i = 0; i < mag.getSize(); i++) {
            if (mag.getElementAt(i).getSifra() == odabrano.getAgenti().getSifra()) {
                sviAgenti.setSelectedIndex(i);
                break;
            }
        }
    }//GEN-LAST:event_listaValueChanged

    private void greska(JComponent komponenta, String obavijest) {
        komponenta.setBackground(Color.red);
        komponenta.requestFocus();
        komponenta.setToolTipText(obavijest);

    }

    private void reset() {

        for (Component c : this.getContentPane().getComponents()) {
            if (c instanceof JTextField) {
                JComponent jc = (JComponent) c;
                jc.setBackground(Color.white);
                jc.setToolTipText("");
            }
        }
    }

    private void cistiPolja() {
        ime.setText("");
        prezime.setText("");
        iban.setText("");
        brojtelefona.setText("");
        provizija.setText("");
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
    private javax.swing.JTextField iban;
    private javax.swing.JTextField ime;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList lista;
    private javax.swing.JTextField prezime;
    private javax.swing.JTextField provizija;
    private javax.swing.JComboBox sviAgenti;
    private javax.swing.JTextField uvjet;
    // End of variables declaration//GEN-END:variables
}
