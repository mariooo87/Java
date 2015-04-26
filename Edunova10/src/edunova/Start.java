/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova;

import edunova.view.Autorizacija;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Profesor
 */
public class Start {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         SimpleDateFormat df = new SimpleDateFormat("dd.MM.YYYY.");
         try {
             Date sad = new Date();
             String s = df.format(sad);
             System.out.println(s);
             Date d = df.parse(s);
                 
            System.out.println(df.format(d));
        } catch (ParseException ex) {
            //Logger.getLogger(Klijenti.class.getName()).log(Level.SEVERE, null, ex);
        }
        new Autorizacija().setVisible(true);
    }
}
