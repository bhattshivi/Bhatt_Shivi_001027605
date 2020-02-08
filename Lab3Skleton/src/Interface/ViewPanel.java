/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.Product;
import javax.swing.JOptionPane;
import Business.ProductDirectory;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author info
 */
public class ViewPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewPanel
     */
    private ProductDirectory accDir;
    private JPanel rightPanel;
    private Product product;
    private ManageProdPanel manageProd;
    private ArrayList<Product> updateDirectory;

    ViewPanel(JPanel rightPanel, ProductDirectory accDir, Product product) {
        initComponents();
        //ArrayList<Product> prod =accDir.getProductDirectory();
        this.rightPanel = rightPanel;
        this.accDir = accDir;
        this.product = product;
        displayProduct();

    }

    //Display Product
    private void displayProduct() {
        txtAvailablity.setText(String.valueOf(product.getAvailNum()) + "");
        txtPrice.setText(String.valueOf(product.getPrice()) + "");
        txtProdName.setText(product.getName() + "");
        txtDesc.setText(product.getDescription() + "");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtPrice = new javax.swing.JTextField();
        txtProdName = new javax.swing.JTextField();
        txtAvailablity = new javax.swing.JTextField();
        lblBankName = new javax.swing.JLabel();
        lblRoutingNo = new javax.swing.JLabel();
        lblAccNo = new javax.swing.JLabel();
        lblHead = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtDesc = new javax.swing.JTextField();
        cancelButton = new javax.swing.JButton();
        backViewButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(192, 192, 255));

        txtPrice.setEnabled(false);

        txtProdName.setEnabled(false);

        txtAvailablity.setEnabled(false);

        lblBankName.setText("Price");

        lblRoutingNo.setText("Product Name");

        lblAccNo.setText("Availablity");

        lblHead.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblHead.setText("View Product");

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnSave.setText("Save");
        btnSave.setEnabled(false);
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        jLabel1.setText("Description");

        txtDesc.setEnabled(false);

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        backViewButton.setBackground(new java.awt.Color(185, 169, 100));
        backViewButton.setText("<<Back");
        backViewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backViewButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblRoutingNo)
                                .addComponent(lblAccNo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblBankName)
                                .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel1))
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cancelButton))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtProdName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                                .addComponent(txtAvailablity, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtPrice, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtDesc, javax.swing.GroupLayout.Alignment.LEADING))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backViewButton, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(119, 119, 119)
                        .addComponent(lblHead)))
                .addContainerGap(192, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backViewButton)
                    .addComponent(lblHead))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRoutingNo)
                    .addComponent(txtProdName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAccNo, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAvailablity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBankName)
                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave)
                    .addComponent(btnUpdate)
                    .addComponent(cancelButton))
                .addGap(0, 232, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        setAllEnabled(true);
        btnSave.setEnabled(true);
        btnUpdate.setEnabled(false);


    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        String prodName = txtProdName.getText();
        if (prodName.isEmpty()) {
            //JOptionPane.showMessageDialog(null, "Product Name Cannot be empty");
            JOptionPane.showMessageDialog(null, "Product Name Cannot be empty", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        } else {
            prodName = txtProdName.getText();
        }
        //Price
        String priceText = txtPrice.getText();
        double price = 0;
        try {
            price = Double.parseDouble(priceText);
        } catch (NumberFormatException e) {
            //e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Please Enter Price Value in Numeric", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        //Avail Num
        String availabilityText = txtAvailablity.getText();
        int availability = 0;
        try {
            availability = Integer.parseInt(availabilityText);
        } catch (NumberFormatException e) {
            //e.printStackTrace();

            JOptionPane.showMessageDialog(null, "Please Enter Valid Availbility Number", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        //Description
        String description = txtDesc.getText();
        if (description.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Description Field Cannot Be Blank", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        } else {
            description = txtDesc.getText();
        }
//            accDir.addProduct().setName(prodName);
//            accDir.addProduct().setPrice(price);
//            accDir.addProduct().setAvailNum(availability);
//            accDir.addProduct().setDescription(description);
        product.setName(prodName);
        product.setPrice(price);
        product.setAvailNum(availability);
        product.setDescription(description);
        accDir.setProduct(product);
        //accDir.setProductDirectory(updateDirectory);
        //manageProd.populate();
        btnSave.setEnabled(false);
        btnUpdate.setEnabled(true);

        JOptionPane.showMessageDialog(null, "Account updated successfully");


    }//GEN-LAST:event_btnSaveActionPerformed

    private void backViewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backViewButtonActionPerformed
        // TODO add your handling code here:
//        rightPanel.remove(this);
//        CardLayout layout = (CardLayout) rightPanel.getLayout();
//       // manageProd.ManageProdPanel(rightPanel, accDir);
//        layout.previous(rightPanel);
//        //super(rightPanel,accDir);
        rightPanel.remove(this);
        ManageProdPanel manageProdJPanel = new ManageProdPanel(rightPanel, accDir);
        rightPanel.add("ManageProdPanel", manageProdJPanel);
        CardLayout layout = (CardLayout) rightPanel.getLayout();
        layout.previous(rightPanel);

       
     
       
    }//GEN-LAST:event_backViewButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        // TODO add your handling code here:
        //Reseting All Values
        txtAvailablity.setText("");
        txtPrice.setText("");
        txtProdName.setText("");
        txtDesc.setText("");
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void setAllEnabled(boolean b) {
        txtProdName.setEnabled(b);
        txtAvailablity.setEnabled(b);
        txtPrice.setEnabled(b);
        txtDesc.setEnabled(b);

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backViewButton;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton cancelButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblAccNo;
    private javax.swing.JLabel lblBankName;
    private javax.swing.JLabel lblHead;
    private javax.swing.JLabel lblRoutingNo;
    private javax.swing.JTextField txtAvailablity;
    private javax.swing.JTextField txtDesc;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtProdName;
    // End of variables declaration//GEN-END:variables
}