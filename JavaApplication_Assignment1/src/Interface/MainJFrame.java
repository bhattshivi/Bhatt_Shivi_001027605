/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

/**
 *
 * @author shivibhatt
 */
import Business.Person;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.plaf.basic.BasicScrollBarUI;

public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    private Person person;
    private Color scrollBarColor = new Color(186, 179, 175);

    public MainJFrame() {
        initComponents();
        person = new Person();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SplitPane = new javax.swing.JSplitPane();
        DisplayJPanel = new javax.swing.JPanel();
        ControlJPanel = new javax.swing.JPanel();
        CreateButton = new javax.swing.JButton();
        DisplayButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        DisplayJPanel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout DisplayJPanelLayout = new javax.swing.GroupLayout(DisplayJPanel);
        DisplayJPanel.setLayout(DisplayJPanelLayout);
        DisplayJPanelLayout.setHorizontalGroup(
            DisplayJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 979, Short.MAX_VALUE)
        );
        DisplayJPanelLayout.setVerticalGroup(
            DisplayJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 958, Short.MAX_VALUE)
        );

        SplitPane.setRightComponent(DisplayJPanel);

        ControlJPanel.setBackground(new java.awt.Color(233, 224, 219));

        CreateButton.setBackground(new java.awt.Color(233, 224, 219));
        CreateButton.setIcon(new javax.swing.ImageIcon("/Users/shivibhatt/Documents/AED/GIT/Bhatt_Shivi_001027605/JavaApplication_Assignment1/Icons/icons8-create-64.png")); // NOI18N
        CreateButton.setText("CREATE");
        CreateButton.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        CreateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateButtonActionPerformed(evt);
            }
        });

        DisplayButton.setBackground(new java.awt.Color(233, 224, 219));
        DisplayButton.setIcon(new javax.swing.ImageIcon("/Users/shivibhatt/Documents/AED/GIT/Bhatt_Shivi_001027605/JavaApplication_Assignment1/Icons/icons8-view-64.png")); // NOI18N
        DisplayButton.setText("VIEW");
        DisplayButton.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        DisplayButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DisplayButtonActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(233, 224, 219));
        jPanel1.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon("/Users/shivibhatt/Documents/AED/GIT/Bhatt_Shivi_001027605/JavaApplication_Assignment1/Icons/icons8-user-account-64.png")); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(20, 0, 64, 80);

        javax.swing.GroupLayout ControlJPanelLayout = new javax.swing.GroupLayout(ControlJPanel);
        ControlJPanel.setLayout(ControlJPanelLayout);
        ControlJPanelLayout.setHorizontalGroup(
            ControlJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ControlJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ControlJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(DisplayButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CreateButton, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(13, 13, 13))
        );
        ControlJPanelLayout.setVerticalGroup(
            ControlJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ControlJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(CreateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(DisplayButton, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(714, Short.MAX_VALUE))
        );

        SplitPane.setLeftComponent(ControlJPanel);

        getContentPane().add(SplitPane, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CreateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateButtonActionPerformed
        // TODO add your handling code here:

        CreateJPanel createPanel = new CreateJPanel(person);
        JScrollPane scroller = new JScrollPane(createPanel);
        scroller.getVerticalScrollBar().setBackground(scrollBarColor);
        scroller.getHorizontalScrollBar().setBackground(scrollBarColor);
        scroller.getVerticalScrollBar().setUI(new BasicScrollBarUI() {
            @Override
            protected void configureScrollBarColors() {
                this.thumbColor = scrollBarColor;
            }
        });

        scroller.getHorizontalScrollBar().setUI(new BasicScrollBarUI() {
            @Override
            protected void configureScrollBarColors() {
                this.thumbColor = scrollBarColor;
            }
        });
        SplitPane.setRightComponent(scroller);
    }//GEN-LAST:event_CreateButtonActionPerformed

    private void DisplayButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DisplayButtonActionPerformed
        // TODO add your handling code here:

        ViewJPanel viewPanel = new ViewJPanel(person);
        JScrollPane scroller = new JScrollPane(viewPanel);
        scroller.getVerticalScrollBar().setBackground(scrollBarColor);
        scroller.getHorizontalScrollBar().setBackground(scrollBarColor);
        scroller.getVerticalScrollBar().setUI(new BasicScrollBarUI() {
            @Override
            protected void configureScrollBarColors() {
                this.thumbColor = scrollBarColor;
            }
        });

        scroller.getHorizontalScrollBar().setUI(new BasicScrollBarUI() {
            @Override
            protected void configureScrollBarColors() {
                this.thumbColor = scrollBarColor;
            }
        });
        SplitPane.setRightComponent(scroller);


    }//GEN-LAST:event_DisplayButtonActionPerformed

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
    private javax.swing.JPanel ControlJPanel;
    private javax.swing.JButton CreateButton;
    private javax.swing.JButton DisplayButton;
    private javax.swing.JPanel DisplayJPanel;
    private javax.swing.JSplitPane SplitPane;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}