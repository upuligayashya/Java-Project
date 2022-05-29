
package UI;

import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class Tec_record extends javax.swing.JFrame {

    String grade;
    String gender;
   
    public Tec_record() {
        initComponents();
        setLocationRelativeTo(null);
        setRecordToTable1();
        
    }
    
              // BUILD OBJECTS
        Connection con;
        PreparedStatement pst;
        ResultSet rs;   
        DefaultTableModel df;
        PreparedStatement insert;
       
            
            // DISPLAY DATABASE TABLE DATA INTO JTABLE 
     public void setRecordToTable1(){
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/schooldb","root","");
            
           PreparedStatement insert = con.prepareStatement("select tech_id,firstname,lastname,bdy,gender,regi_dy,grade,subject,contact,address from tech_regi");  
           ResultSet rs = insert.executeQuery();
           
           while(rs.next()){
                String tech_id = rs.getString("tech_id");
                String firstname = rs.getString("firstname");
                String lastname = rs.getString("lastname");
                String bdy = rs.getString("bdy");
                String gender = rs.getString("gender");
                String grade = rs.getString("grade");
                String subject = rs.getString("subject");
                String regi_dy = rs.getString("regi_dy");
                String contact = rs.getString("contact");
                String address = rs.getString("address");
                 
                 // STRING ARRAY FOR STORE DATA INTO JTABLE
                 
                String tbData [] = {tech_id,firstname,lastname,bdy,gender,regi_dy,grade,subject,contact,address};
                DefaultTableModel tblModel = (DefaultTableModel)tectbl.getModel();
                 
                 // ADD STRING ARRAY DATA INTO JTABLE
                 tblModel.addRow(tbData);
                
           }
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
     
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtbdy = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtadd = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        txtcon = new javax.swing.JTextField();
        txtregi = new javax.swing.JTextField();
        txtln = new javax.swing.JTextField();
        txtfn = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cmbgn = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        cmbgr = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        cmbsub = new javax.swing.JComboBox<>();
        lbl_id = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tectbl = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Teacher Record Management");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/left-1.1s-60px.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(403, 403, 403)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 696, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(406, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1630, 110));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102), 3), "Update the Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 16))); // NOI18N
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(51, 51, 51));
        jLabel16.setText("Registration Date");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Gender");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setText("Birthday");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(51, 51, 51));
        jLabel15.setText("Address");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 51, 51));
        jLabel13.setText("Contact Number");

        txtbdy.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtadd.setColumns(20);
        txtadd.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtadd.setRows(5);
        jScrollPane1.setViewportView(txtadd);

        jButton2.setBackground(new java.awt.Color(0, 102, 102));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Clear");
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 102, 102));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Update");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(0, 102, 102));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Delete");
        jButton5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        txtcon.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtregi.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtregi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtregiActionPerformed(evt);
            }
        });

        txtln.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtfn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("User ID");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Teacher Last Name ");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Teacher First Name");

        cmbgn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cmbgn.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 51));
        jLabel12.setText("Grade");

        cmbgr.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cmbgr.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Grade 1 - 5", "Grade 6 - 9", "Grade 10 - 11", "Advanced Level 12/13" }));
        cmbgr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbgrActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(51, 51, 51));
        jLabel17.setText("Subject");

        cmbsub.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cmbsub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbsubActionPerformed(evt);
            }
        });

        lbl_id.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbl_id.setForeground(new java.awt.Color(0, 0, 153));
        lbl_id.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(txtln, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel5))))
                                .addGap(20, 20, 20)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(lbl_id, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(178, 178, 178)
                                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtfn, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtbdy, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel17)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtregi)
                            .addComponent(cmbgn, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbgr, 0, 248, Short.MAX_VALUE)
                            .addComponent(cmbsub, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(jLabel15))
                .addGap(34, 34, 34)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcon, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txtcon, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addComponent(jScrollPane1))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbgn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtregi, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbgr, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbsub, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(23, 23, 23))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(lbl_id, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(txtfn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7)
                            .addComponent(txtln, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtbdy, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)))
                    .addComponent(jSeparator1))
                .addGap(18, 41, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 1590, 340));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102), 3), "Saved Data", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 16))); // NOI18N

        tectbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tectbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Admission no", "First Name", "Last Name", "Bday", "Gender", "Regiday", "Grade", "Subject", "Contact", "Address"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tectbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tectblMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tectbl);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1546, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 1590, 410));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 892, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // CLEAR BUTTON ACTION
        
        lbl_id.setText("");
        txtfn.setText("");
        txtln.setText("");
        txtbdy.setText("");
        cmbgr.setSelectedIndex(0);
        cmbgn.setSelectedIndex(0);
        cmbsub.setSelectedIndex(0);
        txtregi.setText("");
        txtadd.setText("");
        txtcon.setText("");
        buttonGroup1.clearSelection();
       
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // BACK TO ADMINDASH BOARD
        
        Admin_dashbrd addsh = new Admin_dashbrd();
        addsh.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void tectblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tectblMouseClicked
        // SELECTED TABLE ROW DISPLAY INTO TEXTBOX
     
        int i = tectbl.getSelectedRow();
        TableModel model = tectbl.getModel();
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/schooldb","root","");
            
            lbl_id.setText(model.getValueAt(i, 0).toString());
            txtfn.setText(model.getValueAt(i, 1).toString());
            txtln.setText(model.getValueAt(i, 2).toString());
            txtbdy.setText(model.getValueAt(i, 3).toString());
            cmbgn.setSelectedItem(model.getValueAt(i, 4).toString());
            txtregi.setText(model.getValueAt(i, 5).toString());
            cmbgr.setSelectedItem(model.getValueAt(i, 6).toString());
            cmbsub.setSelectedItem(model.getValueAt(i, 7).toString());
            txtcon.setText(model.getValueAt(i, 8).toString());
            txtadd.setText(model.getValueAt(i, 9).toString());
            
        
        } catch (Exception ex) {
            Logger.getLogger(Tec_record.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tectblMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //  UPDATE TEACHER GIVING DETAILS IN DATABASE
        
    try {
     
        String stufnm = txtfn.getText();
        String stulnm = txtln.getText();
        String bdy = txtbdy.getText();
        String gender = (String)cmbgn.getSelectedItem();
        String regi = txtregi.getText();
        String grade = (String)cmbgr.getSelectedItem();
        String subject = (String)cmbsub.getSelectedItem();
        String contact  = txtcon.getText();
        String address = txtadd.getText();
        
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/schooldb","root",""); 
            String tech_id = lbl_id.getText();
            insert = con.prepareStatement("Update tech_regi set tech_id = ? ,firstname = ?,lastname = ?, bdy = ?,gender= ?, regi_dy = ? ,grade = ? ,subject = ?,contact= ?,address = ? where tech_id = '"+tech_id+"'");    
            insert.setString(1, tech_id);
            insert.setString(2, stufnm);
            insert.setString(3, stulnm);
            insert.setString(4, bdy);
            gender = cmbgn.getSelectedItem().toString();
            insert.setString(5, gender);
            insert.setString(6, regi);
            grade = cmbgr.getSelectedItem().toString();
            insert.setString(7, grade);
            subject = cmbsub.getSelectedItem().toString();
            insert.setString(8, subject);
            insert.setString(9, contact);
            insert.setString(10, address);
            insert.executeUpdate();
            
            // REFRESH THE TABLE AFTER UPDATE DETAILS
            DefaultTableModel model;
            model = (DefaultTableModel)tectbl.getModel();
            model.setRowCount(0);
            setRecordToTable1();
           
            JOptionPane.showMessageDialog(this,"Record Updated");
                    
        } catch (Exception ex) {
           JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
              // GET JTABLE MODEL FIRST
       
        DefaultTableModel tblModel = (DefaultTableModel)tectbl.getModel();
        
             // DELETE SELECTED ROW
       if(tectbl.getSelectedRowCount()==1){
             // IF SINGLE ROWS SELECTED THEN DELETE MSG
           tblModel.removeRow(tectbl.getSelectedRow());
           
        }else{
                if(tectbl.getRowCount()==0){
                   // IF TABLE IS EMPTY (NO DATA) THEN DISPLAY MSG
                   JOptionPane.showMessageDialog(this, "Table is Empty !");
                }else{
                    JOptionPane.showMessageDialog(this, "Please Select Single Row For Delete .");
                   
                   }
        }
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void txtregiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtregiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtregiActionPerformed

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
            cmbsub.addItem("ICT");
            cmbsub.addItem("Bucket - Dancing");
            cmbsub.addItem("Bucket - Music");
            cmbsub.addItem("Bucket - Art");
            cmbsub.addItem("Bucket - Drama");
            
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
            cmbsub.addItem("Physical Science  - Mathemetics");
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
            java.util.logging.Logger.getLogger(Tec_record.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tec_record.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tec_record.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tec_record.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new Tec_record().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cmbgn;
    private javax.swing.JComboBox<String> cmbgr;
    private javax.swing.JComboBox<String> cmbsub;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lbl_id;
    private javax.swing.JTable tectbl;
    private javax.swing.JTextArea txtadd;
    private javax.swing.JTextField txtbdy;
    private javax.swing.JTextField txtcon;
    private javax.swing.JTextField txtfn;
    private javax.swing.JTextField txtln;
    private javax.swing.JTextField txtregi;
    // End of variables declaration//GEN-END:variables

    private void show_user() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
