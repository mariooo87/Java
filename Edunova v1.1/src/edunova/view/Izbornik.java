/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.view;

import edunova.model.Operater;
import edunova.utility.Pomocno;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mario
 */
public class Izbornik extends javax.swing.JFrame {

    /**
     * Creates new form Izbornik
     */
    public Izbornik() {
        initComponents();
        setIcon();
        setLocationRelativeTo(null);
        setTitle("Edunova v1.1: "
                + Pomocno.getOperater().getImePrezime());

        if (Pomocno.getOperater().getUloga().equals(Operater.ADMINISTRATOR)) {
            operateri.setVisible(true);
        } else {
            operateri.setVisible(false);
        }

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
        jDesktopPane1 = new javax.swing.JDesktopPane();
        akcijaGrupe = new javax.swing.JButton();
        akcijaPredavaci = new javax.swing.JButton();
        smjerovi = new javax.swing.JButton();
        akcijaPolaznici = new javax.swing.JButton();
        operateri = new javax.swing.JButton();
        akcijaOdjava = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
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

        jDesktopPane1.setBackground(new java.awt.Color(255, 255, 255));

        akcijaGrupe.setBackground(new java.awt.Color(51, 102, 255));
        akcijaGrupe.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        akcijaGrupe.setText("GRUPE");
        akcijaGrupe.setBorderPainted(false);
        akcijaGrupe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                akcijaGrupeActionPerformed(evt);
            }
        });

        akcijaPredavaci.setBackground(new java.awt.Color(51, 102, 255));
        akcijaPredavaci.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        akcijaPredavaci.setText("Predavači");
        akcijaPredavaci.setBorderPainted(false);
        akcijaPredavaci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                akcijaPredavaciActionPerformed(evt);
            }
        });

        smjerovi.setBackground(new java.awt.Color(51, 102, 255));
        smjerovi.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        smjerovi.setText("Smjerovi");
        smjerovi.setBorderPainted(false);
        smjerovi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smjeroviActionPerformed(evt);
            }
        });

        akcijaPolaznici.setBackground(new java.awt.Color(51, 102, 255));
        akcijaPolaznici.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        akcijaPolaznici.setText("Polaznici");
        akcijaPolaznici.setBorderPainted(false);
        akcijaPolaznici.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                akcijaPolazniciActionPerformed(evt);
            }
        });

        operateri.setBackground(new java.awt.Color(51, 102, 255));
        operateri.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        operateri.setText("Operateri");
        operateri.setBorderPainted(false);
        operateri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                operateriActionPerformed(evt);
            }
        });

        akcijaOdjava.setBackground(new java.awt.Color(51, 102, 255));
        akcijaOdjava.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        akcijaOdjava.setText("Odjava");
        akcijaOdjava.setBorderPainted(false);
        akcijaOdjava.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                akcijaOdjavaActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/slike/edunova_400.jpg"))); // NOI18N

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(operateri, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(akcijaPredavaci, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(smjerovi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(akcijaPolaznici, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(129, 129, 129)
                                .addComponent(jLabel1)))
                        .addContainerGap(184, Short.MAX_VALUE))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(akcijaGrupe, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(akcijaOdjava, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(operateri)
                .addGap(18, 18, 18)
                .addComponent(akcijaPredavaci)
                .addGap(24, 24, 24)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(smjerovi)
                        .addGap(27, 27, 27)
                        .addComponent(akcijaPolaznici)
                        .addGap(23, 23, 23)
                        .addComponent(akcijaGrupe))
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(akcijaOdjava)
                .addGap(32, 32, 32))
        );
        jDesktopPane1.setLayer(akcijaGrupe, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(akcijaPredavaci, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(smjerovi, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(akcijaPolaznici, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(operateri, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(akcijaOdjava, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jMenu1.setText("Datoteka");

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
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jDesktopPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
        System.out.println("Krećem");
        new Onama().setVisible(true);
    }//GEN-LAST:event_jMenu2ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        new Onama().setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void operateriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_operateriActionPerformed
        Operateri op= new Operateri();
        jDesktopPane1.add(op);
        try {
            op.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Izbornik.class.getName()).log(Level.SEVERE, null, ex);
        }
        op.show();
        
    }//GEN-LAST:event_operateriActionPerformed

    private void smjeroviActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smjeroviActionPerformed
        Smjerovi sm= new Smjerovi();
        jDesktopPane1.add(sm);
        try {
            sm.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Izbornik.class.getName()).log(Level.SEVERE, null, ex);
        }
        sm.show();
    }//GEN-LAST:event_smjeroviActionPerformed

    private void akcijaPredavaciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_akcijaPredavaciActionPerformed
        Predavaci pr= new Predavaci();
        jDesktopPane1.add(pr);
        try {
            pr.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Izbornik.class.getName()).log(Level.SEVERE, null, ex);
        }
        pr.show();
    }//GEN-LAST:event_akcijaPredavaciActionPerformed

    private void akcijaPolazniciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_akcijaPolazniciActionPerformed
        Polaznici po= new Polaznici();
        jDesktopPane1.add(po);
        try {
            po.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Izbornik.class.getName()).log(Level.SEVERE, null, ex);
        }
        po.show();
    }//GEN-LAST:event_akcijaPolazniciActionPerformed

    private void akcijaGrupeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_akcijaGrupeActionPerformed
        Grupe gr= new Grupe();
        jDesktopPane1.add(gr);
        try {
            gr.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Izbornik.class.getName()).log(Level.SEVERE, null, ex);
        }
        gr.show();
    }//GEN-LAST:event_akcijaGrupeActionPerformed

    private void akcijaOdjavaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_akcijaOdjavaActionPerformed
        dispose();
        new Autorizacija().setVisible(true);
    }//GEN-LAST:event_akcijaOdjavaActionPerformed

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/slike/edunova_icon.png")));
    }
    
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton akcijaGrupe;
    private javax.swing.JButton akcijaOdjava;
    private javax.swing.JButton akcijaPolaznici;
    private javax.swing.JButton akcijaPredavaci;
    private javax.swing.JLabel datum;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
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
