/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forme;

import domen.Tim;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Calendar;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import kontroler.Kontroler;

/**
 *
 * @author Marko
 */
public class FrmTimUnos extends javax.swing.JDialog {

    /**
     * Creates new form FrmTimUnos
     */
    public FrmTimUnos(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        popuniCombo();
        pozicionirajFormu();
    }

    public FrmTimUnos(java.awt.Frame parent, boolean modal, String naslov, Tim t) {
        super(parent, modal);
        initComponents();
        this.setTitle(naslov);
        jLabel1.setText("Izmena tima");
        popuniCombo();
        pozicionirajFormu();
        jbtnResetuj.setVisible(false);
        popuniPolja(t);
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtxtNaziv = new javax.swing.JTextField();
        jcomboGodina = new javax.swing.JComboBox();
        jtxtGrad = new javax.swing.JTextField();
        jtxtHala = new javax.swing.JTextField();
        jbtnResetuj = new javax.swing.JButton();
        jbtnPotvrdi = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Unos novog tima");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Unos tima");

        jLabel2.setText("Naziv:");

        jLabel3.setText("Godina osnivanja:");

        jLabel4.setText("Grad:");

        jLabel5.setText("Naziv hale:");

        jcomboGodina.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jbtnResetuj.setText("Resetuj");
        jbtnResetuj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnResetujActionPerformed(evt);
            }
        });

        jbtnPotvrdi.setText("Potvrdi");
        jbtnPotvrdi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPotvrdiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jLabel5)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbtnResetuj)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtnPotvrdi))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jtxtNaziv)
                            .addComponent(jtxtGrad, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtxtHala, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcomboGodina, 0, 196, Short.MAX_VALUE))))
                .addGap(32, 32, 32))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtxtNaziv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jcomboGodina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtxtGrad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jtxtHala, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnResetuj)
                    .addComponent(jbtnPotvrdi))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnResetujActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnResetujActionPerformed
        jtxtNaziv.setText("");
        jcomboGodina.setSelectedIndex(0);
        jtxtGrad.setText("");
        jtxtHala.setText("");
    }//GEN-LAST:event_jbtnResetujActionPerformed

    private void jbtnPotvrdiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPotvrdiActionPerformed
        String naziv = jtxtNaziv.getText();
        String grad = jtxtGrad.getText();
        String hala = jtxtHala.getText();
        int godina = (int) jcomboGodina.getSelectedItem();

        if (daLiSuValidniPodaciZaTim(naziv, godina, grad, hala)) {
            Tim t = new Tim(Kontroler.getInstance().vratiBrojTimova() + 1, naziv, godina, grad, hala);    
            if (jLabel1.getText().startsWith("Unos")) {
                
                Kontroler.getInstance().sacuvajTim(t);
                JOptionPane.showMessageDialog(this, "Tim je sačuvan!");
            } else {
                for (Tim tim : Kontroler.getInstance().vratiListuTimova()) {
                    if(tim.equals(t)) {
                        t.setSifraTima(tim.getSifraTima());
                        break;
                    }
                }
                JOptionPane.showMessageDialog(this, "Tim je ažuriran!");
                Kontroler.getInstance().azurirajTim(t);
            }
            //System.out.println("marko "+Kontroler.getInstance().daLiJeFormaInicijalizovana());
            //if(Kontroler.getInstance().daLiJeFormaInicijalizovana()) Kontroler.getInstance().osveziComboTimoviNaFormiZaUnosKOsarkasa();
            dispose();
        }
    }//GEN-LAST:event_jbtnPotvrdiActionPerformed

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
//            java.util.logging.Logger.getLogger(FrmTimUnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(FrmTimUnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(FrmTimUnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(FrmTimUnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the dialog */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                FrmTimUnos dialog = new FrmTimUnos(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton jbtnPotvrdi;
    private javax.swing.JButton jbtnResetuj;
    private javax.swing.JComboBox jcomboGodina;
    private javax.swing.JTextField jtxtGrad;
    private javax.swing.JTextField jtxtHala;
    private javax.swing.JTextField jtxtNaziv;
    // End of variables declaration//GEN-END:variables

    private void popuniCombo() {
        jcomboGodina.removeAllItems();
        int trenutnaGodina = Calendar.getInstance().get(Calendar.YEAR);
        for (int i = trenutnaGodina; i >= 1945; i--) {
            jcomboGodina.addItem(i);
        }
    }

    private boolean daLiSuValidniPodaciZaTim(String naziv, int godina, String grad, String hala) {
        if (naziv == null || naziv.equals("")) {
            JOptionPane.showMessageDialog(this, "Morate uneti naziv tima.", "Greska!", JOptionPane.WARNING_MESSAGE);
            jtxtNaziv.setBorder(BorderFactory.createLineBorder(Color.RED));
            jtxtNaziv.requestFocusInWindow();
            return false;
        }

        if (grad == null || grad.equals("")) {
            JOptionPane.showMessageDialog(this, "Morate uneti grad iz kojeg je tim.", "Greska!", JOptionPane.WARNING_MESSAGE);
            jtxtGrad.setBorder(BorderFactory.createLineBorder(Color.RED));
            jtxtGrad.requestFocusInWindow();
            jtxtNaziv.setBorder(null);
            return false;
        }

        if (hala == null || hala.equals("")) {
            JOptionPane.showMessageDialog(this, "Morate uneti naziv hale u kojoj igra ovaj tim.", "Greska!", JOptionPane.WARNING_MESSAGE);
            jtxtHala.setBorder(BorderFactory.createLineBorder(Color.RED));
            jtxtHala.requestFocusInWindow();
            jtxtGrad.setBorder(null);
            jtxtNaziv.setBorder(null);
            return false;
        }

        return true;
    }

    private void pozicionirajFormu() {
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
    }

    private void popuniPolja(Tim t) {
        jtxtNaziv.setText(t.getNaziv());
        jtxtGrad.setText(t.getGrad());
        jtxtHala.setText(t.getNazivHale());
        jcomboGodina.setSelectedItem(t.getGodinaOsnivanja());
    }
}
