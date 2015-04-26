/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.view;

import edunova.controller.ObradaSmjer;
import edunova.model.Smjer;
import edunova.utility.Pomocno;
import java.awt.Color;
import java.awt.Component;
import java.math.BigDecimal;
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
public class Smjerovi extends javax.swing.JInternalFrame {
    
    private ObradaSmjer obradaSmjer;
    private Smjer odabrano;

    /**
     * Creates new form Smjerovi2
     */
    public Smjerovi() {
        initComponents();
        //setLocationRelativeTo(null);
        obradaSmjer=new ObradaSmjer();
        lista.setModel(new DefaultListModel<Smjer>());
       setTitle("Smjerovi");
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
        akcijaTrazi = new javax.swing.JButton();
        uvjet = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        trajanje = new javax.swing.JTextField();
        naziv = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cijena = new javax.swing.JTextField();
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel2.setText("Naziv");

        jLabel5.setText("Trajanje");

        jLabel6.setText("Cijena");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2)
                    .addComponent(naziv)
                    .addComponent(jLabel5)
                    .addComponent(trajanje)
                    .addComponent(jLabel6)
                    .addComponent(cijena, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(naziv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(trajanje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cijena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(100, Short.MAX_VALUE))
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
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(akcijaPromjeni, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(akcijaDodajNovi, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addContainerGap())
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
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(akcijaOdustani)
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void akcijaOdustaniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_akcijaOdustaniActionPerformed
        dispose();
    }//GEN-LAST:event_akcijaOdustaniActionPerformed

    private void akcijaDodajNoviActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_akcijaDodajNoviActionPerformed
        reset();
        if(naziv.getText().trim().isEmpty()){
            greska(naziv, "Obavezno naziv");
            return;
        }

        if(trajanje.getText().trim().isEmpty()){
            greska(trajanje, "Obavezno trajanje");
            return;
        }

        Smjer o = new Smjer();
        o.setNaziv(naziv.getText().trim());
        o.setTrajanje(Integer.parseInt(trajanje.getText().trim()));
        o.setCijena(new BigDecimal(cijena.getText().trim()));

        o=obradaSmjer.dodaj(o);

        DefaultListModel<Smjer> m =(DefaultListModel<Smjer>) lista.getModel();
        m.addElement(o);

        // System.out.println(o.getSifra());
    }//GEN-LAST:event_akcijaDodajNoviActionPerformed

    private void akcijaTraziActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_akcijaTraziActionPerformed

        cistiPolja();

        List<Smjer> entiteti = obradaSmjer.
        dohvati(uvjet.getText());

        DefaultListModel<Smjer> m = new DefaultListModel<>();
        for (Smjer smjer : entiteti) {
            m.addElement(smjer);
        }
        lista.setModel(m);
    }//GEN-LAST:event_akcijaTraziActionPerformed

    private void akcijaPromjeniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_akcijaPromjeniActionPerformed
        if(odabrano==null){
            return;
        }
        reset();
        //kontorle
        if(naziv.getText().trim().isEmpty()){
            greska(naziv, "Obavezno naziv");
            return;
        }

        if(trajanje.getText().trim().isEmpty()){
            greska(trajanje, "Obavezno trajanje");
            return;
        }
        odabrano.setNaziv(naziv.getText().trim());
        odabrano.setTrajanje(Integer.parseInt(trajanje.getText().trim()));
        odabrano.setCijena(new BigDecimal(cijena.getText()));

        //promjena u bazi
        if(!obradaSmjer.promjeni(odabrano)){
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

    private void listaValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaValueChanged
        reset();
        odabrano = (Smjer) lista.getSelectedValue();
        if(odabrano==null){
            return;
        }
        naziv.setText(odabrano.getNaziv());
        trajanje.setText(String.valueOf(odabrano.getTrajanje()));
        cijena.setText(String.valueOf(odabrano.getCijena()));
    }//GEN-LAST:event_listaValueChanged

    private void akcijaObrisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_akcijaObrisiActionPerformed

        odabrano = (Smjer) lista.getSelectedValue();
        if(odabrano==null){
            return;
        }
        if(JOptionPane.showConfirmDialog(getParent(), "Jeste li sigurni da želite obrisati " + odabrano.getNaziv() + "?","Brisanje smjera",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE)==JOptionPane.NO_OPTION){
            return;
        }

        if(!obradaSmjer.obrisi(odabrano)){
            return;
        }

        DefaultListModel<Smjer> m = (DefaultListModel<Smjer>) lista.getModel();
        m.removeElement(odabrano);
        lista.repaint();
        cistiPolja();
    }//GEN-LAST:event_akcijaObrisiActionPerformed

    private void cistiPolja(){
         naziv.setText("");
        trajanje.setText("");
        cijena.setText("");
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
    private javax.swing.JTextField cijena;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList lista;
    private javax.swing.JTextField naziv;
    private javax.swing.JTextField trajanje;
    private javax.swing.JTextField uvjet;
    // End of variables declaration//GEN-END:variables
}