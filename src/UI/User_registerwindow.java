
package UI;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class User_registerwindow extends javax.swing.JFrame {

   
    public User_registerwindow() {
        initComponents();
        setLocationRelativeTo(null);
        dt();
        teacherId();
    }
    
          // ADDING AUTO DATE IN USER WINDOW
     public void dt(){
       
       Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MMM-dd");
             String dd = sdf.format(d);
             lbl_date.setText(dd);
    }
       
         // BUILD OBJECTS
     Connection con;
     PreparedStatement pst;
   
     
         // AUTO ID GENERATE 
     public void teacherId(){
         try{
             
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/schooldb","root","");
            Statement past = con.createStatement();
            
            String sq = "select Max(tech_id) from tech_regi";
            ResultSet rs = past.executeQuery(sq);
            rs.next();
            rs.getString("Max(tech_id)");
            
            if(rs.getString("Max(tech_id)") == null){
                lbl_id.setText("TC0001");
            }else{
                Long tech_id = Long.parseLong(rs.getString("Max(tech_id)").substring(2, rs.getString("Max(tech_id)").length()));
                tech_id++;
                lbl_id.setText("TC"+String.format("%03d", tech_id));
            }
          }
         catch(Exception ex){
             JOptionPane.showMessageDialog(null, ex);
         }
     }
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtfn = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtln = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtbdy = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtregidy = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtcon = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cmbgn = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        cmbutype = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtadd = new javax.swing.JTextArea();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        cmbql = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        cmbgr = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        cmbsub = new javax.swing.JComboBox<>();
        jPanel5 = new javax.swing.JPanel();
        lblname16 = new javax.swing.JLabel();
        txtpass = new javax.swing.JTextField();
        lblname2 = new javax.swing.JLabel();
        txtun = new javax.swing.JTextField();
        lblname14 = new javax.swing.JLabel();
        lbl_date = new javax.swing.JLabel();
        lblname3 = new javax.swing.JLabel();
        txtpass1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        lbl_id = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Teacher Registration");

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/close-12.5s-43px.png"))); // NOI18N
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(295, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(240, 240, 240)
                .addComponent(jLabel14)
                .addGap(23, 23, 23))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel14))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel1)))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Techer Id");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 131, -1, 40));

        txtfn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel3.add(txtfn, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 180, 296, 38));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("First Name");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        txtln.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel3.add(txtln, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 236, 296, 37));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Last Name");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 94, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Gender");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, -1, -1));

        txtbdy.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel3.add(txtbdy, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 340, 170, 37));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Birthday");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, -1, -1));

        txtregidy.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel3.add(txtregidy, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 450, 170, 40));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Register Date");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, -1, 31));

        txtcon.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel3.add(txtcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 510, 170, 37));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Contact");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 510, 80, 30));

        cmbgn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cmbgn.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        jPanel3.add(cmbgn, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 390, 170, 38));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("User Type");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));

        cmbutype.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cmbutype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Teacher" }));
        cmbutype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbutypeActionPerformed(evt);
            }
        });
        jPanel3.add(cmbutype, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, 170, 38));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("Address");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 570, -1, -1));

        txtadd.setColumns(20);
        txtadd.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtadd.setRows(5);
        jScrollPane1.setViewportView(txtadd);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 560, 300, 130));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(464, 124, 10, 441));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setText("Qualification");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(489, 132, -1, 30));

        cmbql.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cmbql.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Diploma", "Degree", "Msc. / Bsc." }));
        jPanel3.add(cmbql, new org.netbeans.lib.awtextra.AbsoluteConstraints(628, 124, 285, 50));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 51));
        jLabel12.setText("Grade");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 200, 97, 34));

        cmbgr.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cmbgr.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Grade 1 - 5", "Grade 6 - 9", "Grade 10 - 11", "Advanced Level 12/13" }));
        cmbgr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbgrActionPerformed(evt);
            }
        });
        jPanel3.add(cmbgr, new org.netbeans.lib.awtextra.AbsoluteConstraints(628, 192, 285, 50));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 51, 51));
        jLabel13.setText("Subject");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(489, 269, -1, 40));

        cmbsub.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cmbsub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbsubActionPerformed(evt);
            }
        });
        jPanel3.add(cmbsub, new org.netbeans.lib.awtextra.AbsoluteConstraints(628, 269, 285, 50));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Set User Name and Password", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N

        lblname16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblname16.setForeground(new java.awt.Color(51, 51, 51));
        lblname16.setText("Confirm Password :-");

        txtpass.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        lblname2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblname2.setForeground(new java.awt.Color(51, 51, 51));
        lblname2.setText("User Name :-");

        txtun.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        lblname14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblname14.setForeground(new java.awt.Color(51, 51, 51));
        lblname14.setText("Time :-");

        lbl_date.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_date.setForeground(new java.awt.Color(51, 51, 51));

        lblname3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblname3.setForeground(new java.awt.Color(51, 51, 51));
        lblname3.setText("Enter Password :-");

        txtpass1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblname3, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblname16)
                    .addComponent(lblname2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblname14, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtpass, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                        .addComponent(txtpass1)
                        .addComponent(lbl_date, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtun, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblname2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtun, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblname3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtpass1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblname16, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtpass, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblname14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_date, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 370, 440, 280));

        jButton1.setBackground(new java.awt.Color(0, 102, 102));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Clear");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 700, 190, 50));

        jButton2.setBackground(new java.awt.Color(0, 102, 102));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Submit");
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 700, 220, 50));

        lbl_id.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbl_id.setForeground(new java.awt.Color(0, 0, 102));
        lbl_id.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel3.add(lbl_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 170, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 769, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbgrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbgrActionPerformed
        // grade 1 to 5 moving each subject

        if(cmbgr.getSelectedItem().equals("Grade 1 - 5")){
            cmbsub.removeAllItems();
            //cmbsub.setSelectedItem(null);
            cmbsub.addItem("Sinhala");
            cmbsub.addItem("English");
            cmbsub.addItem("Tamil");
            cmbsub.addItem("Envirnment");
            cmbsub.addItem("Handworks");
            cmbsub.addItem("Mathematics");
        }
        else if(cmbgr.getSelectedItem().equals("Grade 6 -9")){
            cmbsub.removeAllItems();
            //cmbsub.setSelectedtItem(null);
            cmbsub.addItem("Sinhala");
            cmbsub.addItem("English");
            cmbsub.addItem("Buddism");
            cmbsub.addItem("History");
            cmbsub.addItem("Civic");
            cmbsub.addItem("Mathematics");
            cmbsub.addItem("Geography");
            cmbsub.addItem("Health");
            cmbsub.addItem("Science");
            cmbsub.addItem("Bucket - Dancing");
            cmbsub.addItem("Bucket - Music");
            cmbsub.addItem("Bucket - Art");
            cmbsub.addItem("Bucket - Drama");
            cmbsub.addItem("ICT");
        }
        else if(cmbgr.getSelectedItem().equals("Grade 10 - 11")){
            cmbsub.removeAllItems();
            //cmbsub.setSelectedtItem(null);
            cmbsub.addItem("Sinhala");
            cmbsub.addItem("English");
            cmbsub.addItem("Buddism");
            cmbsub.addItem("History");
            cmbsub.addItem("Science");
            cmbsub.addItem("Mathematics");
            cmbsub.addItem("Bucket 1 - Geography");
            cmbsub.addItem("Bucket 1 - Civic");
            cmbsub.addItem("Bucket 1 - Commerce");
            cmbsub.addItem("Bucket 2 - Dancing");
            cmbsub.addItem("Bucket 2 - Music");
            cmbsub.addItem("Bucket 2 - Art");
            cmbsub.addItem("Bucket 2 - Drama");
            cmbsub.addItem("Bucket 2 - Sinhala Litruture");
            cmbsub.addItem("Bucket 2 - english Litruture");
            cmbsub.addItem("Bucket 3 - ICT");
            cmbsub.addItem("Bucket 3 - Media");
            cmbsub.addItem("Bucket 3 - Health");
            cmbsub.addItem("Bucket 3 - Home Science");
            cmbsub.addItem("Bucket 3 - Agriculture");
        }
        else if(cmbgr.getSelectedItem().equals("Advanced Level 12/13")){
            cmbsub.removeAllItems();
            //cmbsub.setSelectedtItem(null);
            cmbsub.addItem("Art - Sinhala");
            cmbsub.addItem("Art - English");
            cmbsub.addItem("Art - Buddism");
            cmbsub.addItem("Art - History");
            cmbsub.addItem("Art - Dancing");
            cmbsub.addItem("Art - Music");
            cmbsub.addItem("Art -  Art");
            cmbsub.addItem("Art - Drama");
            cmbsub.addItem("Art -  Sinhala Litruture");
            cmbsub.addItem("Art - english Litruture");
            cmbsub.addItem("Art -  Media");
            cmbsub.addItem("Art - Health");
            cmbsub.addItem("Art - Home Science");
            cmbsub.addItem("Commerce - Logic");
            cmbsub.addItem("Commerce - Political Science");
            cmbsub.addItem("Commerce  - Econ");
            cmbsub.addItem("Commerce  - Business Studies");
            cmbsub.addItem("Science  - Mathemetics");
            cmbsub.addItem("Science  - Biology");
            cmbsub.addItem("Science  - Chemistry");
            cmbsub.addItem("Science  - Physics");
            cmbsub.addItem("Bucket - ICT");
            cmbsub.addItem("Bucket - Agriculture");
            cmbsub.addItem("Technology  - Biosystem");
            cmbsub.addItem("Technology  - Engineering");
            cmbsub.addItem("Technology  - Food Science");
        }

    }//GEN-LAST:event_cmbgrActionPerformed

    private void cmbsubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbsubActionPerformed
        
    }//GEN-LAST:event_cmbsubActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // CLEAR BUTTON ACTION
        
        lbl_id.setText("");
        txtfn.setText("");
        txtln.setText("");
        txtbdy.setText("");
        txtregidy.setText("");
        txtcon.setText("");
        txtadd.setText("");
        cmbql.setSelectedIndex(0);
        cmbgr.setSelectedIndex(0);
        cmbsub.setSelectedIndex(0);
        txtun.setText("");
        txtpass1.setText("");
        txtpass.setText("");
        lbl_date.setText("");
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        // IMGE ICON FOR CANCEL REGISTER AND BACK TO LOGIN WINDOW
        
           Loginwindow login = new Loginwindow();
           login.setVisible(true);
           this.dispose();
    }//GEN-LAST:event_jLabel14MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // SUBMIT FILLING DETAILS IN TO TECH_REGI TABLE IN MYSQL DATABASE
        
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost/schooldb","root","");
        pst = con.prepareStatement("insert into tech_regi values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");  
        pst.setString(1, lbl_id.getText());
        pst.setString(2, txtfn.getText());
        pst.setString(3, txtln.getText());
        
        String utype = (String)cmbutype.getSelectedItem();
        pst.setString(4, utype);
        
        pst.setString(5, txtbdy.getText());
        
        String gender = (String)cmbgn.getSelectedItem();
        pst.setString(6, gender);
        
        pst.setString(7, txtregidy.getText());
        pst.setString(8, txtcon.getText());
        pst.setString(9, txtadd.getText());
        
        String qualification = (String)cmbql.getSelectedItem();
        pst.setString(10, qualification);
        
        String grade = (String)cmbgr.getSelectedItem();
        pst.setString(11, grade);
        
        String subject = (String)cmbsub.getSelectedItem();
        pst.setString(12, subject);
        
        pst.setString(13, txtun.getText());
        pst.setString(14, txtpass.getText());
        pst.setString(15, lbl_date.getText());
        
        pst.executeUpdate();
        JOptionPane.showMessageDialog(null, "Submit Sucessfully! ");
        
        Loginwindow login = new Loginwindow();
        login.setVisible(true);
        this.dispose();
        
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void cmbutypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbutypeActionPerformed
        
    }//GEN-LAST:event_cmbutypeActionPerformed

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
            java.util.logging.Logger.getLogger(User_registerwindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(User_registerwindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(User_registerwindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(User_registerwindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new User_registerwindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbgn;
    private javax.swing.JComboBox<String> cmbgr;
    private javax.swing.JComboBox<String> cmbql;
    private javax.swing.JComboBox<String> cmbsub;
    private javax.swing.JComboBox<String> cmbutype;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbl_date;
    private javax.swing.JLabel lbl_id;
    private javax.swing.JLabel lblname14;
    private javax.swing.JLabel lblname16;
    private javax.swing.JLabel lblname2;
    private javax.swing.JLabel lblname3;
    private javax.swing.JTextArea txtadd;
    private javax.swing.JTextField txtbdy;
    private javax.swing.JTextField txtcon;
    private javax.swing.JTextField txtfn;
    private javax.swing.JTextField txtln;
    private javax.swing.JTextField txtpass;
    private javax.swing.JTextField txtpass1;
    private javax.swing.JTextField txtregidy;
    private javax.swing.JTextField txtun;
    // End of variables declaration//GEN-END:variables
}
