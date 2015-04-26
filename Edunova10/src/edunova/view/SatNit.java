/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.view;

import edunova.utility.Pomocno;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Edunova
 */
public class SatNit extends Thread{
    
    JLabel datum;
    
    public SatNit( JLabel datum){
        this.datum=datum;
    }

    @Override
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
    
    
}
