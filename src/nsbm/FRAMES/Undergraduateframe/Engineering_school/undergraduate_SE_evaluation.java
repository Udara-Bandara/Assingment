
package nsbm.FRAMES.Undergraduateframe.Engineering_school;

import javax.swing.JOptionPane;
import nsbm.FRAMES.HomeFrames.Home;
import nsbm.objects.DBoperation;
import nsbm.objects.Evaluation_details;

/**
 *
 * @author ubandara
 */
public class undergraduate_SE_evaluation extends javax.swing.JFrame {

    DBoperation db = new DBoperation();
    
    public undergraduate_SE_evaluation() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        comfirm = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        ok = new javax.swing.JButton();
        pic1 = new javax.swing.JLabel();
        heading = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        nName = new javax.swing.JLabel();
        nName1 = new javax.swing.JLabel();
        nName2 = new javax.swing.JLabel();
        nName3 = new javax.swing.JLabel();
        getEId = new javax.swing.JTextField();
        getEName = new javax.swing.JTextField();
        submit = new javax.swing.JButton();
        getSId = new javax.swing.JTextField();
        Etype = new javax.swing.JComboBox<>();
        toback = new javax.swing.JButton();
        home = new javax.swing.JButton();
        logout = new javax.swing.JButton();

        comfirm.setTitle("comfirmation");
        comfirm.setLocation(new java.awt.Point(500, 300));
        comfirm.setMinimumSize(new java.awt.Dimension(803, 403));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "COURSES", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lato", 0, 18))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 1, 22)); // NOI18N
        jLabel1.setText(" SUCCESSFULLY DONE!!");

