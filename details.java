import database.Connectionprovider;
import database.InsertUpdateDelete;
import javax.swing.*;
import java.awt.*;
import java.sql.*;
import javax.swing.event.*;
import database.SelectData;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author soham
 */
public class details extends javax.swing.JFrame implements ListSelectionListener{

    /**
     * Creates new form details
     */
    public details() {
        
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel6 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jList1.addListSelectionListener(this);
        jScrollPane1.setViewportView(jList1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 219, 270, 580));

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Engravers MT", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Choose The Category To Adopt...");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 220, -1, 44));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/boy4.jpg"))); // NOI18N
        jButton2.setText("Boy");
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 340, 150, 200));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/girl.jpg"))); // NOI18N
        jButton3.setText("Girl");
        jButton3.setContentAreaFilled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 340, 150, 200));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pa1.jpg"))); // NOI18N
        jButton4.setText("Grandpaa");
        jButton4.setContentAreaFilled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 600, 150, 200));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ma_1.jpg"))); // NOI18N
        jButton5.setText("Grandmaa");
        jButton5.setContentAreaFilled(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 600, 150, 200));

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Engravers MT", 1, 18)); // NOI18N
        jLabel10.setText("Orphan Details");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 25, 251, -1));

        jLabel4.setFont(new java.awt.Font("Perpetua", 0, 18)); // NOI18N
        jLabel4.setText("Orphan Name");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 117, 184, -1));

        jLabel5.setFont(new java.awt.Font("Perpetua", 0, 18)); // NOI18N
        jLabel5.setText("Date  Of Birth");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 157, 184, -1));

        jTextField1.setEditable(false);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(252, 74, 219, -1));

        jTextField2.setEditable(false);
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(252, 116, 219, -1));

        jTextField3.setEditable(false);
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(252, 156, 219, -1));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Perpetua", 0, 18)); // NOI18N
        jLabel3.setText("Orphan  No.");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 73, 184, 25));

        jLabel7.setFont(new java.awt.Font("Perpetua", 0, 18)); // NOI18N
        jLabel7.setText("Contact No. Of Orphanage");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 277, -1, -1));

        jTextField4.setEditable(false);
        jPanel2.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(252, 276, 219, -1));

        jLabel8.setFont(new java.awt.Font("Perpetua", 0, 18)); // NOI18N
        jLabel8.setText("Leatest Pic Of Orphan");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 316, 184, -1));

        jButton1.setBackground(new java.awt.Color(255, 0, 0));
        jButton1.setFont(new java.awt.Font("Engravers MT", 1, 14)); // NOI18N
        jButton1.setText("Select");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 600, -1, -1));

        //ImageIcon img = new ImageIcon("C:/Program Files/Java/jdk-19/bin/images/qu-nh-le-m-nh-dp3CS405UZM-unsplash.jpg");
        //            jLabel1 = new JLabel(img);

        //ResultSet rs2 = SelectData.getData("select * from orphan");
        //                try
        //                {
            //                    if(rs2.next())
            //                    {
                //                        String imgdb = rs2.getString(6);
                //                        ImageIcon img = new ImageIcon("C:/Program Files/Java/jdk-19/bin/images/qu-nh-le-m-nh-dp3CS405UZM-unsplash.jpg");
                //                       jLabel1 = new JLabel(img);

                //                    }
            //                }
        //                catch(Exception e)
        //                {
            //                e.printStackTrace();
            //                }
        jScrollPane2.setViewportView(jLabel1);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 355, 440, 233));

        jLabel9.setFont(new java.awt.Font("Perpetua", 0, 18)); // NOI18N
        jLabel9.setText("Current Age  ");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 197, 184, -1));

        jTextField5.setEditable(false);
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(252, 196, 219, -1));

        jLabel11.setFont(new java.awt.Font("Perpetua", 0, 18)); // NOI18N
        jLabel11.setText("Gender");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 237, 184, -1));

        jTextField6.setEditable(false);
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(252, 236, 219, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 160, 500, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<5", "<10", "<20", "<30", "<40", "<50", "<70", "<100" }));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 152, -1, -1));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("ROG Fonts", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 51));
        jLabel2.setText("\"FAMILY IS NOT JUST BLOOD,ITS LOVE\"");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 621, -1));

        jButton6.setFont(new java.awt.Font("Perpetua", 0, 18)); // NOI18N
        jButton6.setText("Search By Age Criteria");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 150, -1, -1));

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/NicePng_close-png_2084002.png"))); // NOI18N
        jButton7.setBorderPainted(false);
        jButton7.setContentAreaFilled(false);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1487, 0, -1, -1));

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logout.png"))); // NOI18N
        jButton9.setBorderPainted(false);
        jButton9.setContentAreaFilled(false);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1451, 0, -1, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/shubham-dhage-NsPqV-WsZYY-unsplash.jpg"))); // NOI18N
        jLabel13.setText("jLabel13");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    @Override
    public void valueChanged(ListSelectionEvent e)
    {         
        jLabel1 = new javax.swing.JLabel();
        try
        {
            String number = null;
            String item = jList1.getSelectedValue();
            int n = item.indexOf(" ");
            String name = item.substring(n+1,item.length());
            ResultSet rs = SelectData.getData("select * from available where orphan_name = '"+name+"'");         
            if(rs.next())
            {    
                ResultSet rs1 = SelectData.getData("select * from orphanmanager");                 
                String num = rs.getString("orphan_no");
                String gender = rs.getString("orphan_gender");
                String name1 = rs.getString("orphan_name");
                String dob = rs.getString("orphan_dob");
                String age = rs.getString("orphan_age");
                if(rs1.next())
                {
                 number = rs1.getString("number");
                }
                jTextField1.setText(num);
                jTextField2.setText(name1); 
                jTextField6.setText(gender);
                jTextField3.setText(dob); 
                jTextField5.setText(age); 
                jTextField4.setText(number);
                String image = rs.getString("img");
                ImageIcon img = new ImageIcon(image);
                jLabel1 = new JLabel(img);
                jScrollPane2.setViewportView(jLabel1);

                
            }

        }
        catch(Exception ex)
        {
            
//            JOptionPane.showMessageDialog(null,e);
        }
        jList1.getSelectedValue();
        
    }
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

                DefaultListModel m = new DefaultListModel();
        try
        {
            ResultSet rs = SelectData.getData("select * from available");         
            while(rs.next())
            {
                String age1 = rs.getString("orphan_age");
                int age =  Integer.parseInt(age1);
                String gender = rs.getString("orphan_gender");
                String num = rs.getString("orphan_no");
                String name = rs.getString("orphan_name");
                if(gender.equals("Female") && age <= 30)
                {       
                            m.addElement(num + " "+ name);
  
                }
            }
            jList1.setModel(m);
        }
        catch(Exception e)
        {
//            JOptionPane.showMessageDialog(null,e);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        DefaultListModel m = new DefaultListModel();
        try
        {
            ResultSet rs = SelectData.getData("select * from available");         
            while(rs.next())
            {
                String age1 = rs.getString("orphan_age");
                int age =  Integer.parseInt(age1);
                String gender = rs.getString("orphan_gender");
                String num = rs.getString("orphan_no");
                String name = rs.getString("orphan_name");
                if(gender.equals("Male") && age >= 30)
                {       
                            m.addElement(num + " "+ name);
 
                }
            }
            jList1.setModel(m);
        }
        catch(Exception e)
        {
//            JOptionPane.showMessageDialog(null,e);
        }
  // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

        
     String range = (String) jComboBox1.getSelectedItem();
     DefaultListModel m = new DefaultListModel();
        try
        {
            ResultSet rs = SelectData.getData("select * from available");         
            while(rs.next())
            {
                String age1 = rs.getString("orphan_age");
                int age =  Integer.parseInt(age1);
                String num = rs.getString("orphan_no");
                String name = rs.getString("orphan_name");
                
                switch(range)
                {
                    case "<5":
                        if(age <= 5)
                        {
                            m.addElement(num + " "+ name);
                        }
                        break;    
                    case "<10":
                        if(age <= 10)
                        {
                            m.addElement(num + " "+ name);
                        }
                        break; 
                                            case "<20":
                        if(age <= 20)
                        {
                            m.addElement(num + " "+ name);
                        }
                        break; 
                                            case "<30":
                        if(age <= 30)
                        {
                            m.addElement(num + " "+ name);
                        }
                        break; 
                                            case "<40":
                        if(age <= 40)
                        {
                                            m.addElement(num + " "+ name);

                        }
                        break; 
                                            case "<50":
                        if(age <= 50)
                        {
                                                       m.addElement(num + " "+ name);

                        }
                        break; 

                                            case "<70":
                        if(age <= 70)
                        {
                                                 m.addElement(num + " "+ name);

                        }
                      
                        break; 
                                            case "<100":
                        if(age <= 100)
                        {
                                                       m.addElement(num + " "+ name);
                        }
                        break;  
                }
//                if(range.equals("<5"))
//                {
//                    if(age <= 5)
//                    {
//                        m.addElement(num);
//                        m.addElement(name);
//                    }
//                }
//                else if(range.equals("<10"))
//                {
//                     if(age <= 10)
//                    {
//                        m.addElement(num);
//                        m.addElement(name);
//                    }
//                }
            }
            jList1.setModel(m);
        }
        catch(Exception e)
        {
//            JOptionPane.showMessageDialog(null,e);
        }   
   // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        DefaultListModel m = new DefaultListModel();
        try
        {
            ResultSet rs = SelectData.getData("select * from available");         
            while(rs.next())
            {
                String age1 = rs.getString("orphan_age");
                int age =  Integer.parseInt(age1);
                String gender = rs.getString("orphan_gender");
                String num = rs.getString("orphan_no");
                String name = rs.getString("orphan_name");
                if(gender.equals("Male") && age <= 30)
                {       
                                                 m.addElement(num + " "+ name);
   
                }
            }
            jList1.setModel(m);
        }
        catch(Exception e)
        {
//            JOptionPane.showMessageDialog(null,e);
        }   
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        
                DefaultListModel m = new DefaultListModel();
        try
        {
            ResultSet rs = SelectData.getData("select * from available");         
            while(rs.next())
            {
                String age1 = rs.getString("orphan_age");
                int age =  Integer.parseInt(age1);
                String gender = rs.getString("orphan_gender");
                String num = rs.getString("orphan_no");
                String name = rs.getString("orphan_name");
                if(gender.equals("Female") && age >= 30)
                {                                m.addElement(num + " "+ name);

                }
            }
            jList1.setModel(m);
        }
        catch(Exception e)
        {
//            JOptionPane.showMessageDialog(null,e);
        }


        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int a = JOptionPane.showConfirmDialog(null,"Confirm Your Selection By Pressing YES (you cant make changes once you tab on yes)","Select",JOptionPane.YES_NO_OPTION);
        if(a==0)
        {
            try
            {
                ResultSet rs1 = SelectData.getData("select * from email");         
                while(rs1.next())
                {
                    String email01 = rs1.getString("current_login");
                    ResultSet rs = SelectData.getData("select * from family where fam_email = '"+email01+"' ");         
                    while(rs.next())
                    {
                        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                        Date date = new Date();
                        String date01 =formatter.format(date);
                        LocalDate localDate = LocalDate.now();
                        int year = localDate.getYear();
                        String num = jTextField1.getText();
                        String name = jTextField2.getText();
                        String gender = jTextField6.getText();
                        String dob = jTextField3.getText();
                        String age = jTextField5.getText();
                        String orphanage_num = jTextField4.getText();

                        String name01 = rs.getString("fam_name");
                        String number01 = rs.getString("fam_number");
                        String email001 = rs.getString("fam_email");
                        String addhar01 = rs.getString("fam_aadhar");
                        String address01 = rs.getString("fam_adddress");
                        
                        String Query01="insert into details values('"+num+"','"+name+"','"+gender+"','"+dob+"','"+age+"','"+date01+"','"+year+"','"+orphanage_num+"','"+name01+"','"+number01+"','"+email001+"','"+addhar01+"','"+address01+"')";
                        InsertUpdateDelete.setData(Query01, "");
                        
                        String Query="delete from email";
                        InsertUpdateDelete.setData(Query, "");
                        
                        String Query02="delete from available where orphan_no = '"+num+"'";
                        InsertUpdateDelete.setData(Query02, "");
                        
                        setVisible(false);
                        new Select().setVisible(true);
                    }
                }
            }
            catch(Exception e)
            {
//                JOptionPane.showMessageDialog(null,e);
            }
        }        // TODO add your handling code here:
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed

                    String Query="delete from email";
                    InsertUpdateDelete.setData(Query, "");
                    setVisible(false);
                    new login().setVisible(true); 
// TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        int a = JOptionPane.showConfirmDialog(null,"Do you relly want to Close Application","Select",JOptionPane.YES_NO_OPTION);
        if(a==0)
        {
                                String Query="delete from email";
                    InsertUpdateDelete.setData(Query, "");
            System.exit(0);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

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
            java.util.logging.Logger.getLogger(details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new details().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox1;
    public javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}
