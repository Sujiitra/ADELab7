package ui;

import java.awt.CardLayout;
import javax.swing.JPanel;
import model.UserPanel;

public class JFrame extends javax.swing.JFrame {

    private UserPanel newUPanel;

    public JFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        splitPane = new javax.swing.JSplitPane();
        leftPanel = new javax.swing.JPanel();
        formButton = new javax.swing.JButton();
        viewButton = new javax.swing.JButton();
        loginButton = new javax.swing.JButton();
        rightPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        leftPanel.setBackground(new java.awt.Color(153, 0, 255));

        formButton.setText("Fill Form");
        formButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                formButtonActionPerformed(evt);
            }
        });

        viewButton.setText("View Details");
        viewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewButtonActionPerformed(evt);
            }
        });

        loginButton.setText("Login");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout leftPanelLayout = new javax.swing.GroupLayout(leftPanel);
        leftPanel.setLayout(leftPanelLayout);
        leftPanelLayout.setHorizontalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftPanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(formButton)
                    .addComponent(loginButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, leftPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(viewButton)
                .addContainerGap())
        );
        leftPanelLayout.setVerticalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftPanelLayout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(loginButton)
                .addGap(74, 74, 74)
                .addComponent(formButton)
                .addGap(100, 100, 100)
                .addComponent(viewButton)
                .addContainerGap(304, Short.MAX_VALUE))
        );

        splitPane.setLeftComponent(leftPanel);

        rightPanel.setBackground(new java.awt.Color(153, 0, 255));
        rightPanel.setLayout(new java.awt.CardLayout());
        splitPane.setRightComponent(rightPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(splitPane, javax.swing.GroupLayout.DEFAULT_SIZE, 934, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(splitPane)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_formButtonActionPerformed
        FormPanel newFormPanel= new FormPanel(rightPanel);
        rightPanel.add(newFormPanel);
        CardLayout layout=(CardLayout)rightPanel.getLayout();
        layout.next(rightPanel);
    }//GEN-LAST:event_formButtonActionPerformed

    private void viewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewButtonActionPerformed
        ViewPanel newViewPanel= new ViewPanel(newUPanel);
        rightPanel.add(newViewPanel);
        CardLayout layout=(CardLayout)rightPanel.getLayout();
        layout.next(rightPanel);
    }//GEN-LAST:event_viewButtonActionPerformed

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        AdminLogin newFormPanel= new AdminLogin(rightPanel);
        rightPanel.add(newFormPanel);
        CardLayout layout=(CardLayout)rightPanel.getLayout();
        layout.next(rightPanel);
    }//GEN-LAST:event_loginButtonActionPerformed
    public void setUserPanel(UserPanel upanel){
        newUPanel=upanel;
    }
    
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame().setVisible(true);
            }
        });
    }



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton formButton;
    private javax.swing.JPanel leftPanel;
    private javax.swing.JButton loginButton;
    private javax.swing.JPanel rightPanel;
    private javax.swing.JSplitPane splitPane;
    public javax.swing.JButton viewButton;
    // End of variables declaration//GEN-END:variables
}
