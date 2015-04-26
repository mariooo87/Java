/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.view;

import edunova.model.Operater;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;

/**
 *
 * @author Profesor
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

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Edunova APP");

        jLabel1.setText("Korisničko ime:");

        jLabel2.setText("Lozinka:");

        korisnik.setText("tjakopec");
        korisnik.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                korisnikKeyPressed(evt);
            }
        });

        lozinka.setText("t");
        lozinka.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                lozinkaKeyPressed(evt);
            }
        });

        autoriziraj.setText("Autoriziraj");
        autoriziraj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                autorizirajActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(autoriziraj, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(korisnik, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                            .addComponent(lozinka)))
                    .addComponent(poruka, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(poruka, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(korisnik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lozinka, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(autoriziraj, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

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

        Operater o = autorizacija.autoriziraj(korisnik.getText().trim(), new String(lozinka.getPassword()).trim());

        if (o == null) {
            poruka.setText("Kombinacija netočna");
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
    }//GEN-LAST:event_autorizirajActionPerformed

    private void korisnikKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_korisnikKeyPressed
        if (evt.getKeyCode()
                == KeyEvent.VK_ENTER) {
            autorizirajActionPerformed(null);
        }
    }//GEN-LAST:event_korisnikKeyPressed

    private void lozinkaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lozinkaKeyPressed
        if (evt.getKeyCode()
                == KeyEvent.VK_ENTER) {
            autorizirajActionPerformed(null);
        }
    }//GEN-LAST:event_lozinkaKeyPressed

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/slike/edunova_icon.png")));
    }

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton autoriziraj;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField korisnik;
    private javax.swing.JPasswordField lozinka;
    private javax.swing.JLabel poruka;
    // End of variables declaration//GEN-END:variables
}