/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.view;

/**
 *
 * @author Edunova
 */
import edunova.model.SlikaNekretnine;
import java.awt.Component;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;
 
/**
 * Custom renderer to display a country's flag alongside its name
 *
 * @author wwww.codejava.net
 */
public class StavkaListeSlika extends JLabel implements ListCellRenderer<SlikaNekretnine> {
 
    @Override
    public Component getListCellRendererComponent(JList<? extends SlikaNekretnine> list, SlikaNekretnine slika, int index,
        boolean isSelected, boolean cellHasFocus) {
          
        ImageIcon imageIcon = new ImageIcon(slika.getSlika());
         
        setIcon(imageIcon);
       // setText(country.getName());
         
        return this;
    }
     
}