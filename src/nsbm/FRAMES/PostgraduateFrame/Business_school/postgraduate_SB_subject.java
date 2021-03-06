
package nsbm.FRAMES.PostgraduateFrame.Business_school;

import javax.swing.JOptionPane;
import nsbm.FRAMES.HomeFrames.Home;
import nsbm.objects.DBoperation;
import nsbm.objects.Subjects;

/**
 *
 * @author ubandara
 */
public class postgraduate_SB_subject extends javax.swing.JFrame {

    DBoperation db = new DBoperation();
    
    public postgraduate_SB_subject() {
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
        getsubId = new javax.swing.JTextField();
        getsubName = new javax.swing.JTextField();
        submit = new javax.swing.JButton();
        nName4 = new javax.swing.JLabel();
        nName5 = new javax.swing.JLabel();
        getCredit = new javax.swing.JTextField();
        getfee = new javax.swing.JTextField();
        getLecId = new javax.swing.JTextField();
        nName6 = new javax.swing.JLabel();
        nName7 = new javax.swing.JLabel();
        getCourse = new javax.swing.JTextField();
        getInsId = new javax.swing.JTextField();
        home = new javax.swing.JButton();
        toback = new javax.swing.JButton();
        logout = new javax.swing.JButton();

        comfirm.setTitle("comfirmation");
        comfirm.setLocation(new java.awt.Point(500, 300));
        comfirm.setMinimumSize(new java.awt.Dimension(803, 403));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "SUBJECTS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lato", 0, 18))); // NOI18N

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
        setTitle("postgraduate_subject_details");

        pic1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nsbm/images/index.png"))); // NOI18N

        heading.setBackground(java.awt.Color.darkGray);
        heading.setFont(new java.awt.Font("Lato", 1, 80)); // NOI18N
        heading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        heading.setText("NSBM GREEN UNIVERSITY");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "POSTGRADUATE  SUBJECT  DETAILS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lato", 1, 20))); // NOI18N

        nName.setFont(new java.awt.Font("Liberation Sans", 1, 20)); // NOI18N
        nName.setText("Subject Name");

        nName1.setFont(new java.awt.Font("Liberation Sans", 1, 20)); // NOI18N
        nName1.setText("Subject Id");

        nName2.setFont(new java.awt.Font("Liberation Sans", 1, 20)); // NOI18N
        nName2.setText("Credits");

        getsubId.setFont(new java.awt.Font("Lato", 0, 16)); // NOI18N
        getsubId.setText("eg:- PS001");
        getsubId.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                getsubIdFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                getsubIdFocusLost(evt);
            }
        });

        getsubName.setFont(new java.awt.Font("Lato", 0, 16)); // NOI18N
        getsubName.setText("subject name");
        getsubName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                getsubNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                getsubNameFocusLost(evt);
            }
        });

        submit.setFont(new java.awt.Font("Liberation Sans", 1, 20)); // NOI18N
        submit.setText("Submit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        nName4.setFont(new java.awt.Font("Liberation Sans", 1, 20)); // NOI18N
        nName4.setText("Fee");

        nName5.setFont(new java.awt.Font("Liberation Sans", 1, 20)); // NOI18N
        nName5.setText("Instructor Id");

        getCredit.setFont(new java.awt.Font("Lato", 0, 16)); // NOI18N
        getCredit.setText("number of credit");
        getCredit.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                getCreditFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                getCreditFocusLost(evt);
            }
        });

        getfee.setFont(new java.awt.Font("Lato", 0, 16)); // NOI18N
        getfee.setText("subject fee");
        getfee.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                getfeeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                getfeeFocusLost(evt);
            }
        });

        getLecId.setFont(new java.awt.Font("Lato", 0, 16)); // NOI18N
        getLecId.setText("eg:- Lec001");
        getLecId.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                getLecIdFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                getLecIdFocusLost(evt);
            }
        });

        nName6.setFont(new java.awt.Font("Liberation Sans", 1, 20)); // NOI18N
        nName6.setText("Lecture Id");

        nName7.setFont(new java.awt.Font("Liberation Sans", 1, 20)); // NOI18N
        nName7.setText("Course Id");

        getCourse.setFont(new java.awt.Font("Lato", 0, 16)); // NOI18N
        getCourse.setText("eg:- Mas001");
        getCourse.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                getCourseFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                getCourseFocusLost(evt);
            }
        });

        getInsId.setFont(new java.awt.Font("Lato", 0, 16)); // NOI18N
        getInsId.setText("eg:- Ins001");
        getInsId.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                getInsIdFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                getInsIdFocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(submit, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nName1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nName)
                            .addComponent(nName2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(89, 89, 89)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(getsubName, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                            .addComponent(getsubId)
                            .addComponent(getCredit)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(nName4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                            .addComponent(nName5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nName6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nName7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(95, 95, 95)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(getfee, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(getLecId)
                            .addComponent(getCourse, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(getInsId))))
                .addGap(79, 79, 79))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nName, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(getsubName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(getsubId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nName1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nName2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(getCredit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nName4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(getfee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nName6, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(getLecId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nName5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(getInsId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nName7, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(getCourse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addComponent(submit, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
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
                .addComponent(pic1)
                .addGap(86, 86, 86)
                .addComponent(heading, javax.swing.GroupLayout.PREFERRED_SIZE, 1164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(420, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(177, 177, 177)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(home, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(toback, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(66, 66, 66))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(292, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(home, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(toback, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(115, 115, 115))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        //insert data to database
        try{
            Subjects s = new Subjects();
        
            s.setSubject(getsubName.getText());
            s.setSub_id(getsubId.getText());
            s.setFee(getfee.getText());
            s.setCredit(getCredit.getText());
            s.setProgramme("Postgraduate");
            s.setLec_id(getLecId.getText());
            s.setIns_id(getInsId.getText());
            s.setCourse_id(getCourse.getText());
            s.setFaculty_id("nsbm02");
        
            db.addPostgraduateSubject(s);
        
            comfirm.setVisible(true);
        }catch(Exception e){JOptionPane.showMessageDialog(null, "registration failed!!!", "_warning_", JOptionPane.WARNING_MESSAGE);}
    }//GEN-LAST:event_submitActionPerformed

    private void okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okActionPerformed
        //
        postgraduate_SB_subject_details c = new postgraduate_SB_subject_details();
        c.setVisible(true);
        this.dispose();
        comfirm.dispose();
    }//GEN-LAST:event_okActionPerformed

    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed
        // TO home
        Business_pg_login a =new Business_pg_login();
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_homeActionPerformed

    private void tobackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tobackActionPerformed
        // go back
        postgraduate_SB_subject_details u = new postgraduate_SB_subject_details();
        u.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_tobackActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        // TO log out
        Home h = new Home();
        h.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutActionPerformed

    private void getsubNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_getsubNameFocusGained
        if(getsubName.getText().equals("subject name")){
            getsubName.setText("");
        } 
    }//GEN-LAST:event_getsubNameFocusGained

    private void getsubNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_getsubNameFocusLost
       if(getsubName.getText().equals("")){
            getsubName.setText("subject name");
        }  
    }//GEN-LAST:event_getsubNameFocusLost

    private void getsubIdFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_getsubIdFocusGained
        if(getsubId.getText().equals("eg:- PS001")){
            getsubId.setText("");
        } 
    }//GEN-LAST:event_getsubIdFocusGained

    private void getsubIdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_getsubIdFocusLost
       if(getsubId.getText().equals("")){
            getsubId.setText("eg:- PS001");
        } 
    }//GEN-LAST:event_getsubIdFocusLost

    private void getCreditFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_getCreditFocusGained
        if(getCredit.getText().equals("number of credit")){
            getCredit.setText("");
        } 
    }//GEN-LAST:event_getCreditFocusGained

    private void getCreditFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_getCreditFocusLost
         if(getCredit.getText().equals("")){
            getCredit.setText("number of credit");
        } 
    }//GEN-LAST:event_getCreditFocusLost

    private void getLecIdFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_getLecIdFocusGained
       if(getLecId.getText().equals("eg:- Lec001"))
            getLecId.setText(""); 
    }//GEN-LAST:event_getLecIdFocusGained

    private void getLecIdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_getLecIdFocusLost
      if(getLecId.getText().equals(""))
            getLecId.setText("eg:- Lec001"); 
    }//GEN-LAST:event_getLecIdFocusLost

    private void getInsIdFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_getInsIdFocusGained
        if(getInsId.getText().equals("eg:- Ins001"))
            getInsId.setText("");
    }//GEN-LAST:event_getInsIdFocusGained

    private void getInsIdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_getInsIdFocusLost
       if(getInsId.getText().equals(""))
            getInsId.setText("eg:- Ins001"); 
    }//GEN-LAST:event_getInsIdFocusLost

    private void getCourseFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_getCourseFocusGained
        if(getCourse.getText().equals("eg:- Mas001"))
            getCourse.setText("");
    }//GEN-LAST:event_getCourseFocusGained

    private void getCourseFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_getCourseFocusLost
        if(getCourse.getText().equals(""))
            getCourse.setText("eg:- Mas001");
    }//GEN-LAST:event_getCourseFocusLost

    private void getfeeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_getfeeFocusGained
        if(getfee.getText().equals("subject fee"))
            getfee.setText("");
    }//GEN-LAST:event_getfeeFocusGained

    private void getfeeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_getfeeFocusLost
        if(getfee.getText().equals(""))
            getfee.setText("subject fee");
    }//GEN-LAST:event_getfeeFocusLost

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
            java.util.logging.Logger.getLogger(postgraduate_SB_subject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(postgraduate_SB_subject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(postgraduate_SB_subject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(postgraduate_SB_subject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new postgraduate_SB_subject().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog comfirm;
    private javax.swing.JTextField getCourse;
    private javax.swing.JTextField getCredit;
    private javax.swing.JTextField getInsId;
    private javax.swing.JTextField getLecId;
    private javax.swing.JTextField getfee;
    private javax.swing.JTextField getsubId;
    private javax.swing.JTextField getsubName;
    private javax.swing.JLabel heading;
    private javax.swing.JButton home;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton logout;
    private javax.swing.JLabel nName;
    private javax.swing.JLabel nName1;
    private javax.swing.JLabel nName2;
    private javax.swing.JLabel nName4;
    private javax.swing.JLabel nName5;
    private javax.swing.JLabel nName6;
    private javax.swing.JLabel nName7;
    private javax.swing.JButton ok;
    private javax.swing.JLabel pic1;
    private javax.swing.JButton submit;
    private javax.swing.JButton toback;
    // End of variables declaration//GEN-END:variables
}
