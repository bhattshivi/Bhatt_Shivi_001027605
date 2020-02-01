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
import Business.Address;
public class ViewJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewJPanel
     * @param product
     * 
     */
    public ViewJPanel(Person person) {
        initComponents();
        dispalyProduct(person);
    }
private void dispalyProduct(Person person){
    viewFirstName.setText(person.getFirstName());
    viewLastName.setText(person.getLastName());
    viewStreetAddress.setText(person.getStreetAddress());
    viewDob.setText(person.getDateOfBirth());
    viewWAStreetL1.setText(person.getWorkAddress().getStreetLine1());
    viewWAStreetL2.setText(person.getWorkAddress().getStreetLine2());
    viewWACity.setText(person.getWorkAddress().getCity());
    viewWAState.setText(person.getWorkAddress().getState());
    viewWACountry.setText(person.getWorkAddress().getCountry());
    viewWAZipCode.setText(person.getWorkAddress().getZipcode());
    
    viewLAStreetL1.setText(person.getLocalAddress().getStreetLine1());
    viewLAStreetL2.setText(person.getLocalAddress().getStreetLine2());
    viewLACity.setText(person.getLocalAddress().getCity());
    viewLAState.setText(person.getLocalAddress().getState());
    viewLACountry.setText(person.getLocalAddress().getCountry());
    viewLAZipCode.setText(person.getLocalAddress().getZipcode());
    
    
    viewHAStreetL1.setText(person.getHomeAddress().getStreetLine1());
    viewHAStreetL2.setText(person.getHomeAddress().getStreetLine2());
    viewHACity.setText(person.getHomeAddress().getCity());
    viewHAState.setText(person.getHomeAddress().getState());
    viewHACountry.setText(person.getHomeAddress().getCountry());
    viewHAZipCode.setText(person.getHomeAddress().getZipcode());
    
    

}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        viewWAStreetL1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        viewWAStreetL2 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        viewWACity = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        viewWAState = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        viewWACountry = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        viewWAZipCode = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        viewLAStreetL1 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        viewLAStreetL2 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        viewLACity = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        viewLAState = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        viewLACountry = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        viewLAZipCode = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        viewHAZipCode = new javax.swing.JTextField();
        viewHACountry = new javax.swing.JTextField();
        viewHAState = new javax.swing.JTextField();
        viewHACity = new javax.swing.JTextField();
        viewHAStreetL2 = new javax.swing.JTextField();
        viewHAStreetL1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        viewFirstName = new javax.swing.JTextField();
        viewLastName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        viewDob = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        viewStreetAddress = new javax.swing.JTextArea();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setSize(new java.awt.Dimension(80, 26));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Work Address"));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setText("Street Line 1");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 80, 30));

        viewWAStreetL1.setEditable(false);
        viewWAStreetL1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewWAStreetL1ActionPerformed(evt);
            }
        });
        jPanel4.add(viewWAStreetL1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 190, -1));

        jLabel6.setText("Street Line 2");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, 30));

        viewWAStreetL2.setEditable(false);
        viewWAStreetL2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewWAStreetL2ActionPerformed(evt);
            }
        });
        jPanel4.add(viewWAStreetL2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 190, -1));

        jLabel8.setText("City");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 80, 30));

        viewWACity.setEditable(false);
        viewWACity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewWACityActionPerformed(evt);
            }
        });
        jPanel4.add(viewWACity, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 190, -1));

        jLabel9.setText("State");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 80, 30));

        viewWAState.setEditable(false);
        viewWAState.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewWAStateActionPerformed(evt);
            }
        });
        jPanel4.add(viewWAState, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 190, -1));

        jLabel10.setText("Country");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 70, 30));

        viewWACountry.setEditable(false);
        viewWACountry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewWACountryActionPerformed(evt);
            }
        });
        jPanel4.add(viewWACountry, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 190, -1));

        jLabel11.setText("Zip Code");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 176, 80, 30));

        viewWAZipCode.setEditable(false);
        viewWAZipCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewWAZipCodeActionPerformed(evt);
            }
        });
        jPanel4.add(viewWAZipCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 180, 190, -1));

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Local Address"));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setText("Street Line 1");
        jPanel5.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 90, 30));

        viewLAStreetL1.setEditable(false);
        viewLAStreetL1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewLAStreetL1ActionPerformed(evt);
            }
        });
        jPanel5.add(viewLAStreetL1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 190, -1));

        jLabel13.setText("Street Line 2");
        jPanel5.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 64, -1, 20));

        viewLAStreetL2.setEditable(false);
        viewLAStreetL2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewLAStreetL2ActionPerformed(evt);
            }
        });
        jPanel5.add(viewLAStreetL2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 190, -1));

        jLabel14.setText("City");
        jPanel5.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 80, 30));

        viewLACity.setEditable(false);
        viewLACity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewLACityActionPerformed(evt);
            }
        });
        jPanel5.add(viewLACity, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 190, -1));

        jLabel15.setText("State");
        jPanel5.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 80, 30));

        viewLAState.setEditable(false);
        viewLAState.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewLAStateActionPerformed(evt);
            }
        });
        jPanel5.add(viewLAState, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 190, -1));

        jLabel16.setText("Country");
        jPanel5.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 70, 30));

        viewLACountry.setEditable(false);
        viewLACountry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewLACountryActionPerformed(evt);
            }
        });
        jPanel5.add(viewLACountry, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 190, -1));

        jLabel17.setText("Zip Code");
        jPanel5.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 80, 30));

        viewLAZipCode.setEditable(false);
        viewLAZipCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewLAZipCodeActionPerformed(evt);
            }
        });
        jPanel5.add(viewLAZipCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 180, 190, -1));

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Home Address"));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setText("Street Line 1");
        jPanel6.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 80, 30));

        jLabel19.setText("Street Line 2");
        jPanel6.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, 30));

        jLabel20.setText("City");
        jPanel6.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 80, 30));

        jLabel21.setText("State");
        jPanel6.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 80, 30));

        jLabel22.setText("Country");
        jPanel6.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 70, 30));

        jLabel23.setText("Zip Code");
        jPanel6.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 80, 30));

        viewHAZipCode.setEditable(false);
        viewHAZipCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewHAZipCodeActionPerformed(evt);
            }
        });
        jPanel6.add(viewHAZipCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 180, 190, -1));

        viewHACountry.setEditable(false);
        viewHACountry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewHACountryActionPerformed(evt);
            }
        });
        jPanel6.add(viewHACountry, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 190, -1));

        viewHAState.setEditable(false);
        viewHAState.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewHAStateActionPerformed(evt);
            }
        });
        jPanel6.add(viewHAState, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 190, -1));

        viewHACity.setEditable(false);
        viewHACity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewHACityActionPerformed(evt);
            }
        });
        jPanel6.add(viewHACity, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 190, -1));

        viewHAStreetL2.setEditable(false);
        viewHAStreetL2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewHAStreetL2ActionPerformed(evt);
            }
        });
        jPanel6.add(viewHAStreetL2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 190, -1));

        viewHAStreetL1.setEditable(false);
        viewHAStreetL1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewHAStreetL1ActionPerformed(evt);
            }
        });
        jPanel6.add(viewHAStreetL1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 190, -1));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setText("PERSON PROFILE");

        jLabel2.setText("First Name");

        jLabel3.setText("Last Name");

        jLabel4.setText("Street Address");

        viewFirstName.setEditable(false);
        viewFirstName.setColumns(30);
        viewFirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewFirstNameActionPerformed(evt);
            }
        });

        viewLastName.setEditable(false);
        viewLastName.setColumns(30);
        viewLastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewLastNameActionPerformed(evt);
            }
        });

        jLabel5.setText("DOB(YYYY/MM/DD)");

        viewDob.setEditable(false);
        viewDob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewDobActionPerformed(evt);
            }
        });

        viewStreetAddress.setEditable(false);
        viewStreetAddress.setColumns(20);
        viewStreetAddress.setRows(5);
        jScrollPane1.setViewportView(viewStreetAddress);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(viewFirstName, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(viewLastName, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane1))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(45, 45, 45)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(37, 37, 37)
                                        .addComponent(viewDob, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 28, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(viewFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(viewLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(viewDob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel4))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(66, 66, 66)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(95, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void viewWAStreetL1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewWAStreetL1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_viewWAStreetL1ActionPerformed

    private void viewWAStreetL2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewWAStreetL2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_viewWAStreetL2ActionPerformed

    private void viewLAStreetL1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewLAStreetL1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_viewLAStreetL1ActionPerformed

    private void viewLAStreetL2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewLAStreetL2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_viewLAStreetL2ActionPerformed

    private void viewHAStreetL2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewHAStreetL2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_viewHAStreetL2ActionPerformed

    private void viewHAStreetL1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewHAStreetL1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_viewHAStreetL1ActionPerformed

    private void viewFirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewFirstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_viewFirstNameActionPerformed

    private void viewLastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewLastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_viewLastNameActionPerformed

    private void viewDobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewDobActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_viewDobActionPerformed

    private void viewWACityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewWACityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_viewWACityActionPerformed

    private void viewWAStateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewWAStateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_viewWAStateActionPerformed

    private void viewLACityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewLACityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_viewLACityActionPerformed

    private void viewLAStateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewLAStateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_viewLAStateActionPerformed

    private void viewLACountryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewLACountryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_viewLACountryActionPerformed

    private void viewLAZipCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewLAZipCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_viewLAZipCodeActionPerformed

    private void viewHACityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewHACityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_viewHACityActionPerformed

    private void viewHAStateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewHAStateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_viewHAStateActionPerformed

    private void viewHACountryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewHACountryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_viewHACountryActionPerformed

    private void viewHAZipCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewHAZipCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_viewHAZipCodeActionPerformed

    private void viewWACountryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewWACountryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_viewWACountryActionPerformed

    private void viewWAZipCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewWAZipCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_viewWAZipCodeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField viewDob;
    private javax.swing.JTextField viewFirstName;
    private javax.swing.JTextField viewHACity;
    private javax.swing.JTextField viewHACountry;
    private javax.swing.JTextField viewHAState;
    private javax.swing.JTextField viewHAStreetL1;
    private javax.swing.JTextField viewHAStreetL2;
    private javax.swing.JTextField viewHAZipCode;
    private javax.swing.JTextField viewLACity;
    private javax.swing.JTextField viewLACountry;
    private javax.swing.JTextField viewLAState;
    private javax.swing.JTextField viewLAStreetL1;
    private javax.swing.JTextField viewLAStreetL2;
    private javax.swing.JTextField viewLAZipCode;
    private javax.swing.JTextField viewLastName;
    private javax.swing.JTextArea viewStreetAddress;
    private javax.swing.JTextField viewWACity;
    private javax.swing.JTextField viewWACountry;
    private javax.swing.JTextField viewWAState;
    private javax.swing.JTextField viewWAStreetL1;
    private javax.swing.JTextField viewWAStreetL2;
    private javax.swing.JTextField viewWAZipCode;
    // End of variables declaration//GEN-END:variables
}