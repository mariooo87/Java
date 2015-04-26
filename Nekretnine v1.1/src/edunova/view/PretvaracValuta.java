/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.view;

import java.awt.Color;
import java.awt.Component;
import java.awt.Toolkit;
import java.text.NumberFormat;
import java.text.ParseException;
import javax.swing.JComponent;
import javax.swing.JTextField;

/**
 *
 * @author Mario
 */
public class PretvaracValuta extends javax.swing.JFrame {

    /**
     * Creates new form PretvaracValuta
     */
    public PretvaracValuta() {
        initComponents();
        setIcon();
        setLocationRelativeTo(null);
        setTitle("Pretvarač valuta");
    }

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/pictures/real_estate_icon.jpg")));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        iznosukunama = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tecajeura = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        iznosueurima = new javax.swing.JTextField();
        akcijaPretvori = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        iznosueurima1 = new javax.swing.JTextField();
        iznosukunama1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        akcijaPretvori1 = new javax.swing.JButton();
        akcijaOdustani = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel2.setText("Tečaj eura:");

        tecajeura.setText("7.5");

        jLabel3.setText("Iznos u eurima:");

        akcijaPretvori.setText("Pretvori");
        akcijaPretvori.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                akcijaPretvoriActionPerformed(evt);
            }
        });

        jLabel4.setText("Iznos u kunama:");

        jLabel5.setText("Iznos u eurima:");

        jLabel7.setText("Iznos u kunama:");

        akcijaPretvori1.setText("Pretvori");
        akcijaPretvori1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                akcijaPretvori1ActionPerformed(evt);
            }
        });

        akcijaOdustani.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Cancel__Red.png"))); // NOI18N
        akcijaOdustani.setText("Odustani");
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(iznosukunama, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                                        .addComponent(iznosueurima1, javax.swing.GroupLayout.Alignment.LEADING))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(122, 122, 122)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tecajeura)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(iznosukunama1)
                                    .addComponent(iznosueurima, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(akcijaPretvori1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(akcijaPretvori, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel3)
                            .addComponent(jLabel7))))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(iznosukunama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(iznosueurima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(akcijaPretvori, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(iznosueurima1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tecajeura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(77, 77, 77)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(iznosukunama1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(akcijaPretvori1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(akcijaOdustani)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void akcijaPretvoriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_akcijaPretvoriActionPerformed

        reset();

        if (iznosukunama.getText().trim().isEmpty()) {
            greska(iznosukunama, "Upišite iznos.");
            return;
        }

        if (tecajeura.getText().trim().isEmpty()) {
            greska(tecajeura, "Upišite iznos.");
            return;
        }

        try {
            NumberFormat.getInstance().parse(iznosukunama.getText());
        } catch (ParseException e) {
            greska(iznosukunama, "Broj nije dobrog formata");
            return;
        }

        try {
            NumberFormat.getInstance().parse(tecajeura.getText());
        } catch (ParseException e) {
            greska(tecajeura, "Broj nije dobrog formata");
            return;
        }

        Float kn = new Float(iznosukunama.getText());
        Float t = new Float(tecajeura.getText());
        Float eur = kn / t;
        iznosueurima.setText(Float.toString(eur));

    }//GEN-LAST:event_akcijaPretvoriActionPerformed

    private void akcijaPretvori1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_akcijaPretvori1ActionPerformed
        reset();

        if (iznosueurima1.getText().trim().isEmpty()) {
            greska(iznosueurima1, "Upišite iznos.");
            return;
        }

        if (tecajeura.getText().trim().isEmpty()) {
            greska(tecajeura, "Upišite iznos.");
            return;
        }

        try {
            NumberFormat.getInstance().parse(iznosueurima1.getText());
        } catch (ParseException e) {
            greska(iznosueurima1, "Broj nije dobrog formata");
            return;
        }

        try {
            NumberFormat.getInstance().parse(tecajeura.getText());
        } catch (ParseException e) {
            greska(tecajeura, "Broj nije dobrog formata");
            return;
        }

        Float eur = new Float(iznosueurima1.getText());
        Float t = new Float(tecajeura.getText());
        Float kn = eur * t;
        iznosukunama1.setText(Float.toString(kn));


    }//GEN-LAST:event_akcijaPretvori1ActionPerformed

    private void akcijaOdustaniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_akcijaOdustaniActionPerformed
        dispose();
    }//GEN-LAST:event_akcijaOdustaniActionPerformed

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton akcijaOdustani;
    private javax.swing.JButton akcijaPretvori;
    private javax.swing.JButton akcijaPretvori1;
    private javax.swing.JTextField iznosueurima;
    private javax.swing.JTextField iznosueurima1;
    private javax.swing.JTextField iznosukunama;
    private javax.swing.JTextField iznosukunama1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField tecajeura;
    // End of variables declaration//GEN-END:variables
}