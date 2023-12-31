/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package busmanagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jonas
 */
public class ManagePassenger extends javax.swing.JFrame {

    /** Creates new form ManagePassenger */
    public ManagePassenger() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        pn = new javax.swing.JTextField();
        g = new javax.swing.JTextField();
        n = new javax.swing.JTextField();
        ppn = new javax.swing.JTextField();
        ph = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Manage Passenger");

        jLabel2.setText("Passenger Name");

        jLabel3.setText("Gender");

        jLabel4.setText("Nationality");

        jLabel5.setText("Passport Number");

        jLabel6.setText("Phone");

        jLabel7.setText("<--Back");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        n.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nActionPerformed(evt);
            }
        });

        ppn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ppnActionPerformed(evt);
            }
        });

        ph.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "PassengerName", "Gender", "Nationality", "PassportNumber", "Phone"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("Insert");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Display");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Delete");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Search");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(42, 42, 42)
                        .addComponent(jLabel3)
                        .addGap(59, 59, 59)
                        .addComponent(jLabel4)
                        .addGap(45, 45, 45)
                        .addComponent(jLabel5)
                        .addGap(42, 42, 42)
                        .addComponent(jLabel6)
                        .addGap(0, 56, Short.MAX_VALUE))
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(pn, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(g, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(n, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jButton3)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ppn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ph))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton4)
                                .addGap(36, 36, 36)
                                .addComponent(jButton5)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(195, 195, 195)
                        .addComponent(jLabel7)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(g, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(n, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ppn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ph, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(jButton5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nActionPerformed

    private void ppnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ppnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ppnActionPerformed

    private void phActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phActionPerformed

    /**
     *
     * @return
     */
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bms", "root", "");
            Statement st = con.createStatement();
            String sql = "SELECT * from managepassenger";
            PreparedStatement ptst = con.prepareStatement(sql);
            ResultSet rs = ptst.executeQuery();
            DefaultTableModel dt = (DefaultTableModel)jTable1.getModel();
            dt.setRowCount(0);

            while(rs.next()){
                Object o[] = {rs.getString("name"), rs.getString("gender"), rs.getString("nationality"), rs.getString("passportnumber"), rs.getString("phone")};
                dt.addRow(o);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bms", "root", "");
            String sql = "insert into managepassenger values (?,?,?,?,?)";
            PreparedStatement ptst = con.prepareStatement(sql);
            ptst.setString(1, pn.getText());
            ptst.setString(2, g.getText());
            ptst.setString(3, n.getText());
            ptst.setString(4, ppn.getText());
            ptst.setString(5, ph.getText());

            if((pn.getText().length() >= 5 && pn.getText().length() <= 30) && (g.getText().equals("Male") || g.getText().equals("Female")) && (n.getText().equals("Indonesia") || n.getText().equals("Malaysia") || n.getText().equals("Singapore")) && ppn.getText().startsWith("PPN") && (ph.getText().matches("[0-9]*") && (ph.getText().length() >= 10 && ph.getText().length() <= 12))){
                ptst.executeUpdate();
                JOptionPane.showMessageDialog(this, "Data inserted Succesfully!");
                pn.setText("");
                g.setText("");
                n.setText("");
                ppn.setText("");
                ph.setText("");
                con.close();
            }else if(pn.getText().isEmpty() && g.getText().isEmpty() && n.getText().isEmpty() && ppn.getText().isEmpty() && ph.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "Data cannot be empty!");
            }else if(pn.getText().length() < 5 || pn.getText().length() > 30){
                JOptionPane.showMessageDialog(this, "Passenger Name's length must be 5 - 30 digits");
            }else if(!g.getText().equals("Male") && !g.getText().equals("Female")){
                JOptionPane.showMessageDialog(this, "Gender must be 'Male' or 'Female'");
            }else if(!n.getText().equals("Indonesia") && !n.getText().equals("Malaysia") && !n.getText().equals("Singapore")){
                JOptionPane.showMessageDialog(this, "Nationality must be 'Indonesia', 'Malaysia' or 'Singapore'");
            }else if(!ppn.getText().startsWith("PPN")){
                JOptionPane.showMessageDialog(this, "Passport Number must be starts with 'PPN'");
            }else if(!ph.getText().matches("[0-9]*") || (ph.getText().length() < 10 || ph.getText().length() > 12)){
                JOptionPane.showMessageDialog(this, "Phone Number must be only number and the length must be 10 - 12 digits");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

        try{
            String name = pn.getText();
            String gender = g.getText();
            String nationality = n.getText();
            String passport = ppn.getText();
            String phone = ph.getText();
            boolean flag = false;

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bms", "root", "");
            Statement st = con.createStatement();
            String sql2 = "Select name from managepassenger";
            ResultSet rs = st.executeQuery(sql2);

            while(rs.next()){
                String passName = rs.getString("name");

                if(name.equals(passName)){
                    flag = true;
                }
            }

            if(flag && (name.length() >= 5 && name.length() <= 30) && (gender.equals("Male") || gender.equals("Female")) && (nationality.equals("Indonesia") || nationality.equals("Malaysia") || nationality.equals("Singapore")) && passport.startsWith("PPN") && (phone.matches("[0-9]*") && (phone.length() >= 10 && phone.length() <= 12))){
                String sql = "UPDATE `managepassenger` SET `gender`='"+gender+"',`nationality`='"+nationality+"',`passportnumber`='"+passport+"',`phone`='"+phone+"'WHERE name ='"+name+"'";
                PreparedStatement ptst = con.prepareStatement(sql);
                ptst.execute();
                JOptionPane.showMessageDialog(this, "Record Updated!");
                pn.setText("");
                g.setText("");
                n.setText("");
                ppn.setText("");
                ph.setText("");
            }else if(name.isEmpty()){
                JOptionPane.showMessageDialog(this, "Please, Input Passenger Name to Update Data!");
            }else if(name.length() < 5 || name.length() > 30){
                JOptionPane.showMessageDialog(this, "Passenger Name's length must be 5 - 30 digits");
            }else if(name.length() >= 5 && name.length() <= 30 && !flag){
                JOptionPane.showMessageDialog(this, "Data not exist!");
                pn.setText("");
            }else if(!gender.equals("Male") && !gender.equals("Female")){
                JOptionPane.showMessageDialog(this, "Gender must be 'Male' or 'Female'");
            }else if(!nationality.equals("Indonesia") && !nationality.equals("Malaysia") && !nationality.equals("Singapore")){
                JOptionPane.showMessageDialog(this, "Nationality must be 'Indonesia', 'Malaysia' or 'Singapore'");
            }else if(!passport.startsWith("PPN")){
                JOptionPane.showMessageDialog(this, "Passport Number must be starts with 'PPN'");
            }else if(!phone.matches("[0-9]*") || (phone.length() < 10 || phone.length() > 12)){
                JOptionPane.showMessageDialog(this, "Phone Number must be only number and the length must be 10 - 12 digits");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bms", "root", "");
            Statement st = con.createStatement();

            String name = pn.getText();
            String sql2 = "Select name from managepassenger";
            ResultSet rs = st.executeQuery(sql2);
            boolean flag = false;

            while(rs.next()){
                String passName = rs.getString("name");

                if(name.equals(passName)){
                    flag = true;
                }
            }

            if(flag && (name.length() >= 5 && name.length() <= 30)){
                String sql = "DELETE FROM `managepassenger` WHERE name ='"+name+"'";
                PreparedStatement ptst = con.prepareStatement(sql);
                ptst.executeUpdate();
                JOptionPane.showMessageDialog(this, "Data deleted Succesfully!");
                pn.setText("");
                con.close();
            }else if(name.isEmpty()){
                JOptionPane.showMessageDialog(this, "Please, Input Passenger Name to Delete Data!");
            }else if(name.length() < 5 || name.length() > 30){
                JOptionPane.showMessageDialog(this, "Passenger Name's length must be 5 - 30 digits");
            }else if((name.length() >= 5 && name.length() <= 30) && !flag){
                JOptionPane.showMessageDialog(this, "Data not exist!");
                pn.setText("");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        // TODO add your handling code here:

        Dashboard obj = new Dashboard();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bms", "root", "");
            Statement st = con.createStatement();

            String name = pn.getText();
            String sql = "Select * from managepassenger";
            PreparedStatement ptst = con.prepareStatement(sql);
            ResultSet rs = ptst.executeQuery();
            DefaultTableModel dt = (DefaultTableModel)jTable1.getModel();
            dt.setRowCount(0);
            boolean flag = false;

            if(!name.isEmpty() && (name.length() >= 5 && name.length() <= 30)){
                while(rs.next()){
                    String passName = rs.getString("name");

                    if(name.equals(passName)){
                        Object o[] = {rs.getString("name"), rs.getString("gender"), rs.getString("nationality"), rs.getString("passportnumber"), rs.getString("phone")};
                        dt.addRow(o);
                        pn.setText("");
                        flag = true;
                    }
                }

                if((name.length() >= 5 && name.length() <= 30) && !flag){
                    JOptionPane.showMessageDialog(this, "Data not exist!");
                    pn.setText("");
                }
            }else if(name.isEmpty()){
                JOptionPane.showMessageDialog(this, "Please, Input Passenger Name to Search Data!");
            }else if(name.length() < 5 || name.length() > 30){
                JOptionPane.showMessageDialog(this, "Passenger Name's length must be 5 - 30 digits");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(ManagePassenger.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManagePassenger.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManagePassenger.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManagePassenger.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManagePassenger().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField g;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField n;
    private javax.swing.JTextField ph;
    private javax.swing.JTextField pn;
    private javax.swing.JTextField ppn;
    // End of variables declaration//GEN-END:variables

}
