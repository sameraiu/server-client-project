
package mainproject;

import java.awt.Color;
import java.awt.Image;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.net.Socket;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static mainproject.OnlineMultiMedia.din;


public class CleintChat extends javax.swing.JFrame {

  
    static Socket s;
    static DataInputStream din;
    static DataOutputStream dout;
    static DataInputStream dinImage;

    int position;
    
    
    public CleintChat() {
        initComponents();
//        if (this.position != -1)
//            showImage(position);
    }
    public CleintChat(int imgnum) {
        initComponents();

        showImage(imgnum);
    }

    public String[] getImages(){
        File file = new File(getClass().getResource("/mainproject/Images").getFile());
        String [] imagesList = file.list();
        return imagesList;
    }
    
    public void showImage (int index){
        try{
            String[] imagesList = getImages();
            String imageName = imagesList[index];

            ImageIcon icon = new ImageIcon(getClass().getResource("/mainproject/Images/"+imageName));
            Image image = icon.getImage().getScaledInstance(jLable_image.getWidth(),jLable_image.getHeight(),Image.SCALE_SMOOTH);
            jLable_image.setIcon(new ImageIcon(image));
        }catch(Exception ex){

            JOptionPane.showMessageDialog(this,"error");
        }
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAreaCleint = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLable_image = new javax.swing.JLabel();
        btnOpen = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tCleintMsgTxt = new javax.swing.JTextArea();
        btnSend = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Online Multimedia Chat");

        txtAreaCleint.setEditable(false);
        txtAreaCleint.setColumns(20);
        txtAreaCleint.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N
        txtAreaCleint.setRows(5);
        jScrollPane2.setViewportView(txtAreaCleint);

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Audience");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 107, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Presentation");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Chat");

        btnOpen.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnOpen.setText("Open");
        btnOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLable_image, javax.swing.GroupLayout.PREFERRED_SIZE, 596, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnOpen, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(255, 255, 255)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(21, 21, 21)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLable_image, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnOpen, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(153, 153, 153)))
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        tCleintMsgTxt.setColumns(20);
        tCleintMsgTxt.setFont(new java.awt.Font("Courier New", 0, 18)); // NOI18N
        tCleintMsgTxt.setRows(5);
        tCleintMsgTxt.setText("Type hier");
        tCleintMsgTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tCleintMsgTxtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tCleintMsgTxtFocusLost(evt);
            }
        });
        jScrollPane1.setViewportView(tCleintMsgTxt);

        btnSend.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnSend.setText("Send");
        btnSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 567, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addComponent(btnSend, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSend, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 7, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendActionPerformed
        
        try{
        
            String msgout = "";
            msgout = tCleintMsgTxt.getText().trim();
            dout.writeUTF(msgout);
        }
        catch(Exception e){
        
        }
    }//GEN-LAST:event_btnSendActionPerformed

    private void tCleintMsgTxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tCleintMsgTxtFocusGained
         if(tCleintMsgTxt.getText().trim().equals("Type hier")){
       
           tCleintMsgTxt.setText("");
       }
       tCleintMsgTxt.setForeground(Color.black);
    }//GEN-LAST:event_tCleintMsgTxtFocusGained

    private void tCleintMsgTxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tCleintMsgTxtFocusLost
          if(tCleintMsgTxt.getText().trim().equals("")){
       
           tCleintMsgTxt.setText("IP Address");
       }
    }//GEN-LAST:event_tCleintMsgTxtFocusLost

    private void btnOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpenActionPerformed

        
    }//GEN-LAST:event_btnOpenActionPerformed

    public static void main(String args[]) {

        JFrame cchat = new JFrame();
        cchat =  new CleintChat();
        cchat.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
//        cchat =  new CleintChat(2);
        cchat.setVisible(true);
//        new CleintChat(2).setVisible(true);

                
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            @Override
//            public void run() {
//                JFrame cchat = new JFrame();
//                cchat =  new CleintChat();
//                cchat.setVisible(true);
//            }
//        });
        try{
            s = new Socket("127.0.0.1",45671);
            
            din = new DataInputStream(s.getInputStream());
            dout = new DataOutputStream(s.getOutputStream());
            dinImage = new DataInputStream(s.getInputStream());
                    
            String msgin ="";
            String selectedImg = "";
            
            msgin = din.readUTF();
            selectedImg = dinImage.readUTF();
            
          //  while(!selectedImg.equals("exit")){                
//                txtAreaCleint.setText(txtAreaCleint.getText().trim()+"Shared Image : "+"\n"+selectedImg);
                
                cchat.dispose();
                new CleintChat(Integer.parseInt(selectedImg)).setVisible(true);
//      
//                new CleintChat().showImage( Integer.parseInt(selectedImg) );
//                cchat.dispose();
//                new CleintChat().setVisible(true);
//                new CleintChat().setImage( 2 );
                  
//                java.awt.EventQueue.invokeLater(new Runnable() {
//                    @Override
//                    public void run() {
////                        cchat.dispose();
//                        new CleintChat().setVisible(true);
//                        new CleintChat().setImage( 2 );
//                    }
//                });
            
            
            
            while(!msgin.equals("exit")){
                txtAreaCleint.setText(txtAreaCleint.getText().trim()+"USER1: "+"\n"+msgin);
            }
        
        }
        catch(Exception e){
        
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOpen;
    private javax.swing.JButton btnSend;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    public javax.swing.JLabel jLable_image;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private static javax.swing.JTextArea tCleintMsgTxt;
    private static javax.swing.JTextArea txtAreaCleint;
    // End of variables declaration//GEN-END:variables
}
