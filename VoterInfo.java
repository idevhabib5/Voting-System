/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VoteSystem;


import javax.swing.text.MaskFormatter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Hp
 */
public class VoterInfo extends javax.swing.JFrame {
MaskFormatter mf, af;
String provinces[]={"Sindh","Punjab","Balochistan","Khyber Pakhtunkhwa","Islamabad","Gilgit Baltistan","Azad Jammu & Kashmir"};
String candidates[]={"McDonald's", "KFC", "Domino's", "Pizza Hut", "Burger Lab", "Subway"};
static String dname, dcnic, dage, dstate, dcity, demail, dcand;

    /**
     * Creates new form VoterInfo
     */
    public VoterInfo() {
        initComponents();
        getContentPane().setBackground(new java.awt.Color(49, 49, 49));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        cast = new javax.swing.JButton();
        back = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        city = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        invalidmail = new javax.swing.JLabel();
        invalidage = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        try {
            mf = new MaskFormatter("#####-#######-#");
            mf.setPlaceholderCharacter('#');
            cnic = new javax.swing.JFormattedTextField(mf);
            try {
                af = new MaskFormatter("##");
                af.setPlaceholderCharacter('#');
                age = new javax.swing.JFormattedTextField(af);
                states = new javax.swing.JComboBox(provinces);
                cand = new javax.swing.JComboBox<>(candidates);
                jLabel5 = new javax.swing.JLabel();
                jLabel6 = new javax.swing.JLabel();
                jLabel9 = new javax.swing.JLabel();
                jLabel10 = new javax.swing.JLabel();
                jLabel11 = new javax.swing.JLabel();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                setBackground(new java.awt.Color(49, 49, 49));
                setLocationByPlatform(true);
                setResizable(false);

                jPanel3.setBackground(new java.awt.Color(49, 49, 49));

                jPanel1.setBackground(new java.awt.Color(186, 79, 84));
                jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

                cast.setBackground(new java.awt.Color(255, 255, 255));
                cast.setFont(new java.awt.Font("Raleway SemiBold", 0, 12)); // NOI18N
                cast.setText("Cast your vote");
                cast.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        castActionPerformed(evt);
                    }
                });

