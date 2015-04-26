/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.view;

import edunova.model.Operater;
import edunova.utility.Pomocno;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Profesor
 */
public class Izbornik extends javax.swing.JFrame {

    /**
     * Creates new form Izbornik
     */
    public Izbornik() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Edunova APP "
                + Pomocno.getOperater().getImePrezime());

        if (Pomocno.getOperater().getUloga().equals(Operater.ADMINISTRATOR)) {
            operateri.setVisible(true);
        } else {
            operateri.setVisible(false);
        }
/*
        //Primjer inline
        (new Thread() {
            public void run() {
                SimpleDateFormat df = new SimpleDateFormat(Pomocno.FORMAT_DATUM_VRIJEME);
                while (true) {
                    try {
                        datum.setText(df.format(new Date()));
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Izbornik.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }).start();
        */
        SatNit t = new SatNit(datum);
        t.start();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        datum = new javax.swing.JLabel();
        operateri = new javax.swing.JButton();
        smjerovi = new javax.swing.JButton();
        akcijaPredavaci = new javax.swing.JButton();
        akcijaPolaznici = new javax.swing.JButton();
        akcijaGrupe = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Edunova APP");

        jToolBar1.setFocusable(false);

        datum.setMaximumSize(new java.awt.Dimension(200, 40));
        jToolBar1.add(datum);

        operateri.setBackground(new java.awt.Color(255, 204, 204));
        operateri.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        operateri.setText("Operateri");
        operateri.setBorderPainted(false);
        operateri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                operateriActionPerformed(evt);
            }
        });

        smjerovi.setBackground(new java.awt.Color(255, 204, 204));
        smjerovi.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        smjerovi.setText("Smjerovi");
        smjerovi.setBorderPainted(false);
        smjerovi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smjeroviActionPerformed(evt);
            }
        });

        akcijaPredavaci.setBackground(new java.awt.Color(255, 204, 204));
        akcijaPredavaci.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        akcijaPredavaci.setText("Predavači");
        akcijaPredavaci.setBorderPainted(false);
        akcijaPredavaci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                akcijaPredavaciActionPerformed(evt);
            }
        });

        akcijaPolaznici.setBackground(new java.awt.Color(255, 204, 204));
        akcijaPolaznici.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        akcijaPolaznici.setText("Polaznici");
        akcijaPolaznici.setBorderPainted(false);
        akcijaPolaznici.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                akcijaPolazniciActionPerformed(evt);
            }
        });

        akcijaGrupe.setBackground(new java.awt.Color(255, 204, 204));
        akcijaGrupe.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        akcijaGrupe.setText("GRUPE");
        akcijaGrupe.setBorderPainted(false);
        akcijaGrupe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                akcijaGrupeActionPerformed(evt);
            }
        });

        jMenu1.setText("Edunova");

        jMenuItem1.setMnemonic(KeyEvent.VK_X);
        jMenuItem1.setText("Izlaz");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Pomoć");
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });

        jMenuItem2.setText("O nama");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 170, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(smjerovi, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(akcijaPolaznici, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(operateri, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(akcijaPredavaci, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(akcijaGrupe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(operateri, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(akcijaPredavaci, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(smjerovi, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(akcijaPolaznici, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(akcijaGrupe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(39, 39, 39)
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed

        dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
        System.out.println("Krećem");
        new Onama().setVisible(true);
    }//GEN-LAST:event_jMenu2ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        new Onama().setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void operateriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_operateriActionPerformed
        new Operateri().setVisible(true);
    }//GEN-LAST:event_operateriActionPerformed

    private void smjeroviActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smjeroviActionPerformed
        new Smjerovi().setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_smjeroviActionPerformed

    private void akcijaPredavaciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_akcijaPredavaciActionPerformed
        new Predavaci().setVisible(true);
    }//GEN-LAST:event_akcijaPredavaciActionPerformed

    private void akcijaPolazniciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_akcijaPolazniciActionPerformed
        new Polaznici().setVisible(true);
    }//GEN-LAST:event_akcijaPolazniciActionPerformed

    private void akcijaGrupeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_akcijaGrupeActionPerformed
        new Grupe().setVisible(true);
    }//GEN-LAST:event_akcijaGrupeActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton akcijaGrupe;
    private javax.swing.JButton akcijaPolaznici;
    private javax.swing.JButton akcijaPredavaci;
    private javax.swing.JLabel datum;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JButton operateri;
    private javax.swing.JButton smjerovi;
    // End of variables declaration//GEN-END:variables
}
