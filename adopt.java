
import database.InsertUpdateDelete;
import database.SelectData;
import java.sql.ResultSet;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author soham
 */
public class adopt extends javax.swing.JFrame implements ListSelectionListener{

    /**
     * Creates new form adopt
     */
    public adopt() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.WARNING: Do NOT modify this code.The content of this method is always
 regenerated by the Form Editor.
     * 
     */
    @SuppressWarnings("unchecked")
    
    
    @Override
    public void valueChanged(ListSelectionEvent e)
    {   
        try
        {
            jLabel19 = new javax.swing.JLabel();
            String item = jList1.getSelectedValue();
            int n = item.indexOf(" ");
            String name = item.substring(n+1,item.length());
            ResultSet rs = SelectData.getData("select * from details where adopt_name = '"+name+"'");         
            if(rs.next())
            {    
                String num = rs.getString("adopt_no");
                String name01 = rs.getString("adopt_name");
                String gender = rs.getString("adopt_gender");
                String dob = rs.getString("adopt_dob");
                String age = rs.getString("adopt_age");
                String date = rs.getString("adopt_date");
                String number01 = rs.getString("orphanage_number");
                String a_name = rs.getString("adopter_name");
                String a_number = rs.getString("adopter_mobile");
                String a_email = rs.getString("adopter_email");
                String a_addhar = rs.getString("adopter_addhar");
                String a_address = rs.getString("adopter_address");
                
            ResultSet rs1 = SelectData.getData("select * from orphan where orphan_name = '"+name+"' ");         
            if(rs1.next())
            { 
                String image = rs1.getString("img");
                ImageIcon img = new ImageIcon(image);
                jLabel19 = new JLabel(img);
                jScrollPane3.setViewportView(jLabel19);
            }     
                
                jTextField10.setText(num);
                jTextField11.setText(name01); 
                jTextField12.setText(gender);
                jTextField13.setText(dob); 
                jTextField14.setText(age); 
                jTextField15.setText(date);
                jTextField8.setText(number01);
                jTextField3.setText(a_name);
                jTextField4.setText(a_number); 
                jTextField5.setText(a_email);
                jTextField7.setText(a_addhar); 
                jTextArea1.setText(a_address);      
            }
        }
        catch(Exception ex)
        {          
            JOptionPane.showMessageDialog(null,e);
        }
        jList1.getSelectedValue();   
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField6 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jLabel19 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();

        jTextField6.setText("jTextField6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jList1.addListSelectionListener(this);
        jScrollPane1.setViewportView(jList1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 211, 189, 498));

        jButton1.setText("Search By No.");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 129, 111, -1));

        jButton2.setText("Search By Year ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 170, -1, -1));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 129, 71, -1));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 170, 71, -1));

        jPanel1.setBackground(java.awt.SystemColor.activeCaptionBorder);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Engravers MT", 1, 18)); // NOI18N
        jLabel1.setText("Orphan Details");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 28, 275, 41));

        jLabel2.setFont(new java.awt.Font("Engravers MT", 1, 18)); // NOI18N
        jLabel2.setText("Adopter Details");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(813, 28, 254, 41));

        jLabel3.setFont(new java.awt.Font("Perpetua", 0, 18)); // NOI18N
        jLabel3.setText("Orphan No.");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 95, 135, -1));

        jLabel4.setFont(new java.awt.Font("Perpetua", 0, 18)); // NOI18N
        jLabel4.setText("Orphan Name");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 142, 194, -1));

        jLabel5.setFont(new java.awt.Font("Perpetua", 0, 18)); // NOI18N
        jLabel5.setText("Gender");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 189, 194, -1));

        jLabel6.setFont(new java.awt.Font("Perpetua", 0, 18)); // NOI18N
        jLabel6.setText("Date Of Birth");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 236, 194, -1));

        jLabel7.setFont(new java.awt.Font("Perpetua", 0, 18)); // NOI18N
        jLabel7.setText("Age While Adopt");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 283, 194, -1));

        jLabel8.setFont(new java.awt.Font("Perpetua", 0, 18)); // NOI18N
        jLabel8.setText("Date And Time Of Adoption");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 330, -1, -1));

        jLabel9.setFont(new java.awt.Font("Perpetua", 0, 18)); // NOI18N
        jLabel9.setText("Photo Of Orphan");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 425, 194, -1));

        jTextField10.setEditable(false);
        jPanel1.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(282, 94, 225, -1));

        jTextField11.setEditable(false);
        jPanel1.add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(282, 141, 225, -1));

        jTextField12.setEditable(false);
        jTextField12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField12ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(282, 188, 225, -1));

        jTextField13.setEditable(false);
        jPanel1.add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(282, 235, 225, -1));

        jTextField14.setEditable(false);
        jPanel1.add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(282, 282, 225, -1));

        jTextField15.setEditable(false);
        jPanel1.add(jTextField15, new org.netbeans.lib.awtextra.AbsoluteConstraints(282, 329, 225, -1));
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(495, 597, 12, 124));

        jLabel12.setFont(new java.awt.Font("Perpetua", 0, 18)); // NOI18N
        jLabel12.setText("Name");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(707, 95, 100, -1));

        jLabel13.setFont(new java.awt.Font("Perpetua", 0, 18)); // NOI18N
        jLabel13.setText("Mobile No.");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(707, 142, 100, -1));

        jLabel14.setFont(new java.awt.Font("Perpetua", 0, 18)); // NOI18N
        jLabel14.setText("Email Id");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(707, 189, 100, -1));

        jLabel15.setFont(new java.awt.Font("Perpetua", 0, 18)); // NOI18N
        jLabel15.setText("Addhar No.");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(707, 236, 100, -1));

        jLabel16.setFont(new java.awt.Font("Perpetua", 0, 18)); // NOI18N
        jLabel16.setText("Address");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(707, 283, 100, -1));

        jTextField3.setEditable(false);
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(855, 94, 225, -1));

        jTextField4.setEditable(false);
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(855, 141, 225, -1));

        jTextField5.setEditable(false);
        jPanel1.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(855, 188, 225, -1));

        jTextField7.setEditable(false);
        jPanel1.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(855, 235, 225, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setEditable(false);
        jScrollPane2.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(855, 282, 225, -1));

        jLabel10.setFont(new java.awt.Font("Perpetua", 0, 18)); // NOI18N
        jLabel10.setText("Orphanage contact no.");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 378, 194, -1));

        jTextField8.setEditable(false);
        jPanel1.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(282, 377, 225, -1));

        jScrollPane3.setViewportView(jLabel19);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(282, 425, 225, 166));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, 1100, 630));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/NicePng_close-png_2084002.png"))); // NOI18N
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1490, 0, -1, -1));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logout.png"))); // NOI18N
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1450, 0, -1, -1));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/turn-back.png"))); // NOI18N
        jButton5.setBorderPainted(false);
        jButton5.setContentAreaFilled(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1410, 0, -1, -1));

        jLabel17.setFont(new java.awt.Font("ROG Fonts", 0, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 0, 0));
        jLabel17.setText("\"PLANTING SEEDS OF LOVE AND KINDNESS IN THE HEART OF ORPHANS\"");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/shubham-dhage-NsPqV-WsZYY-unsplash.jpg"))); // NOI18N
        jLabel20.setText("jLabel20");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField12ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
                int a = JOptionPane.showConfirmDialog(null,"Do you relly want to Close Application","Select",JOptionPane.YES_NO_OPTION);
        if(a==0)
        {                    String Query="delete from email";
                    InsertUpdateDelete.setData(Query, "");
            System.exit(0);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
                    String Query="delete from email";
                    InsertUpdateDelete.setData(Query, "");
        setVisible(false);
        new login().setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        setVisible(false);
        new Submit().setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
                
     String year = jTextField2.getText();
     DefaultListModel m = new DefaultListModel();
        try
        {
            ResultSet rs = SelectData.getData("select * from details where adopt_year = '"+year+"'");         
            while(rs.next())
            {           
                
                String a_year = rs.getString("adopt_year");
                String num = rs.getString("adopt_no");
                String name = rs.getString("adopt_name");
                
                if(year.equals(a_year))
                {
                    m.addElement(num + " "+ name);
                }               
            }
            jList1.setModel(m);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }   
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
     String number = jTextField1.getText();
     DefaultListModel m = new DefaultListModel();
        try
        {
            ResultSet rs = SelectData.getData("select * from details where adopt_no = '"+number+"'");         
            if(rs.next())
            {           
                
                String num = rs.getString("adopt_no");
                String name = rs.getString("adopt_name");
                
                m.addElement(num + " "+ name);
                jList1.setModel(m);               
            }
            else
                JOptionPane.showMessageDialog(null,"This orphan is still abandon");           
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }   
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(adopt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adopt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adopt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adopt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adopt().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    public javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables
}
