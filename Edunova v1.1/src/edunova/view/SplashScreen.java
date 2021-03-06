/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

/**
 *
 * @author Mario
 */
public class SplashScreen extends javax.swing.JFrame {

    private ActionListener al;
    private Timer t;

    /**
     * Creates new form SplashScreen
     */
    public SplashScreen() {

        setLocationRelativeTo(null);

        al = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (jProgressBar1.getValue() < 100) {
                    jProgressBar1.setValue(jProgressBar1.getValue() + 1);
                } else {
                    t.stop();
                    prikaziIzbornik();
                }

            }
        };
        t = new Timer(10, al);
        initComponents();
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

        splash = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        splash.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        splash.setIcon(new javax.swing.ImageIcon(getClass().getResource("/slike/edunova.png"))); // NOI18N
        getContentPane().add(splash);
        splash.setBounds(0, 90, 420, 90);

        jProgressBar1.setBackground(new java.awt.Color(204, 204, 204));
        jProgressBar1.setForeground(new java.awt.Color(0, 0, 204));
        jProgressBar1.setBorderPainted(false);
        getContentPane().add(jProgressBar1);
        jProgressBar1.setBounds(10, 250, 400, 10);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void prikaziIzbornik(){
        Izbornik i = new Izbornik();
        setLocationRelativeTo(null);
        i.setVisible(true);
        this.dispose();
    }
    
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JLabel splash;
    // End of variables declaration//GEN-END:variables
}
