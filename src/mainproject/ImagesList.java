
package mainproject;

import java.awt.Image;
import static java.awt.JobAttributes.DestinationType.FILE;
import java.io.File;
import static java.lang.System.in;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;


public class ImagesList extends javax.swing.JFrame {

   
    public ImagesList() {
        initComponents();
        getImagesName();
    }
    OnlineMultiMedia online = new OnlineMultiMedia();
    
    public void getImagesName(){
        
    File file = new File(getClass().getResource("/mainproject/Images").getFile() );
    Object[] files = file.list();
    DefaultTableModel model = (DefaultTableModel)jTable_images_name.getModel();
    model.setColumnIdentifiers(new String[]{"Images Names"});
    
            Object[] row = new Object[1];
           for(Object items :files){
            
                row[0] = (items);
                model.addRow(row);
            }
            }
    
 
    @SuppressWarnings("unchecked") 
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable_images_name = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable_images_name.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable_images_name.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_images_nameMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable_images_name);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable_images_nameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_images_nameMouseClicked
      
        
    }//GEN-LAST:event_jTable_images_nameMouseClicked

 
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ImagesList().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable_images_name;
    // End of variables declaration//GEN-END:variables
}
