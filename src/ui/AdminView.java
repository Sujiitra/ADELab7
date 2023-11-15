
package ui;

import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.UserPanel;

/**
 *
 * @author sujiitramurukeshan
 */
public class AdminView extends javax.swing.JPanel {


    private JPanel rightPanel;
    private ArrayList<UserPanel> patients;
    public AdminView(JPanel inPane) {
        initComponents();
        this.rightPanel=inPane;
        submitButton.setVisible(false);
        fNameText.setVisible(false);
        lNameText.setVisible(false);
        emailText.setVisible(false);
        patientTypeCombo.setVisible(false);
        fNameLabel.setVisible(false);
        lNameLabel.setVisible(false);
        emailLabel.setVisible(false);
        patientTypeLabel.setVisible(false);
        chooseRecordInvalid.setVisible(false);
        display();
    }
    
    private static String sfn;
    private static String sln ;
    private static String seml;
    private static String sptype;
    private static int addOrEdit;
 
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        patientTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        addButton = new javax.swing.JButton();
        editButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        chooseRecordInvalid = new javax.swing.JLabel();
        fNameLabel = new javax.swing.JLabel();
        lNameLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        patientTypeLabel = new javax.swing.JLabel();
        fNameText = new javax.swing.JTextField();
        lNameText = new javax.swing.JTextField();
        emailText = new javax.swing.JTextField();
        patientTypeCombo = new javax.swing.JComboBox<>();
        fnameInvalid = new javax.swing.JLabel();
        lnameInvalid = new javax.swing.JLabel();
        emailInvalid = new javax.swing.JLabel();
        patienttypeInvalid = new javax.swing.JLabel();
        submitButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 204));
        setPreferredSize(new java.awt.Dimension(758, 688));

        patientTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "PID", "FIRST", "LAST", "EMAIL", "PATIENTTYPE"
            }
        ));
        jScrollPane1.setViewportView(patientTable);

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel1.setText("Registered Patients");

        addButton.setText("Add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        editButton.setText("Edit");
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        chooseRecordInvalid.setText("Please choose one field");

        fNameLabel.setText("First Name");

        lNameLabel.setText("Last Name");

        emailLabel.setText("Email Id");

        patientTypeLabel.setText("Patient Type");

        fNameText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                fNameTextKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fNameTextKeyTyped(evt);
            }
        });

        lNameText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lNameTextKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                lNameTextKeyTyped(evt);
            }
        });

        emailText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                emailTextKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                emailTextKeyTyped(evt);
            }
        });

        patientTypeCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "In-Patient", "Out Patient", "New Patient" }));
        patientTypeCombo.setSelectedIndex(-1);
        patientTypeCombo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                patientTypeComboFocusLost(evt);
            }
        });

        fnameInvalid.setForeground(new java.awt.Color(255, 0, 0));

        lnameInvalid.setForeground(new java.awt.Color(255, 0, 0));

        emailInvalid.setForeground(new java.awt.Color(255, 0, 0));

        patienttypeInvalid.setForeground(new java.awt.Color(255, 0, 0));

        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 643, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(addButton)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lNameLabel)
                                .addComponent(fNameLabel)
                                .addComponent(emailLabel)
                                .addComponent(patientTypeLabel)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(editButton)
                                .addGap(51, 51, 51)
                                .addComponent(deleteButton))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(fNameText)
                                            .addComponent(lNameText, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE))
                                        .addGap(29, 29, 29)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(fnameInvalid)
                                            .addComponent(lnameInvalid)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(emailText, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(patientTypeCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(29, 29, 29)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(patienttypeInvalid)
                                            .addComponent(emailInvalid)))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(chooseRecordInvalid))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(191, 191, 191)
                        .addComponent(submitButton)))
                .addContainerGap(61, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(284, 284, 284))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addButton)
                    .addComponent(editButton)
                    .addComponent(deleteButton))
                .addGap(27, 27, 27)
                .addComponent(chooseRecordInvalid)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fNameLabel)
                    .addComponent(fNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fnameInvalid))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lNameLabel)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lnameInvalid)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(emailLabel)
                    .addComponent(emailInvalid)
                    .addComponent(emailText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(patientTypeLabel)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(patientTypeCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(patienttypeInvalid)))
                .addGap(26, 26, 26)
                .addComponent(submitButton)
                .addContainerGap(71, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    
    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        
        submitButton.setVisible(true);
        fNameText.setVisible(true);
        lNameText.setVisible(true);
        emailText.setVisible(true);
        patientTypeCombo.setVisible(true);
        fNameLabel.setVisible(true);
        lNameLabel.setVisible(true);
        emailLabel.setVisible(true);
        patientTypeLabel.setVisible(true);
        chooseRecordInvalid.setVisible(false);
        addOrEdit=1;
       
    }//GEN-LAST:event_addButtonActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        
        if(patientTable.getSelectedRow()==-1)
     chooseRecordInvalid.setVisible(true);
     else {
            int index=patientTable.getSelectedRow();
            
            fNameText.setText((String)patientTable.getValueAt(index, 1));
            fNameText.setVisible(true);
            lNameText.setText((String)patientTable.getValueAt(index, 2));
            
            
        lNameText.setVisible(true);
        emailText.setText((String)patientTable.getValueAt(index, 3));
        emailText.setVisible(true);
        patientTypeCombo.setSelectedItem((String)patientTable.getValueAt(index, 4));
        patientTypeCombo.setVisible(true);
        fNameLabel.setVisible(true);
        lNameLabel.setVisible(true);
        emailLabel.setVisible(true);
        patientTypeLabel.setVisible(true);
        submitButton.setVisible(true);
        chooseRecordInvalid.setVisible(false);
        addOrEdit=2;

        }
  
    }//GEN-LAST:event_editButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        

        if(patientTable.getSelectedRow()==-1)
            chooseRecordInvalid.setVisible(true);
        else {
            chooseRecordInvalid.setVisible(false);
            int index=patientTable.getSelectedRow();
            UserPanel op=new UserPanel();
            op.setPid((int)patientTable.getValueAt(index,0));
            op.getPid();
            DBConnector.deletePatient(op);
            JOptionPane.showMessageDialog(null, "Deleted Successfully");
            display();
        }
        
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        

        UserPanel np=new UserPanel();
        np.setFirstName(fNameText.getText());
        np.getFirstName();
        np.setLastName(lNameText.getText());
        np.getLastName();
        np.setEmail(emailText.getText());
        np.getEmail();
        np.setPatientType((String)patientTypeCombo.getSelectedItem());
        np.getPatientType();
        
        if(addOrEdit==1)
          DBConnector.addPatient(np);
        else if (addOrEdit==2){
        int i=patientTable.getSelectedRow();
            np.setPid((int)patientTable.getValueAt(i, 0));
            np.getPid();
            DBConnector.editPatient( np);
          
             
      }
      JOptionPane.showMessageDialog(null, "Submitted Successfully");
      display();
    }//GEN-LAST:event_submitButtonActionPerformed

    private void fNameTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fNameTextKeyTyped
        char keych = evt.getKeyChar();
        if(Character.isLowerCase(keych))
        {
            evt.setKeyChar(Character.toUpperCase(keych));
        }
    }//GEN-LAST:event_fNameTextKeyTyped

    private void lNameTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lNameTextKeyTyped
        char keych = evt.getKeyChar();
        if(Character.isLowerCase(keych))
        {
            evt.setKeyChar(Character.toUpperCase(keych));
        }
    }//GEN-LAST:event_lNameTextKeyTyped

    private void emailTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emailTextKeyReleased
        
       seml = emailText.getText();
        boolean bemlflag = seml.matches("^[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,6}$");
        if(bemlflag)
        {
            emailInvalid.setVisible(false);
        }
        else
        {
            emailInvalid.setText("Please enter a valid email address");
            emailInvalid.setVisible(true);
        }
    }//GEN-LAST:event_emailTextKeyReleased

    private void emailTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emailTextKeyTyped
        char keych = evt.getKeyChar();
        if(Character.isUpperCase(keych))
        {
            evt.setKeyChar(Character.toLowerCase(keych));
        }
    }//GEN-LAST:event_emailTextKeyTyped

    private void patientTypeComboFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_patientTypeComboFocusLost
        int scntryflg = patientTypeCombo.getSelectedIndex();
        if(scntryflg!=-1)
        {
            patienttypeInvalid.setVisible(false);
        }
        else
        {
            patienttypeInvalid.setText("Please choose one");
            patienttypeInvalid.setVisible(true);
        }
        
    }//GEN-LAST:event_patientTypeComboFocusLost

    private void fNameTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fNameTextKeyReleased
        sln = fNameText.getText();
        boolean bflag=sln.matches("^[A-Z ]*");
        if(bflag)
        {
            fnameInvalid.setVisible(false);
        }
        else
        {
            fnameInvalid.setText("Please enter only alphabets");
            fnameInvalid.setVisible(true);
        }
        
    }//GEN-LAST:event_fNameTextKeyReleased

    private void lNameTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lNameTextKeyReleased
        sln = lNameText.getText();
        boolean bflag=sln.matches("^[A-Z ]*");
        if(bflag)
        {
            lnameInvalid.setVisible(false);
        }
        else
        {
            lnameInvalid.setText("Please enter only alphabets");
            lnameInvalid.setVisible(true);
        }
      
    }//GEN-LAST:event_lNameTextKeyReleased



    public void display(){
        this.patients=DBConnector.getAllPatients();
        DefaultTableModel t=(DefaultTableModel)patientTable.getModel();
        t.setRowCount(0);
        for(UserPanel p:patients){
            Object[] row=new Object[5];
            row[0]=p.getPid();
            row[1]=p.getFirstName();
            row[2]=p.getLastName();
            row[3]=p.getEmail();
            row[4]=p.getPatientType();
            t.addRow(row);
        }
        clearValues();
            
        }
    private void clearValues(){
        fNameText.setText("");
        lNameText.setText("");
        emailText.setText("");
        patientTypeCombo.setSelectedIndex(-1);
        fNameText.setVisible(false);
        lNameText.setVisible(false);
        emailText.setVisible(false);
        patientTypeCombo.setVisible(false);
        fNameLabel.setVisible(false);
        lNameLabel.setVisible(false);
        emailLabel.setVisible(false);
        patientTypeLabel.setVisible(false);
        chooseRecordInvalid.setVisible(false);
        fnameInvalid.setVisible(false);
        lnameInvalid.setVisible(false);
        emailInvalid.setVisible(false);
        patienttypeInvalid.setVisible(false);
        submitButton.setVisible(false);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JLabel chooseRecordInvalid;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton editButton;
    private javax.swing.JLabel emailInvalid;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField emailText;
    private javax.swing.JLabel fNameLabel;
    private javax.swing.JTextField fNameText;
    private javax.swing.JLabel fnameInvalid;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lNameLabel;
    private javax.swing.JTextField lNameText;
    private javax.swing.JLabel lnameInvalid;
    private javax.swing.JTable patientTable;
    private javax.swing.JComboBox<String> patientTypeCombo;
    private javax.swing.JLabel patientTypeLabel;
    private javax.swing.JLabel patienttypeInvalid;
    private javax.swing.JButton submitButton;
    // End of variables declaration//GEN-END:variables
}
