/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopproject;

import javax.swing.JOptionPane;

/**
 *
 * @author Lenovo
 */
public class AllLecsGUI extends javax.swing.JFrame {

    private static int nolec;
   
    private static int counteroflecs;
    
    /**
     * Creates new form AllLecsGUI
     */
    public AllLecsGUI() {
        
        initComponents();
        nolec = AllCoursesGUI.getNolec();
        counteroflecs=0;
            enterlecprofid_label.setText("Enter Lecture #1 of Course #"+(AllCoursesGUI.getCounterofcourses())+" Professor ID:");
            enterlecprofname_label.setText("Enter Lecture #1 of Course #"+(AllCoursesGUI.getCounterofcourses())+" Professor Name:");
            enterlecprofphone_label.setText("Enter Lecture #1 of Course #"+(AllCoursesGUI.getCounterofcourses())+" Professor Phone:");
            enterlecprofemail_label.setText("Enter Lecture #1 of Course #"+(AllCoursesGUI.getCounterofcourses())+" Professor Email:");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        enterlecprofid_label = new javax.swing.JLabel();
        enterlecprofid_tf = new javax.swing.JTextField();
        enterlecprofname_label = new javax.swing.JLabel();
        enterlecprofname_tf = new javax.swing.JTextField();
        enterlecprofphone_label = new javax.swing.JLabel();
        enterlecprofphone_tf = new javax.swing.JTextField();
        enterlecprofemail_label = new javax.swing.JLabel();
        enterlecprofemail_tf = new javax.swing.JTextField();
        enterlec_btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        enterlecprofid_label.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        enterlecprofid_label.setText("Enter Lecture #1 of Course #1 Professor ID:");

        enterlecprofid_tf.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        enterlecprofname_label.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        enterlecprofname_label.setText("Enter Lecture #1 of Course #1 Professor Name:");

        enterlecprofname_tf.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        enterlecprofphone_label.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        enterlecprofphone_label.setText("Enter Lecture #1 of Course #1 Professor Phone:");

        enterlecprofphone_tf.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        enterlecprofemail_label.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        enterlecprofemail_label.setText("Enter Lecture #1 of Course #1 Professor Email:");

        enterlecprofemail_tf.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        enterlecprofemail_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterlecprofemail_tfActionPerformed(evt);
            }
        });

        enterlec_btn.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        enterlec_btn.setText("Enter");
        enterlec_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterlec_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(134, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(enterlecprofname_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(enterlecprofphone_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(enterlecprofid_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(145, 145, 145))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(enterlecprofemail_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(143, 143, 143))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(enterlec_btn)
                        .addGap(238, 238, 238))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(enterlecprofid_label)
                        .addGap(104, 104, 104))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(enterlecprofphone_label)
                            .addComponent(enterlecprofname_label)
                            .addComponent(enterlecprofemail_label))
                        .addGap(93, 93, 93))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(enterlecprofid_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(enterlecprofid_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(enterlecprofname_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(enterlecprofname_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(enterlecprofphone_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(enterlecprofphone_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(enterlecprofemail_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(enterlecprofemail_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(enterlec_btn)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void enterlecprofemail_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterlecprofemail_tfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enterlecprofemail_tfActionPerformed

    private void enterlec_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterlec_btnActionPerformed
        boolean ex = false;
        int TeacherID=0;
        try{
            ex=false;
            TeacherID = Integer.valueOf(enterlecprofid_tf.getText());

        }
        catch(NumberFormatException nfe){
            ex = true;                        
            JOptionPane.showMessageDialog(rootPane, "Professor ID is an Integer!");

        }
        if(!ex){
            enterlecprofid_label.setText("Enter Lecture #"+(counteroflecs+2)+" of Course #"+(AllCoursesGUI.getCounterofcourses())+" Professor ID:");
            enterlecprofname_label.setText("Enter Lecture #"+(counteroflecs+2)+" of Course #"+(AllCoursesGUI.getCounterofcourses())+" Professor Name:");
            enterlecprofphone_label.setText("Enter Lecture #"+(counteroflecs+2)+" of Course #"+(AllCoursesGUI.getCounterofcourses())+" Professor Phone:");
            enterlecprofemail_label.setText("Enter Lecture #"+(counteroflecs+2)+" of Course #"+(AllCoursesGUI.getCounterofcourses())+" Professor Email:");



            String name = enterlecprofname_tf.getText(); 
            String phone = enterlecprofphone_tf.getText();
            String email = enterlecprofemail_tf.getText();

            int numOfHrs = AllCoursesGUI.getLecnoh(); 
            String nameOfRoom = AllCoursesGUI.getLecnameofroom();

            AllCoursesGUI.Allcourses[AllCoursesGUI.getCounterofcourses()-1].getLecs()[counteroflecs++] = new Lecture(TeacherID,name,phone,email,numOfHrs,nameOfRoom);


            if(counteroflecs==nolec){
                this.setVisible(false);
                AllLabsGUI alllabsFrame = new AllLabsGUI();
                alllabsFrame.setVisible(true);
                counteroflecs=0;

            }

            enterlecprofid_tf.setText("");
            enterlecprofname_tf.setText("");
            enterlecprofphone_tf.setText("");
            enterlecprofemail_tf.setText("");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_enterlec_btnActionPerformed

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
            java.util.logging.Logger.getLogger(AllLecsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AllLecsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AllLecsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AllLecsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AllLecsGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton enterlec_btn;
    private javax.swing.JLabel enterlecprofemail_label;
    private javax.swing.JTextField enterlecprofemail_tf;
    private javax.swing.JLabel enterlecprofid_label;
    private javax.swing.JTextField enterlecprofid_tf;
    private javax.swing.JLabel enterlecprofname_label;
    private javax.swing.JTextField enterlecprofname_tf;
    private javax.swing.JLabel enterlecprofphone_label;
    private javax.swing.JTextField enterlecprofphone_tf;
    // End of variables declaration//GEN-END:variables
}
