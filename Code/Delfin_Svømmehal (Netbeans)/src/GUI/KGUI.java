/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import javax.swing.JFrame;

/**
 *
 * @author ahmed
 */
public class KGUI extends javax.swing.JFrame {

    
    private KGUIAdd kGUIAdd;
//    private KGUIAdd kGUIADD;
    private KGUIShowSubs kShowSubs;
    private GUIStart guiStart;
    //private FGUIUpdateMember fGUIUp;
    private KGUIDeleteMember kGUIDel;
    private KGUIPay kGUIPay;
    
    /**
     * Creates new form KGUI
     */
    public KGUI(JFrame kGUI) {
       this.setTitle("Chairmans menu");
        initComponents();

        kGUIAdd = new KGUIAdd(this);
        this.setResizable(false);
        guiStart = (GUIStart) kGUI;
        kShowSubs = new KGUIShowSubs(this);
        kGUIDel = new KGUIDeleteMember(this);
        kGUIPay = new KGUIPay(this);
        //fGUIUp = new FGUIUpdateMember(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        addSubButton = new javax.swing.JButton();
        showSubTable = new javax.swing.JButton();
        delSubButton = new javax.swing.JButton();
        upSubButton = new javax.swing.JButton();
        paySubButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(489, 369));

        menuButton.setText("Return to start menu");
        menuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel1.setText("Kontigent menu");

        addSubButton.setText("Add subscriber");
        addSubButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addSubButtonActionPerformed(evt);
            }
        });

        showSubTable.setText("Show subscribers");
        showSubTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showSubTableActionPerformed(evt);
            }
        });

        delSubButton.setText("Delete subscriber");
        delSubButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delSubButtonActionPerformed(evt);
            }
        });

        upSubButton.setText("Update subscriber");
        upSubButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upSubButtonActionPerformed(evt);
            }
        });

        paySubButton.setText("Pay subscription");
        paySubButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paySubButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(88, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(menuButton)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(187, 187, 187))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(upSubButton, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addSubButton, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(paySubButton, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(72, 72, 72)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(showSubTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(delSubButton, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(67, 67, 67))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(delSubButton)
                    .addComponent(upSubButton))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addSubButton)
                    .addComponent(showSubTable))
                .addGap(29, 29, 29)
                .addComponent(paySubButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                .addComponent(menuButton)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuButtonActionPerformed
        this.setVisible(false);
        guiStart.setVisible(true);
    }//GEN-LAST:event_menuButtonActionPerformed

    private void delSubButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delSubButtonActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        kGUIDel.setVisible(true);
    }//GEN-LAST:event_delSubButtonActionPerformed

    private void addSubButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addSubButtonActionPerformed
        // TODO add your handling code here:
         this.setVisible(false);
        kGUIAdd.setVisible(true);
    }//GEN-LAST:event_addSubButtonActionPerformed

    private void upSubButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upSubButtonActionPerformed
        // TODO add your handling code here:
        //this.setVisible(false);
        //fGUIUp.setVisible(true);
        
    }//GEN-LAST:event_upSubButtonActionPerformed

    private void showSubTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showSubTableActionPerformed
          this.setVisible(false);
        kShowSubs.setVisible(true);
    }//GEN-LAST:event_showSubTableActionPerformed

    private void paySubButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paySubButtonActionPerformed
        this.setVisible(false);
        kGUIPay.setVisible(true);
        
    }//GEN-LAST:event_paySubButtonActionPerformed

    /**
     * @param args the command line arguments
     */
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addSubButton;
    private javax.swing.JButton delSubButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton menuButton;
    private javax.swing.JButton paySubButton;
    private javax.swing.JButton showSubTable;
    private javax.swing.JButton upSubButton;
    // End of variables declaration//GEN-END:variables
}
