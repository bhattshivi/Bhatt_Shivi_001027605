/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface;

import Business.Customer.Customer;
import Business.EcoSystem;
import Business.DB4OUtil.DB4OUtil;
import Business.DeliveryMan.DeliveryMan;
import Business.Restaurant.Restaurant;
import Business.Restaurant.RestaurantDirectory;

import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;

/**
 *
 * @author Lingfeng
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    private EcoSystem system;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    UserAccount userAccount;

    public MainJFrame() {
        this.setUndecorated(true);
        initComponents();
        system = dB4OUtil.retrieveSystem();
        loginJPanel.setVisible(true);
        container.setVisible(false);
        leftPanel.setVisible(false);
//        this.userAccount = userAccount;
//        changePanel(userAccount);
    }

    private void changePanel(UserAccount userAccount) {
        if (userAccount != null) {
            String greetings = "Hi";
            if (userAccount instanceof Customer){
                    greetings =  greetings + " " + ((Customer)userAccount).getName();
                    container.add("workArea", userAccount.getRole().createWorkArea(container, (Customer)userAccount, system));
            }else if(userAccount instanceof Restaurant){
                    greetings =  greetings + " " + ((Restaurant)userAccount).getName();
                    container.add("workArea", userAccount.getRole().createWorkArea(container, (Restaurant)userAccount, system));
            }else if(userAccount instanceof DeliveryMan){
                    greetings =  greetings + " " + ((DeliveryMan)userAccount).getName();
                    container.add("workArea", userAccount.getRole().createWorkArea(container, (DeliveryMan)userAccount, system));
            }else{
                 container.add("workArea", userAccount.getRole().createWorkArea(container, userAccount, system));
            }
            greetingUserLabel.setText(greetings + " !!!");
            CardLayout layout = (CardLayout) container.getLayout();
            layout.next(container);
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        leftPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        greetingUserLabel = new javax.swing.JLabel();
        container = new javax.swing.JPanel();
        loginJPanel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        userNameJTextField = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        loginButton = new javax.swing.JLabel();
        cancelButton = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1200, 802));
        setPreferredSize(new java.awt.Dimension(1200, 702));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        leftPanel.setBackground(new java.awt.Color(245, 245, 245));
        leftPanel.setPreferredSize(new java.awt.Dimension(1200, 60));
        leftPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-shutdown-30.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel1MousePressed(evt);
            }
        });
        leftPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 2, 60, 60));

        greetingUserLabel.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        leftPanel.add(greetingUserLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 500, 60));

        getContentPane().add(leftPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        container.setBackground(new java.awt.Color(31, 50, 97));
        container.setForeground(new java.awt.Color(31, 50, 97));
        container.setLayout(new java.awt.CardLayout());
        getContentPane().add(container, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 61, 1200, 750));

        loginJPanel.setBackground(new java.awt.Color(31, 50, 97));
        loginJPanel.setPreferredSize(new java.awt.Dimension(1200, 802));

        jPanel2.setBackground(new java.awt.Color(240, 178, 62));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/delivery (2).png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 331, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 802, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(31, 50, 97));
        jPanel3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(240, 178, 62)));
        jPanel3.setPreferredSize(new java.awt.Dimension(302, 34));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/user (3).png"))); // NOI18N
        jLabel3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(240, 178, 62)));

        userNameJTextField.setBackground(new java.awt.Color(31, 50, 97));
        userNameJTextField.setForeground(new java.awt.Color(255, 255, 255));
        userNameJTextField.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(31, 50, 97)));
        userNameJTextField.setCaretColor(new java.awt.Color(255, 255, 255));
        userNameJTextField.setDisabledTextColor(new java.awt.Color(16, 10, 55));
        userNameJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNameJTextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(userNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(userNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel4.setBackground(new java.awt.Color(31, 50, 97));
        jPanel4.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(240, 178, 62)));
        jPanel4.setPreferredSize(new java.awt.Dimension(302, 34));

        jLabel4.setBackground(new java.awt.Color(31, 50, 97));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/house-key.png"))); // NOI18N
        jLabel4.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(240, 178, 62)));

        passwordField.setBackground(new java.awt.Color(31, 50, 97));
        passwordField.setForeground(new java.awt.Color(255, 255, 255));
        passwordField.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(31, 50, 97)));
        passwordField.setCaretColor(new java.awt.Color(255, 255, 255));
        passwordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(0, 3, Short.MAX_VALUE)
                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        loginButton.setBackground(new java.awt.Color(240, 178, 62));
        loginButton.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        loginButton.setForeground(new java.awt.Color(240, 178, 62));
        loginButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginButton.setText("LOGIN");
        loginButton.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(240, 178, 62)));
        loginButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                loginButtonMousePressed(evt);
            }
        });

        cancelButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/cancel.png"))); // NOI18N
        cancelButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cancelButtonMousePressed(evt);
            }
        });

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/user.png"))); // NOI18N

        javax.swing.GroupLayout loginJPanelLayout = new javax.swing.GroupLayout(loginJPanel);
        loginJPanel.setLayout(loginJPanelLayout);
        loginJPanelLayout.setHorizontalGroup(
            loginJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginJPanelLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(loginJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loginJPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cancelButton)
                        .addContainerGap())
                    .addGroup(loginJPanelLayout.createSequentialGroup()
                        .addGroup(loginJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(loginJPanelLayout.createSequentialGroup()
                                .addGap(290, 290, 290)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(loginJPanelLayout.createSequentialGroup()
                                .addGap(232, 232, 232)
                                .addGroup(loginJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        loginJPanelLayout.setVerticalGroup(
            loginJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginJPanelLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(loginJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(loginJPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MousePressed
        logout();
    }//GEN-LAST:event_jLabel1MousePressed

    private void userNameJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userNameJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userNameJTextFieldActionPerformed

    private void passwordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordFieldActionPerformed

    private void loginButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginButtonMousePressed
        // TODO add your handling code here:
        String userName = userNameJTextField.getText();
        char[] passwordCharArray = passwordField.getPassword();
        String password = String.valueOf(passwordCharArray);

        userAccount=system.getUserAccountDirectory().authenticateUser(userName, password);
      
        if(userAccount==null){
            JOptionPane.showMessageDialog(null, "Invalid credentials");
            return;
        }else{
            loginJPanel.setVisible(false);
            container.setVisible(true);
            leftPanel.setVisible(true);
            userNameJTextField.setText("");
            passwordField.setText("");
            changePanel(userAccount);
        }
       
    }//GEN-LAST:event_loginButtonMousePressed

    private void cancelButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelButtonMousePressed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_cancelButtonMousePressed

    private void logout() {    
        container.removeAll();
        dB4OUtil.storeSystem(system);
       loginJPanel.setVisible(true);
       container.setVisible(false);
       leftPanel.setVisible(false);
    }
    
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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
     
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cancelButton;
    private javax.swing.JPanel container;
    private javax.swing.JLabel greetingUserLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel leftPanel;
    private javax.swing.JLabel loginButton;
    private javax.swing.JPanel loginJPanel;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JTextField userNameJTextField;
    // End of variables declaration//GEN-END:variables

}
