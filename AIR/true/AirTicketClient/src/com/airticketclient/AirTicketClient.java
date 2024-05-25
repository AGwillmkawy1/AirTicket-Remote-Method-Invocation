/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.airticketclient;

import com.airticketserver.model.Client;
import com.airticketserver.model.Ticket;
import com.airticketserver.service.ServiceIFC;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Plaubert
 */
public class AirTicketClient extends javax.swing.JFrame {

    /**
     * Creates new form AirTicketClient
     */
    public AirTicketClient() {
        initComponents();
        listcombo();
        listClt();
        listTkt();
    }
    static ServiceIFC servc;
    
    private void listcombo(){
        idComb.removeAllItems();
        idComb.addItem(" ");
        try {
            for(Client i: servc.listClient()) idComb.addItem(i.getClientId());
        } catch (RemoteException ex) {
            Logger.getLogger(AirTicketClient.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        
    }
    
     private void listClt(){
         DefaultTableModel mdl=(DefaultTableModel) clientTbl.getModel();
        try {
            mdl.setRowCount(0);
            for(Client i: servc.listClient()){
                String arr[]={i.getClientId(),i.getFullname(),i.getPassportNumber(),i.getPhoneNumber()};
                mdl.addRow(arr);
            }
        } catch (RemoteException ex) {
            Logger.getLogger(AirTicketClient.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        
    }
     
     private void listTkt(){
         DefaultTableModel mdl=(DefaultTableModel) ticketTbl.getModel();
        try {
            mdl.setRowCount(0);
            if(servc.listTicket().size()>0)
            for(Ticket i: servc.listTicket()){
                String arr[]={i.getTicketNumber(),i.getDestination(),i.getFlightDate().toString(),i.getClientId()};
                mdl.addRow(arr);
            }
        } catch (RemoteException ex) {
            Logger.getLogger(AirTicketClient.class.getName()).log(Level.SEVERE, null, ex);
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

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        idTxt = new javax.swing.JTextField();
        nameTxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        passTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        phoneTxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        clientSave = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        clientTbl = new javax.swing.JTable();
        updateBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        ticknum = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        destTxt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        ticketSave = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        ticketTbl = new javax.swing.JTable();
        idComb = new javax.swing.JComboBox<>();
        dateTxt = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 153, 153));

        jTabbedPane1.setBackground(new java.awt.Color(0, 153, 153));

        jPanel1.setBackground(new java.awt.Color(0, 255, 255));

        jLabel1.setText("id");

        jLabel2.setText("name");

        jLabel3.setText("passport");

        jLabel4.setText("phone");

        clientSave.setText("save");
        clientSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clientSaveMouseClicked(evt);
            }
        });
        clientSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientSaveActionPerformed(evt);
            }
        });

        clientTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ClientId", "Names", "passport", "phone"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(clientTbl);

        updateBtn.setText("update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        deleteBtn.setText("delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        jButton1.setText("search");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(idTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(passTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(218, 218, 218)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(nameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(phoneTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 818, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addComponent(clientSave, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(updateBtn)
                        .addGap(58, 58, 58)
                        .addComponent(deleteBtn)
                        .addGap(116, 116, 116)
                        .addComponent(jButton1)))
                .addContainerGap(281, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phoneTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clientSave, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateBtn)
                    .addComponent(deleteBtn)
                    .addComponent(jButton1))
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(79, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Client Persective", jPanel1);

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));

        jLabel5.setText("id:");

        jLabel6.setText("destination:");

        jLabel7.setText("clientId");

        jLabel8.setText("date");

        ticketSave.setText("save");
        ticketSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ticketSaveMouseClicked(evt);
            }
        });
        ticketSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ticketSaveActionPerformed(evt);
            }
        });

        ticketTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ticketNUmber", "destination", "date", "clientId"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(ticketTbl);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ticknum, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(dateTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(218, 218, 218)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(destTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(idComb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(327, 327, 327)
                        .addComponent(ticketSave, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 818, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(281, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 84, Short.MAX_VALUE)
                        .addComponent(ticketSave, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(dateTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ticknum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(destTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(idComb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(76, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Ticket Persective", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(97, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ticketSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ticketSaveMouseClicked
        // TODO add your handling code here:
        Ticket tk=new Ticket(ticknum.getText(), destTxt.getText(), dateTxt.getDate() , idComb.getSelectedItem().toString());
        
        if(ticknum.getText().equals("") || destTxt.getText().equals("") || dateTxt.getDate().equals("") || idComb.getSelectedItem().equals("")){
            JOptionPane.showMessageDialog(this, "Kindly, fill all the fields!");
        
        }else{
            
        try {
            
            servc.saveTicket(tk);
            JOptionPane.showMessageDialog(this, "saved");
            listTkt();
        } catch (RemoteException ex) {
            Logger.getLogger(AirTicketClient.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        }
    }//GEN-LAST:event_ticketSaveMouseClicked

    private void clientSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clientSaveMouseClicked
        // TODO add your handling code here:
        //Client cl=new Client(idTxt.getText(), nameTxt.getText(), passTxt.getText(), phoneTxt.getText());
        
        if(idTxt.getText().isEmpty() || nameTxt.getText().isEmpty() || passTxt.getText().isEmpty() || phoneTxt.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Kindly fill all the fields");
        }else{
            if(idTxt.getText().length()==5){
                if(passTxt.getText().length()==8){
                    if(phoneTxt.getText().length()==10){
                        Client cl=new Client(idTxt.getText(), nameTxt.getText(), passTxt.getText(), phoneTxt.getText());
                        try {
                                servc.saveClient(cl);
                                JOptionPane.showMessageDialog(this, "saved");
                                listClt();
                            } catch (RemoteException ex) {
                                Logger.getLogger(AirTicketClient.class.getName()).log(Level.SEVERE, null, ex);
                                }
                        
                    }else{
                        JOptionPane.showMessageDialog(this, "Phone number must be 10 digits");
                    }
                        
                    
                }else{
                    JOptionPane.showMessageDialog(this, "Passport number must be 8 characters");
                }
            }else{
                JOptionPane.showMessageDialog(this, "Client Id must have 5 characters");
            }
           
            
        }
//        try {
//            servc.saveClient(cl);
//             JOptionPane.showMessageDialog(this, "saved");
//        } catch (RemoteException ex) {
//            Logger.getLogger(AirTicketClient.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }//GEN-LAST:event_clientSaveMouseClicked

    private void clientSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientSaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clientSaveActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
         if(idTxt.getText().isEmpty() || nameTxt.getText().isEmpty() || passTxt.getText().isEmpty() || phoneTxt.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Kindly fill all the fields");
        }else{
            if(idTxt.getText().length()==5){
                if(passTxt.getText().length()==8){
                    if(phoneTxt.getText().length()==10){
                        Client cl=new Client(idTxt.getText(), nameTxt.getText(), passTxt.getText(), phoneTxt.getText());
                        try {
                                servc.updateClient(cl);
                                JOptionPane.showMessageDialog(this, "updated");
                            } catch (RemoteException ex) {
                                Logger.getLogger(AirTicketClient.class.getName()).log(Level.SEVERE, null, ex);
                                }
                        
                    }else{
                        JOptionPane.showMessageDialog(this, "Phone number must be 10 digits");
                    }
                        
                    
                }else{
                    JOptionPane.showMessageDialog(this, "Passport number must be 8 characters");
                }
            }else{
                JOptionPane.showMessageDialog(this, "Client Id must have 5 characters");
            }
           
            
        }        
    }//GEN-LAST:event_updateBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
         if(idTxt.getText().isEmpty() || nameTxt.getText().isEmpty() || passTxt.getText().isEmpty() || phoneTxt.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Kindly fill all the fields");
        }else{
            if(idTxt.getText().length()==5){
                if(passTxt.getText().length()==8){
                    if(phoneTxt.getText().length()==10){
                        Client cl=new Client(idTxt.getText(), nameTxt.getText(), passTxt.getText(), phoneTxt.getText());
                        try {
                                servc.deleteClient(cl);
                                JOptionPane.showMessageDialog(this, "deleted");
                            } catch (RemoteException ex) {
                                Logger.getLogger(AirTicketClient.class.getName()).log(Level.SEVERE, null, ex);
                                }
                        
                    }else{
                        JOptionPane.showMessageDialog(this, "Phone number must be 10 digits");
                    }
                        
                    
                }else{
                    JOptionPane.showMessageDialog(this, "Passport number must be 8 characters");
                }
            }else{
                JOptionPane.showMessageDialog(this, "Client Id must have 5 characters");
            }
           
            
        }
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void ticketSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ticketSaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ticketSaveActionPerformed

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
            Registry reg=LocateRegistry.getRegistry("localhost", 6000);
            servc=(ServiceIFC)reg.lookup("airTicketService");
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AirTicketClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AirTicketClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AirTicketClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AirTicketClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AirTicketClient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clientSave;
    private javax.swing.JTable clientTbl;
    private com.toedter.calendar.JDateChooser dateTxt;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JTextField destTxt;
    private javax.swing.JComboBox<String> idComb;
    private javax.swing.JTextField idTxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField nameTxt;
    private javax.swing.JTextField passTxt;
    private javax.swing.JTextField phoneTxt;
    private javax.swing.JButton ticketSave;
    private javax.swing.JTable ticketTbl;
    private javax.swing.JTextField ticknum;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables
}
