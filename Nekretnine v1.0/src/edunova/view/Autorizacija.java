/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.view;

import edunova.model.Agent;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import javax.swing.UIManager;

/**
 *
 * @author Mario
 */
public class Autorizacija extends javax.swing.JFrame {

    private int brojPokusaja;
    private edunova.controller.Autorizacija autorizacija;

    /**
     * Creates new form Autorizacija
     */
    public Autorizacija() {
        initComponents();
        setIcon();
        setLocationRelativeTo(null);
        brojPokusaja = 0;
        autorizacija = new edunova.controller.Autorizacija();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        korisnik = new javax.swing.JTextField();
        lozinka = new javax.swing.JPasswordField();
        autoriziraj = new javax.swing.JButton();
        poruka = new javax.swing.JLabel();
        slika = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Prijava korisnika");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Korisničko ime:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Lozinka:");

        korisnik.setText("mbencic");

        lozinka.setText("mario123");

        autoriziraj.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        autoriziraj.setText("Prijavi se");
        autoriziraj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                autorizirajActionPerformed(evt);
            }
        });

        poruka.setForeground(new java.awt.Color(255, 51, 51));

        slika.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/decrypted.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(poruka, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(slika)
                                        .addGap(5, 5, 5)
                                        .addComponent(jLabel1)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(lozinka, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                    .addComponent(korisnik)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(94, 94, 94)
                                .addComponent(autoriziraj, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(poruka, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(slika)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(korisnik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lozinka, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(autoriziraj, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void autorizirajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_autorizirajActionPerformed
        if (brojPokusaja == 3) {
            dispose();
            System.exit(-1);
        }
        brojPokusaja++;
        poruka.setText("");
        
        if (korisnik.getText().trim().length() == 0) {
            poruka.setText("Korisnik obavezno");
            korisnik.requestFocus();
            return;
        }
        if (new String(lozinka.getPassword()).
                trim().length() == 0) {
            poruka.setText("Lozinka obavezno");
            lozinka.requestFocus();
            return;
        }

        Agent o = autorizacija.autoriziraj(korisnik.getText().trim(), new String(lozinka.getPassword()).trim());

        if (o == null) {
            poruka.setText("Kombinacija je netočna.");
            return;
        }

        
        try {
            
            SplashScreen sp = new SplashScreen();
            sp.setSize(425, 318);
            sp.setLocationRelativeTo(null);
            sp.setVisible(true);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        dispose();
    }

    private void korisnikKeyPressed(java.awt.event.KeyEvent evt) {
        if (evt.getKeyCode()
                == KeyEvent.VK_ENTER) {
            autorizirajActionPerformed(null);
        }
    }

    private void lozinkaKeyPressed(java.awt.event.KeyEvent evt) {
        if (evt.getKeyCode()
                == KeyEvent.VK_ENTER) {
            autorizirajActionPerformed(null);
        }
    }//GEN-LAST:event_autorizirajActionPerformed
    
    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/pictures/real_estate_icon.jpg")));
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton autoriziraj;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField korisnik;
    private javax.swing.JPasswordField lozinka;
    private javax.swing.JLabel poruka;
    private javax.swing.JLabel slika;
    // End of variables declaration//GEN-END:variables
}
