
package mainproject;

import java.awt.Color;

public class Start extends javax.swing.JFrame {

    public Start() {
        initComponents();
        jPanel1.setFocusable(true);
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnConnect = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        tPort = new javax.swing.JTextField();
        tIpAddress = new javax.swing.JTextField();
        tUsername = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnStartServer = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnConnect.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnConnect.setText("Connect");
        btnConnect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConnectActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("OR");

        tPort.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tPort.setText("PORT");
        tPort.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(102, 102, 255), null));
        tPort.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tPortFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tPortFocusLost(evt);
            }
        });

        tIpAddress.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tIpAddress.setText("IP Address");
        tIpAddress.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(102, 102, 255), null));
        tIpAddress.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tIpAddressFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tIpAddressFocusLost(evt);
            }
        });

        tUsername.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tUsername.setText("Username");
        tUsername.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(102, 102, 255), null));
        tUsername.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tUsernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tUsernameFocusLost(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Online Multimedia Education");

        btnStartServer.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnStartServer.setText("Start Server");
        btnStartServer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartServerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(86, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(tUsername)
                        .addComponent(tIpAddress, javax.swing.GroupLayout.DEFAULT_SIZE, 329, Short.MAX_VALUE)
                        .addComponent(tPort)))
                .addGap(98, 98, 98))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(220, 220, 220)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(btnConnect, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(162, 162, 162)
                    .addComponent(btnStartServer)
                    .addContainerGap(190, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(86, 86, 86)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addComponent(tUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(tIpAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(tPort, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnConnect)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(70, 70, 70)
                    .addComponent(btnStartServer)
                    .addContainerGap(338, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tUsernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tUsernameFocusGained
       if(tUsername.getText().trim().equals("Username")){
       
           tUsername.setText("");
       }
      
    }//GEN-LAST:event_tUsernameFocusGained

    private void tUsernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tUsernameFocusLost
       if(tUsername.getText().trim().equals("")){
       
           tUsername.setText("Username");
       }
    }//GEN-LAST:event_tUsernameFocusLost

    private void tIpAddressFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tIpAddressFocusGained
      if(tUsername.getText().trim().equals("IP Address")){
       
           tUsername.setText("");
       }
      
    }//GEN-LAST:event_tIpAddressFocusGained

    private void tIpAddressFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tIpAddressFocusLost
           if(tUsername.getText().trim().equals("")){
       
           tUsername.setText("IP Address");
       }
    }//GEN-LAST:event_tIpAddressFocusLost

    private void tPortFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tPortFocusGained
        if(tUsername.getText().trim().equals("PORT")){
       
           tUsername.setText("");
       }
     
    }//GEN-LAST:event_tPortFocusGained

    private void tPortFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tPortFocusLost
           if(tUsername.getText().trim().equals("")){
       
           tUsername.setText("PORT");
       }
    }//GEN-LAST:event_tPortFocusLost

    private void btnStartServerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartServerActionPerformed
       OnlineMultiMedia on = new OnlineMultiMedia();
       on.setVisible(true);
    }//GEN-LAST:event_btnStartServerActionPerformed

    private void btnConnectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConnectActionPerformed
       
         if (evt.getSource()==btnConnect){
            
            String uname = this.tUsername.getText().toString();
            String ipAdd = this.tIpAddress.getText().toString();
             String po = this.tPort.getText().toString();
            
            Connect co = new Connect(uname,ipAdd, po);
            if (co.validate())
                dispose();
            
        }
       
    }//GEN-LAST:event_btnConnectActionPerformed

    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Start().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConnect;
    private javax.swing.JButton btnStartServer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField tIpAddress;
    private javax.swing.JTextField tPort;
    private javax.swing.JTextField tUsername;
    // End of variables declaration//GEN-END:variables
}
