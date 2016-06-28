/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forme;

import domen.Kosarkas;
import domen.Tim;
import java.awt.Checkbox;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import kontroler.Kontroler;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

/**
 *
 * @author Marko
 */
public class FrmPrikazKosarkasa extends javax.swing.JDialog {

    /**
     * Creates new form FrmPrikazKosarkasa
     */
    public FrmPrikazKosarkasa(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        napuniCombo();
        napuniListu(Kontroler.getInstance().vratiListuKosarkasa());
        jtxtareaKosarkasi.setEditable(false);
        pozicionirajFormu();
        jbtnIzmeniKosarkasa.setEnabled(false);
        jbtnObrisiKosarkasa.setEnabled(false);
    }

    public FrmPrikazKosarkasa(java.awt.Frame parent, boolean modal, String naslov) {
        super(parent, modal);
        initComponents();
        jLabel1.setText(naslov);
        napuniCombo();
        napuniListu(Kontroler.getInstance().vratiListuKosarkasa());
        jtxtareaKosarkasi.setEditable(false);
        pozicionirajFormu();
        if (naslov.startsWith("Brisanje")) {
            jbtnIzmeniKosarkasa.setVisible(false);
            jbtnObrisiKosarkasa.setEnabled(false);
        } else {
            jbtnObrisiKosarkasa.setVisible(false);
            jbtnIzmeniKosarkasa.setEnabled(false);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jlistKosarkasi = new javax.swing.JList();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtxtareaKosarkasi = new javax.swing.JTextArea();
        jbtnIzmeniKosarkasa = new javax.swing.JButton();
        jbtnObrisiKosarkasa = new javax.swing.JButton();
        jpnlFilter = new javax.swing.JPanel();
        cbPlej = new javax.swing.JCheckBox();
        cbBek = new javax.swing.JCheckBox();
        cbKrilo = new javax.swing.JCheckBox();
        cbKrilniCentar = new javax.swing.JCheckBox();
        cbCentar = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        jtxtKriterijumPretrage = new javax.swing.JTextField();
        jbtnOK = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jcomboIzborTima = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Pretraga košarkaša");
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Pretraga košarkaša");

        jlistKosarkasi.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255), 2));
        jlistKosarkasi.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jlistKosarkasi.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jlistKosarkasiFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jlistKosarkasiFocusLost(evt);
            }
        });
        jScrollPane1.setViewportView(jlistKosarkasi);

        jtxtareaKosarkasi.setColumns(20);
        jtxtareaKosarkasi.setRows(5);
        jtxtareaKosarkasi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtxtareaKosarkasiMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jtxtareaKosarkasi);

        jbtnIzmeniKosarkasa.setText("Izmeni");
        jbtnIzmeniKosarkasa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnIzmeniKosarkasaActionPerformed(evt);
            }
        });

        jbtnObrisiKosarkasa.setText("Obriši");
        jbtnObrisiKosarkasa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnObrisiKosarkasaActionPerformed(evt);
            }
        });

        jpnlFilter.setBorder(javax.swing.BorderFactory.createTitledBorder("Filter"));
        jpnlFilter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpnlFilterMouseClicked(evt);
            }
        });
        jpnlFilter.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jpnlFilterFocusGained(evt);
            }
        });

        cbPlej.setText("Plejmejker");

        cbBek.setText("Bek");

        cbKrilo.setText("Krilo");

        cbKrilniCentar.setText("Krilni centar");
        cbKrilniCentar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbKrilniCentarActionPerformed(evt);
            }
        });

        cbCentar.setText("Centar");

        jLabel2.setText("Unesite prezime košarkaša:");

        jbtnOK.setText("OK");
        jbtnOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnOKActionPerformed(evt);
            }
        });

        jLabel3.setText("Izaberite poziciju/e:");

        jLabel4.setText("Izaberite tim:");

        jcomboIzborTima.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jcomboIzborTima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcomboIzborTimaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpnlFilterLayout = new javax.swing.GroupLayout(jpnlFilter);
        jpnlFilter.setLayout(jpnlFilterLayout);
        jpnlFilterLayout.setHorizontalGroup(
            jpnlFilterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnlFilterLayout.createSequentialGroup()
                .addGroup(jpnlFilterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnlFilterLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jpnlFilterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGroup(jpnlFilterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpnlFilterLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cbBek)
                                .addGap(18, 18, 18)
                                .addComponent(cbKrilo)
                                .addGap(18, 18, 18)
                                .addComponent(cbKrilniCentar)
                                .addGap(10, 10, 10)
                                .addComponent(cbCentar))
                            .addGroup(jpnlFilterLayout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addComponent(jcomboIzborTima, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnlFilterLayout.createSequentialGroup()
                        .addGap(493, 493, 493)
                        .addComponent(jbtnOK, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnlFilterLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jpnlFilterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbPlej)
                            .addComponent(jtxtKriterijumPretrage, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
            .addGroup(jpnlFilterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jpnlFilterLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel2)
                    .addContainerGap(421, Short.MAX_VALUE)))
        );
        jpnlFilterLayout.setVerticalGroup(
            jpnlFilterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnlFilterLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jtxtKriterijumPretrage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jpnlFilterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbBek)
                    .addComponent(cbPlej)
                    .addComponent(cbKrilo)
                    .addComponent(cbKrilniCentar)
                    .addComponent(cbCentar)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(jpnlFilterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jcomboIzborTima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jbtnOK))
            .addGroup(jpnlFilterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jpnlFilterLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel2)
                    .addContainerGap(152, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(236, 236, 236)
                .addComponent(jbtnIzmeniKosarkasa)
                .addGap(37, 37, 37)
                .addComponent(jbtnObrisiKosarkasa)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(57, 57, 57)
                                .addComponent(jScrollPane2))
                            .addComponent(jpnlFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(234, 234, 234)
                        .addComponent(jLabel1)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(15, 15, 15)
                .addComponent(jpnlFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addGap(53, 53, 53)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnIzmeniKosarkasa)
                    .addComponent(jbtnObrisiKosarkasa))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnObrisiKosarkasaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnObrisiKosarkasaActionPerformed
        Kontroler.getInstance().izbrisiKosarkasa((Kosarkas) jlistKosarkasi.getSelectedValue());

        napuniListu(Kontroler.getInstance().vratiListuKosarkasa());
        jbtnIzmeniKosarkasa.setEnabled(false);
        jbtnObrisiKosarkasa.setEnabled(false);
        jtxtKriterijumPretrage.setText("");
        cbBek.setSelected(false);
        cbPlej.setSelected(false);
        cbKrilo.setSelected(false);
        cbKrilniCentar.setSelected(false);
        cbCentar.setSelected(false);
        jcomboIzborTima.setSelectedIndex(0);
    }//GEN-LAST:event_jbtnObrisiKosarkasaActionPerformed

    private void jbtnIzmeniKosarkasaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnIzmeniKosarkasaActionPerformed
        FrmKosarkasUnos forma = new FrmKosarkasUnos(null, true, "Izmena košarkaša", (Kosarkas) jlistKosarkasi.getSelectedValue());
        forma.setVisible(true);
        jbtnIzmeniKosarkasa.setEnabled(false);
        jbtnObrisiKosarkasa.setEnabled(false);
        
        jtxtKriterijumPretrage.setText("");
        cbBek.setSelected(false);
        cbPlej.setSelected(false);
        cbKrilo.setSelected(false);
        cbKrilniCentar.setSelected(false);
        cbCentar.setSelected(false);
        jcomboIzborTima.setSelectedIndex(0);
    }//GEN-LAST:event_jbtnIzmeniKosarkasaActionPerformed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        napuniListu(Kontroler.getInstance().vratiListuKosarkasa());
    }//GEN-LAST:event_formWindowGainedFocus

    private void cbKrilniCentarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbKrilniCentarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbKrilniCentarActionPerformed

    private void jcomboIzborTimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcomboIzborTimaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcomboIzborTimaActionPerformed

    private void jbtnOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnOKActionPerformed
        List<Kosarkas> sviKosarkasi = Kontroler.getInstance().vratiListuKosarkasa();
        List<Kosarkas> lk = new ArrayList<>();
        String prezime = jtxtKriterijumPretrage.getText().trim();

        List<String> izabranePozicije = new ArrayList<>();
        if (cbPlej.isSelected()) {
            izabranePozicije.add("Plejmejker");
        }
        if (cbBek.isSelected()) {
            izabranePozicije.add("Bek");
        }
        if (cbKrilo.isSelected()) {
            izabranePozicije.add("Krilo");
        }
        if (cbKrilniCentar.isSelected()) {
            izabranePozicije.add("Krilni centar");
        }
        if (cbCentar.isSelected()) {
            izabranePozicije.add("Centar");
        }

        List<Kosarkas> listaPoPrezimenu = new ArrayList<>();
        for (Kosarkas k : sviKosarkasi) {
            if (prezime != null && !prezime.isEmpty()) {
                if (k.getPrezime().toUpperCase().equals(prezime.toUpperCase()) || k.getPrezime().toUpperCase().contains(prezime.toUpperCase())) {
                    listaPoPrezimenu.add(k);
                }
            } else {
                listaPoPrezimenu = sviKosarkasi;
                break;
            }

        }

        if (!prezime.isEmpty() && listaPoPrezimenu.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Nije pronađen nijedan košarkaš prema zadatim kriterijumima!", "Nema rezultata", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        
        List<Kosarkas> listaPoPozicijama = new ArrayList<>();
        for (Kosarkas k : sviKosarkasi) {
            if (izabranePozicije.isEmpty()) {
                listaPoPozicijama = sviKosarkasi;
                break;
            } else {
                for (String poz : izabranePozicije) {
                    if (k.getPozicija().equals(poz)) {
                        listaPoPozicijama.add(k);
                    }
                }
            }
        }

        List<Kosarkas> listaPremaTimu = new ArrayList<>();
        if (jcomboIzborTima.getSelectedIndex() != 0) {
            Tim tim = (Tim) jcomboIzborTima.getSelectedItem();
            for (Kosarkas k : sviKosarkasi) {
                if (k.getTimZaKojiNastupa().equals(tim)) {
                    listaPremaTimu.add(k);
                }
            }
        } else {
            listaPremaTimu = sviKosarkasi;
        }

        for (Kosarkas k : listaPoPrezimenu) {
            if(listaPoPozicijama.contains(k) && listaPremaTimu.contains(k)) lk.add(k);
        }
        
        if (lk.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Nije pronađen nijedan košarkaš prema zadatim kriterijumima!", "Nema rezultata", JOptionPane.INFORMATION_MESSAGE);
            lk = sviKosarkasi;
        }

        napuniListu(lk);

    }//GEN-LAST:event_jbtnOKActionPerformed

    private void jlistKosarkasiFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jlistKosarkasiFocusGained
        jbtnIzmeniKosarkasa.setEnabled(true);
        jbtnObrisiKosarkasa.setEnabled(true);
    }//GEN-LAST:event_jlistKosarkasiFocusGained

    private void jlistKosarkasiFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jlistKosarkasiFocusLost
