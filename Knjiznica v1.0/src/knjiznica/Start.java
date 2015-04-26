/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knjiznica;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import knjiznica.view.Autorizacija;

/**
 *
 * @author Mario
 */
public class Start {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        new Autorizacija().setVisible(true);
        
        
    }
    
}
