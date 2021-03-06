/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knjiznica.view;

import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import knjiznica.model.Operater;

/**
 *
 * @author Mario
 */
public class Autorizacija extends javax.swing.JFrame {
    
    private int brojPokusaja;
    private knjiznica.controller.Autorizacija autorizacija;

    /**
     * Creates new form Autorizacija
     */
    public Autorizacija() {
        initComponents();
        setLocationRelativeTo(null);
        setIcon();
        setTitle("Prijava korisnika");
        brojPokusaja=0;
        autorizacija = new knjiznica.controller.Autorizacija();
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
        korisnickoIme = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        lozinka = new javax.swing.JPasswordField();
        akcijaAutoriziraj = new javax.swing.JButton();
        poruka = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Korisničko ime");

        korisnickoIme.setText("ihorvat");
        korisnickoIme.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                korisnickoImeKeyPressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Lozinka");

        lozinka.setText("ivan123");
        lozinka.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                lozinkaKeyPressed(evt);
            }
        });

        akcijaAutoriziraj.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        akcijaAutoriziraj.setText("Prijavi se");
        akcijaAutoriziraj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                akcijaAutorizirajActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(korisnickoIme)
                            .addComponent(lozinka)
                            .addComponent(poruka, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(akcijaAutoriziraj, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(poruka, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(korisnickoIme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lozinka, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(akcijaAutoriziraj, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void akcijaAutorizirajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_akcijaAutorizirajActionPerformed
        if(brojPokusaja==3){
            dispose();
            System.exit(-1);
        }
        brojPokusaja++;
        poruka.setText("");
        if(korisnickoIme.getText().trim().length()==0){
           poruka.setText("Korisnik obavezno");
           korisnickoIme.requestFocus();
           return;
       } 
        if(new String(lozinka.getPassword()).
                trim().length()==0){
            poruka.setText("Lozinka obavezno");
            lozinka.requestFocus();
            return;
        }
        
        Operater o = autorizacija.autoriziraj(korisnickoIme.getText().trim(), new String(lozinka.getPassword()).trim());
        
        if(o==null){
        poruka.setText("Kombinacija je netočna");
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
    }//GEN-LAST:event_akcijaAutorizirajActionPerformed

    private void korisnickoImeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_korisnickoImeKeyPressed
        if(evt.getKeyCode()==
                KeyEvent.VK_ENTER){
            akcijaAutorizirajActionPerformed(null);
        }
    }//GEN-LAST:event_korisnickoImeKeyPressed

    private void lozinkaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lozinkaKeyPressed
        if(evt.getKeyCode()==
                KeyEvent.VK_ENTER){
            akcijaAutorizirajActionPerformed(null);
        }
    }//GEN-LAST:event_lozinkaKeyPressed

    /**
     * @param args the command line arguments
     */
    
    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/slike/book.png")));
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton akcijaAutoriziraj;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField korisnickoIme;
    private javax.swing.JPasswordField lozinka;
    private javax.swing.JLabel poruka;
    // End of variables declaration//GEN-END:variables
}
