package GUI;

import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;

/**
 *
 * @author ahmed
 */
public class GUIStart extends javax.swing.JFrame {

    private FGUI fGUI;
    private TGUI tGUI;
    private KGUI kGUI;
<<<<<<< HEAD

    //private KGUI kGUI;
    String info = "hello there, hope this works";

    private GUIShowMembers mGUI;

=======
    
    String info = "hello there, hope this works";

    private GUIShowMembers mGUI;
    
    
>>>>>>> 25b743989a523bc7f6c8972da2ff0723e95b33fd
    public GUIStart() {
        initComponents();
        this.setTitle("Startup menu");
        tGUI = new TGUI(this);
        fGUI = new FGUI(this);
        kGUI = new KGUI(this);

        //kGUI = new KGUI(this);
        this.setTitle("Startup menu");

        mGUI = new GUIShowMembers(this);

    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        chairmanButton1 = new javax.swing.JToggleButton();
        trainerButton = new javax.swing.JToggleButton();
        cashierButton = new javax.swing.JToggleButton();
        showMembers = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(400, 220));

        jLabel1.setText("Press the following depeding one you who you are:");

        chairmanButton1.setText("Formand");
        chairmanButton1.setPreferredSize(new java.awt.Dimension(90, 25));
        chairmanButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chairmanButton1ActionPerformed(evt);
            }
        });

        trainerButton.setText("Træner");
        trainerButton.setPreferredSize(new java.awt.Dimension(90, 25));
        trainerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trainerButtonActionPerformed(evt);
            }
        });

        cashierButton.setText("Kasserer");
        cashierButton.setPreferredSize(new java.awt.Dimension(90, 25));
        cashierButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cashierButtonActionPerformed(evt);
            }
        });

        showMembers.setText("Show members");
        showMembers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showMembersActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cashierButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(chairmanButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(showMembers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(trainerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chairmanButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(trainerButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(showMembers)
                    .addComponent(cashierButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(73, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chairmanButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chairmanButton1ActionPerformed
        // TODO add your handling code here:
        fGUI.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_chairmanButton1ActionPerformed

    private void trainerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trainerButtonActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        tGUI.setVisible(true);


    }//GEN-LAST:event_trainerButtonActionPerformed

    private void cashierButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cashierButtonActionPerformed
        // TODO add your handling code here:
<<<<<<< HEAD

        // JOptionPane.showMessageDialog(Start.this, info, "infor", INFORMATION_MESSAGE);
//        JOptionPane.showMessageDialog(GUIStart.this, info, "infor", INFORMATION_MESSAGE);
        //kGUI.setVisible(true);
        this.setVisible(false);
        kGUI.setVisible(true); // JOptionPane.showMessageDialog(Start.this, info, "infor", INFORMATION_MESSAGE);
//        JOptionPane.showMessageDialog(GUIStart.this, info, "text button test", INFORMATION_MESSAGE);
//
//        // JOptionPane.showMessageDialog(Start.this, info, "infor", INFORMATION_MESSAGE);
//        JOptionPane.showMessageDialog(GUIStart.this, info, "text button test", INFORMATION_MESSAGE);
=======
        this.setVisible(false);
        kGUI.setVisible(true);

         
>>>>>>> 25b743989a523bc7f6c8972da2ff0723e95b33fd

    }//GEN-LAST:event_cashierButtonActionPerformed

    private void showMembersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showMembersActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        mGUI.setVisible(true);

    }//GEN-LAST:event_showMembersActionPerformed

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
            java.util.logging.Logger.getLogger(GUIStart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIStart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIStart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIStart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIStart().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton cashierButton;
    private javax.swing.JToggleButton chairmanButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton showMembers;
    private javax.swing.JToggleButton trainerButton;
    // End of variables declaration//GEN-END:variables
}
