/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knjiznica.view;

import java.awt.BorderLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

/**
 *
 * @author Mario
 */
public class Oprogramu extends java.awt.Panel {

    /**
     * Creates new form Oprogramu
     */
    public Oprogramu() {
        initComponents();
        
        Runnable r = new Runnable() {
            public void run() {
                String pt1 = "<html><body width='";
                String pt2 =
                    "'><h1>O programu</h1>" +
                    "<p>Program Knjižnica v1.0 namijenjen je knjižnicama te omogućuje "
                        + "lakšu evidenciju kataloga.<br><br>" +
                    "<p>travanj 2015. Mario Benčić, mariooo87@gmail.com";
                

                JPanel p = new JPanel( new BorderLayout());

                int width = 175;
                String s = pt1 + width + pt2;

                JOptionPane.showMessageDialog(null, s);
            }
        };
        SwingUtilities.invokeLater(r);
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setLayout(new java.awt.BorderLayout());
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}