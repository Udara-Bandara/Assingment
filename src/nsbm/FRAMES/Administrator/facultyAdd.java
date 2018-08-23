
package nsbm.FRAMES.Administrator;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import nsbm.FRAMES.HomeFrames.Home;
import nsbm.objects.DBoperation;
import nsbm.objects.Faculties;

/**
 *
 * @author ubandara
 */
public class facultyAdd extends javax.swing.JFrame {

    DBoperation db = new DBoperation();
    
    public facultyAdd() {
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
        getFid = new javax.swing.JTextField();
        getFaculty = new javax.swing.JTextField();
        submit = new javax.swing.JButton();
        home = new javax.swing.JButton();
        toback = new javax.swing.JButton();
        logout = new javax.swing.JButton();

        comfirm.setTitle("comfirmation");
        comfirm.setLocation(new java.awt.Point(500, 300));
        comfirm.setMinimumSize(new java.awt.Dimension(803, 403));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "FACULTY\n", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lato", 0, 18))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 1, 22)); // NOI18N
        jLabel1.setText("SUCCESSFULLY DONE!!");

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
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(133, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(ok, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(102, 102, 102))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(76, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
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
        setTitle("add_faculty ");

        pic1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nsbm/images/index.png"))); // NOI18N

        heading.setBackground(java.awt.Color.darkGray);
        heading.setFont(new java.awt.Font("Lato", 1, 80)); // NOI18N
        heading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        heading.setText("NSBM GREEN UNIVERSITY");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "FACULTY ADMIN REGISTRATION", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lato", 1, 20))); // NOI18N

        nName.setFont(new java.awt.Font("Liberation Sans", 1, 20)); // NOI18N
        nName.setText("Faculty Name");

        nName1.setFont(new java.awt.Font("Liberation Sans", 1, 20)); // NOI18N
        nName1.setText("Faculty Id");

        getFid.setFont(new java.awt.Font("Lato", 0, 18)); // NOI18N
        getFid.setText("eg:- nsbm01");
        getFid.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                getFidFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                getFidFocusLost(evt);
            }
        });

        getFaculty.setFont(new java.awt.Font("Lato", 0, 18)); // NOI18N
        getFaculty.setText("eg:- Computer School");
        getFaculty.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                getFacultyFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                getFacultyFocusLost(evt);
            }
        });

        submit.setFont(new java.awt.Font("Liberation Sans", 1, 20)); // NOI18N
        submit.setText("Submit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nName1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nName, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(86, 86, 86)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(submit, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(getFaculty, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                        .addComponent(getFid)))
                .addContainerGap(82, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nName, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(getFaculty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nName1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(getFid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(87, 87, 87)
                .addComponent(submit, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(105, Short.MAX_VALUE))
        );

        home.setBackground(java.awt.Color.gray);
        home.setFont(new java.awt.Font("Lato", 1, 20)); // NOI18N
        home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nsbm/images/home.png"))); // NOI18N
        home.setText("HOME");
        home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeActionPerformed(evt);
            }
        });

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
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(toback, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(home, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(234, 234, 234))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pic1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(heading)))
                .addGap(97, 97, 97)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(home, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(toback, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(394, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        //insert data to database
        try{
            Faculties f = new Faculties();
            f.setFaculty(getFaculty.getText());
            f.setFacultyId(getFid.getText());
        
            db.addFaculty(f);
            
            comfirm.setVisible(true);
        }catch(Exception e){JOptionPane.showMessageDialog(null, "registration failed!!!", "_warning_", JOptionPane.WARNING_MESSAGE);}
       
        
    }//GEN-LAST:event_submitActionPerformed

    private void okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okActionPerformed
        //
        Faculty_details p;
        try {
            p = new Faculty_details();
            p.setVisible(true);
            this.dispose();
            comfirm.dispose();
        } catch (SQLException ex) {
            Logger.getLogger(facultyAdd.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_okActionPerformed

    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed
        // TO home
        admin_Details a =new admin_Details();
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_homeActionPerformed

    private void tobackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tobackActionPerformed
        // go back
        Faculty_details a;
        try {
            a = new Faculty_details();
            a.setVisible(true);
            this.dispose();
        } catch (SQLException ex) {
            Logger.getLogger(facultyAdd.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_tobackActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        // TO log out
        Home h = new Home();
        h.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutActionPerformed

    private void getFacultyFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_getFacultyFocusGained
        if(getFaculty.getText().equals("eg:- Computer School")){
            getFaculty.setText("");
        }
    }//GEN-LAST:event_getFacultyFocusGained

    private void getFacultyFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_getFacultyFocusLost
        if(getFaculty.getText().equals("")){
            getFaculty.setText("eg:- Computer School");
        }
    }//GEN-LAST:event_getFacultyFocusLost

    private void getFidFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_getFidFocusGained
        if(getFid.getText().equals("eg:- nsbm01")){
            getFid.setText("");
        }
    }//GEN-LAST:event_getFidFocusGained

    private void getFidFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_getFidFocusLost
        if(getFid.getText().equals("")){
            getFid.setText("eg:- nsbm01");
        }
    }//GEN-LAST:event_getFidFocusLost

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
            java.util.logging.Logger.getLogger(facultyAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(facultyAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(facultyAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(facultyAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new facultyAdd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog comfirm;
    private javax.swing.JTextField getFaculty;
    private javax.swing.JTextField getFid;
    private javax.swing.JLabel heading;
    private javax.swing.JButton home;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton logout;
    private javax.swing.JLabel nName;
    private javax.swing.JLabel nName1;
    private javax.swing.JButton ok;
    private javax.swing.JLabel pic1;
    private javax.swing.JButton submit;
    private javax.swing.JButton toback;
    // End of variables declaration//GEN-END:variables
}
