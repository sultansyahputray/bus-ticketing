package ticketbooking;

import javax.swing.JComponent;

public class BusTicketing extends javax.swing.JFrame {

    public BusTicketing() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jTextFieldForm = new javax.swing.JTextField();
        jTextFieldTo = new javax.swing.JTextField();
        jTextFieldDate2 = new javax.swing.JTextField();
        jTextFieldTime2 = new javax.swing.JTextField();
        jTextFieldClass = new javax.swing.JTextField();
        jTextFieldTicketType = new javax.swing.JTextField();
        jTextFieldPassengers2 = new javax.swing.JTextField();
        jTextFieldPrice = new javax.swing.JTextField();
        jButtonReset = new javax.swing.JButton();
        jButtonExit = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jComboBoxDestination = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jRadioButtonSingle1 = new javax.swing.JRadioButton();
        jRadioButtonEconomy1 = new javax.swing.JRadioButton();
        jRadioButtonReturn1 = new javax.swing.JRadioButton();
        jRadioButtonFirstClass1 = new javax.swing.JRadioButton();
        jComboBoxTime = new javax.swing.JComboBox<>();
        jDateChooser = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldPassenger1 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jTextFieldTax = new javax.swing.JTextField();
        jTextFieldTotal = new javax.swing.JTextField();
        jTextFieldSubTotal = new javax.swing.JTextField();
        jButtonTotal = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1200, 700));
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 80)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("BUS SEMPATI STAR");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(220, 10, 790, 80);

        jLabel22.setIcon(new javax.swing.ImageIcon("D:\\sampah\\BUS SURABAYA\\bus (1).png")); // NOI18N
        jPanel1.add(jLabel22);
        jLabel22.setBounds(90, 10, 140, 80);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 11, 1090, 110);

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jLabel8.setText("Kota Asal");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jLabel9.setText("Kota Tujuan");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jLabel10.setText("Kelas");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jLabel11.setText("Jadwal Keberangkatan");

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jLabel12.setText("Tanggal Keberangkatan");

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jLabel13.setText("Total Tagihan");

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jLabel14.setText("Jumlah Penumpang");

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jLabel15.setText("Tiket");

        jTextFieldForm.setBackground(new java.awt.Color(204, 204, 204));
        jTextFieldForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldFormActionPerformed(evt);
            }
        });

        jTextFieldTo.setBackground(new java.awt.Color(204, 204, 204));
        jTextFieldTo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldToActionPerformed(evt);
            }
        });

        jTextFieldDate2.setBackground(new java.awt.Color(204, 204, 204));
        jTextFieldDate2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDate2ActionPerformed(evt);
            }
        });

        jTextFieldTime2.setBackground(new java.awt.Color(204, 204, 204));
        jTextFieldTime2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTime2ActionPerformed(evt);
            }
        });

        jTextFieldClass.setBackground(new java.awt.Color(204, 204, 204));
        jTextFieldClass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldClassActionPerformed(evt);
            }
        });

        jTextFieldTicketType.setBackground(new java.awt.Color(204, 204, 204));
        jTextFieldTicketType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTicketTypeActionPerformed(evt);
            }
        });

        jTextFieldPassengers2.setBackground(new java.awt.Color(204, 204, 204));
        jTextFieldPassengers2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPassengers2ActionPerformed(evt);
            }
        });

        jTextFieldPrice.setBackground(new java.awt.Color(204, 204, 204));
        jTextFieldPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPriceActionPerformed(evt);
            }
        });

        jButtonReset.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jButtonReset.setText("Reset");
        jButtonReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonResetActionPerformed(evt);
            }
        });

        jButtonExit.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jButtonExit.setText("Exit");
        jButtonExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonExitMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonExitMouseExited(evt);
            }
        });
        jButtonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextFieldForm, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButtonReset, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel13))
                        .addGap(13, 13, 13)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(jButtonExit, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addComponent(jTextFieldPassengers2, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(47, 47, 47)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldTicketType, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldTime2, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextFieldTo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextFieldClass, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextFieldDate2, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jTextFieldPrice, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldTo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldDate2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldTime2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldTicketType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldClass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldPassengers2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonReset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonExit))
                .addGap(15, 15, 15))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(580, 130, 522, 512);

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel2.setText("Tujuan");

        jComboBoxDestination.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih tujuan anda ", "Bekasi", "Jakarta", "Merak", "Jambi", "Palembang", "Pekanbaru", "Riau", "Medan", "Aceh", " " }));
        jComboBoxDestination.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxDestinationActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel3.setText("Tanggal Berangkat");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel4.setText("Tiket");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel5.setText("Jadwal Berangkat");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel7.setText("Kelas");

        jRadioButtonSingle1.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jRadioButtonSingle1.setText("Single Trip");
        jRadioButtonSingle1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonSingle1ActionPerformed(evt);
            }
        });

        jRadioButtonEconomy1.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jRadioButtonEconomy1.setText("Economy");
        jRadioButtonEconomy1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonEconomy1ActionPerformed(evt);
            }
        });

        jRadioButtonReturn1.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jRadioButtonReturn1.setText("Round Trip");
        jRadioButtonReturn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonReturn1ActionPerformed(evt);
            }
        });

        jRadioButtonFirstClass1.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jRadioButtonFirstClass1.setText("First Class");
        jRadioButtonFirstClass1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonFirstClass1ActionPerformed(evt);
            }
        });

        jComboBoxTime.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih jadwal keberangkatan", "1:30", "2:30", "11:30", "12:30", " " }));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel6.setText("Jumlah Penumpang");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(84, 84, 84)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBoxDestination, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBoxTime, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButtonSingle1)
                            .addComponent(jRadioButtonFirstClass1))
                        .addGap(50, 50, 50)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButtonReturn1)
                            .addComponent(jRadioButtonEconomy1))
                        .addGap(0, 29, Short.MAX_VALUE))
                    .addComponent(jTextFieldPassenger1))
                .addGap(21, 21, 21))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jTextFieldPassenger1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBoxDestination, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jRadioButtonReturn1)
                                .addGap(42, 42, 42))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jRadioButtonSingle1)
                                .addGap(45, 45, 45))
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jRadioButtonFirstClass1)
                                .addComponent(jRadioButtonEconomy1))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19))
        );

        getContentPane().add(jPanel3);
        jPanel3.setBounds(10, 130, 560, 286);

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel16.setText("Tarif / penumpang");

        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel17.setText("Total Tagihan ");

        jLabel18.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel18.setText("Tax / penumpang ");

        jTextFieldTax.setBackground(new java.awt.Color(204, 204, 204));
        jTextFieldTax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTaxActionPerformed(evt);
            }
        });

        jTextFieldTotal.setBackground(new java.awt.Color(204, 204, 204));
        jTextFieldTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTotalActionPerformed(evt);
            }
        });

        jTextFieldSubTotal.setBackground(new java.awt.Color(204, 204, 204));
        jTextFieldSubTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSubTotalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextFieldTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                        .addComponent(jTextFieldTax, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextFieldSubTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(74, 74, 74))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldTax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldSubTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel4);
        jPanel4.setBounds(10, 470, 560, 167);

        jButtonTotal.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jButtonTotal.setText("Submit");
        jButtonTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTotalActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonTotal);
        jButtonTotal.setBounds(200, 430, 200, 35);

        jLabel19.setIcon(new javax.swing.ImageIcon("D:\\sampah\\BUS SURABAYA\\732022bb5578e6e0e4b32c39df578133.jpg")); // NOI18N
        getContentPane().add(jLabel19);
        jLabel19.setBounds(0, 0, 560, 670);

        jLabel20.setIcon(new javax.swing.ImageIcon("D:\\sampah\\BUS SURABAYA\\732022bb5578e6e0e4b32c39df578133.jpg")); // NOI18N
        getContentPane().add(jLabel20);
        jLabel20.setBounds(0, 0, 560, 670);

        jLabel21.setIcon(new javax.swing.ImageIcon("D:\\sampah\\BUS SURABAYA\\732022bb5578e6e0e4b32c39df578133.jpg")); // NOI18N
        getContentPane().add(jLabel21);
        jLabel21.setBounds(560, 0, 610, 670);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButtonFirstClass1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonFirstClass1ActionPerformed

        if(jRadioButtonFirstClass1.isSelected()){
        jRadioButtonEconomy1.setSelected(false);
        }
    }//GEN-LAST:event_jRadioButtonFirstClass1ActionPerformed

    private void jRadioButtonEconomy1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonEconomy1ActionPerformed

         if(jRadioButtonEconomy1.isSelected()){
        jRadioButtonFirstClass1.setSelected(false);
        }
    }//GEN-LAST:event_jRadioButtonEconomy1ActionPerformed

    private void jTextFieldTaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTaxActionPerformed

    }//GEN-LAST:event_jTextFieldTaxActionPerformed

    private void jTextFieldTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTotalActionPerformed

    }//GEN-LAST:event_jTextFieldTotalActionPerformed

    private void jTextFieldSubTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSubTotalActionPerformed

    }//GEN-LAST:event_jTextFieldSubTotalActionPerformed

    private void jTextFieldFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldFormActionPerformed

    }//GEN-LAST:event_jTextFieldFormActionPerformed

    private void jTextFieldToActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldToActionPerformed

    }//GEN-LAST:event_jTextFieldToActionPerformed

    private void jTextFieldDate2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDate2ActionPerformed

    }//GEN-LAST:event_jTextFieldDate2ActionPerformed

    private void jTextFieldTime2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTime2ActionPerformed

    }//GEN-LAST:event_jTextFieldTime2ActionPerformed

    private void jTextFieldClassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldClassActionPerformed

    }//GEN-LAST:event_jTextFieldClassActionPerformed

    private void jTextFieldTicketTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTicketTypeActionPerformed

    }//GEN-LAST:event_jTextFieldTicketTypeActionPerformed

    private void jTextFieldPassengers2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPassengers2ActionPerformed

    }//GEN-LAST:event_jTextFieldPassengers2ActionPerformed

    private void jTextFieldPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPriceActionPerformed

    }//GEN-LAST:event_jTextFieldPriceActionPerformed

    private void jButtonTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTotalActionPerformed

        int Tarif=300;
        int Tax = 10;
        int jarak = 0;
        int TTarif =0;
        int Dtax=0;
        int SubTotal = 0;
      
        if(jComboBoxDestination.getSelectedItem().equals("Bekasi") && jRadioButtonFirstClass1.isSelected()&& 
               jRadioButtonSingle1.isSelected()&& (!(jTextFieldPassenger1.getText()== null) ) ){
    
            int Pass = Integer.parseInt(jTextFieldPassenger1.getText());
            jTextFieldPassengers2.setText(jTextFieldPassenger1.getText());
            jTextFieldTo.setText("Bekasi");
            jTextFieldClass.setText("First Class");
            jTextFieldTicketType.setText("single trip");
            jTextFieldDate2.setText(jDateChooser.getDate().toString());
            jTextFieldForm.setText("Surabaya");
       
            jarak = 800;
            TTarif= (jarak*Tarif)+50000;
            Dtax = (Tax*TTarif)/100;
            SubTotal = (Dtax + TTarif)*Pass;
            String TotalTarif= String.format("%d",TTarif);
            String DisplayTax = String.format("%d",Dtax);
            String Stotal = String.format("%d",SubTotal);    
            jTextFieldTotal.setText(TotalTarif);
            jTextFieldTax.setText(DisplayTax);
            jTextFieldSubTotal.setText(Stotal);
            jTextFieldPrice.setText(Stotal);
            if(jComboBoxTime.getSelectedItem().equals("11:30")){
                jTextFieldTime2.setText("11:30");
            }else if(jComboBoxTime.getSelectedItem().equals("12:30")){
                jTextFieldTime2.setText("12:30");
            }
            else if(jComboBoxTime.getSelectedItem().equals("1:30")){
                jTextFieldTime2.setText("1:30");
            }
            else if(jComboBoxTime.getSelectedItem().equals("2:30")){
                jTextFieldTime2.setText("2:30");
            }
            else {
                jTextFieldTo.setText(null);
                jTextFieldTotal.setText(null);
                jTextFieldTax.setText(null);
                jTextFieldSubTotal.setText(null);
                jTextFieldPrice.setText(null);
                jTextFieldForm.setText(null);
                jTextFieldDate2.setText(null);
                jTextFieldTime2.setText(null);
                jTextFieldClass.setText(null);
                jTextFieldPassengers2.setText(null);
                jTextFieldTicketType.setText(null);
            }  
        }

        else if(jComboBoxDestination.getSelectedItem().equals("Bekasi") && jRadioButtonEconomy1.isSelected()&& 
                jRadioButtonSingle1.isSelected() && (!(jTextFieldPassenger1.getText()== null) )){
            int Pass = Integer.parseInt(jTextFieldPassenger1.getText());
      
            jTextFieldPassengers2.setText(jTextFieldPassenger1.getText());
            jTextFieldTo.setText("Bekasi");
            jTextFieldClass.setText("Economy");
            jTextFieldTicketType.setText("single trip");
            jTextFieldDate2.setText(jDateChooser.getDate().toString());
            jTextFieldForm.setText("Surabaya");
      
            jarak = 800;
            TTarif= jarak*Tarif;
            Dtax = (Tax*TTarif)/100;
            SubTotal = (Dtax + TTarif)*Pass;
            String TotalTarif= String.format("%d",TTarif);
            String DisplayTax = String.format("%d",Dtax);
            String Stotal = String.format("%d",SubTotal);    
            jTextFieldTotal.setText(TotalTarif);
            jTextFieldTax.setText(DisplayTax);
            jTextFieldSubTotal.setText(Stotal);
            jTextFieldPrice.setText(Stotal);
            if(jComboBoxTime.getSelectedItem().equals("11:30")){
                jTextFieldTime2.setText("11:30");
            }
            else if(jComboBoxTime.getSelectedItem().equals("12:30")){
                jTextFieldTime2.setText("12:30");
            }
            else if(jComboBoxTime.getSelectedItem().equals("1:30")){
                jTextFieldTime2.setText("1:30");
            }
            else if(jComboBoxTime.getSelectedItem().equals("2:30")){
                jTextFieldTime2.setText("2:30");
            }
            else {
                jTextFieldTo.setText(null);
                jTextFieldTotal.setText(null);
                jTextFieldTax.setText(null);
                jTextFieldSubTotal.setText(null);
                jTextFieldPrice.setText(null);
                jTextFieldForm.setText(null);
                jTextFieldDate2.setText(null);
                jTextFieldTime2.setText(null);
                jTextFieldClass.setText(null);
                jTextFieldPassengers2.setText(null);
                jTextFieldTicketType.setText(null);
            }
        }

        else if(jComboBoxDestination.getSelectedItem().equals("Bekasi") && jRadioButtonFirstClass1.isSelected()&& 
               jRadioButtonReturn1.isSelected() && (!(jTextFieldPassenger1.getText()== null)) ){
            int Pass = Integer.parseInt(jTextFieldPassenger1.getText());
     
            jTextFieldPassengers2.setText(jTextFieldPassenger1.getText());
            jTextFieldTo.setText("Bekasi");
            jTextFieldClass.setText("First Class");
            jTextFieldTicketType.setText("Round Trip");
            jTextFieldDate2.setText(jDateChooser.getDate().toString());
            jTextFieldForm.setText("Surabaya");
            
            jarak = 800;
            TTarif= (jarak*Tarif*2)+50000;
            Dtax = (Tax*TTarif)/100;
            SubTotal = (Dtax + TTarif)*Pass;
            String TotalTarif= String.format("%d",TTarif);
            String DisplayTax = String.format("%d",Dtax);
            String Stotal = String.format("%d",SubTotal);    
            jTextFieldTotal.setText(TotalTarif);
            jTextFieldTax.setText(DisplayTax);
            jTextFieldSubTotal.setText(Stotal);
            jTextFieldPrice.setText(Stotal);
            if(jComboBoxTime.getSelectedItem().equals("11:30")){
                jTextFieldTime2.setText("11:30");
            }else if(jComboBoxTime.getSelectedItem().equals("12:30")){
                jTextFieldTime2.setText("12:30");
            }
            else if(jComboBoxTime.getSelectedItem().equals("1:30")){
                jTextFieldTime2.setText("1:30");
            }
            else if(jComboBoxTime.getSelectedItem().equals("2:30")){
                jTextFieldTime2.setText("2:30");
            }
            else {
                jTextFieldTo.setText(null);
                jTextFieldTotal.setText(null);
                jTextFieldTax.setText(null);
                jTextFieldSubTotal.setText(null);
                jTextFieldPrice.setText(null);
                jTextFieldForm.setText(null);
                jTextFieldDate2.setText(null);
                jTextFieldTime2.setText(null);
                jTextFieldClass.setText(null);
                jTextFieldPassengers2.setText(null);
                jTextFieldTicketType.setText(null);
            }
        }
       
        else if(jComboBoxDestination.getSelectedItem().equals("Bekasi") && jRadioButtonEconomy1.isSelected()&& 
                jRadioButtonReturn1.isSelected()&& (!(jTextFieldPassenger1.getText()== null) )){
            int Pass = Integer.parseInt(jTextFieldPassenger1.getText());
      
      
            jTextFieldPassengers2.setText(jTextFieldPassenger1.getText());
            jTextFieldTo.setText("Bekasi");
            jTextFieldClass.setText("Economy");
            jTextFieldTicketType.setText("Round Trip");
            jTextFieldDate2.setText(jDateChooser.getDate().toString());
            jTextFieldForm.setText("Surabaya");
       
            jarak = 800;
            TTarif= jarak*Tarif*2;
            Dtax = (Tax*TTarif)/100;
            SubTotal = (Dtax + TTarif)*Pass;
            String TotalTarif= String.format("%d",TTarif);
            String DisplayTax = String.format("%d",Dtax);
            String Stotal = String.format("%d",SubTotal);    
            jTextFieldTotal.setText(TotalTarif);
            jTextFieldTax.setText(DisplayTax);
            jTextFieldSubTotal.setText(Stotal);
            jTextFieldPrice.setText(Stotal);
            if(jComboBoxTime.getSelectedItem().equals("11:30")){
                jTextFieldTime2.setText("11:30");
            }else if(jComboBoxTime.getSelectedItem().equals("12:30")){
                jTextFieldTime2.setText("12:30");
            }
            else if(jComboBoxTime.getSelectedItem().equals("1:30")){
                jTextFieldTime2.setText("1:30");
            }
            else if(jComboBoxTime.getSelectedItem().equals("2:30")){
                jTextFieldTime2.setText("2:30");
            }
            else if(jComboBoxTime.getSelectedItem().equals("Select Time")){
                jTextFieldTo.setText(null);
                jTextFieldTotal.setText(null);
                jTextFieldTax.setText(null);
                jTextFieldSubTotal.setText(null);
                jTextFieldPrice.setText(null);
                jTextFieldForm.setText(null);
                jTextFieldDate2.setText(null);
                jTextFieldTime2.setText(null);
                jTextFieldClass.setText(null);
                jTextFieldPassengers2.setText(null);
                jTextFieldTicketType.setText(null);
            }
        }
        
        else if(jComboBoxDestination.getSelectedItem().equals("Jakarta")&& jRadioButtonEconomy1.isSelected()&& 
               jRadioButtonSingle1.isSelected()&& (!(jTextFieldPassenger1.getText()== null) )){
            int Pass = Integer.parseInt(jTextFieldPassenger1.getText());
     
            jTextFieldPassengers2.setText(jTextFieldPassenger1.getText());
            jTextFieldTo.setText("Jakarta");
            jTextFieldClass.setText("Economy");
            jTextFieldTicketType.setText("single trip");       
            jTextFieldDate2.setText(jDateChooser.getDate().toString());
            jTextFieldForm.setText("Surabaya");
            
            jarak = 850;
            TTarif= jarak*Tarif;
            Dtax = (Tax*TTarif)/100;
            SubTotal = (Dtax + TTarif)*Pass;
            String TotalTarif= String.format("%d",TTarif);
            String DisplayTax = String.format("%d",Dtax);
            String Stotal = String.format("%d",SubTotal);    
            jTextFieldTotal.setText(TotalTarif);
            jTextFieldTax.setText(DisplayTax);
            jTextFieldSubTotal.setText(Stotal);
            jTextFieldPrice.setText(Stotal);
            if(jComboBoxTime.getSelectedItem().equals("11:30")){
                jTextFieldTime2.setText("11:30");
            }else if(jComboBoxTime.getSelectedItem().equals("12:30")){
                jTextFieldTime2.setText("12:30");
            }
            else if(jComboBoxTime.getSelectedItem().equals("1:30")){
                jTextFieldTime2.setText("1:30");
            }
            else if(jComboBoxTime.getSelectedItem().equals("2:30")){
                jTextFieldTime2.setText("2:30");
            }
            else {
                jTextFieldTo.setText(null);
                jTextFieldTotal.setText(null);
                jTextFieldTax.setText(null);
                jTextFieldSubTotal.setText(null);
                jTextFieldPrice.setText(null);
                jTextFieldForm.setText(null);
                jTextFieldDate2.setText(null);
                jTextFieldTime2.setText(null);
                jTextFieldClass.setText(null);
                jTextFieldPassengers2.setText(null);
                jTextFieldTicketType.setText(null);
            }
        }
        
        else if(jComboBoxDestination.getSelectedItem().equals("Jakarta") && jRadioButtonFirstClass1.isSelected() && 
               jRadioButtonSingle1.isSelected()&& (!(jTextFieldPassenger1.getText()== null) ) ){
            int Pass = Integer.parseInt(jTextFieldPassenger1.getText());
      
      
            jTextFieldPassengers2.setText(jTextFieldPassenger1.getText());
            jTextFieldTo.setText("Jakarta");
            jTextFieldClass.setText("First Class");
            jTextFieldTicketType.setText("single trip");
            jTextFieldDate2.setText(jDateChooser.getDate().toString());
            jTextFieldForm.setText("Surabaya");
            
            jarak = 850;
            TTarif= (jarak*Tarif)+50000;
            Dtax = (Tax*TTarif)/100;
            SubTotal = (Dtax + TTarif)*Pass;
            String TotalTarif= String.format("%d",TTarif);
            String DisplayTax = String.format("%d",Dtax);
            String Stotal = String.format("%d",SubTotal);    
            jTextFieldTotal.setText(TotalTarif);
            jTextFieldTax.setText(DisplayTax);
            jTextFieldSubTotal.setText(Stotal);
            jTextFieldPrice.setText(Stotal);
            if(jComboBoxTime.getSelectedItem().equals("11:30")){
                jTextFieldTime2.setText("11:30");
            }else if(jComboBoxTime.getSelectedItem().equals("12:30")){
                jTextFieldTime2.setText("12:30");
            }
            else if(jComboBoxTime.getSelectedItem().equals("1:30")){
                jTextFieldTime2.setText("1:30");
            }
            else if(jComboBoxTime.getSelectedItem().equals("2:30")){
                jTextFieldTime2.setText("2:30");
            }
            else{
                jTextFieldTo.setText(null);
                jTextFieldTotal.setText(null);
                jTextFieldTax.setText(null);
                jTextFieldSubTotal.setText(null);
                jTextFieldPrice.setText(null);
                jTextFieldForm.setText(null);
                jTextFieldDate2.setText(null);
                jTextFieldTime2.setText(null);
                jTextFieldClass.setText(null);
                jTextFieldPassengers2.setText(null);
                jTextFieldTicketType.setText(null);
            }
        }
        
        else if(jComboBoxDestination.getSelectedItem().equals("Jakarta")&& jRadioButtonEconomy1.isSelected()&& 
               jRadioButtonReturn1.isSelected() && (!(jTextFieldPassenger1.getText()== null) )){
            int Pass = Integer.parseInt(jTextFieldPassenger1.getText());
      
       
            jTextFieldPassengers2.setText(jTextFieldPassenger1.getText());
            jTextFieldTo.setText("Jakarta");
            jTextFieldClass.setText("Economy");
            jTextFieldTicketType.setText("Round Trip");
            jTextFieldDate2.setText(jDateChooser.getDate().toString());
            jTextFieldForm.setText("Surabaya");
       
            jarak = 850;
            TTarif= jarak*Tarif*2;
            Dtax = (Tax*TTarif)/100;
            SubTotal = (Dtax + TTarif)*Pass;
            String TotalTarif= String.format("%d",TTarif);
            String DisplayTax = String.format("%d",Dtax);
            String Stotal = String.format("%d",SubTotal);    
            jTextFieldTotal.setText(TotalTarif);
            jTextFieldTax.setText(DisplayTax);
            jTextFieldSubTotal.setText(Stotal);
            jTextFieldPrice.setText(Stotal);
            if(jComboBoxTime.getSelectedItem().equals("11:30")){
                jTextFieldTime2.setText("11:30");
            }else if(jComboBoxTime.getSelectedItem().equals("12:30")){
                jTextFieldTime2.setText("12:30");
            }
            else if(jComboBoxTime.getSelectedItem().equals("1:30")){
                jTextFieldTime2.setText("1:30");
            }
            else if(jComboBoxTime.getSelectedItem().equals("2:30")){
                jTextFieldTime2.setText("2:30");
            }
            else {
                jTextFieldTo.setText(null);
                jTextFieldTotal.setText(null);
                jTextFieldTax.setText(null);
                jTextFieldSubTotal.setText(null);
                jTextFieldPrice.setText(null);
                jTextFieldForm.setText(null);
                jTextFieldDate2.setText(null);
                jTextFieldTime2.setText(null);
                jTextFieldClass.setText(null);
                jTextFieldPassengers2.setText(null);
                jTextFieldTicketType.setText(null);
            }
        }
        
        else if(jComboBoxDestination.getSelectedItem().equals("Jakarta") && jRadioButtonFirstClass1.isSelected() && 
               jRadioButtonReturn1.isSelected()&& (!(jTextFieldPassenger1.getText()== null) ) ){
            int Pass = Integer.parseInt(jTextFieldPassenger1.getText());
     
            jTextFieldPassengers2.setText(jTextFieldPassenger1.getText());
            jTextFieldTo.setText("Jakarta");
            jTextFieldClass.setText("First Class");
            jTextFieldTicketType.setText("Round Trip");
            jTextFieldDate2.setText(jDateChooser.getDate().toString());
            jTextFieldForm.setText("Surabaya");
       
            jarak = 850;
            TTarif= (jarak*Tarif*2)+50000;
            Dtax = (Tax*TTarif)/100;
            SubTotal = (Dtax + TTarif)*Pass;
            String TotalTarif= String.format("%d",TTarif);
            String DisplayTax = String.format("%d",Dtax);
            String Stotal = String.format("%d",SubTotal);    
            jTextFieldTotal.setText(TotalTarif);
            jTextFieldTax.setText(DisplayTax);
            jTextFieldSubTotal.setText(Stotal);
            jTextFieldPrice.setText(Stotal);
            if(jComboBoxTime.getSelectedItem().equals("11:30")){
                jTextFieldTime2.setText("11:30");
            }
            else if(jComboBoxTime.getSelectedItem().equals("12:30")){
                jTextFieldTime2.setText("12:30");
            }
            else if(jComboBoxTime.getSelectedItem().equals("1:30")){
                jTextFieldTime2.setText("1:30");
            }
            else if(jComboBoxTime.getSelectedItem().equals("2:30")){
                jTextFieldTime2.setText("2:30");
            }
            else {
                jTextFieldTo.setText(null);
                jTextFieldTotal.setText(null);
                jTextFieldTax.setText(null);
                jTextFieldSubTotal.setText(null);
                jTextFieldPrice.setText(null);
                jTextFieldForm.setText(null);
                jTextFieldDate2.setText(null);
                jTextFieldTime2.setText(null);
                jTextFieldClass.setText(null);
                jTextFieldPassengers2.setText(null);
                jTextFieldTicketType.setText(null);
            }
        }
        
        else if(jComboBoxDestination.getSelectedItem().equals("Merak") && jRadioButtonEconomy1.isSelected() 
               && jRadioButtonReturn1.isSelected()&& (!(jTextFieldPassenger1.getText()== null) )){
            int Pass = Integer.parseInt(jTextFieldPassenger1.getText());
      
            jTextFieldPassengers2.setText(jTextFieldPassenger1.getText());
            jTextFieldTo.setText("Merak");
            jTextFieldClass.setText("Economy");
            jTextFieldTicketType.setText("Round Trip");
            jTextFieldDate2.setText(jDateChooser.getDate().toString());
            jTextFieldForm.setText("Surabaya");
       
            jarak = 110050;
            TTarif= jarak*Tarif*2;
            Dtax = (Tax*TTarif)/100;
            SubTotal = (Dtax + TTarif)*Pass;
            String TotalTarif= String.format("%d",TTarif);
            String DisplayTax = String.format("%d",Dtax);
            String Stotal = String.format("%d",SubTotal);    
            jTextFieldTotal.setText(TotalTarif);
            jTextFieldTax.setText(DisplayTax);
            jTextFieldSubTotal.setText(Stotal);
            jTextFieldPrice.setText(Stotal);
            if(jComboBoxTime.getSelectedItem().equals("11:30")){
                jTextFieldTime2.setText("11:30");
            }
            else if(jComboBoxTime.getSelectedItem().equals("12:30")){
                jTextFieldTime2.setText("12:30");
            }
            else if(jComboBoxTime.getSelectedItem().equals("1:30")){
                jTextFieldTime2.setText("1:30");
            }
            else if(jComboBoxTime.getSelectedItem().equals("2:30")){
                jTextFieldTime2.setText("2:30");
            }
            else {
                jTextFieldTo.setText(null);
                jTextFieldTotal.setText(null);
                jTextFieldTax.setText(null);
                jTextFieldSubTotal.setText(null);
                jTextFieldPrice.setText(null);
                jTextFieldForm.setText(null);
                jTextFieldDate2.setText(null);
                jTextFieldTime2.setText(null);
                jTextFieldClass.setText(null);
                jTextFieldPassengers2.setText(null);
                jTextFieldTicketType.setText(null);
            }
        }
        
        else if(jComboBoxDestination.getSelectedItem().equals("Merak") && jRadioButtonFirstClass1.isSelected()
                   && jRadioButtonReturn1.isSelected() && (!(jTextFieldPassenger1.getText()== null) )){
            int Pass = Integer.parseInt(jTextFieldPassenger1.getText());
      
            jTextFieldPassengers2.setText(jTextFieldPassenger1.getText());
            jTextFieldTo.setText("Merak");
            jTextFieldClass.setText("First Class");
            jTextFieldTicketType.setText("Round Trip");
            jTextFieldDate2.setText(jDateChooser.getDate().toString());
            jTextFieldForm.setText("Surabaya");
       
            jarak = 110050;
            TTarif= (jarak*Tarif*2)+50000;
            Dtax = (Tax*TTarif)/100;
            SubTotal = (Dtax + TTarif)*Pass;
            String TotalTarif= String.format("%d",TTarif);
            String DisplayTax = String.format("%d",Dtax);
            String Stotal = String.format("%d",SubTotal);    
            jTextFieldTotal.setText(TotalTarif);
            jTextFieldTax.setText(DisplayTax);
            jTextFieldSubTotal.setText(Stotal);
            jTextFieldPrice.setText(Stotal);
            if(jComboBoxTime.getSelectedItem().equals("11:30")){
                jTextFieldTime2.setText("11:30");
            }
            else if(jComboBoxTime.getSelectedItem().equals("12:30")){
                jTextFieldTime2.setText("12:30");
            }
            else if(jComboBoxTime.getSelectedItem().equals("1:30")){
                jTextFieldTime2.setText("1:30");
            }
            else if(jComboBoxTime.getSelectedItem().equals("2:30")){
                jTextFieldTime2.setText("2:30");
            }
            else {
                jTextFieldTo.setText(null);
                jTextFieldTotal.setText(null);
                jTextFieldTax.setText(null);
                jTextFieldSubTotal.setText(null);
                jTextFieldPrice.setText(null);
                jTextFieldForm.setText(null);
                jTextFieldDate2.setText(null);
                jTextFieldTime2.setText(null);
                jTextFieldClass.setText(null);
                jTextFieldPassengers2.setText(null);
                jTextFieldTicketType.setText(null);
            }
        }
        
        else if(jComboBoxDestination.getSelectedItem().equals("Merak") && jRadioButtonEconomy1.isSelected()
               && jRadioButtonSingle1.isSelected()&& (!(jTextFieldPassenger1.getText()== null) )){
            int Pass = Integer.parseInt(jTextFieldPassenger1.getText());
      
            jTextFieldPassengers2.setText(jTextFieldPassenger1.getText());
            jTextFieldTo.setText("Merak");
            jTextFieldClass.setText("Economy");
            jTextFieldTicketType.setText("single trip");
            jTextFieldDate2.setText(jDateChooser.getDate().toString());
            jTextFieldForm.setText("Surabaya");
      
            jarak = 110050;
            TTarif= jarak*Tarif;
            Dtax = (Tax*TTarif)/100;
            SubTotal = (Dtax + TTarif)*Pass;
            String TotalTarif= String.format("%d",TTarif);
            String DisplayTax = String.format("%d",Dtax);
            String Stotal = String.format("%d",SubTotal);    
            jTextFieldTotal.setText(TotalTarif);
            jTextFieldTax.setText(DisplayTax);
            jTextFieldSubTotal.setText(Stotal);
            jTextFieldPrice.setText(Stotal);
            if(jComboBoxTime.getSelectedItem().equals("11:30")){
                jTextFieldTime2.setText("11:30");
            }
            else if(jComboBoxTime.getSelectedItem().equals("12:30")){
                jTextFieldTime2.setText("12:30");
            }
            else if(jComboBoxTime.getSelectedItem().equals("1:30")){
                jTextFieldTime2.setText("1:30");
            }
            else if(jComboBoxTime.getSelectedItem().equals("2:30")){
                jTextFieldTime2.setText("2:30");
            }
            else {
                jTextFieldTo.setText(null);
                jTextFieldTotal.setText(null);
                jTextFieldTax.setText(null);
                jTextFieldSubTotal.setText(null);
                jTextFieldPrice.setText(null);
                jTextFieldForm.setText(null);
                jTextFieldDate2.setText(null);
                jTextFieldTime2.setText(null);
                jTextFieldClass.setText(null);
                jTextFieldPassengers2.setText(null);
                jTextFieldTicketType.setText(null);
            }
        }
        
        else if(jComboBoxDestination.getSelectedItem().equals("Merak") && jRadioButtonFirstClass1.isSelected()
                   && jRadioButtonSingle1.isSelected()&& (!(jTextFieldPassenger1.getText()== null) ) ){
            int Pass = Integer.parseInt(jTextFieldPassenger1.getText());
      
      
            jTextFieldPassengers2.setText(jTextFieldPassenger1.getText());
            jTextFieldTo.setText("Merak");
            jTextFieldClass.setText("First Class");
            jTextFieldTicketType.setText("single trip");
            jTextFieldDate2.setText(jDateChooser.getDate().toString());
            jTextFieldForm.setText("Surabaya");
      
            jarak = 110050;
            TTarif= (jarak*Tarif)+50000;
            Dtax = (Tax*TTarif)/100;
            SubTotal = (Dtax + TTarif)*Pass;
            String TotalTarif= String.format("%d",TTarif);
            String DisplayTax = String.format("%d",Dtax);
            String Stotal = String.format("%d",SubTotal);    
            jTextFieldTotal.setText(TotalTarif);
            jTextFieldTax.setText(DisplayTax);
            jTextFieldSubTotal.setText(Stotal);
            jTextFieldPrice.setText(Stotal);
            if(jComboBoxTime.getSelectedItem().equals("11:30")){
                jTextFieldTime2.setText("11:30");
            }
            else if(jComboBoxTime.getSelectedItem().equals("12:30")){
                jTextFieldTime2.setText("12:30");
            }
            else if(jComboBoxTime.getSelectedItem().equals("1:30")){
                jTextFieldTime2.setText("1:30");
            }
            else if(jComboBoxTime.getSelectedItem().equals("2:30")){
                jTextFieldTime2.setText("2:30");
            }
            else {
                jTextFieldTo.setText(null);
                jTextFieldTotal.setText(null);
                jTextFieldTax.setText(null);
                jTextFieldSubTotal.setText(null);
                jTextFieldPrice.setText(null);
                jTextFieldForm.setText(null);
                jTextFieldDate2.setText(null);
                jTextFieldTime2.setText(null);
                jTextFieldClass.setText(null);
                jTextFieldPassengers2.setText(null);
                jTextFieldTicketType.setText(null);
            }
        }
        
        else if(jComboBoxDestination.getSelectedItem().equals("Jambi")&& jRadioButtonEconomy1.isSelected()
               && jRadioButtonSingle1.isSelected()&& (!(jTextFieldPassenger1.getText()== null) )){
            int Pass = Integer.parseInt(jTextFieldPassenger1.getText());
   
            jTextFieldPassengers2.setText(jTextFieldPassenger1.getText());
            jTextFieldTo.setText("Jambi");
            jTextFieldClass.setText("Economy");
            jTextFieldTicketType.setText("single trip");
            jTextFieldDate2.setText(jDateChooser.getDate().toString());
            jTextFieldForm.setText("Surabaya");
       
            jarak = 1000;
            TTarif= jarak*Tarif;
            Dtax = (Tax*TTarif)/100;
            SubTotal = (Dtax + TTarif)*Pass;
            String TotalTarif= String.format("%d",TTarif);
            String DisplayTax = String.format("%d",Dtax);
            String Stotal = String.format("%d",SubTotal);    
            jTextFieldTotal.setText(TotalTarif);
            jTextFieldTax.setText(DisplayTax);
            jTextFieldSubTotal.setText(Stotal);
            jTextFieldPrice.setText(Stotal);
            if(jComboBoxTime.getSelectedItem().equals("11:30")){
                jTextFieldTime2.setText("11:30");
            }
            else if(jComboBoxTime.getSelectedItem().equals("12:30")){
                jTextFieldTime2.setText("12:30");
            }
            else if(jComboBoxTime.getSelectedItem().equals("1:30")){
                jTextFieldTime2.setText("1:30");
            }
            else if(jComboBoxTime.getSelectedItem().equals("2:30")){
                jTextFieldTime2.setText("2:30");
            }
            else {
                jTextFieldTo.setText(null);
                jTextFieldTotal.setText(null);
                jTextFieldTax.setText(null);
                jTextFieldSubTotal.setText(null);
                jTextFieldPrice.setText(null);
                jTextFieldForm.setText(null);
                jTextFieldDate2.setText(null);
                jTextFieldTime2.setText(null);
                jTextFieldClass.setText(null);
                jTextFieldPassengers2.setText(null);
                jTextFieldTicketType.setText(null);
            }
        }
        
        else if(jComboBoxDestination.getSelectedItem().equals("Jambi") && jRadioButtonFirstClass1.isSelected()
                  && jRadioButtonReturn1.isSelected()&& (!(jTextFieldPassenger1.getText()== null) ) ){
            int Pass = Integer.parseInt(jTextFieldPassenger1.getText());
      
     
            jTextFieldPassengers2.setText(jTextFieldPassenger1.getText());
            jTextFieldTo.setText("Jambi");
            jTextFieldClass.setText("First Class");
            jTextFieldTicketType.setText("Round Trip");
            jTextFieldDate2.setText(jDateChooser.getDate().toString());
            jTextFieldForm.setText("Surabaya");
       
            jarak = 1000;
            TTarif= (jarak*Tarif*2)+50000;
            Dtax = (Tax*TTarif)/100;
            SubTotal = (Dtax + TTarif)*(Pass);
            String TotalTarif= String.format("%d",TTarif);
            String DisplayTax = String.format("%d",Dtax);
            String Stotal = String.format("%d",SubTotal);    
            jTextFieldTotal.setText(TotalTarif);
            jTextFieldTax.setText(DisplayTax);
            jTextFieldSubTotal.setText(Stotal);
            jTextFieldPrice.setText(Stotal);
            if(jComboBoxTime.getSelectedItem().equals("11:30")){
                jTextFieldTime2.setText("11:30");
            }
            else if(jComboBoxTime.getSelectedItem().equals("12:30")){
                jTextFieldTime2.setText("12:30");
            }
            else if(jComboBoxTime.getSelectedItem().equals("1:30")){
                jTextFieldTime2.setText("1:30");
            }
            else if(jComboBoxTime.getSelectedItem().equals("2:30")){
                jTextFieldTime2.setText("2:30");
            }
            else {
                jTextFieldTo.setText(null);
                jTextFieldTotal.setText(null);
                jTextFieldTax.setText(null);
                jTextFieldSubTotal.setText(null);
                jTextFieldPrice.setText(null);
                jTextFieldForm.setText(null);
                jTextFieldDate2.setText(null);
                jTextFieldTime2.setText(null);
                jTextFieldClass.setText(null);
                jTextFieldPassengers2.setText(null);
                jTextFieldTicketType.setText(null);
            }
        }
        
        else if(jComboBoxDestination.getSelectedItem().equals("Jambi")&& jRadioButtonEconomy1.isSelected()
               && jRadioButtonReturn1.isSelected()&& (!(jTextFieldPassenger1.getText()== null) )){
            int Pass = Integer.parseInt(jTextFieldPassenger1.getText());
      
            jTextFieldPassengers2.setText(jTextFieldPassenger1.getText());
            jTextFieldTo.setText("Jambi");
            jTextFieldClass.setText("Economy");
            jTextFieldTicketType.setText("Round Trip");
            jTextFieldDate2.setText(jDateChooser.getDate().toString());
            jTextFieldForm.setText("Surabaya");
       
            jarak = 1000;
            TTarif= jarak*Tarif*2;
            Dtax = (Tax*TTarif)/100;
            SubTotal = (Dtax + TTarif)*Pass;
            String TotalTarif= String.format("%d",TTarif);
            String DisplayTax = String.format("%d",Dtax);
            String Stotal = String.format("%d",SubTotal);    
            jTextFieldTotal.setText(TotalTarif);
            jTextFieldTax.setText(DisplayTax);
            jTextFieldSubTotal.setText(Stotal);
            jTextFieldPrice.setText(Stotal);
            if(jComboBoxTime.getSelectedItem().equals("11:30")){
                jTextFieldTime2.setText("11:30");
            }
            else if(jComboBoxTime.getSelectedItem().equals("12:30")){
                jTextFieldTime2.setText("12:30");
            }
            else if(jComboBoxTime.getSelectedItem().equals("1:30")){
                jTextFieldTime2.setText("1:30");
            }
            else if(jComboBoxTime.getSelectedItem().equals("2:30")){
                jTextFieldTime2.setText("2:30");
            }
            else {
                jTextFieldTo.setText(null);
                jTextFieldTotal.setText(null);
                jTextFieldTax.setText(null);
                jTextFieldSubTotal.setText(null);
                jTextFieldPrice.setText(null);
                jTextFieldForm.setText(null);
                jTextFieldDate2.setText(null);
                jTextFieldTime2.setText(null);
                jTextFieldClass.setText(null);
                jTextFieldPassengers2.setText(null);
                jTextFieldTicketType.setText(null);
            }
        }
        
        else if(jComboBoxDestination.getSelectedItem().equals("Jambi") && jRadioButtonFirstClass1.isSelected()
                  && jRadioButtonSingle1.isSelected()&& (!(jTextFieldPassenger1.getText()== null) ) ){
            int Pass = Integer.parseInt(jTextFieldPassenger1.getText());
      
            jTextFieldPassengers2.setText(jTextFieldPassenger1.getText());
            jTextFieldTo.setText("Jambi");
            jTextFieldClass.setText("First Class");
            jTextFieldTicketType.setText("single trip");
            jTextFieldDate2.setText(jDateChooser.getDate().toString());
            jTextFieldForm.setText("Surabaya");
      
            jarak = 1000;
            TTarif= (jarak*Tarif)+50000;
            Dtax = (Tax*TTarif)/100;
            SubTotal = (Dtax + TTarif)*(Pass);
            String TotalTarif= String.format("%d",TTarif);
            String DisplayTax = String.format("%d",Dtax);
            String Stotal = String.format("%d",SubTotal);    
            jTextFieldTotal.setText(TotalTarif);
            jTextFieldTax.setText(DisplayTax);
            jTextFieldSubTotal.setText(Stotal);
            jTextFieldPrice.setText(Stotal);
            if(jComboBoxTime.getSelectedItem().equals("11:30")){
                jTextFieldTime2.setText("11:30");
            }
            else if(jComboBoxTime.getSelectedItem().equals("12:30")){
                jTextFieldTime2.setText("12:30");
            }
            else if(jComboBoxTime.getSelectedItem().equals("1:30")){
                jTextFieldTime2.setText("1:30");
            }
            else if(jComboBoxTime.getSelectedItem().equals("2:30")){
                jTextFieldTime2.setText("2:30");
            }
            else {
                jTextFieldTo.setText(null);
                jTextFieldTotal.setText(null);
                jTextFieldTax.setText(null);
                jTextFieldSubTotal.setText(null);
                jTextFieldPrice.setText(null);
                jTextFieldForm.setText(null);
                jTextFieldDate2.setText(null);
                jTextFieldTime2.setText(null);
                jTextFieldClass.setText(null);
                jTextFieldPassengers2.setText(null);
                jTextFieldTicketType.setText(null);
            }
        }
        
        else if(jComboBoxDestination.getSelectedItem().equals("Palembang")&& jRadioButtonEconomy1.isSelected()
               && jRadioButtonSingle1.isSelected()&& (!(jTextFieldPassenger1.getText()== null) )){
            int Pass = Integer.parseInt(jTextFieldPassenger1.getText());
     
            jTextFieldPassengers2.setText(jTextFieldPassenger1.getText());
            jTextFieldTo.setText("Palembang");
            jTextFieldClass.setText("Economy");
            jTextFieldTicketType.setText("single trip");
            jTextFieldDate2.setText(jDateChooser.getDate().toString());
            jTextFieldForm.setText("Surabaya");
      
            jarak = 1100;
            TTarif= jarak*Tarif;
            Dtax = (Tax*TTarif)/100;
            SubTotal = (Dtax + TTarif)*Pass;
            String TotalTarif= String.format("%d",TTarif);
            String DisplayTax = String.format("%d",Dtax);
            String Stotal = String.format("%d",SubTotal);    
            jTextFieldTotal.setText(TotalTarif);
            jTextFieldTax.setText(DisplayTax);
            jTextFieldSubTotal.setText(Stotal);
            jTextFieldPrice.setText(Stotal);
            if(jComboBoxTime.getSelectedItem().equals("11:30")){
                jTextFieldTime2.setText("11:30");
            }
            else if(jComboBoxTime.getSelectedItem().equals("12:30")){
                jTextFieldTime2.setText("12:30");
            }
            else if(jComboBoxTime.getSelectedItem().equals("1:30")){
                jTextFieldTime2.setText("1:30");
            }
            else if(jComboBoxTime.getSelectedItem().equals("2:30")){
                jTextFieldTime2.setText("2:30");
            }
            else {
                jTextFieldTo.setText(null);
                jTextFieldTotal.setText(null);
                jTextFieldTax.setText(null);
                jTextFieldSubTotal.setText(null);
                jTextFieldPrice.setText(null);
                jTextFieldForm.setText(null);
                jTextFieldDate2.setText(null);
                jTextFieldTime2.setText(null);
                jTextFieldClass.setText(null);
                jTextFieldPassengers2.setText(null);
                jTextFieldTicketType.setText(null);
            }
        }
        
        else if(jComboBoxDestination.getSelectedItem().equals("Palembang") && jRadioButtonFirstClass1.isSelected()
               && jRadioButtonSingle1.isSelected()&& (!(jTextFieldPassenger1.getText()== null) ) ){
            int Pass = Integer.parseInt(jTextFieldPassenger1.getText());
     
            jTextFieldPassengers2.setText(jTextFieldPassenger1.getText());
            jTextFieldTo.setText("Palembang");
            jTextFieldClass.setText("First Class");
            jTextFieldTicketType.setText("single trip");
            jTextFieldDate2.setText(jDateChooser.getDate().toString());
            jTextFieldForm.setText("Surabaya");
      
            jarak = 1100;
            TTarif= (jarak*Tarif)+50000;
            Dtax = (Tax*TTarif)/100;
            SubTotal = (Dtax + TTarif)*Pass;
            String TotalTarif= String.format("%d",TTarif);
            String DisplayTax = String.format("%d",Dtax);
            String Stotal = String.format("%d",SubTotal);    
            jTextFieldTotal.setText(TotalTarif);
            jTextFieldTax.setText(DisplayTax);
            jTextFieldSubTotal.setText(Stotal);
            jTextFieldPrice.setText(Stotal);
            if(jComboBoxTime.getSelectedItem().equals("11:30")){
                jTextFieldTime2.setText("11:30");
            }
            else if(jComboBoxTime.getSelectedItem().equals("12:30")){
                jTextFieldTime2.setText("12:30");
            }
            else if(jComboBoxTime.getSelectedItem().equals("1:30")){
                jTextFieldTime2.setText("1:30");
            }
            else if(jComboBoxTime.getSelectedItem().equals("2:30")){
                jTextFieldTime2.setText("2:30");
            }
            else {
                jTextFieldTo.setText(null);
                jTextFieldTotal.setText(null);
                jTextFieldTax.setText(null);
                jTextFieldSubTotal.setText(null);
                jTextFieldPrice.setText(null);
                jTextFieldForm.setText(null);
                jTextFieldDate2.setText(null);
                jTextFieldTime2.setText(null);
                jTextFieldClass.setText(null);
                jTextFieldPassengers2.setText(null);
                jTextFieldTicketType.setText(null);
            }
        }
        
        else if(jComboBoxDestination.getSelectedItem().equals("Palembang")&& jRadioButtonEconomy1.isSelected()
               && jRadioButtonReturn1.isSelected()&& (!(jTextFieldPassenger1.getText()== null) )){
            int Pass = Integer.parseInt(jTextFieldPassenger1.getText());
     
            jTextFieldPassengers2.setText(jTextFieldPassenger1.getText());
            jTextFieldTo.setText("Palembang");
            jTextFieldClass.setText("Economy");
            jTextFieldTicketType.setText("Round Trip");
            jTextFieldDate2.setText(jDateChooser.getDate().toString());
            jTextFieldForm.setText("Surabaya");
       
            jarak = 1100;
            TTarif= jarak*Tarif*2;
            Dtax = (Tax*TTarif)/100;
            SubTotal = (Dtax + TTarif)*Pass;
            String TotalTarif= String.format("%d",TTarif);
            String DisplayTax = String.format("%d",Dtax);
            String Stotal = String.format("%d",SubTotal);    
            jTextFieldTotal.setText(TotalTarif);
            jTextFieldTax.setText(DisplayTax);
            jTextFieldSubTotal.setText(Stotal);
            jTextFieldPrice.setText(Stotal);
            if(jComboBoxTime.getSelectedItem().equals("11:30")){
                jTextFieldTime2.setText("11:30");
            }
            else if(jComboBoxTime.getSelectedItem().equals("12:30")){
                jTextFieldTime2.setText("12:30");
            }
            else if(jComboBoxTime.getSelectedItem().equals("1:30")){
                jTextFieldTime2.setText("1:30");
            }
            else if(jComboBoxTime.getSelectedItem().equals("2:30")){
                jTextFieldTime2.setText("2:30");
            }
            else {
                jTextFieldTo.setText(null);
                jTextFieldTotal.setText(null);
                jTextFieldTax.setText(null);
                jTextFieldSubTotal.setText(null);
                jTextFieldPrice.setText(null);
                jTextFieldForm.setText(null);
                jTextFieldDate2.setText(null);
                jTextFieldTime2.setText(null);
                jTextFieldClass.setText(null);
                jTextFieldPassengers2.setText(null);
                jTextFieldTicketType.setText(null);
            }
         
        }
        
        else if(jComboBoxDestination.getSelectedItem().equals("Pekanbaru")&& jRadioButtonEconomy1.isSelected()
               && jRadioButtonSingle1.isSelected()&& (!(jTextFieldPassenger1.getText()== null) )){
            int Pass = Integer.parseInt(jTextFieldPassenger1.getText());
   
            jTextFieldPassengers2.setText(jTextFieldPassenger1.getText());
            jTextFieldTo.setText("Pekanbaru");
            jTextFieldClass.setText("Economy");
            jTextFieldTicketType.setText("single trip");
            jTextFieldDate2.setText(jDateChooser.getDate().toString());
            jTextFieldForm.setText("Surabaya");
       
            jarak = 1200;
            TTarif= jarak*Tarif;
            Dtax = (Tax*TTarif)/100;
            SubTotal = (Dtax + TTarif)*Pass;
            String TotalTarif= String.format("%d",TTarif);
            String DisplayTax = String.format("%d",Dtax);
            String Stotal = String.format("%d",SubTotal);    
            jTextFieldTotal.setText(TotalTarif);
            jTextFieldTax.setText(DisplayTax);
            jTextFieldSubTotal.setText(Stotal);
            jTextFieldPrice.setText(Stotal);
            if(jComboBoxTime.getSelectedItem().equals("11:30")){
                jTextFieldTime2.setText("11:30");
            }
            else if(jComboBoxTime.getSelectedItem().equals("12:30")){
                jTextFieldTime2.setText("12:30");
            }
            else if(jComboBoxTime.getSelectedItem().equals("1:30")){
                jTextFieldTime2.setText("1:30");
            }
            else if(jComboBoxTime.getSelectedItem().equals("2:30")){
                jTextFieldTime2.setText("2:30");
            }
            else {
                jTextFieldTo.setText(null);
                jTextFieldTotal.setText(null);
                jTextFieldTax.setText(null);
                jTextFieldSubTotal.setText(null);
                jTextFieldPrice.setText(null);
                jTextFieldForm.setText(null);
                jTextFieldDate2.setText(null);
                jTextFieldTime2.setText(null);
                jTextFieldClass.setText(null);
                jTextFieldPassengers2.setText(null);
                jTextFieldTicketType.setText(null);
            }
        }
        
        else if(jComboBoxDestination.getSelectedItem().equals("Pekanbaru") && jRadioButtonFirstClass1.isSelected()
                  && jRadioButtonReturn1.isSelected()&& (!(jTextFieldPassenger1.getText()== null) ) ){
            int Pass = Integer.parseInt(jTextFieldPassenger1.getText());
      
     
            jTextFieldPassengers2.setText(jTextFieldPassenger1.getText());
            jTextFieldTo.setText("Pekanbaru");
            jTextFieldClass.setText("First Class");
            jTextFieldTicketType.setText("Round Trip");
            jTextFieldDate2.setText(jDateChooser.getDate().toString());
            jTextFieldForm.setText("Surabaya");
       
            jarak = 1200;
            TTarif= (jarak*Tarif*2)+50000;
            Dtax = (Tax*TTarif)/100;
            SubTotal = (Dtax + TTarif)*(Pass);
            String TotalTarif= String.format("%d",TTarif);
            String DisplayTax = String.format("%d",Dtax);
            String Stotal = String.format("%d",SubTotal);    
            jTextFieldTotal.setText(TotalTarif);
            jTextFieldTax.setText(DisplayTax);
            jTextFieldSubTotal.setText(Stotal);
            jTextFieldPrice.setText(Stotal);
            if(jComboBoxTime.getSelectedItem().equals("11:30")){
                jTextFieldTime2.setText("11:30");
            }
            else if(jComboBoxTime.getSelectedItem().equals("12:30")){
                jTextFieldTime2.setText("12:30");
            }
            else if(jComboBoxTime.getSelectedItem().equals("1:30")){
                jTextFieldTime2.setText("1:30");
            }
            else if(jComboBoxTime.getSelectedItem().equals("2:30")){
                jTextFieldTime2.setText("2:30");
            }
            else {
                jTextFieldTo.setText(null);
                jTextFieldTotal.setText(null);
                jTextFieldTax.setText(null);
                jTextFieldSubTotal.setText(null);
                jTextFieldPrice.setText(null);
                jTextFieldForm.setText(null);
                jTextFieldDate2.setText(null);
                jTextFieldTime2.setText(null);
                jTextFieldClass.setText(null);
                jTextFieldPassengers2.setText(null);
                jTextFieldTicketType.setText(null);
            }
        }
        
        else if(jComboBoxDestination.getSelectedItem().equals("Pekanbaru")&& jRadioButtonEconomy1.isSelected()
               && jRadioButtonReturn1.isSelected()&& (!(jTextFieldPassenger1.getText()== null) )){
            int Pass = Integer.parseInt(jTextFieldPassenger1.getText());
      
            jTextFieldPassengers2.setText(jTextFieldPassenger1.getText());
            jTextFieldTo.setText("Pekanbaru");
            jTextFieldClass.setText("Economy");
            jTextFieldTicketType.setText("Round Trip");
            jTextFieldDate2.setText(jDateChooser.getDate().toString());
            jTextFieldForm.setText("Surabaya");
       
            jarak = 1200;
            TTarif= jarak*Tarif*2;
            Dtax = (Tax*TTarif)/100;
            SubTotal = (Dtax + TTarif)*Pass;
            String TotalTarif= String.format("%d",TTarif);
            String DisplayTax = String.format("%d",Dtax);
            String Stotal = String.format("%d",SubTotal);    
            jTextFieldTotal.setText(TotalTarif);
            jTextFieldTax.setText(DisplayTax);
            jTextFieldSubTotal.setText(Stotal);
            jTextFieldPrice.setText(Stotal);
            if(jComboBoxTime.getSelectedItem().equals("11:30")){
                jTextFieldTime2.setText("11:30");
            }
            else if(jComboBoxTime.getSelectedItem().equals("12:30")){
                jTextFieldTime2.setText("12:30");
            }
            else if(jComboBoxTime.getSelectedItem().equals("1:30")){
                jTextFieldTime2.setText("1:30");
            }
            else if(jComboBoxTime.getSelectedItem().equals("2:30")){
                jTextFieldTime2.setText("2:30");
            }
            else {
                jTextFieldTo.setText(null);
                jTextFieldTotal.setText(null);
                jTextFieldTax.setText(null);
                jTextFieldSubTotal.setText(null);
                jTextFieldPrice.setText(null);
                jTextFieldForm.setText(null);
                jTextFieldDate2.setText(null);
                jTextFieldTime2.setText(null);
                jTextFieldClass.setText(null);
                jTextFieldPassengers2.setText(null);
                jTextFieldTicketType.setText(null);
            }
        }
        
        else if(jComboBoxDestination.getSelectedItem().equals("Pekanbaru") && jRadioButtonFirstClass1.isSelected()
                  && jRadioButtonSingle1.isSelected()&& (!(jTextFieldPassenger1.getText()== null) ) ){
            int Pass = Integer.parseInt(jTextFieldPassenger1.getText());
      
            jTextFieldPassengers2.setText(jTextFieldPassenger1.getText());
            jTextFieldTo.setText("Pekanbaru");
            jTextFieldClass.setText("First Class");
            jTextFieldTicketType.setText("single trip");
            jTextFieldDate2.setText(jDateChooser.getDate().toString());
            jTextFieldForm.setText("Surabaya");
      
            jarak = 1200;
            TTarif= (jarak*Tarif)+50000;
            Dtax = (Tax*TTarif)/100;
            SubTotal = (Dtax + TTarif)*(Pass);
            String TotalTarif= String.format("%d",TTarif);
            String DisplayTax = String.format("%d",Dtax);
            String Stotal = String.format("%d",SubTotal);    
            jTextFieldTotal.setText(TotalTarif);
            jTextFieldTax.setText(DisplayTax);
            jTextFieldSubTotal.setText(Stotal);
            jTextFieldPrice.setText(Stotal);
            if(jComboBoxTime.getSelectedItem().equals("11:30")){
                jTextFieldTime2.setText("11:30");
            }
            else if(jComboBoxTime.getSelectedItem().equals("12:30")){
                jTextFieldTime2.setText("12:30");
            }
            else if(jComboBoxTime.getSelectedItem().equals("1:30")){
                jTextFieldTime2.setText("1:30");
            }
            else if(jComboBoxTime.getSelectedItem().equals("2:30")){
                jTextFieldTime2.setText("2:30");
            }
            else {
                jTextFieldTo.setText(null);
                jTextFieldTotal.setText(null);
                jTextFieldTax.setText(null);
                jTextFieldSubTotal.setText(null);
                jTextFieldPrice.setText(null);
                jTextFieldForm.setText(null);
                jTextFieldDate2.setText(null);
                jTextFieldTime2.setText(null);
                jTextFieldClass.setText(null);
                jTextFieldPassengers2.setText(null);
                jTextFieldTicketType.setText(null);
            }
        }
        
        else if(jComboBoxDestination.getSelectedItem().equals("Riau")&& jRadioButtonEconomy1.isSelected()
               && jRadioButtonSingle1.isSelected()&& (!(jTextFieldPassenger1.getText()== null) )){
            int Pass = Integer.parseInt(jTextFieldPassenger1.getText());
   
            jTextFieldPassengers2.setText(jTextFieldPassenger1.getText());
            jTextFieldTo.setText("Riau");
            jTextFieldClass.setText("Economy");
            jTextFieldTicketType.setText("single trip");
            jTextFieldDate2.setText(jDateChooser.getDate().toString());
            jTextFieldForm.setText("Surabaya");
       
            jarak = 1300;
            TTarif= jarak*Tarif;
            Dtax = (Tax*TTarif)/100;
            SubTotal = (Dtax + TTarif)*Pass;
            String TotalTarif= String.format("%d",TTarif);
            String DisplayTax = String.format("%d",Dtax);
            String Stotal = String.format("%d",SubTotal);    
            jTextFieldTotal.setText(TotalTarif);
            jTextFieldTax.setText(DisplayTax);
            jTextFieldSubTotal.setText(Stotal);
            jTextFieldPrice.setText(Stotal);
            if(jComboBoxTime.getSelectedItem().equals("11:30")){
                jTextFieldTime2.setText("11:30");
            }
            else if(jComboBoxTime.getSelectedItem().equals("12:30")){
                jTextFieldTime2.setText("12:30");
            }
            else if(jComboBoxTime.getSelectedItem().equals("1:30")){
                jTextFieldTime2.setText("1:30");
            }
            else if(jComboBoxTime.getSelectedItem().equals("2:30")){
                jTextFieldTime2.setText("2:30");
            }
            else {
                jTextFieldTo.setText(null);
                jTextFieldTotal.setText(null);
                jTextFieldTax.setText(null);
                jTextFieldSubTotal.setText(null);
                jTextFieldPrice.setText(null);
                jTextFieldForm.setText(null);
                jTextFieldDate2.setText(null);
                jTextFieldTime2.setText(null);
                jTextFieldClass.setText(null);
                jTextFieldPassengers2.setText(null);
                jTextFieldTicketType.setText(null);
            }
        }
        
        else if(jComboBoxDestination.getSelectedItem().equals("Riau") && jRadioButtonFirstClass1.isSelected()
                  && jRadioButtonReturn1.isSelected()&& (!(jTextFieldPassenger1.getText()== null) ) ){
            int Pass = Integer.parseInt(jTextFieldPassenger1.getText());
      
     
            jTextFieldPassengers2.setText(jTextFieldPassenger1.getText());
            jTextFieldTo.setText("Riau");
            jTextFieldClass.setText("First Class");
            jTextFieldTicketType.setText("Round Trip");
            jTextFieldDate2.setText(jDateChooser.getDate().toString());
            jTextFieldForm.setText("Surabaya");
       
            jarak = 1300;
            TTarif= (jarak*Tarif*2)+50000;
            Dtax = (Tax*TTarif)/100;
            SubTotal = (Dtax + TTarif)*(Pass);
            String TotalTarif= String.format("%d",TTarif);
            String DisplayTax = String.format("%d",Dtax);
            String Stotal = String.format("%d",SubTotal);    
            jTextFieldTotal.setText(TotalTarif);
            jTextFieldTax.setText(DisplayTax);
            jTextFieldSubTotal.setText(Stotal);
            jTextFieldPrice.setText(Stotal);
            if(jComboBoxTime.getSelectedItem().equals("11:30")){
                jTextFieldTime2.setText("11:30");
            }
            else if(jComboBoxTime.getSelectedItem().equals("12:30")){
                jTextFieldTime2.setText("12:30");
            }
            else if(jComboBoxTime.getSelectedItem().equals("1:30")){
                jTextFieldTime2.setText("1:30");
            }
            else if(jComboBoxTime.getSelectedItem().equals("2:30")){
                jTextFieldTime2.setText("2:30");
            }
            else {
                jTextFieldTo.setText(null);
                jTextFieldTotal.setText(null);
                jTextFieldTax.setText(null);
                jTextFieldSubTotal.setText(null);
                jTextFieldPrice.setText(null);
                jTextFieldForm.setText(null);
                jTextFieldDate2.setText(null);
                jTextFieldTime2.setText(null);
                jTextFieldClass.setText(null);
                jTextFieldPassengers2.setText(null);
                jTextFieldTicketType.setText(null);
            }
        }
        
        else if(jComboBoxDestination.getSelectedItem().equals("Riau")&& jRadioButtonEconomy1.isSelected()
               && jRadioButtonReturn1.isSelected()&& (!(jTextFieldPassenger1.getText()== null) )){
            int Pass = Integer.parseInt(jTextFieldPassenger1.getText());
      
            jTextFieldPassengers2.setText(jTextFieldPassenger1.getText());
            jTextFieldTo.setText("Riau");
            jTextFieldClass.setText("Economy");
            jTextFieldTicketType.setText("Round Trip");
            jTextFieldDate2.setText(jDateChooser.getDate().toString());
            jTextFieldForm.setText("Surabaya");
       
            jarak = 1300;
            TTarif= jarak*Tarif*2;
            Dtax = (Tax*TTarif)/100;
            SubTotal = (Dtax + TTarif)*Pass;
            String TotalTarif= String.format("%d",TTarif);
            String DisplayTax = String.format("%d",Dtax);
            String Stotal = String.format("%d",SubTotal);    
            jTextFieldTotal.setText(TotalTarif);
            jTextFieldTax.setText(DisplayTax);
            jTextFieldSubTotal.setText(Stotal);
            jTextFieldPrice.setText(Stotal);
            if(jComboBoxTime.getSelectedItem().equals("11:30")){
                jTextFieldTime2.setText("11:30");
            }
            else if(jComboBoxTime.getSelectedItem().equals("12:30")){
                jTextFieldTime2.setText("12:30");
            }
            else if(jComboBoxTime.getSelectedItem().equals("1:30")){
                jTextFieldTime2.setText("1:30");
            }
            else if(jComboBoxTime.getSelectedItem().equals("2:30")){
                jTextFieldTime2.setText("2:30");
            }
            else {
                jTextFieldTo.setText(null);
                jTextFieldTotal.setText(null);
                jTextFieldTax.setText(null);
                jTextFieldSubTotal.setText(null);
                jTextFieldPrice.setText(null);
                jTextFieldForm.setText(null);
                jTextFieldDate2.setText(null);
                jTextFieldTime2.setText(null);
                jTextFieldClass.setText(null);
                jTextFieldPassengers2.setText(null);
                jTextFieldTicketType.setText(null);
            }
        }
        
        else if(jComboBoxDestination.getSelectedItem().equals("Riau") && jRadioButtonFirstClass1.isSelected()
                  && jRadioButtonSingle1.isSelected()&& (!(jTextFieldPassenger1.getText()== null) ) ){
            int Pass = Integer.parseInt(jTextFieldPassenger1.getText());
      
            jTextFieldPassengers2.setText(jTextFieldPassenger1.getText());
            jTextFieldTo.setText("Riau");
            jTextFieldClass.setText("First Class");
            jTextFieldTicketType.setText("single trip");
            jTextFieldDate2.setText(jDateChooser.getDate().toString());
            jTextFieldForm.setText("Surabaya");
      
            jarak = 1300;
            TTarif= (jarak*Tarif)+50000;
            Dtax = (Tax*TTarif)/100;
            SubTotal = (Dtax + TTarif)*(Pass);
            String TotalTarif= String.format("%d",TTarif);
            String DisplayTax = String.format("%d",Dtax);
            String Stotal = String.format("%d",SubTotal);    
            jTextFieldTotal.setText(TotalTarif);
            jTextFieldTax.setText(DisplayTax);
            jTextFieldSubTotal.setText(Stotal);
            jTextFieldPrice.setText(Stotal);
            if(jComboBoxTime.getSelectedItem().equals("11:30")){
                jTextFieldTime2.setText("11:30");
            }
            else if(jComboBoxTime.getSelectedItem().equals("12:30")){
                jTextFieldTime2.setText("12:30");
            }
            else if(jComboBoxTime.getSelectedItem().equals("1:30")){
                jTextFieldTime2.setText("1:30");
            }
            else if(jComboBoxTime.getSelectedItem().equals("2:30")){
                jTextFieldTime2.setText("2:30");
            }
            else {
                jTextFieldTo.setText(null);
                jTextFieldTotal.setText(null);
                jTextFieldTax.setText(null);
                jTextFieldSubTotal.setText(null);
                jTextFieldPrice.setText(null);
                jTextFieldForm.setText(null);
                jTextFieldDate2.setText(null);
                jTextFieldTime2.setText(null);
                jTextFieldClass.setText(null);
                jTextFieldPassengers2.setText(null);
                jTextFieldTicketType.setText(null);
            }
        }
        
        else if(jComboBoxDestination.getSelectedItem().equals("Medan")&& jRadioButtonEconomy1.isSelected()
               && jRadioButtonSingle1.isSelected()&& (!(jTextFieldPassenger1.getText()== null) )){
            int Pass = Integer.parseInt(jTextFieldPassenger1.getText());
   
            jTextFieldPassengers2.setText(jTextFieldPassenger1.getText());
            jTextFieldTo.setText("Medan");
            jTextFieldClass.setText("Economy");
            jTextFieldTicketType.setText("single trip");
            jTextFieldDate2.setText(jDateChooser.getDate().toString());
            jTextFieldForm.setText("Surabaya");
       
            jarak = 1400;
            TTarif= jarak*Tarif;
            Dtax = (Tax*TTarif)/100;
            SubTotal = (Dtax + TTarif)*Pass;
            String TotalTarif= String.format("%d",TTarif);
            String DisplayTax = String.format("%d",Dtax);
            String Stotal = String.format("%d",SubTotal);    
            jTextFieldTotal.setText(TotalTarif);
            jTextFieldTax.setText(DisplayTax);
            jTextFieldSubTotal.setText(Stotal);
            jTextFieldPrice.setText(Stotal);
            if(jComboBoxTime.getSelectedItem().equals("11:30")){
                jTextFieldTime2.setText("11:30");
            }
            else if(jComboBoxTime.getSelectedItem().equals("12:30")){
                jTextFieldTime2.setText("12:30");
            }
            else if(jComboBoxTime.getSelectedItem().equals("1:30")){
                jTextFieldTime2.setText("1:30");
            }
            else if(jComboBoxTime.getSelectedItem().equals("2:30")){
                jTextFieldTime2.setText("2:30");
            }
            else {
                jTextFieldTo.setText(null);
                jTextFieldTotal.setText(null);
                jTextFieldTax.setText(null);
                jTextFieldSubTotal.setText(null);
                jTextFieldPrice.setText(null);
                jTextFieldForm.setText(null);
                jTextFieldDate2.setText(null);
                jTextFieldTime2.setText(null);
                jTextFieldClass.setText(null);
                jTextFieldPassengers2.setText(null);
                jTextFieldTicketType.setText(null);
            }
        }
        
        else if(jComboBoxDestination.getSelectedItem().equals("Medan") && jRadioButtonFirstClass1.isSelected()
                  && jRadioButtonReturn1.isSelected()&& (!(jTextFieldPassenger1.getText()== null) ) ){
            int Pass = Integer.parseInt(jTextFieldPassenger1.getText());
      
     
            jTextFieldPassengers2.setText(jTextFieldPassenger1.getText());
            jTextFieldTo.setText("Medan");
            jTextFieldClass.setText("First Class");
            jTextFieldTicketType.setText("Round Trip");
            jTextFieldDate2.setText(jDateChooser.getDate().toString());
            jTextFieldForm.setText("Surabaya");
       
            jarak = 1400;
            TTarif= (jarak*Tarif*2)+50000;
            Dtax = (Tax*TTarif)/100;
            SubTotal = (Dtax + TTarif)*(Pass);
            String TotalTarif= String.format("%d",TTarif);
            String DisplayTax = String.format("%d",Dtax);
            String Stotal = String.format("%d",SubTotal);    
            jTextFieldTotal.setText(TotalTarif);
            jTextFieldTax.setText(DisplayTax);
            jTextFieldSubTotal.setText(Stotal);
            jTextFieldPrice.setText(Stotal);
            if(jComboBoxTime.getSelectedItem().equals("11:30")){
                jTextFieldTime2.setText("11:30");
            }
            else if(jComboBoxTime.getSelectedItem().equals("12:30")){
                jTextFieldTime2.setText("12:30");
            }
            else if(jComboBoxTime.getSelectedItem().equals("1:30")){
                jTextFieldTime2.setText("1:30");
            }
            else if(jComboBoxTime.getSelectedItem().equals("2:30")){
                jTextFieldTime2.setText("2:30");
            }
            else {
                jTextFieldTo.setText(null);
                jTextFieldTotal.setText(null);
                jTextFieldTax.setText(null);
                jTextFieldSubTotal.setText(null);
                jTextFieldPrice.setText(null);
                jTextFieldForm.setText(null);
                jTextFieldDate2.setText(null);
                jTextFieldTime2.setText(null);
                jTextFieldClass.setText(null);
                jTextFieldPassengers2.setText(null);
                jTextFieldTicketType.setText(null);
            }
        }
        
        else if(jComboBoxDestination.getSelectedItem().equals("Medan")&& jRadioButtonEconomy1.isSelected()
               && jRadioButtonReturn1.isSelected()&& (!(jTextFieldPassenger1.getText()== null) )){
            int Pass = Integer.parseInt(jTextFieldPassenger1.getText());
      
            jTextFieldPassengers2.setText(jTextFieldPassenger1.getText());
            jTextFieldTo.setText("Medan");
            jTextFieldClass.setText("Economy");
            jTextFieldTicketType.setText("Round Trip");
            jTextFieldDate2.setText(jDateChooser.getDate().toString());
            jTextFieldForm.setText("Surabaya");
       
            jarak = 1400;
            TTarif= jarak*Tarif*2;
            Dtax = (Tax*TTarif)/100;
            SubTotal = (Dtax + TTarif)*Pass;
            String TotalTarif= String.format("%d",TTarif);
            String DisplayTax = String.format("%d",Dtax);
            String Stotal = String.format("%d",SubTotal);    
            jTextFieldTotal.setText(TotalTarif);
            jTextFieldTax.setText(DisplayTax);
            jTextFieldSubTotal.setText(Stotal);
            jTextFieldPrice.setText(Stotal);
            if(jComboBoxTime.getSelectedItem().equals("11:30")){
                jTextFieldTime2.setText("11:30");
            }
            else if(jComboBoxTime.getSelectedItem().equals("12:30")){
                jTextFieldTime2.setText("12:30");
            }
            else if(jComboBoxTime.getSelectedItem().equals("1:30")){
                jTextFieldTime2.setText("1:30");
            }
            else if(jComboBoxTime.getSelectedItem().equals("2:30")){
                jTextFieldTime2.setText("2:30");
            }
            else {
                jTextFieldTo.setText(null);
                jTextFieldTotal.setText(null);
                jTextFieldTax.setText(null);
                jTextFieldSubTotal.setText(null);
                jTextFieldPrice.setText(null);
                jTextFieldForm.setText(null);
                jTextFieldDate2.setText(null);
                jTextFieldTime2.setText(null);
                jTextFieldClass.setText(null);
                jTextFieldPassengers2.setText(null);
                jTextFieldTicketType.setText(null);
            }
        }
        
        else if(jComboBoxDestination.getSelectedItem().equals("Medan") && jRadioButtonFirstClass1.isSelected()
                  && jRadioButtonSingle1.isSelected()&& (!(jTextFieldPassenger1.getText()== null) ) ){
            int Pass = Integer.parseInt(jTextFieldPassenger1.getText());
      
            jTextFieldPassengers2.setText(jTextFieldPassenger1.getText());
            jTextFieldTo.setText("Medan");
            jTextFieldClass.setText("First Class");
            jTextFieldTicketType.setText("single trip");
            jTextFieldDate2.setText(jDateChooser.getDate().toString());
            jTextFieldForm.setText("Surabaya");
      
            jarak = 1400;
            TTarif= (jarak*Tarif)+50000;
            Dtax = (Tax*TTarif)/100;
            SubTotal = (Dtax + TTarif)*(Pass);
            String TotalTarif= String.format("%d",TTarif);
            String DisplayTax = String.format("%d",Dtax);
            String Stotal = String.format("%d",SubTotal);    
            jTextFieldTotal.setText(TotalTarif);
            jTextFieldTax.setText(DisplayTax);
            jTextFieldSubTotal.setText(Stotal);
            jTextFieldPrice.setText(Stotal);
            if(jComboBoxTime.getSelectedItem().equals("11:30")){
                jTextFieldTime2.setText("11:30");
            }
            else if(jComboBoxTime.getSelectedItem().equals("12:30")){
                jTextFieldTime2.setText("12:30");
            }
            else if(jComboBoxTime.getSelectedItem().equals("1:30")){
                jTextFieldTime2.setText("1:30");
            }
            else if(jComboBoxTime.getSelectedItem().equals("2:30")){
                jTextFieldTime2.setText("2:30");
            }
            else {
                jTextFieldTo.setText(null);
                jTextFieldTotal.setText(null);
                jTextFieldTax.setText(null);
                jTextFieldSubTotal.setText(null);
                jTextFieldPrice.setText(null);
                jTextFieldForm.setText(null);
                jTextFieldDate2.setText(null);
                jTextFieldTime2.setText(null);
                jTextFieldClass.setText(null);
                jTextFieldPassengers2.setText(null);
                jTextFieldTicketType.setText(null);
            }
        }
        
        else if(jComboBoxDestination.getSelectedItem().equals("Aceh")&& jRadioButtonEconomy1.isSelected()
               && jRadioButtonSingle1.isSelected()&& (!(jTextFieldPassenger1.getText()== null) )){
            int Pass = Integer.parseInt(jTextFieldPassenger1.getText());
   
            jTextFieldPassengers2.setText(jTextFieldPassenger1.getText());
            jTextFieldTo.setText("Aceh");
            jTextFieldClass.setText("Economy");
            jTextFieldTicketType.setText("single trip");
            jTextFieldDate2.setText(jDateChooser.getDate().toString());
            jTextFieldForm.setText("Surabaya");
       
            jarak = 1500;
            TTarif= jarak*Tarif;
            Dtax = (Tax*TTarif)/100;
            SubTotal = (Dtax + TTarif)*Pass;
            String TotalTarif= String.format("%d",TTarif);
            String DisplayTax = String.format("%d",Dtax);
            String Stotal = String.format("%d",SubTotal);    
            jTextFieldTotal.setText(TotalTarif);
            jTextFieldTax.setText(DisplayTax);
            jTextFieldSubTotal.setText(Stotal);
            jTextFieldPrice.setText(Stotal);
            if(jComboBoxTime.getSelectedItem().equals("11:30")){
                jTextFieldTime2.setText("11:30");
            }
            else if(jComboBoxTime.getSelectedItem().equals("12:30")){
                jTextFieldTime2.setText("12:30");
            }
            else if(jComboBoxTime.getSelectedItem().equals("1:30")){
                jTextFieldTime2.setText("1:30");
            }
            else if(jComboBoxTime.getSelectedItem().equals("2:30")){
                jTextFieldTime2.setText("2:30");
            }
            else {
                jTextFieldTo.setText(null);
                jTextFieldTotal.setText(null);
                jTextFieldTax.setText(null);
                jTextFieldSubTotal.setText(null);
                jTextFieldPrice.setText(null);
                jTextFieldForm.setText(null);
                jTextFieldDate2.setText(null);
                jTextFieldTime2.setText(null);
                jTextFieldClass.setText(null);
                jTextFieldPassengers2.setText(null);
                jTextFieldTicketType.setText(null);
            }
        }
        
        else if(jComboBoxDestination.getSelectedItem().equals("Aceh") && jRadioButtonFirstClass1.isSelected()
                  && jRadioButtonReturn1.isSelected()&& (!(jTextFieldPassenger1.getText()== null) ) ){
            int Pass = Integer.parseInt(jTextFieldPassenger1.getText());
      
     
            jTextFieldPassengers2.setText(jTextFieldPassenger1.getText());
            jTextFieldTo.setText("Aceh");
            jTextFieldClass.setText("First Class");
            jTextFieldTicketType.setText("Round Trip");
            jTextFieldDate2.setText(jDateChooser.getDate().toString());
            jTextFieldForm.setText("Surabaya");
       
            jarak = 1500;
            TTarif= (jarak*Tarif*2)+50000;
            Dtax = (Tax*TTarif)/100;
            SubTotal = (Dtax + TTarif)*(Pass);
            String TotalTarif= String.format("%d",TTarif);
            String DisplayTax = String.format("%d",Dtax);
            String Stotal = String.format("%d",SubTotal);    
            jTextFieldTotal.setText(TotalTarif);
            jTextFieldTax.setText(DisplayTax);
            jTextFieldSubTotal.setText(Stotal);
            jTextFieldPrice.setText(Stotal);
            if(jComboBoxTime.getSelectedItem().equals("11:30")){
                jTextFieldTime2.setText("11:30");
            }
            else if(jComboBoxTime.getSelectedItem().equals("12:30")){
                jTextFieldTime2.setText("12:30");
            }
            else if(jComboBoxTime.getSelectedItem().equals("1:30")){
                jTextFieldTime2.setText("1:30");
            }
            else if(jComboBoxTime.getSelectedItem().equals("2:30")){
                jTextFieldTime2.setText("2:30");
            }
            else {
                jTextFieldTo.setText(null);
                jTextFieldTotal.setText(null);
                jTextFieldTax.setText(null);
                jTextFieldSubTotal.setText(null);
                jTextFieldPrice.setText(null);
                jTextFieldForm.setText(null);
                jTextFieldDate2.setText(null);
                jTextFieldTime2.setText(null);
                jTextFieldClass.setText(null);
                jTextFieldPassengers2.setText(null);
                jTextFieldTicketType.setText(null);
            }
        }
        
        else if(jComboBoxDestination.getSelectedItem().equals("Aceh")&& jRadioButtonEconomy1.isSelected()
               && jRadioButtonReturn1.isSelected()&& (!(jTextFieldPassenger1.getText()== null) )){
            int Pass = Integer.parseInt(jTextFieldPassenger1.getText());
      
            jTextFieldPassengers2.setText(jTextFieldPassenger1.getText());
            jTextFieldTo.setText("Aceh");
            jTextFieldClass.setText("Economy");
            jTextFieldTicketType.setText("Round Trip");
            jTextFieldDate2.setText(jDateChooser.getDate().toString());
            jTextFieldForm.setText("Surabaya");
       
            jarak = 1500;
            TTarif= jarak*Tarif*2;
            Dtax = (Tax*TTarif)/100;
            SubTotal = (Dtax + TTarif)*Pass;
            String TotalTarif= String.format("%d",TTarif);
            String DisplayTax = String.format("%d",Dtax);
            String Stotal = String.format("%d",SubTotal);    
            jTextFieldTotal.setText(TotalTarif);
            jTextFieldTax.setText(DisplayTax);
            jTextFieldSubTotal.setText(Stotal);
            jTextFieldPrice.setText(Stotal);
            if(jComboBoxTime.getSelectedItem().equals("11:30")){
                jTextFieldTime2.setText("11:30");
            }
            else if(jComboBoxTime.getSelectedItem().equals("12:30")){
                jTextFieldTime2.setText("12:30");
            }
            else if(jComboBoxTime.getSelectedItem().equals("1:30")){
                jTextFieldTime2.setText("1:30");
            }
            else if(jComboBoxTime.getSelectedItem().equals("2:30")){
                jTextFieldTime2.setText("2:30");
            }
            else {
                jTextFieldTo.setText(null);
                jTextFieldTotal.setText(null);
                jTextFieldTax.setText(null);
                jTextFieldSubTotal.setText(null);
                jTextFieldPrice.setText(null);
                jTextFieldForm.setText(null);
                jTextFieldDate2.setText(null);
                jTextFieldTime2.setText(null);
                jTextFieldClass.setText(null);
                jTextFieldPassengers2.setText(null);
                jTextFieldTicketType.setText(null);
            }
        }
        
        else if(jComboBoxDestination.getSelectedItem().equals("Aceh") && jRadioButtonFirstClass1.isSelected()
                  && jRadioButtonSingle1.isSelected()&& (!(jTextFieldPassenger1.getText()== null) ) ){
            int Pass = Integer.parseInt(jTextFieldPassenger1.getText());
      
            jTextFieldPassengers2.setText(jTextFieldPassenger1.getText());
            jTextFieldTo.setText("Aceh");
            jTextFieldClass.setText("First Class");
            jTextFieldTicketType.setText("single trip");
            jTextFieldDate2.setText(jDateChooser.getDate().toString());
            jTextFieldForm.setText("Surabaya");
      
            jarak = 1500;
            TTarif= (jarak*Tarif)+50000;
            Dtax = (Tax*TTarif)/100;
            SubTotal = (Dtax + TTarif)*(Pass);
            String TotalTarif= String.format("%d",TTarif);
            String DisplayTax = String.format("%d",Dtax);
            String Stotal = String.format("%d",SubTotal);    
            jTextFieldTotal.setText(TotalTarif);
            jTextFieldTax.setText(DisplayTax);
            jTextFieldSubTotal.setText(Stotal);
            jTextFieldPrice.setText(Stotal);
            if(jComboBoxTime.getSelectedItem().equals("11:30")){
                jTextFieldTime2.setText("11:30");
            }
            else if(jComboBoxTime.getSelectedItem().equals("12:30")){
                jTextFieldTime2.setText("12:30");
            }
            else if(jComboBoxTime.getSelectedItem().equals("1:30")){
                jTextFieldTime2.setText("1:30");
            }
            else if(jComboBoxTime.getSelectedItem().equals("2:30")){
                jTextFieldTime2.setText("2:30");
            }
            else {
                jTextFieldTo.setText(null);
                jTextFieldTotal.setText(null);
                jTextFieldTax.setText(null);
                jTextFieldSubTotal.setText(null);
                jTextFieldPrice.setText(null);
                jTextFieldForm.setText(null);
                jTextFieldDate2.setText(null);
                jTextFieldTime2.setText(null);
                jTextFieldClass.setText(null);
                jTextFieldPassengers2.setText(null);
                jTextFieldTicketType.setText(null);
            }
        }
        
        else if((!jRadioButtonSingle1.isSelected() && !jRadioButtonReturn1.isSelected()) ||
               (!jRadioButtonFirstClass1.isSelected()&& !jRadioButtonEconomy1.isSelected()) ||
               jComboBoxDestination.getSelectedItem().equals("Select Destination")|| jTextFieldPassenger1.getText()== "" ){
            jTextFieldTo.setText(null);
            jTextFieldTotal.setText(null);
            jTextFieldTax.setText(null);
            jTextFieldSubTotal.setText(null);
            jTextFieldPrice.setText(null);
            jTextFieldForm.setText(null);
            jTextFieldDate2.setText(null);
            jTextFieldTime2.setText(null);
            jTextFieldClass.setText(null);
            jTextFieldPassengers2.setText(null);
            jTextFieldTicketType.setText(null);       
        }       
      
      
        else{
            jTextFieldTo.setText(null);
            jTextFieldTotal.setText(null);
            jTextFieldTax.setText(null);
            jTextFieldSubTotal.setText(null);
            jTextFieldPrice.setText(null);
            jTextFieldForm.setText(null);
            jTextFieldDate2.setText(null);
            jTextFieldTime2.setText(null);
            jTextFieldClass.setText(null);
            jTextFieldPassengers2.setText(null);
            jTextFieldTicketType.setText(null);
        }
    }//GEN-LAST:event_jButtonTotalActionPerformed

    private void jComboBoxDestinationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxDestinationActionPerformed

    }//GEN-LAST:event_jComboBoxDestinationActionPerformed

    private void jButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExitActionPerformed

    }//GEN-LAST:event_jButtonExitActionPerformed

    private void jButtonExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonExitMouseExited

    }//GEN-LAST:event_jButtonExitMouseExited

    private void jButtonExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonExitMouseClicked

        System.exit(0);
    }//GEN-LAST:event_jButtonExitMouseClicked

    private void jButtonResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonResetActionPerformed

        jDateChooser.setCalendar(null);
        jComboBoxTime.setSelectedIndex(0);
        jComboBoxDestination.setSelectedIndex(0);
        jTextFieldSubTotal.setText(null);
        jTextFieldPassenger1.setText(null);
        jTextFieldTotal.setText(null);
        jTextFieldTax.setText(null);
        jTextFieldTotal.setText(null);
        jTextFieldForm.setText(null);
        jTextFieldTo.setText(null);
        jTextFieldDate2.setText(null);
        jTextFieldTime2.setText(null);
        jTextFieldDate2.setText(null);
        jTextFieldTicketType.setText(null);
        jTextFieldClass.setText(null);
        jTextFieldPassengers2.setText(null);
        jTextFieldPrice.setText(null);
        jRadioButtonReturn1.setSelected(false);
        jRadioButtonSingle1.setSelected(false);
        jRadioButtonFirstClass1.setSelected(false);
        jRadioButtonEconomy1.setSelected(false);
        
    }//GEN-LAST:event_jButtonResetActionPerformed

    private void jRadioButtonSingle1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonSingle1ActionPerformed

        if(jRadioButtonSingle1.isSelected()){       
        jRadioButtonReturn1.setSelected(false);}
    }//GEN-LAST:event_jRadioButtonSingle1ActionPerformed

    private void jRadioButtonReturn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonReturn1ActionPerformed

        if(jRadioButtonReturn1.isSelected()){
        jRadioButtonSingle1.setSelected(false);
        }
    }//GEN-LAST:event_jRadioButtonReturn1ActionPerformed

    public static void main(String args[]) {
  
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BusTicketing().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButtonExit;
    private javax.swing.JButton jButtonReset;
    private javax.swing.JButton jButtonTotal;
    private javax.swing.JComboBox<String> jComboBoxDestination;
    private javax.swing.JComboBox<String> jComboBoxTime;
    private com.toedter.calendar.JDateChooser jDateChooser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
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
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton jRadioButtonEconomy1;
    private javax.swing.JRadioButton jRadioButtonFirstClass1;
    private javax.swing.JRadioButton jRadioButtonReturn1;
    private javax.swing.JRadioButton jRadioButtonSingle1;
    private javax.swing.JTextField jTextFieldClass;
    private javax.swing.JTextField jTextFieldDate2;
    private javax.swing.JTextField jTextFieldForm;
    private javax.swing.JTextField jTextFieldPassenger1;
    private javax.swing.JTextField jTextFieldPassengers2;
    private javax.swing.JTextField jTextFieldPrice;
    private javax.swing.JTextField jTextFieldSubTotal;
    private javax.swing.JTextField jTextFieldTax;
    private javax.swing.JTextField jTextFieldTicketType;
    private javax.swing.JTextField jTextFieldTime2;
    private javax.swing.JTextField jTextFieldTo;
    private javax.swing.JTextField jTextFieldTotal;
    // End of variables declaration//GEN-END:variables
}
