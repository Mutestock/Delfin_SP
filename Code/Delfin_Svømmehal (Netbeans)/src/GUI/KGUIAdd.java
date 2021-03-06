package GUI;

import Controller.Controller;
import FormandAdgang.Member;
import Kontingent.Kontingent;
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
public class KGUIAdd extends javax.swing.JFrame {

    // private KGUI kGUI;
    private GUIShowMembers guiM;
    private GUIStart sMenu;
    private KGUI kGUI;

    /**
     * Creates new form GUI
     */
    public KGUIAdd(JFrame KGUI) {
        // this.kGUI = (KGUI) KGUI;
        initComponents();
        this.setTitle("Add member");
        this.kGUI = (KGUI) KGUI;
    }

    /**
     * This method is called from within the constructor to the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        compCheck = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        subCheck = new javax.swing.JCheckBox();
        ConfirmButton = new javax.swing.JButton();
        MenuButton = new javax.swing.JButton();
        nameIn = new javax.swing.JTextField();
        phoneIn = new javax.swing.JTextField();
        ageIn = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        yearIn = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Delfine Svømmehal Prog.");

        jLabel2.setText("Name:");

        jLabel3.setText("Age:");

        jLabel4.setText("Phone:");

        jLabel5.setText("Does the person wish to be competitive?");

        jLabel6.setText("Does the person wish an active subscription?");

        subCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subCheckActionPerformed(evt);
            }
        });

        ConfirmButton.setText("Confirm");
        ConfirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmButtonActionPerformed(evt);
            }
        });

        MenuButton.setText("Menu");
        MenuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuButtonActionPerformed(evt);
            }
        });

        ageIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageInActionPerformed(evt);
            }
        });

        jLabel7.setText("Kontingent");

        jLabel8.setText("Year:");

        yearIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearInActionPerformed(evt);
            }
        });

        jLabel9.setText("Write number of existing user in Phone");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(compCheck)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(subCheck)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(201, 201, 201)
                                .addComponent(jLabel7))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel8))
                                .addGap(46, 46, 46)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(ageIn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                                    .addComponent(phoneIn, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nameIn, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(yearIn)))
                            .addComponent(jLabel9))
                        .addGap(112, 112, 112)
                        .addComponent(MenuButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ConfirmButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(2, 2, 2)
                .addComponent(jLabel7)
                .addGap(17, 17, 17)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nameIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(phoneIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(ageIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(MenuButton)
                            .addComponent(ConfirmButton))
                        .addGap(52, 52, 52))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(yearIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(subCheck, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(compCheck, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(32, 32, 32))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void ConfirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmButtonActionPerformed
        // When the button is pressed, the GUI2 will get invisible and FGUI get visible.

        //- Hvad hvis man vil adde flere members på én gang? Tror det er
        //overflødigt når man alligevel har en "menu-knap" i samme gui.
        //fGUI.setVisible(true);
        //this.setVisible(false);
        Controller c = new Controller();

        // takes the input values and implements them into the register class to save them.
//        int age = Integer.parseInt(ageIn.getText());
//        String name = nameIn.getText();
        String phone = phoneIn.getText();
        boolean active = subCheck.isSelected();
        boolean comp = compCheck.isSelected();
        Member member = c.getMember(phone);

        int subYear = Integer.parseInt(yearIn.getText());

//        c.getKFee(member, subYear);
//
        if (subCheck.isSelected()) {
            subCheck.doClick();
        }
        if (compCheck.isSelected()) {
            compCheck.doClick();
        }

        System.out.println("====================================");
        System.out.println(member);
        System.out.println(subYear);

        
       // Kontingent k = new Kontingent(member, subYear, active, comp);
      //  Kontingent k = new Kontingent(member, subYear);

        // makes sure that the input fields is always clean when it is open again
        //c.createSubscriber(member, subYear, active, comp);
        c.registerSubscriber(member, subYear, active, comp);
        


    }//GEN-LAST:event_ConfirmButtonActionPerformed

    private void ageInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageInActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ageInActionPerformed

    private void yearInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearInActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yearInActionPerformed

    private void subCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subCheckActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_subCheckActionPerformed

    private void MenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuButtonActionPerformed

        // TODO add your handling code here:
        this.setVisible(false);
        kGUI.setVisible(true);
    }//GEN-LAST:event_MenuButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    /* public static void main(String args[]) {
        /* Set the Nimbus look and feel */
    //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
    /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
     */
 /*try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }*/
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>

    /* Create and display the form */
 /*   java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TGUI().setVisible(true);
            }
        });
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ConfirmButton;
    private javax.swing.JButton MenuButton;
    private javax.swing.JTextField ageIn;
    private javax.swing.JCheckBox compCheck;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField nameIn;
    private javax.swing.JTextField phoneIn;
    private javax.swing.JCheckBox subCheck;
    private javax.swing.JTextField yearIn;
    // End of variables declaration//GEN-END:variables
}
