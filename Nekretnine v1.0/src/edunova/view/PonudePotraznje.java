/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.view;

import edunova.controller.ObradaKlijent;
import edunova.controller.ObradaNekretnina;
import edunova.controller.ObradaPonudaPotraznja;
import edunova.model.Klijent;
import edunova.model.Nekretnina;
import edunova.model.PonudaPotraznja;
import edunova.utility.Pomocno;
import java.awt.Color;
import java.awt.Component;
import java.awt.Toolkit;
import java.io.FileInputStream;
import java.io.InputStream;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.DefaultListModel;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;

/**
 *
 * @author Mario
 */
public class PonudePotraznje extends javax.swing.JFrame {

    private ObradaPonudaPotraznja obradaPonudaPotraznja;
    private PonudaPotraznja odabranoPonudaPotraznja;
    private ObradaNekretnina obradaNekretnina;
    private Nekretnina odabranoNekretnina;
    private ObradaKlijent obradaKlijent;
    private Klijent odabranoKlijent;

    private SimpleDateFormat df;
    private JTextField TF;

    /**
     * Creates new form PonudaPotraznja
     */
    public PonudePotraznje() {
        initComponents();
        setIcon();
        setLocationRelativeTo(null);

        obradaPonudaPotraznja = new ObradaPonudaPotraznja();
        listaPonuda.setModel(new DefaultListModel<PonudaPotraznja>());
        setTitle("Ponuda/potražnja");

        obradaNekretnina = new ObradaNekretnina();
        obradaKlijent = new ObradaKlijent();

        kupnjaNekretnine.setSelected(true);

        df = new SimpleDateFormat(Pomocno.FORMAT_DATUM_UNOS);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        listaNekretnina = new javax.swing.JList();
        uvjetNekretnina = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        akcijaTraziNekretninu = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaKlijent = new javax.swing.JList();
        uvjetKlijent = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        akcijaTraziKlijenta = new javax.swing.JButton();
        akcijaDodajNovuNekretninu = new javax.swing.JButton();
        akcijaDodajNovogKlijenta = new javax.swing.JButton();
        akcijaKreirajPonudu = new javax.swing.JButton();
        UvjetPonudaPotraznja = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        akcijaTraziPonude = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        listaPonuda = new javax.swing.JList();
        akcijaGenerirajPDF = new javax.swing.JButton();
        akcijaPosalji = new javax.swing.JButton();
        akcijaOdustani = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        cijena = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        provizija = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cijenaSprovizijom = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        kupnjaNekretnine = new javax.swing.JCheckBox();
        prodajaNekretnine = new javax.swing.JCheckBox();
        akcijaObrisi = new javax.swing.JButton();
        akcijaUracunajProviziju = new javax.swing.JButton();
        datum = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Ponuda/potražnja");

        listaNekretnina.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaNekretninaValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(listaNekretnina);

        jLabel1.setText("Uvjet (* za sve)");

        akcijaTraziNekretninu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Magnifier2.png"))); // NOI18N
        akcijaTraziNekretninu.setText("Traži nekretninu");
        akcijaTraziNekretninu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                akcijaTraziNekretninuActionPerformed(evt);
            }
        });

        listaKlijent.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaKlijentValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(listaKlijent);

        jLabel2.setText("Uvjet (* za sve)");

        akcijaTraziKlijenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Magnifier2.png"))); // NOI18N
        akcijaTraziKlijenta.setText("Traži klijenta");
        akcijaTraziKlijenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                akcijaTraziKlijentaActionPerformed(evt);
            }
        });

        akcijaDodajNovuNekretninu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Add_Blue.png"))); // NOI18N
        akcijaDodajNovuNekretninu.setText("Dodaj novo");
        akcijaDodajNovuNekretninu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                akcijaDodajNovuNekretninuActionPerformed(evt);
            }
        });

        akcijaDodajNovogKlijenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Add_Blue.png"))); // NOI18N
        akcijaDodajNovogKlijenta.setText("Dodaj novo");
        akcijaDodajNovogKlijenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                akcijaDodajNovogKlijentaActionPerformed(evt);
            }
        });

        akcijaKreirajPonudu.setBackground(new java.awt.Color(0, 102, 255));
        akcijaKreirajPonudu.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        akcijaKreirajPonudu.setText("Kreiraj ponudu");
        akcijaKreirajPonudu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                akcijaKreirajPonuduActionPerformed(evt);
            }
        });

        jLabel3.setText("Uvjet (* za sve)");

        akcijaTraziPonude.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Magnifier2.png"))); // NOI18N
        akcijaTraziPonude.setText("Traži ponude");
        akcijaTraziPonude.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                akcijaTraziPonudeActionPerformed(evt);
            }
        });

        jScrollPane3.setViewportView(listaPonuda);

        akcijaGenerirajPDF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/pdf.png"))); // NOI18N
        akcijaGenerirajPDF.setText("PDF");
        akcijaGenerirajPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                akcijaGenerirajPDFActionPerformed(evt);
            }
        });

        akcijaPosalji.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/messages-new.png"))); // NOI18N
        akcijaPosalji.setText("Pošalji");
        akcijaPosalji.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                akcijaPosaljiActionPerformed(evt);
            }
        });

        akcijaOdustani.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Cancel__Red.png"))); // NOI18N
        akcijaOdustani.setText("Odustani");
        akcijaOdustani.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                akcijaOdustaniActionPerformed(evt);
            }
        });

        jLabel4.setText("Cijena [eur]");

        cijena.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                cijenaPropertyChange(evt);
            }
        });

        jLabel5.setText("Provizija [%]");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/real_estate_picture.jpg"))); // NOI18N

        jLabel6.setText("Cijena s provizijom [eur]");

        jLabel8.setText("Datum");

        kupnjaNekretnine.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        kupnjaNekretnine.setText("Kupnja nekretnine");
        kupnjaNekretnine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kupnjaNekretnineActionPerformed(evt);
            }
        });

        prodajaNekretnine.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        prodajaNekretnine.setText("Prodaja nekretnine");
        prodajaNekretnine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prodajaNekretnineActionPerformed(evt);
            }
        });

        akcijaObrisi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/DeleteRed.png"))); // NOI18N
        akcijaObrisi.setText("Obriši");
        akcijaObrisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                akcijaObrisiActionPerformed(evt);
            }
        });

        akcijaUracunajProviziju.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/calculator.png"))); // NOI18N
        akcijaUracunajProviziju.setText("Uračunaj proviziju");
        akcijaUracunajProviziju.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                akcijaUracunajProvizijuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(kupnjaNekretnine)
                                .addGap(25, 25, 25)
                                .addComponent(prodajaNekretnine))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel1)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(uvjetNekretnina, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(akcijaTraziNekretninu))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(akcijaDodajNovuNekretninu)
                                            .addComponent(UvjetPonudaPotraznja, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addComponent(akcijaTraziPonude)))
                                .addGap(47, 47, 47)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(akcijaDodajNovogKlijenta)
                                    .addComponent(jLabel2)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(uvjetKlijent, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(akcijaTraziKlijenta))))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel7))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(akcijaKreirajPonudu, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(akcijaUracunajProviziju, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                                    .addComponent(cijenaSprovizijom, javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(provizija, javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(cijena, javax.swing.GroupLayout.Alignment.CENTER)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.CENTER, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addComponent(jLabel8))
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(datum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(akcijaOdustani)
                            .addGap(276, 276, 276)
                            .addComponent(akcijaObrisi, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(akcijaGenerirajPDF, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(akcijaPosalji, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(datum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cijena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(provizija, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cijenaSprovizijom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(akcijaUracunajProviziju)
                        .addGap(18, 18, 18)
                        .addComponent(akcijaKreirajPonudu, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(prodajaNekretnine)
                            .addComponent(kupnjaNekretnine, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(uvjetNekretnina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(akcijaTraziNekretninu))
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(23, 23, 23))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(uvjetKlijent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(akcijaTraziKlijenta))
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(akcijaDodajNovuNekretninu)
                            .addComponent(akcijaDodajNovogKlijenta))
                        .addGap(37, 37, 37)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UvjetPonudaPotraznja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(akcijaTraziPonude))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(akcijaOdustani, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(akcijaObrisi, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(akcijaGenerirajPDF, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(akcijaPosalji))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        datum.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void akcijaOdustaniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_akcijaOdustaniActionPerformed
        dispose();
    }//GEN-LAST:event_akcijaOdustaniActionPerformed

    private void akcijaDodajNovuNekretninuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_akcijaDodajNovuNekretninuActionPerformed
        new Nekretnine().setVisible(true);
    }//GEN-LAST:event_akcijaDodajNovuNekretninuActionPerformed

    private void akcijaDodajNovogKlijentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_akcijaDodajNovogKlijentaActionPerformed
        new Klijenti().setVisible(true);
    }//GEN-LAST:event_akcijaDodajNovogKlijentaActionPerformed

    private void akcijaTraziNekretninuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_akcijaTraziNekretninuActionPerformed
        cistiPolja();

        List<Nekretnina> entiteti = obradaNekretnina.dohvati(uvjetNekretnina.getText());
        DefaultListModel<Nekretnina> m = new DefaultListModel<>();
        for (Nekretnina e : entiteti) {
            m.addElement(e);
        }

        listaNekretnina.setModel(m);
    }//GEN-LAST:event_akcijaTraziNekretninuActionPerformed

    private void akcijaTraziKlijentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_akcijaTraziKlijentaActionPerformed

        List<Klijent> klijenti = obradaKlijent.dohvati(uvjetKlijent.getText());

        DefaultListModel<Klijent> m = new DefaultListModel<>();
        for (Klijent klijent : klijenti) {
            m.addElement(klijent);
        }
        listaKlijent.setModel(m);
    }//GEN-LAST:event_akcijaTraziKlijentaActionPerformed

    private void listaNekretninaValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaNekretninaValueChanged
        reset();
        odabranoNekretnina = (Nekretnina) listaNekretnina.getSelectedValue();
        if (odabranoNekretnina == null) {
            return;
        }
        cijena.setText(String.valueOf(odabranoNekretnina.getCijena()));

    }//GEN-LAST:event_listaNekretninaValueChanged

    private void listaKlijentValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaKlijentValueChanged
        reset();
        odabranoKlijent = (Klijent) listaKlijent.getSelectedValue();
        if (odabranoKlijent == null) {
            return;
        }
        provizija.setText(String.valueOf(odabranoKlijent.getProvizija()));
    }//GEN-LAST:event_listaKlijentValueChanged

    private void akcijaPosaljiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_akcijaPosaljiActionPerformed
        new Email().setVisible(true);
    }//GEN-LAST:event_akcijaPosaljiActionPerformed

    private void kupnjaNekretnineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kupnjaNekretnineActionPerformed
        if (kupnjaNekretnine.isSelected()) {
            prodajaNekretnine.setSelected(false);
            return;
        }

        if (!kupnjaNekretnine.isSelected()) {
            prodajaNekretnine.setSelected(true);

        }

    }//GEN-LAST:event_kupnjaNekretnineActionPerformed

    private void akcijaKreirajPonuduActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_akcijaKreirajPonuduActionPerformed
        reset();

        if (cijena.getText().trim().isEmpty()) {
            greska(cijena, "Obavezno odabrati nekretninu");
            return;
        }

        if (provizija.getText().trim().isEmpty()) {
            greska(provizija, "Obavezno odabrati klijenta");
            return;
        }

        if (cijenaSprovizijom.getText().trim().isEmpty()) {
            greska(cijenaSprovizijom, "Obavezno uračunati proviziju");
            return;
        }

        if (odabranoNekretnina == null
                || listaNekretnina.getSelectedValuesList().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Prvo odaberite nekretninu", "Pogreška", JOptionPane.ERROR_MESSAGE);
            this.listaNekretnina.requestFocus();
            return;
        }

        if (odabranoKlijent == null
                || listaKlijent.getSelectedValuesList().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Prvo odaberite klijenta", "Pogreška", JOptionPane.ERROR_MESSAGE);
            this.listaKlijent.requestFocus();
            return;
        }
        if (datum.getCalendar() == null || datum.getCalendar().getTime() == null) {
            JOptionPane.showMessageDialog(rootPane, "Prvo odaberite datum", "Pogreška", JOptionPane.ERROR_MESSAGE);
            this.datum.requestFocus();
            return;
        }

        PonudaPotraznja pp = new PonudaPotraznja();

        pp.setNaziv(getTitle().trim());
        pp.setDatum(datum.getDate());
        pp.setCijenasprovizijom(new BigDecimal(cijenaSprovizijom.getText().trim()));
        pp.setKupnjanekretnine(kupnjaNekretnine.isSelected());
        pp.setProdajanekretnine(prodajaNekretnine.isSelected());
        pp.setKlijenti(odabranoKlijent);
        pp.setNekretnine(odabranoNekretnina);

        pp = obradaPonudaPotraznja.dodaj(pp);

        DefaultListModel<PonudaPotraznja> m = (DefaultListModel<PonudaPotraznja>) listaPonuda.getModel();
        m.addElement(pp);


    }//GEN-LAST:event_akcijaKreirajPonuduActionPerformed

    private void akcijaObrisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_akcijaObrisiActionPerformed
        odabranoPonudaPotraznja = (PonudaPotraznja) listaPonuda.getSelectedValue();
        if (odabranoPonudaPotraznja == null) {
            return;
        }
        if (JOptionPane.showConfirmDialog(getParent(), "Jeste li sigurni da želite obrisati: " + odabranoPonudaPotraznja.getNaziv() + " " + odabranoPonudaPotraznja.getSifra() + "?", "Brisanje ponude", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.NO_OPTION) {
            return;
        }

        if (!obradaPonudaPotraznja.obrisi(odabranoPonudaPotraznja)) {
            return;
        }

        DefaultListModel<edunova.model.PonudaPotraznja> m = (DefaultListModel<edunova.model.PonudaPotraznja>) listaPonuda.getModel();
        m.removeElement(odabranoPonudaPotraznja);
        listaPonuda.repaint();
        cistiPolja();

    }//GEN-LAST:event_akcijaObrisiActionPerformed

    private void akcijaGenerirajPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_akcijaGenerirajPDFActionPerformed
        odabranoPonudaPotraznja = (PonudaPotraznja) listaPonuda.getSelectedValue();
        
        if (odabranoPonudaPotraznja == null
                && listaPonuda.getSelectedValuesList().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Prvo odaberite stavku", "Pogreška", JOptionPane.ERROR_MESSAGE);
            this.listaPonuda.requestFocus();
            return;
        }

        
        try {
            InputStream inputStream = new FileInputStream("reports/MYreport.jrxml");

            List<PonudaPotraznja> l = obradaPonudaPotraznja.dohvatiPonudaPotraznja("");
            
            JRBeanCollectionDataSource beanColDataSource = new JRBeanCollectionDataSource(l);
            
            Map parameters = new HashMap();

            parameters.put("ponudapotraznja", odabranoPonudaPotraznja);
            parameters.put("klijent", odabranoPonudaPotraznja.getKlijenti());
            parameters.put("nekretnina", odabranoPonudaPotraznja.getNekretnine());

            JasperDesign jasperDesign = JRXmlLoader.load(inputStream);
            JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesign);
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, beanColDataSource);
            String naziv = "d:/MYreport" + System.currentTimeMillis() + ".pdf";
            JasperExportManager.exportReportToPdfFile(jasperPrint, naziv);

            ProcessBuilder pb = new ProcessBuilder("cmd", "/C start " + naziv);
            pb.start();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_akcijaGenerirajPDFActionPerformed

    private void akcijaTraziPonudeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_akcijaTraziPonudeActionPerformed

        List<PonudaPotraznja> entiteti = obradaPonudaPotraznja.dohvatiPonudaPotraznja(UvjetPonudaPotraznja.getText());

        DefaultListModel<PonudaPotraznja> m = new DefaultListModel<>();
        for (PonudaPotraznja e : entiteti) {
            m.addElement(e);
        }

        listaPonuda.setModel(m);
    }//GEN-LAST:event_akcijaTraziPonudeActionPerformed

    private void prodajaNekretnineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prodajaNekretnineActionPerformed
        if (prodajaNekretnine.isSelected()) {
            kupnjaNekretnine.setSelected(false);
            return;
        }

        if (!prodajaNekretnine.isSelected()) {
            kupnjaNekretnine.setSelected(true);

        }
    }//GEN-LAST:event_prodajaNekretnineActionPerformed

    private void cijenaPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_cijenaPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_cijenaPropertyChange

    private void akcijaUracunajProvizijuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_akcijaUracunajProvizijuActionPerformed

        if (cijena.getText().trim().isEmpty()) {
            greska(cijena, "Obavezno cijena.");
            greska(provizija, "Obavezno provizija.");
            return;
        } else {
            Float c1 = new Float(cijena.getText());
            Float pro = new Float(provizija.getText());
            Float c2 = c1 * ((pro / 100) + 1);
            cijenaSprovizijom.setText(Float.toString(c2));

        }

    }//GEN-LAST:event_akcijaUracunajProvizijuActionPerformed

    private void cistiPolja() {
        cijena.setText("");
        cijenaSprovizijom.setText("");

    }

    private void greska(JComponent komponenta, String obavijest) {
        komponenta.setBackground(Color.red);
        komponenta.requestFocus();
        komponenta.setToolTipText(obavijest);

    }

    private void reset() {

        for (Component c : this.getContentPane().getComponents()) {
            if (c instanceof JTextField) {
                JComponent jc = (JComponent) c;
                jc.setBackground(Color.white);
                jc.setToolTipText("");
            }
        }
    }

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/pictures/real_estate_icon.jpg")));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField UvjetPonudaPotraznja;
    private javax.swing.JButton akcijaDodajNovogKlijenta;
    private javax.swing.JButton akcijaDodajNovuNekretninu;
    private javax.swing.JButton akcijaGenerirajPDF;
    private javax.swing.JButton akcijaKreirajPonudu;
    private javax.swing.JButton akcijaObrisi;
    private javax.swing.JButton akcijaOdustani;
    private javax.swing.JButton akcijaPosalji;
    private javax.swing.JButton akcijaTraziKlijenta;
    private javax.swing.JButton akcijaTraziNekretninu;
    private javax.swing.JButton akcijaTraziPonude;
    private javax.swing.JButton akcijaUracunajProviziju;
    private javax.swing.JTextField cijena;
    private javax.swing.JTextField cijenaSprovizijom;
    private com.toedter.calendar.JDateChooser datum;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JCheckBox kupnjaNekretnine;
    private javax.swing.JList listaKlijent;
    private javax.swing.JList listaNekretnina;
    private javax.swing.JList listaPonuda;
    private javax.swing.JCheckBox prodajaNekretnine;
    private javax.swing.JTextField provizija;
    private javax.swing.JTextField uvjetKlijent;
    private javax.swing.JTextField uvjetNekretnina;
    // End of variables declaration//GEN-END:variables
}