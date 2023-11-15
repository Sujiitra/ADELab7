
package ui;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.Icon;
import javax.swing.JPanel;
import model.UserPanel;

public class ViewPanel extends javax.swing.JPanel {

    private UserPanel newUserPanel;
    public ViewPanel(UserPanel newUPanel) {
        initComponents();
        this.newUserPanel=newUPanel;
        if(newUPanel!=null)
        showDetails();
       
    }


   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        fNameLabel = new javax.swing.JLabel();
        lNameLabel = new javax.swing.JLabel();
        ageLabel = new javax.swing.JLabel();
        genderLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        patientLabel = new javax.swing.JLabel();
        msgLabel = new javax.swing.JLabel();
        photoLabel = new javax.swing.JLabel();
        fNameOut = new javax.swing.JLabel();
        lNameOut = new javax.swing.JLabel();
        ageOut = new javax.swing.JLabel();
        genderOut = new javax.swing.JLabel();
        emailOut = new javax.swing.JLabel();
        patientOut = new javax.swing.JLabel();
        msgOut = new javax.swing.JLabel();
        photoOut = new javax.swing.JLabel();
        dobLabel = new javax.swing.JLabel();
        dobOut = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(102, 255, 102));

        titleLabel.setBackground(new java.awt.Color(102, 255, 102));
        titleLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(255, 0, 0));
        titleLabel.setText("View Patient Form Details");

        fNameLabel.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        fNameLabel.setText("First Name:");

        lNameLabel.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        lNameLabel.setText("Last Name:");

        ageLabel.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        ageLabel.setText("Age:");

        genderLabel.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        genderLabel.setText("Gender:");

        emailLabel.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        emailLabel.setText("E-mail:");

        patientLabel.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        patientLabel.setText("Patient Type:");

        msgLabel.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        msgLabel.setText("Message:");

        photoLabel.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        photoLabel.setText("Uploaded Photo");

        fNameOut.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N

        lNameOut.setBackground(new java.awt.Color(204, 255, 153));
        lNameOut.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N

        ageOut.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N

        genderOut.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N

        emailOut.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N

        patientOut.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N

        msgOut.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N

        dobLabel.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        dobLabel.setText("Date Of Birth:");

        dobOut.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(251, 251, 251)
                        .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fNameLabel)
                            .addComponent(lNameLabel)
                            .addComponent(ageLabel)
                            .addComponent(genderLabel)
                            .addComponent(emailLabel)
                            .addComponent(patientLabel)
                            .addComponent(msgLabel)
                            .addComponent(photoLabel)
                            .addComponent(dobLabel))
                        .addGap(122, 122, 122)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lNameOut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(fNameOut, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(genderOut, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(photoOut, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ageOut, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emailOut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(patientOut, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(msgOut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dobOut, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(132, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fNameLabel)
                            .addComponent(fNameOut, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(lNameOut, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lNameLabel))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(genderOut, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ageOut, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ageLabel))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dobLabel)
                            .addComponent(dobOut, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(genderLabel)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(emailLabel))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(emailOut, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(patientLabel)
                    .addComponent(patientOut, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(msgLabel)
                    .addComponent(msgOut, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(photoLabel)
                    .addComponent(photoOut, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(66, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(19, 19, 19))
        );
    }// </editor-fold>//GEN-END:initComponents
         private void showDetails(){
             

        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        String dob;
    
            fNameOut.setText(newUserPanel.getFirstName());
            lNameOut.setText(newUserPanel.getLastName());
            ageOut.setText(newUserPanel.getAge());
            dobOut.setText(newUserPanel.getDOB().toString());
            genderOut.setText(newUserPanel.getGender());
            emailOut.setText(newUserPanel.getEmail());
            patientOut.setText(newUserPanel.getPatientType());
            msgOut.setText(newUserPanel.getMsg());
            photoOut.setIcon(newUserPanel.getPic());
           
       
        }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ageLabel;
    private javax.swing.JLabel ageOut;
    private javax.swing.JLabel dobLabel;
    private javax.swing.JLabel dobOut;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JLabel emailOut;
    private javax.swing.JLabel fNameLabel;
    private javax.swing.JLabel fNameOut;
    private javax.swing.JLabel genderLabel;
    private javax.swing.JLabel genderOut;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lNameLabel;
    private javax.swing.JLabel lNameOut;
    private javax.swing.JLabel msgLabel;
    private javax.swing.JLabel msgOut;
    private javax.swing.JLabel patientLabel;
    private javax.swing.JLabel patientOut;
    private javax.swing.JLabel photoLabel;
    private javax.swing.JLabel photoOut;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables

}
