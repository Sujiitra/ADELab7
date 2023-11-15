
package ui;

import java.awt.CardLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.*;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author sujiitramurukeshan
 */
public class AdminLogin extends javax.swing.JPanel {
 
    private JPanel rightPanel;
    public AdminLogin(JPanel inPane) {
        initComponents();
        this.rightPanel=inPane;
        loginInvalid.setVisible(false);
     
    }

    private static String uid;
    private static String pwd ;
    private static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
    private static final String USERNAME = "admin";
    private static final String PASSWORD = "admin";
 
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        adminLabel = new javax.swing.JLabel();
        userIDLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        userIDTextField = new javax.swing.JTextField();
        passwordTextField = new javax.swing.JTextField();
        loginButton = new javax.swing.JButton();
        loginInvalid = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 153, 153));
        setPreferredSize(new java.awt.Dimension(758, 688));

        adminLabel.setText("Admin Login");

        userIDLabel.setText("User Name");

        passwordLabel.setText("Password");

        userIDTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                userIDTextFieldKeyTyped(evt);
            }
        });

        loginButton.setText("Submit");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        loginInvalid.setForeground(new java.awt.Color(255, 0, 102));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(259, 259, 259)
                        .addComponent(adminLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(userIDLabel)
                                    .addComponent(passwordLabel))
                                .addGap(91, 91, 91)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(userIDTextField)
                                    .addComponent(passwordTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)))
                            .addComponent(loginInvalid)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addComponent(loginButton)))
                .addContainerGap(336, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(adminLabel)
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(userIDLabel)
                    .addComponent(userIDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(passwordLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(passwordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(75, 75, 75)
                .addComponent(loginButton)
                .addGap(29, 29, 29)
                .addComponent(loginInvalid)
                .addContainerGap(280, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed

        checkinputs();
       
    }//GEN-LAST:event_loginButtonActionPerformed

    private void userIDTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_userIDTextFieldKeyTyped
        char keych = evt.getKeyChar();
        if(Character.isLowerCase(keych))
        {
            evt.setKeyChar(Character.toUpperCase(keych));
        }
    }//GEN-LAST:event_userIDTextFieldKeyTyped

    public void checkinputs(){
        String query = "Select PASSWORD FROM HOSPITALADMIN WHERE ADMINNAME=?";
        try (Connection conn = DriverManager.getConnection(URL, USERNAME,PASSWORD)) {
        PreparedStatement stmt = conn.prepareStatement(query);
        stmt.setString(1, userIDTextField.getText());
        ResultSet myRs= stmt.executeQuery(); 

    if(myRs.next()){   
        boolean valid = myRs.getString(1).equals(passwordTextField.getText());
        if(!valid){
                loginInvalid.setText("Please check your login user name and password.");
                loginInvalid.setVisible(true);
    }
    else{
            
        AdminView newFormPanel= new AdminView(rightPanel);
        rightPanel.add(newFormPanel);
        CardLayout layout=(CardLayout)rightPanel.getLayout();
        layout.next(rightPanel);
        }
    }
    else
    {
        loginInvalid.setText("Please check your login user name and password.");
        loginInvalid.setVisible(true);
    }
     conn.close();
    } catch (SQLException e) {
    e.printStackTrace();
    }
        
       
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel adminLabel;
    private javax.swing.JButton loginButton;
    private javax.swing.JLabel loginInvalid;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JTextField passwordTextField;
    private javax.swing.JLabel userIDLabel;
    private javax.swing.JTextField userIDTextField;
    // End of variables declaration//GEN-END:variables
}
