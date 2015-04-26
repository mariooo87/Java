/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.view;

import java.awt.Color;
import java.awt.Toolkit;
import java.io.File;
import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.swing.JComponent;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import net.atlanticbb.tantlinger.shef.HTMLEditorPane;

/**
 *
 * @author Mario
 */
public class Email extends javax.swing.JFrame {

    private HTMLEditorPane editor;
    String attachment_path;

    /**
     * Creates new form Email2
     */
    public Email() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("E-mail");
        setIcon();

        editor = new HTMLEditorPane();
        editor.setSize(editorKontejner.getSize());
        editorKontejner.add(editor);
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
        naslov = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        eMailAdresa = new javax.swing.JTextField();
        akcijaPosalji = new javax.swing.JButton();
        editorKontejner = new javax.swing.JPanel();
        akcijaOdustani = new javax.swing.JButton();
        akcijaDodajPrilog = new javax.swing.JButton();
        pathAttach = new javax.swing.JTextField();
        name_attach = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Naslov:");

        naslov.setText("Nekretnine d.o.o. - ponuda za nekretninu");

        jLabel2.setText("E-mail adresa:");

        akcijaPosalji.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Forward.png"))); // NOI18N
        akcijaPosalji.setText(" Pošalji");
        akcijaPosalji.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                akcijaPosaljiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout editorKontejnerLayout = new javax.swing.GroupLayout(editorKontejner);
        editorKontejner.setLayout(editorKontejnerLayout);
        editorKontejnerLayout.setHorizontalGroup(
            editorKontejnerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        editorKontejnerLayout.setVerticalGroup(
            editorKontejnerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 160, Short.MAX_VALUE)
        );

        akcijaOdustani.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Cancel__Red.png"))); // NOI18N
        akcijaOdustani.setText("Odustani");
        akcijaOdustani.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                akcijaOdustaniActionPerformed(evt);
            }
        });

        akcijaDodajPrilog.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/mail-attachment.png"))); // NOI18N
        akcijaDodajPrilog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                akcijaDodajPrilogActionPerformed(evt);
            }
        });

        jLabel3.setText("Adresa dodanog priloga:");

        jLabel4.setText("Naziv priloga:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(akcijaOdustani, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(akcijaPosalji, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(editorKontejner, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pathAttach)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(eMailAdresa)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(naslov, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 164, Short.MAX_VALUE)
                                .addComponent(akcijaDodajPrilog, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(40, 40, 40))
                    .addComponent(name_attach, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(naslov, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(eMailAdresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(akcijaDodajPrilog, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pathAttach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addGap(4, 4, 4)
                .addComponent(name_attach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(editorKontejner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(akcijaPosalji)
                    .addComponent(akcijaOdustani))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void akcijaPosaljiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_akcijaPosaljiActionPerformed
        final String username = "nekretnine121@gmail.com";
        final String password = "edunovaj14";

        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

        Session session = Session.getInstance(props,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(username, password);
                    }
                });

        try {

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("nekretnine121@gmail.com"));

            if (eMailAdresa.getText().trim().length() == 0) {
                greska(eMailAdresa, "Upišite e-mail adresu");
                return;
            } else {
                
                message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(eMailAdresa.getText()));
            }

            message.setSubject(naslov.getText());

            MimeBodyPart messBodyPart= new MimeBodyPart();
            messBodyPart.setText(editor.getText(), "utf-8", "html");
            
            Multipart multipart = new MimeMultipart();
            multipart.addBodyPart(messBodyPart);
            
            messBodyPart = new MimeBodyPart();
            javax.activation.DataSource source = new FileDataSource(attachment_path);
            messBodyPart.setDataHandler(new DataHandler(source));
            messBodyPart.setFileName(name_attach.getText() + ".pdf");
            multipart.addBodyPart(messBodyPart);
            message.setContent(multipart);
            
            if (pathAttach.getText().trim().isEmpty()) {
            greska(name_attach, "Obavezno dodijeliti ime prilogu");
            return;
        }
            
            Transport.send(message);

            System.out.println("Ponuda je poslana.");
            dispose();

        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }//GEN-LAST:event_akcijaPosaljiActionPerformed

    private void akcijaOdustaniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_akcijaOdustaniActionPerformed
        dispose();
    }//GEN-LAST:event_akcijaOdustaniActionPerformed

    private void akcijaDodajPrilogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_akcijaDodajPrilogActionPerformed

        FileNameExtensionFilter filter = new FileNameExtensionFilter("Dokumenti", "pdf", "doc", "docx", "txt");
        JFileChooser fileChooser = new JFileChooser(System.getProperty("user.home"));
        
        fileChooser.setFileFilter(filter);
        
        int returnVal = fileChooser.showOpenDialog(getRootPane());
        File f = fileChooser.getSelectedFile();
        attachment_path = f.getAbsolutePath();
        pathAttach.setText(attachment_path);
        
    }//GEN-LAST:event_akcijaDodajPrilogActionPerformed

    private void greska(JComponent komponenta, String obavijest) {
        komponenta.setBackground(Color.red);
        komponenta.requestFocus();
        komponenta.setToolTipText(obavijest);

    }

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/pictures/real_estate_icon.jpg")));
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton akcijaDodajPrilog;
    private javax.swing.JButton akcijaOdustani;
    private javax.swing.JButton akcijaPosalji;
    private javax.swing.JTextField eMailAdresa;
    private javax.swing.JPanel editorKontejner;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField name_attach;
    private javax.swing.JTextField naslov;
    private javax.swing.JTextField pathAttach;
    // End of variables declaration//GEN-END:variables
}