                back.setBackground(new java.awt.Color(255, 255, 255));
                back.setFont(new java.awt.Font("Raleway SemiBold", 0, 12)); // NOI18N
                back.setText("Return to Voter's Main Screen");
                back.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        backActionPerformed(evt);
                    }
                });

                jPanel2.setBackground(new java.awt.Color(49, 49, 49));
                jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "VOTER'S INFORMATION", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Prompt ExtraBold", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N
                jPanel2.setForeground(new java.awt.Color(202, 62, 71));

                jLabel7.setFont(new java.awt.Font("Raleway ExtraBold", 0, 12)); // NOI18N
                jLabel7.setForeground(new java.awt.Color(255, 255, 255));
                jLabel7.setText("City");

                jLabel8.setFont(new java.awt.Font("Raleway ExtraBold", 0, 12)); // NOI18N
                jLabel8.setForeground(new java.awt.Color(255, 255, 255));
                jLabel8.setText("Email");

                city.setFont(new java.awt.Font("Raleway SemiBold", 0, 11)); // NOI18N
                city.setText("Enter your City Name");
                city.setToolTipText("Please enter the city you belong to.");
                city.addFocusListener(new java.awt.event.FocusAdapter() {
                    public void focusGained(java.awt.event.FocusEvent evt) {
                        cityFocusGained(evt);
                    }
                    public void focusLost(java.awt.event.FocusEvent evt) {
                        cityFocusLost(evt);
                    }
                });
                city.addKeyListener(new java.awt.event.KeyAdapter() {
                    public void keyPressed(java.awt.event.KeyEvent evt) {
                        cityKeyPressed(evt);
                    }
                });

                email.setFont(new java.awt.Font("Raleway SemiBold", 0, 11)); // NOI18N
                email.setText("email@domain.com");
                email.setToolTipText("Please enter your email under a valid domain.");
                email.addFocusListener(new java.awt.event.FocusAdapter() {
                    public void focusGained(java.awt.event.FocusEvent evt) {
                        emailFocusGained(evt);
                    }
                    public void focusLost(java.awt.event.FocusEvent evt) {
                        emailFocusLost(evt);
                    }
                });
                email.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        emailActionPerformed(evt);
                    }
                });
                email.addKeyListener(new java.awt.event.KeyAdapter() {
                    public void keyPressed(java.awt.event.KeyEvent evt) {
                        emailKeyPressed(evt);
                    }
                });

                invalidmail.setFont(new java.awt.Font("Raleway ExtraBold", 0, 12)); // NOI18N
                invalidmail.setForeground(new java.awt.Color(255, 255, 255));
                invalidmail.setText("Invalid Email ID");
                invalidmail.setVisible(false);

                invalidage.setFont(new java.awt.Font("Raleway ExtraBold", 0, 12)); // NOI18N
                invalidage.setForeground(new java.awt.Color(255, 255, 255));
                invalidage.setText("Age must be greater than 18");
                invalidage.setVisible(false);

                jLabel1.setFont(new java.awt.Font("Raleway ExtraBold", 0, 12)); // NOI18N
                jLabel1.setForeground(new java.awt.Color(255, 255, 255));
                jLabel1.setText("Name");

                jLabel2.setFont(new java.awt.Font("Raleway ExtraBold", 0, 12)); // NOI18N
                jLabel2.setForeground(new java.awt.Color(255, 255, 255));
                jLabel2.setText("CNIC");

                jLabel3.setFont(new java.awt.Font("Raleway ExtraBold", 0, 12)); // NOI18N
                jLabel3.setForeground(new java.awt.Color(255, 255, 255));
                jLabel3.setText("Age");

                jLabel4.setFont(new java.awt.Font("Raleway ExtraBold", 0, 12)); // NOI18N
                jLabel4.setForeground(new java.awt.Color(255, 255, 255));
                jLabel4.setText("State");

                name.setFont(new java.awt.Font("Raleway SemiBold", 0, 11)); // NOI18N
                name.setText("Enter your Full Name");
                name.setToolTipText("Please enter your name according to the official documentations.");
                name.addFocusListener(new java.awt.event.FocusAdapter() {
                    public void focusGained(java.awt.event.FocusEvent evt) {
                        nameFocusGained(evt);
                    }
                    public void focusLost(java.awt.event.FocusEvent evt) {
                        nameFocusLost(evt);
                    }
                });
                name.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        nameActionPerformed(evt);
                    }
                });
                name.addKeyListener(new java.awt.event.KeyAdapter() {
                    public void keyPressed(java.awt.event.KeyEvent evt) {
                        nameKeyPressed(evt);
                    }
                });

                cnic.setColumns(13);
            }

            catch(Exception e) {
                e.printStackTrace();
            }
            cnic.setToolTipText("Please enter your CNIC in the speciified format.");
            cnic.setName(""); // NOI18N
            cnic.addFocusListener(new java.awt.event.FocusAdapter() {
                public void focusGained(java.awt.event.FocusEvent evt) {
                    cnicFocusGained(evt);
                }
                public void focusLost(java.awt.event.FocusEvent evt) {
                    cnicFocusLost(evt);
                }
            });
            cnic.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    cnicActionPerformed(evt);
                }
            });

            age.setColumns(2);
        }

        catch(Exception e) {
            e.printStackTrace();
        }
        age.setToolTipText("Please enter your age.");
        age.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ageFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                ageFocusLost(evt);
            }
        });
        age.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageActionPerformed(evt);
            }
        });

        states.setFont(new java.awt.Font("Raleway SemiBold", 0, 11)); // NOI18N
        states.setToolTipText("");
        states.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(6, 6, 6))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(10, 10, 10))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(1, 1, 1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(10, 10, 10))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(2, 2, 2)))
                .addGap(45, 45, 45)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(invalidage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(invalidmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(72, 72, 72))
                            .addComponent(name)
                            .addComponent(cnic)
                            .addComponent(age)
                            .addComponent(states, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(city)
                            .addComponent(email))
                        .addGap(3, 3, 3)))
                .addGap(50, 50, 50))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cnic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(invalidage)
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(states, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(city, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(invalidmail)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        cand.setFont(new java.awt.Font("Raleway SemiBold", 0, 12)); // NOI18N
        cand.setToolTipText("");
        cand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                candActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Raleway ExtraBold", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Candidates");

        jLabel6.setFont(new java.awt.Font("Raleway ExtraBold", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Which fast food chain do you think is best across Pakistan?");

        jLabel9.setFont(new java.awt.Font("Raleway ExtraBold", 0, 13)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("VOTING QUESTION:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(36, 36, 36)
                                .addComponent(cand, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46))
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(back)
                                    .addComponent(cast, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(85, 85, 85)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel9))
                        .addGap(22, 22, 22))))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {back, cast});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addGap(3, 3, 3)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel5))
                    .addComponent(cand, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(cast)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(back)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VoteSystem/icons8_show_permit_card_100px.png"))); // NOI18N

        jLabel11.setFont(new java.awt.Font("Prompt ExtraBold", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("VOTER'S INFO");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap(59, Short.MAX_VALUE)
                        .addComponent(jLabel11))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jLabel10)))
                .addGap(18, 58, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(209, 209, 209)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void castActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_castActionPerformed
        dname = name.getText();
        dcnic = cnic.getText();
        dage = age.getText();
        dstate = states.getSelectedItem().toString();
        dcity = city.getText();
        demail = email.getText();
        dcand = cand.getSelectedItem().toString();
              
        int agestring;
        try { agestring = Integer.parseInt(age.getText()); }
        catch (NumberFormatException e){ agestring = 0;}
        
        //-----------------------
        
        String email_pattern = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@"
            + "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
        
        Pattern pattern = Pattern.compile(email_pattern);
        Matcher matcher = pattern.matcher(demail);
        
        if(agestring<18 && matcher.matches() == false){ //Age and Email Limitations
            invalidage.setVisible(true);
            invalidmail.setVisible(true);
            return;
        }
        else if(agestring<18 && matcher.matches() == true){
            invalidage.setVisible(true);               
            invalidmail.setVisible(false);
            return;
        }
        
        else if(agestring>=18 && matcher.matches() == false){
            invalidage.setVisible(false);               
            invalidmail.setVisible(true);
            return;
        }
        else{
        invalidmail.setVisible(false);
        invalidage.setVisible(false);               
        }
        
       //-----------------------

        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/votingsystem","root","lunaaurora");

            String sql = "INSERT INTO voter VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement pstmt=conn.prepareStatement(sql);
                     
            pstmt.setString(1,dname);
            pstmt.setString(2,dcnic);
            pstmt.setInt(3,Integer.parseInt(dage));
            pstmt.setString(4,dstate);
            pstmt.setString(5,dcity);
            pstmt.setString(6,demail);
            pstmt.setString(7,dcand);
            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(null,"Insertion Successful! Database has been updated.");
            conn.close();             
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            return;
        }
        
        VotingDone done = new VotingDone(VoterInfo.this, true);
        done.setVisible(true);
        

    }//GEN-LAST:event_castActionPerformed

    private void nameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nameFocusGained
        if(name.getText().trim().toLowerCase().equals("enter your full name")){
        name.setText("");}
    }//GEN-LAST:event_nameFocusGained

    private void nameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nameFocusLost
        if(name.getText().trim().equals("") || name.getText().trim().toLowerCase().equals("enter your full name")){
        name.setText("Enter your Full Name");}
    }//GEN-LAST:event_nameFocusLost

    private void ageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ageActionPerformed

    private void cnicFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cnicFocusGained
    //    if(cnic.getText().trim().toLowerCase().equals("00000-0000000-0")){
    //    cnic.setText("");}
    }//GEN-LAST:event_cnicFocusGained

    private void cnicFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cnicFocusLost
    //    if(cnic.getText().trim().equals("") || cnic.getText().trim().toLowerCase().equals("00000-0000000-0")){
    //    cnic.setText("00000-0000000-0");}
    }//GEN-LAST:event_cnicFocusLost

    private void cnicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cnicActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cnicActionPerformed

    private void ageFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ageFocusGained
