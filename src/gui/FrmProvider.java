/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import control.Models;
import entities.Provider;
import java.util.List;
import javax.persistence.EntityManager;
import javax.swing.JOptionPane;
import persistencia.ProviderRepositoryImpl;

/**
 *
 * @author Invitado
 */
public class FrmProvider extends javax.swing.JFrame {

    private boolean isNewProvider;
    private Provider providerEdit;
    private List<Provider> lstProviders;
    private ProviderRepositoryImpl providerRep;
    private EntityManager em;

    public FrmProvider(EntityManager em) {
        initComponents();
        this.em=em;
        isNewProvider=true;
        btnRemove.setVisible(false);
        updateMainTable();
    }
    
    private void getRepProviders(){
        providerRep=new ProviderRepositoryImpl(em, Provider.class);
    }
    
    private void updateMainTable(){
        getRepProviders();
        lstProviders=providerRep.findAll();
        this.jtblProviders.setModel(Models.providerTableModel(lstProviders));
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        txtId = new javax.swing.JTextField();
        lblId = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        btnAction = new javax.swing.JButton();
        lblAddress = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        lblPhone = new javax.swing.JLabel();
        txtPhone = new javax.swing.JTextField();
        txtWebsite = new javax.swing.JTextField();
        lblWebsite = new javax.swing.JLabel();
        btnClear = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtblProviders = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblTitle.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("PROVIDERS");

        lblId.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        lblId.setText("Id");

        lblName.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        lblName.setText("Name");

        btnAction.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnAction.setText("Add");
        btnAction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActionActionPerformed(evt);
            }
        });

        lblAddress.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        lblAddress.setText("Address");

        lblPhone.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        lblPhone.setText("Phone");

        lblWebsite.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        lblWebsite.setText("Website");

        btnClear.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnRemove.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnRemove.setText("Remove");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(lblId)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnAction, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lblAddress)
                                        .addComponent(lblPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(lblWebsite, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtWebsite, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblName)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(btnRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblId))
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAddress)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPhone)
                    .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblWebsite)
                    .addComponent(txtWebsite, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAction, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jtblProviders.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null}
            },
            new String [] {
                "Id", "RFC", "Name", "Address", "Phone"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtblProviders.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtblProvidersMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jtblProviders);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 679, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        clearFields();
        isNewProvider=true;
    }//GEN-LAST:event_btnClearActionPerformed

    private void clearFields(){
        txtId.setText("");
        txtName.setText("");
        txtAddress.setText("");
        txtPhone.setText("");
        txtWebsite.setText("");
        
        btnAction.setText("Add");
        btnRemove.setVisible(false);
    }
    
    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        if(providerEdit!=null){
            try{
            providerRep.delete(providerEdit);
            providerRep.commit();
            }catch(Exception e){
                JOptionPane.showMessageDialog(this, "You can't remove this provider");
            }
            updateMainTable();
            clearFields();
        }
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void jtblProvidersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtblProvidersMouseClicked
        int row=jtblProviders.rowAtPoint(evt.getPoint());
        providerEdit=lstProviders.get(lstProviders.indexOf(new Provider((Integer)jtblProviders.getValueAt(row, 0))));
        
        txtId.setText(String.valueOf(providerEdit.getId()));
        txtName.setText(providerEdit.getName());
        txtAddress.setText(providerEdit.getAddress());
        txtPhone.setText(providerEdit.getPhone());
        txtWebsite.setText(providerEdit.getWebsite());
        
        isNewProvider=false;
        btnAction.setText("Save changes");
        btnRemove.setVisible(true);
        this.updateMainTable();
    }//GEN-LAST:event_jtblProvidersMouseClicked

    private void btnActionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActionActionPerformed
        if(isNewProvider){
            Provider provider=new Provider(this.txtName.getText(), this.txtAddress.getText(), this.txtPhone.getText(), this.txtWebsite.getText());
            providerRep.save(provider);
            providerRep.commit();
        }else{
            if(providerEdit!=null){
                providerEdit.setName(txtName.getText());
                providerEdit.setAddress(txtAddress.getText());
                providerEdit.setPhone(txtPhone.getText());
                providerEdit.setWebsite(txtWebsite.getText());
                providerRep.save(providerEdit);
                providerRep.commit();
            }
        }
        updateMainTable();
        clearFields();
    }//GEN-LAST:event_btnActionActionPerformed

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
            java.util.logging.Logger.getLogger(FrmProvider.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmProvider.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmProvider.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmProvider.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmProvider(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAction;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnRemove;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jtblProviders;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPhone;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblWebsite;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtWebsite;
    // End of variables declaration//GEN-END:variables
}
