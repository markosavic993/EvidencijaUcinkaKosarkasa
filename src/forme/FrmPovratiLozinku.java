/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forme;

import domen.Korisnik;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import kontroler.Kontroler;

/**
 *
 * @author Marko
 */
public class FrmPovratiLozinku extends javax.swing.JDialog {

    /**
     * Creates new form FrmPovratiLozinku
     */
    public FrmPovratiLozinku(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        pozicionirajFormu();
        jtxtLozinka.setEditable(false);
        //jtxtLozinka.setVisible(false);
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
        jtxtKI = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jtxtMail = new javax.swing.JTextField();
        jbtnDalje = new javax.swing.JButton();
        jtxtLozinka = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Zaboravljena lozinka");

        jLabel1.setText("Unesite korisničko ime:");

        jLabel2.setText("Email:");

        jbtnDalje.setText("Pronadji lozinku");
        jbtnDalje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDaljeActionPerformed(evt);
            }
        });

        jtxtLozinka.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jbtnDalje)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtxtMail, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtxtKI, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jtxtLozinka, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtxtKI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtxtMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jbtnDalje)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtxtLozinka, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnDaljeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDaljeActionPerformed
        String ki = jtxtKI.getText().trim();
        String mail = jtxtMail.getText().trim();
        
        if(validanUnos(ki, mail)) {
            List<Korisnik> lk = Kontroler.getInstance().vratiSveKorisnike();
            for (Korisnik k : lk) {
                if(k.getUsername().equals(ki) && k.getMail().equals(mail)) {
                    jtxtLozinka.setVisible(true);
                    jtxtLozinka.setText(k.getPassword());
                    return;
                }
            }
            
            JOptionPane.showMessageDialog(this, "Nije pronađen korisnik sa unetim vrednostima." ,"Greška!", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jbtnDaljeActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmPovratiLozinku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPovratiLozinku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPovratiLozinku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPovratiLozinku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrmPovratiLozinku dialog = new FrmPovratiLozinku(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton jbtnDalje;
    private javax.swing.JTextField jtxtKI;
    private javax.swing.JTextField jtxtLozinka;
    private javax.swing.JTextField jtxtMail;
    // End of variables declaration//GEN-END:variables

    private void pozicionirajFormu() {
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
    }

    private boolean validanUnos(String ki, String mail) {
        
        if(ki.isEmpty() || ki.length() < 5) {
            JOptionPane.showMessageDialog(this, "Korisničko ime mora sadržati bar 5 karaktera!", "Greška!", JOptionPane.WARNING_MESSAGE);
            jtxtKI.setBorder(BorderFactory.createLineBorder(Color.RED));
            jtxtKI.requestFocusInWindow();
            jtxtMail.setBorder(null);
            return false;
        }
        
        if(mail.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Morate uneti mail adresu!", "Greška!", JOptionPane.WARNING_MESSAGE);
            jtxtMail.setBorder(BorderFactory.createLineBorder(Color.RED));
            jtxtMail.requestFocusInWindow();
            jtxtKI.setBorder(null);
            return false;
        }
        
        if(!mail.contains("@")) {
            JOptionPane.showMessageDialog(this, "Mail adresa nije u odgovarajućem formatu, mora sadržati znak @!", "Greška!", JOptionPane.WARNING_MESSAGE);
            jtxtMail.setBorder(BorderFactory.createLineBorder(Color.RED));
            jtxtMail.requestFocusInWindow();
            jtxtKI.setBorder(null);
            return false;
        }
        
        return true;
    }
    
}