//        if(age.getText().trim().toLowerCase().equals("00")){
//        age.setText("");}
    }//GEN-LAST:event_ageFocusGained

    private void ageFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ageFocusLost
//        if(age.getText().trim().equals("") || age.getText().trim().toLowerCase().equals("00")){
//        age.setText("00");}
    }//GEN-LAST:event_ageFocusLost

    private void statesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_statesActionPerformed

    private void nameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameKeyPressed
        char c = evt.getKeyChar();
        if(Character.isLetter(c) || Character.isWhitespace(c) || Character.isISOControl(c)){
            name.setEditable(true);
        }
        else{
            name.setEditable(false);
        }
    }//GEN-LAST:event_nameKeyPressed

    private void cityKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cityKeyPressed
        char c = evt.getKeyChar();
        if(Character.isLetter(c) || Character.isWhitespace(c) || Character.isISOControl(c)){
            city.setEditable(true);
        }
        else{
            city.setEditable(false);
        }
    }//GEN-LAST:event_cityKeyPressed

    private void cityFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cityFocusGained
        if(city.getText().trim().toLowerCase().equals("enter your city name")){
        city.setText("");}
    }//GEN-LAST:event_cityFocusGained

    private void cityFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cityFocusLost
        if(city.getText().trim().equals("") || city.getText().trim().toLowerCase().equals("enter your city name")){
        city.setText("Enter your City Name");}
    }//GEN-LAST:event_cityFocusLost

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        new VoterOptions().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_backActionPerformed

    private void emailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailFocusGained
        if(email.getText().trim().toLowerCase().equals("email@domain.com")){
        email.setText("");}
    }//GEN-LAST:event_emailFocusGained

    private void emailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailFocusLost
        if(email.getText().trim().equals("") || email.getText().trim().toLowerCase().equals("email@domain.com")){
        email.setText("email@domain.com");}
    }//GEN-LAST:event_emailFocusLost

    private void emailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emailKeyPressed

    }//GEN-LAST:event_emailKeyPressed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed

    }//GEN-LAST:event_emailActionPerformed

    private void candActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_candActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_candActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]){
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
            java.util.logging.Logger.getLogger(VoterInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VoterInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VoterInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VoterInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new VoterInfo().setVisible(true);
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField age;
    private javax.swing.JButton back;
    private javax.swing.JComboBox<String> cand;
    private javax.swing.JButton cast;
    private javax.swing.JTextField city;
    private javax.swing.JFormattedTextField cnic;
    private javax.swing.JTextField email;
    private javax.swing.JLabel invalidage;
    private javax.swing.JLabel invalidmail;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField name;
    private javax.swing.JComboBox<String> states;
    // End of variables declaration//GEN-END:variables
}