        ok.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        ok.setText("OK");
        ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(583, Short.MAX_VALUE)
                .addComponent(ok, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(84, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addComponent(ok)
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout comfirmLayout = new javax.swing.GroupLayout(comfirm.getContentPane());
        comfirm.getContentPane().setLayout(comfirmLayout);
        comfirmLayout.setHorizontalGroup(
            comfirmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(comfirmLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );
        comfirmLayout.setVerticalGroup(
            comfirmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(comfirmLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("undergraduate_evaluation_details");

        pic1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nsbm/images/index.png"))); // NOI18N

        heading.setBackground(java.awt.Color.darkGray);
        heading.setFont(new java.awt.Font("Lato", 1, 80)); // NOI18N
        heading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        heading.setText("NSBM GREEN UNIVERSITY");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "UNDERGRADUATE  EVALUATION  DETAILS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lato", 1, 20))); // NOI18N

        nName.setFont(new java.awt.Font("Liberation Sans", 1, 20)); // NOI18N
        nName.setText("Evaluation Name");

        nName1.setFont(new java.awt.Font("Liberation Sans", 1, 20)); // NOI18N
        nName1.setText("Evaluation Id");

        nName2.setFont(new java.awt.Font("Liberation Sans", 1, 20)); // NOI18N
        nName2.setText("Subject Id");

        nName3.setFont(new java.awt.Font("Liberation Sans", 1, 20)); // NOI18N
        nName3.setText("Evaluation Type");

        getEId.setFont(new java.awt.Font("Lato", 0, 16)); // NOI18N
        getEId.setText("eg:- exam01");
        getEId.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                getEIdFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                getEIdFocusLost(evt);
            }
        });

        getEName.setFont(new java.awt.Font("Lato", 0, 16)); // NOI18N
        getEName.setText("eg:- subname_ ass_01");
        getEName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                getENameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                getENameFocusLost(evt);
            }
        });
        getEName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getENameActionPerformed(evt);
            }
        });

        submit.setFont(new java.awt.Font("Liberation Sans", 1, 20)); // NOI18N
        submit.setText("Submit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        getSId.setFont(new java.awt.Font("Lato", 0, 16)); // NOI18N
        getSId.setText("eg:- US001");
        getSId.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                getSIdFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                getSIdFocusLost(evt);
            }
        });

        Etype.setFont(new java.awt.Font("Lato", 1, 18)); // NOI18N
        Etype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "               --select type--", "Exam", "Assingment" }));
        Etype.setToolTipText("");
        Etype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EtypeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(submit, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nName3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nName1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nName2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(89, 89, 89)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(getEName)
                    .addComponent(getEId)
                    .addComponent(getSId)
                    .addComponent(Etype, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(68, 68, 68))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nName, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(getEName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nName1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(getEId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nName2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(getSId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nName3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Etype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 145, Short.MAX_VALUE)
                .addComponent(submit, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100))
        );

        toback.setBackground(java.awt.Color.gray);
        toback.setFont(new java.awt.Font("Lato", 1, 20)); // NOI18N
        toback.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nsbm/images/back.png"))); // NOI18N
        toback.setText("BACK");
        toback.setMaximumSize(new java.awt.Dimension(160, 45));
        toback.setMinimumSize(new java.awt.Dimension(160, 45));
        toback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tobackActionPerformed(evt);
            }
        });

        home.setBackground(java.awt.Color.gray);
        home.setFont(new java.awt.Font("Lato", 1, 20)); // NOI18N
        home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nsbm/images/home.png"))); // NOI18N
        home.setText("HOME");
        home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeActionPerformed(evt);
            }
        });

        logout.setBackground(java.awt.Color.gray);
        logout.setFont(new java.awt.Font("Lato", 1, 20)); // NOI18N
        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nsbm/images/logout.png"))); // NOI18N
        logout.setText("LOG OUT");
        logout.setMaximumSize(new java.awt.Dimension(160, 45));
        logout.setMinimumSize(new java.awt.Dimension(160, 45));
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pic1)
                        .addGap(86, 86, 86)
                        .addComponent(heading, javax.swing.GroupLayout.PREFERRED_SIZE, 1164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(420, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(249, 249, 249)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(toback, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(home, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(41, 41, 41))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(home, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(toback, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(pic1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(156, 156, 156)
                                .addComponent(heading)))
                        .addGap(85, 85, 85)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(266, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        //insert data to database
        try{
            Evaluation_details e = new Evaluation_details();
        
            e.setEvo_name(getEName.getText());
            e.setEvo_id(getEId.getText());
            e.setSub_id(getSId.getText());
            e.setEvo_type(Etype.getSelectedItem().toString());
            e.setF_id("nsbm03");
           
        
            db.addUndergraduateEvaluation(e);
        
            comfirm.setVisible(true);
        }catch(Exception e){JOptionPane.showMessageDialog(null, "registration failed!!!", "_warning_", JOptionPane.WARNING_MESSAGE);}
    }//GEN-LAST:event_submitActionPerformed

    private void getENameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getENameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_getENameActionPerformed

    private void okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okActionPerformed
        //
        undergraduate_SE_evaluation_details c = new undergraduate_SE_evaluation_details();
        c.setVisible(true);
        this.dispose();
        comfirm.dispose();
    }//GEN-LAST:event_okActionPerformed

    private void tobackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tobackActionPerformed
        // go back
        undergraduate_SE_evaluation_details u = new undergraduate_SE_evaluation_details();
        u.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_tobackActionPerformed

    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed
        // TO home
        Engineering_ug_login a =new Engineering_ug_login();
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_homeActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        // TO log out
        Home h = new Home();
        h.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutActionPerformed

    private void getENameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_getENameFocusGained
        if(getEName.getText().equals("eg:- subname_ ass_01")){
            getEName.setText("");
        }
    }//GEN-LAST:event_getENameFocusGained

    private void getENameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_getENameFocusLost
        if(getEName.getText().equals("")){
            getEName.setText("eg:- subname_ ass_01");
        }
    }//GEN-LAST:event_getENameFocusLost

    private void getEIdFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_getEIdFocusGained
        if(getEId.getText().equals("eg:- exam01")){
            getEId.setText("");
        }
    }//GEN-LAST:event_getEIdFocusGained

    private void getEIdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_getEIdFocusLost
        if(getEId.getText().equals("")){
            getEId.setText("eg:- exam01");
        }
    }//GEN-LAST:event_getEIdFocusLost

    private void getSIdFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_getSIdFocusGained
        if(getSId.getText().equals("eg:- US001")){
            getSId.setText("");
        }
    }//GEN-LAST:event_getSIdFocusGained

    private void getSIdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_getSIdFocusLost
        if(getSId.getText().equals("")){
            getSId.setText("eg:- US001");
        }
    }//GEN-LAST:event_getSIdFocusLost

    private void EtypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EtypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EtypeActionPerformed

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
            java.util.logging.Logger.getLogger(undergraduate_SE_evaluation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(undergraduate_SE_evaluation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(undergraduate_SE_evaluation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(undergraduate_SE_evaluation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new undergraduate_SE_evaluation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Etype;
    private javax.swing.JDialog comfirm;
    private javax.swing.JTextField getEId;
    private javax.swing.JTextField getEName;
    private javax.swing.JTextField getSId;
    private javax.swing.JLabel heading;
    private javax.swing.JButton home;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton logout;
    private javax.swing.JLabel nName;
    private javax.swing.JLabel nName1;
    private javax.swing.JLabel nName2;
    private javax.swing.JLabel nName3;
    private javax.swing.JButton ok;
    private javax.swing.JLabel pic1;
    private javax.swing.JButton submit;
    private javax.swing.JButton toback;
    // End of variables declaration//GEN-END:variables
}