//        jbtnIzmeniKosarkasa.setEnabled(false);
//        jbtnObrisiKosarkasa.setEnabled(false);
    }//GEN-LAST:event_jlistKosarkasiFocusLost

    private void jpnlFilterFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jpnlFilterFocusGained
        jbtnIzmeniKosarkasa.setEnabled(false);
        jbtnObrisiKosarkasa.setEnabled(false);
    }//GEN-LAST:event_jpnlFilterFocusGained

    private void jpnlFilterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpnlFilterMouseClicked
        jbtnIzmeniKosarkasa.setEnabled(false);
        jbtnObrisiKosarkasa.setEnabled(false);
    }//GEN-LAST:event_jpnlFilterMouseClicked

    private void jtxtareaKosarkasiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtxtareaKosarkasiMouseClicked
        jbtnIzmeniKosarkasa.setEnabled(false);
        jbtnObrisiKosarkasa.setEnabled(false);
    }//GEN-LAST:event_jtxtareaKosarkasiMouseClicked

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(FrmPrikazKosarkasa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(FrmPrikazKosarkasa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(FrmPrikazKosarkasa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(FrmPrikazKosarkasa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the dialog */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                FrmPrikazKosarkasa dialog = new FrmPrikazKosarkasa(new javax.swing.JFrame(), true);
//                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
//                    @Override
//                    public void windowClosing(java.awt.event.WindowEvent e) {
//                        System.exit(0);
//                    }
//                });
//                dialog.setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox cbBek;
    private javax.swing.JCheckBox cbCentar;
    private javax.swing.JCheckBox cbKrilniCentar;
    private javax.swing.JCheckBox cbKrilo;
    private javax.swing.JCheckBox cbPlej;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbtnIzmeniKosarkasa;
    private javax.swing.JButton jbtnOK;
    private javax.swing.JButton jbtnObrisiKosarkasa;
    private javax.swing.JComboBox jcomboIzborTima;
    private javax.swing.JList jlistKosarkasi;
    private javax.swing.JPanel jpnlFilter;
    private javax.swing.JTextField jtxtKriterijumPretrage;
    private javax.swing.JTextArea jtxtareaKosarkasi;
    // End of variables declaration//GEN-END:variables

    private void napuniListu(List<Kosarkas> listaKosarkasa) {
        //jlistKosarkasi.removeAll();
        DefaultListModel dlm = new DefaultListModel();

        for (Kosarkas kosarkas : listaKosarkasa) {
            dlm.addElement(kosarkas);
        }

        jlistKosarkasi.setModel(dlm);

        jlistKosarkasi.addListSelectionListener(new ListSelectionListener() {

            @Override
            public void valueChanged(ListSelectionEvent e) {
                prikaziElementListe();
            }

            private void prikaziElementListe() {
                if (jlistKosarkasi.getSelectedValue() == null) {
                    jtxtareaKosarkasi.setText("");
                    return;
                }
                Kosarkas k = (Kosarkas) jlistKosarkasi.getSelectedValue();
                SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy.");
                jtxtareaKosarkasi.setText("\n Ime: " + k.getIme() + "\n"
                        + " Prezime: " + k.getPrezime() + "\n"
                        + " Datum rođenja: " + sdf.format(k.getDatumRodjenja()) + "\n"
                        + " Pozicija: " + k.getPozicija() + "\n"
                        + " Broj na dresu: " + k.getBrojNaDresu() + "\n"
                        + " Tim: " + k.getTimZaKojiNastupa() + "\n"
                        + " Visina: " + k.getVisina() + "\n"
                        + " Tezina: " + k.getTezina() + "\n");
            }
        });
    }

    private void pozicionirajFormu() {
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);

        Border border = BorderFactory.createLineBorder(Color.BLACK);
        jtxtareaKosarkasi.setBorder(border);

        AutoCompleteDecorator.decorate(jcomboIzborTima);
    }

    private void napuniCombo() {
        jcomboIzborTima.removeAllItems();

        jcomboIzborTima.addItem("Nije izabrano");
        for (Tim tim : Kontroler.getInstance().vratiListuTimova()) {
            jcomboIzborTima.addItem(tim);
        }
    }

}
