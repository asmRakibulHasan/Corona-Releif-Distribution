/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject;

import java.awt.Component;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

/**
 *
 * @author User
 */
public class Upazilla1Info extends javax.swing.JFrame {

    /**
     * Creates new form Upazilla1Info
     */
    public Upazilla1Info() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        nid = new javax.swing.JTextField();
        rSMaterialButtonRectangle1 = new rojerusan.RSMaterialButtonRectangle();
        rSMaterialButtonRectangle2 = new rojerusan.RSMaterialButtonRectangle();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 181, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Serif", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("INFO SECTION");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, 320, 50));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("X");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 10, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 140));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel2.setText("Enter NID:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, 120, 50));

        nid.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        nid.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel2.add(nid, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, 180, 40));

        rSMaterialButtonRectangle1.setText("BACK");
        rSMaterialButtonRectangle1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSMaterialButtonRectangle1ActionPerformed(evt);
            }
        });
        jPanel2.add(rSMaterialButtonRectangle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 240, 130, 50));

        rSMaterialButtonRectangle2.setText("SUBMIT");
        rSMaterialButtonRectangle2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rSMaterialButtonRectangle2MouseClicked(evt);
            }
        });
        rSMaterialButtonRectangle2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSMaterialButtonRectangle2ActionPerformed(evt);
            }
        });
        jPanel2.add(rSMaterialButtonRectangle2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 140, 130, 50));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 710, 310));

        setSize(new java.awt.Dimension(711, 448));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void rSMaterialButtonRectangle1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSMaterialButtonRectangle1ActionPerformed
        // TODO add your handling code here:
        Upazilla1Central cent =new Upazilla1Central();
        cent.setVisible(true);
        cent.setResizable(false);
        dispose();
                
    }//GEN-LAST:event_rSMaterialButtonRectangle1ActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void rSMaterialButtonRectangle2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSMaterialButtonRectangle2MouseClicked
        // TODO add your handling code here:
        FileReader fr = null;
        
        try {
            fr = new FileReader("up1_people.txt");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CentralMain.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        BufferedReader br = new BufferedReader(fr);
        
        String str;
        
        String arr[][] = new String [100][10];
        int counter  = 0;
        int idx = 0;

        try {
            while((str = br.readLine())!=null)
            {
                arr[counter][idx] = str;
                if(idx == 4)
                {
                    idx = 0;
                    counter++;
                }
                else idx++;
                //System.out.println(counter);
            }
        } catch (IOException ex) {
            Logger.getLogger(CentralMain.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            br.close();
        } catch (IOException ex) {
            Logger.getLogger(CentralMain.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String temp_id = nid.getText();
        int id = Integer.valueOf(temp_id);
        
        try{
         if(id>counter){
         throw new IDNotfound("Id not found");
         }
         else{
        Upazilla1ShowInfo up1_show_info = new Upazilla1ShowInfo();
        up1_show_info.setVisible(true);
        up1_show_info.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        up1_show_info.setResizable(false);
        dispose();
        
        id--;
        
        up1_show_info.nid.setText(temp_id);
        up1_show_info.name.setText(arr[id][0]);
        up1_show_info.birth.setText(arr[id][1]);
        up1_show_info.mobile.setText(arr[id][2]);
        
        up1_show_info.nid.setEditable(false);
        up1_show_info.name.setEditable(false);
        up1_show_info.birth.setEditable(false);
        up1_show_info.mobile.setEditable(false);
        }
         }
         catch(IDNotfound e){
            Component icon = null;
            JOptionPane.showMessageDialog(icon,"This id does not exist","Error",JOptionPane.ERROR_MESSAGE);
            nid.setText("");
            }
        
        
//        if(id >counter)
//        {
//            Component icon = null;
//            JOptionPane.showMessageDialog(icon,"This id is not exist","Error",JOptionPane.ERROR_MESSAGE);
//            nid.setText("");
//        }
        
    }//GEN-LAST:event_rSMaterialButtonRectangle2MouseClicked

    private void rSMaterialButtonRectangle2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSMaterialButtonRectangle2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rSMaterialButtonRectangle2ActionPerformed

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
            java.util.logging.Logger.getLogger(Upazilla1Info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Upazilla1Info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Upazilla1Info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Upazilla1Info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Upazilla1Info().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField nid;
    private rojerusan.RSMaterialButtonRectangle rSMaterialButtonRectangle1;
    private rojerusan.RSMaterialButtonRectangle rSMaterialButtonRectangle2;
    // End of variables declaration//GEN-END:variables
}
