package GUI;


import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ahmed
 */
public class FGUI extends javax.swing.JFrame {

    private FGUIAddMember fGUIADD;
    private GUIShowMembers guiM;
    private GUIStart guiStart;
    private FGUIUpdateMember fGUIUp;
    private FGUIDeleteMember fGUIDel;

    /**
     * Creates new form GUI
     */
    public FGUI(JFrame fGui) {
        this.setTitle("Chairmans menu");
        initComponents();
        fGUIADD = new FGUIAddMember(this);
        fGUIUp = new FGUIUpdateMember(this);
        //guiM = new GUIShowMembers(this);
        fGUIDel = new FGUIDeleteMember(this);
        this.setResizable(false);
        guiStart = (GUIStart) fGui;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        menuButton = new javax.swing.JButton();
        DeleteMember = new javax.swing.JButton();
        UpdateMember = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        addButton.setText("Add a new member");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Delfine Svømmehal Prog.");

        menuButton.setText("Return to menu");
        menuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuButtonActionPerformed(evt);
            }
        });

        DeleteMember.setText("Remove a member");
        DeleteMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteMemberActionPerformed(evt);
            }
        });

        UpdateMember.setText("Update member");
        UpdateMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateMemberActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(126, 126, 126)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(UpdateMember, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(addButton))
                                .addGap(45, 45, 45)
                                .addComponent(DeleteMember, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 60, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(menuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addButton)
                    .addComponent(DeleteMember))
                .addGap(44, 44, 44)
                .addComponent(UpdateMember)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 134, Short.MAX_VALUE)
                .addComponent(menuButton)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        //When the button is pressed, the FGUI will gets "invisible" and FGUI (the add member menu) get visible.

       this.setVisible(false);
       fGUIADD.setVisible(true);


    }//GEN-LAST:event_addButtonActionPerformed

    private void menuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuButtonActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        guiStart.setVisible(true);
        
    }//GEN-LAST:event_menuButtonActionPerformed

    private void UpdateMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateMemberActionPerformed
        // Shows the update member side
        this.setVisible(false);
        fGUIUp.setVisible(true);
        
    }//GEN-LAST:event_UpdateMemberActionPerformed

    private void DeleteMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteMemberActionPerformed
        // Shows the delete member side
        this.setVisible(false);
        fGUIDel.setVisible(true);
        
        
    }//GEN-LAST:event_DeleteMemberActionPerformed

    /**
     * @param args the command line arguments
     */
   /* public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
     /*   try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
     //   java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
      //          new FGUI().setVisible(true);
            }
      //  });
   // } 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DeleteMember;
    private javax.swing.JButton UpdateMember;
    private javax.swing.JButton addButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton menuButton;
    // End of variables declaration//GEN-END:variables
}
