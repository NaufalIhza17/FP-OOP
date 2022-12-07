/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.movietixapp;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author M Naufal Ihza S
 */
public class WelcomeFrame extends javax.swing.JFrame {

    /**
     * Creates new form WelcomeFrame
     */
    public WelcomeFrame() {
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

        jPanel1 = new javax.swing.JPanel();
        NavBar = new javax.swing.JPanel();
        Headline1 = new javax.swing.JLabel();
        Headline2 = new javax.swing.JLabel();
        HomeButton = new javax.swing.JButton();
        HistoryButton = new javax.swing.JButton();
        OrderButton = new javax.swing.JButton();
        Tab = new javax.swing.JPanel();
        HomePage = new javax.swing.JPanel();
        HomePageTitle1 = new javax.swing.JLabel();
        HomePageTitle2 = new javax.swing.JLabel();
        TopMovieTitle = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        OrderPage = new javax.swing.JPanel();
        OrderTitle1 = new javax.swing.JLabel();
        OrderTitle2 = new javax.swing.JLabel();
        Display = new javax.swing.JPanel();
        Display1 = new javax.swing.JPanel();
        javax.swing.JButton PayButton = new javax.swing.JButton();
        LocationLabel = new javax.swing.JLabel();
        MovieNameLabel = new javax.swing.JLabel();
        SeatsLabel = new javax.swing.JLabel();
        LocationInput = new javax.swing.JComboBox<>();
        MovieNameInput = new javax.swing.JComboBox<>();
        SeatsInput = new javax.swing.JSpinner();
        TimeLabel = new javax.swing.JLabel();
        TimeInput = new javax.swing.JComboBox<>();
        Display2 = new javax.swing.JPanel();
        javax.swing.JButton BackButton = new javax.swing.JButton();
        javax.swing.JButton OrderFixButton = new javax.swing.JButton();
        SeatsPicturePanel = new javax.swing.JPanel();
        SeatsImagePlot = new javax.swing.JLabel();
        HistoryPage = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        HistoryTable = new javax.swing.JTable();
        HistoryTitle1 = new javax.swing.JLabel();
        HistoryTitle2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(582, 504));

        jPanel1.setMinimumSize(new java.awt.Dimension(582, 504));

        NavBar.setBackground(new java.awt.Color(0, 102, 102));

        Headline1.setFont(new java.awt.Font("STZhongsong", 1, 24)); // NOI18N
        Headline1.setForeground(new java.awt.Color(255, 255, 255));
        Headline1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Headline1.setText("Movie");
        Headline1.setToolTipText("");

        Headline2.setFont(new java.awt.Font("STZhongsong", 1, 14)); // NOI18N
        Headline2.setForeground(new java.awt.Color(255, 255, 255));
        Headline2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Headline2.setText("---Tix---");
        Headline2.setToolTipText("");

        HomeButton.setBackground(new java.awt.Color(0, 204, 204));
        HomeButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        HomeButton.setText("Home");
        HomeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomeButtonMouseClicked(evt);
            }
        });
        HomeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeButtonActionPerformed(evt);
            }
        });

        HistoryButton.setBackground(new java.awt.Color(0, 204, 204));
        HistoryButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        HistoryButton.setText("History");
        HistoryButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HistoryButtonMouseClicked(evt);
            }
        });
        HistoryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HistoryButtonActionPerformed(evt);
            }
        });

        OrderButton.setBackground(new java.awt.Color(0, 204, 204));
        OrderButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        OrderButton.setText("Order");
        OrderButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OrderButtonMouseClicked(evt);
            }
        });
        OrderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrderButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout NavBarLayout = new javax.swing.GroupLayout(NavBar);
        NavBar.setLayout(NavBarLayout);
        NavBarLayout.setHorizontalGroup(
            NavBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(HomeButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(Headline1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Headline2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(HistoryButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(OrderButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
        );
        NavBarLayout.setVerticalGroup(
            NavBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NavBarLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(Headline1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Headline2)
                .addGap(91, 91, 91)
                .addComponent(HomeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(OrderButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(HistoryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Tab.setLayout(new java.awt.CardLayout());

        HomePageTitle1.setFont(new java.awt.Font("STZhongsong", 1, 36)); // NOI18N
        HomePageTitle1.setText("HOME");
        HomePageTitle1.setToolTipText("");

        HomePageTitle2.setFont(new java.awt.Font("STZhongsong", 0, 14)); // NOI18N
        HomePageTitle2.setText("Page");

        TopMovieTitle.setFont(new java.awt.Font("Swis721 WGL4 BT", 3, 12)); // NOI18N
        TopMovieTitle.setText("TOP MOVIE THIS WEEK!");

        jLabel5.setFont(new java.awt.Font("Swis721 WGL4 BT", 3, 12)); // NOI18N
        jLabel5.setText("GUIDE TO BUY TICKET!");

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Imperfect");
        jLabel7.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Thor");
        jLabel8.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Imperfect");
        jLabel9.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout HomePageLayout = new javax.swing.GroupLayout(HomePage);
        HomePage.setLayout(HomePageLayout);
        HomePageLayout.setHorizontalGroup(
            HomePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HomePageLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(HomePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(HomePageTitle2)
                    .addComponent(HomePageTitle1))
                .addGap(26, 26, 26))
            .addGroup(HomePageLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(HomePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HomePageLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(HomePageLayout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12))
                    .addGroup(HomePageLayout.createSequentialGroup()
                        .addComponent(TopMovieTitle)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        HomePageLayout.setVerticalGroup(
            HomePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomePageLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(HomePageTitle1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(HomePageTitle2)
                .addGap(49, 49, 49)
                .addComponent(TopMovieTitle)
                .addGap(16, 16, 16)
                .addGroup(HomePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(103, 103, 103))
        );

        Tab.add(HomePage, "card2");

        OrderTitle1.setFont(new java.awt.Font("STZhongsong", 1, 36)); // NOI18N
        OrderTitle1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        OrderTitle1.setText("Order");

        OrderTitle2.setFont(new java.awt.Font("STZhongsong", 0, 14)); // NOI18N
        OrderTitle2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        OrderTitle2.setText("Page");

        Display.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        Display.setLayout(new java.awt.CardLayout());

        PayButton.setFont(new java.awt.Font("STZhongsong", 0, 12)); // NOI18N
        PayButton.setText("Pay");
        PayButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PayButtonMouseClicked(evt);
            }
        });
        PayButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PayButtonActionPerformed(evt);
            }
        });

        LocationLabel.setFont(new java.awt.Font("STZhongsong", 2, 14)); // NOI18N
        LocationLabel.setText("Theater Location");

        MovieNameLabel.setFont(new java.awt.Font("STZhongsong", 2, 14)); // NOI18N
        MovieNameLabel.setText("Movie Name");

        SeatsLabel.setFont(new java.awt.Font("STZhongsong", 2, 14)); // NOI18N
        SeatsLabel.setText("Lots of Seats");

        LocationInput.setFont(new java.awt.Font("STZhongsong", 0, 12)); // NOI18N
        LocationInput.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pakuwon City", "Galaxy Mall", "Tunjungan Plaza", "Transmart" }));

        MovieNameInput.setFont(new java.awt.Font("STZhongsong", 0, 12)); // NOI18N
        MovieNameInput.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Thor", "Imperfect", "Top Gun Maverick", "Despicable Me" }));

        TimeLabel.setFont(new java.awt.Font("STZhongsong", 2, 14)); // NOI18N
        TimeLabel.setText("Time");

        TimeInput.setFont(new java.awt.Font("STZhongsong", 0, 12)); // NOI18N
        TimeInput.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "11:00 - 13:00", "13:00 - 15:00", "15:00 - 17:00", "17:00 - 19:00", "19:00 - 21:00", "21:00 - 23:00" }));

        javax.swing.GroupLayout Display1Layout = new javax.swing.GroupLayout(Display1);
        Display1.setLayout(Display1Layout);
        Display1Layout.setHorizontalGroup(
            Display1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Display1Layout.createSequentialGroup()
                .addGroup(Display1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Display1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(PayButton, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Display1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(Display1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(MovieNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(LocationLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(SeatsLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(Display1Layout.createSequentialGroup()
                                .addGroup(Display1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LocationInput, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(MovieNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(SeatsInput, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TimeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TimeInput, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 37, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        Display1Layout.setVerticalGroup(
            Display1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Display1Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(LocationLabel)
                .addGap(5, 5, 5)
                .addComponent(LocationInput, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MovieNameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MovieNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SeatsLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SeatsInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TimeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TimeInput, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(PayButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        Display.add(Display1, "card2");

        BackButton.setFont(new java.awt.Font("STZhongsong", 0, 12)); // NOI18N
        BackButton.setText("Back");
        BackButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackButtonMouseClicked(evt);
            }
        });

        OrderFixButton.setFont(new java.awt.Font("STZhongsong", 0, 12)); // NOI18N
        OrderFixButton.setText("Order");
        OrderFixButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OrderFixButtonMouseClicked(evt);
            }
        });
        OrderFixButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrderFixButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SeatsPicturePanelLayout = new javax.swing.GroupLayout(SeatsPicturePanel);
        SeatsPicturePanel.setLayout(SeatsPicturePanelLayout);
        SeatsPicturePanelLayout.setHorizontalGroup(
            SeatsPicturePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SeatsPicturePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SeatsImagePlot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        SeatsPicturePanelLayout.setVerticalGroup(
            SeatsPicturePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SeatsPicturePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SeatsImagePlot, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout Display2Layout = new javax.swing.GroupLayout(Display2);
        Display2.setLayout(Display2Layout);
        Display2Layout.setHorizontalGroup(
            Display2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Display2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Display2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(SeatsPicturePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(Display2Layout.createSequentialGroup()
                        .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 255, Short.MAX_VALUE)
                        .addComponent(OrderFixButton, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        Display2Layout.setVerticalGroup(
            Display2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Display2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SeatsPicturePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 141, Short.MAX_VALUE)
                .addGroup(Display2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(OrderFixButton, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(BackButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        Display.add(Display2, "card3");

        javax.swing.GroupLayout OrderPageLayout = new javax.swing.GroupLayout(OrderPage);
        OrderPage.setLayout(OrderPageLayout);
        OrderPageLayout.setHorizontalGroup(
            OrderPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OrderPageLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(OrderPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(OrderPageLayout.createSequentialGroup()
                        .addComponent(Display, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, OrderPageLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(OrderPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(OrderTitle1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(OrderTitle2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29))))
        );
        OrderPageLayout.setVerticalGroup(
            OrderPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OrderPageLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(OrderTitle1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(OrderTitle2)
                .addGap(18, 18, 18)
                .addComponent(Display, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        Tab.add(OrderPage, "card3");

        HistoryTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Location", "Movie Name", "Tickets", "Time", "Date", "Total Price"
            }
        ));
        jScrollPane1.setViewportView(HistoryTable);

        HistoryTitle1.setFont(new java.awt.Font("STZhongsong", 1, 36)); // NOI18N
        HistoryTitle1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        HistoryTitle1.setText("History");

        HistoryTitle2.setFont(new java.awt.Font("STZhongsong", 0, 14)); // NOI18N
        HistoryTitle2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        HistoryTitle2.setText("Order");

        javax.swing.GroupLayout HistoryPageLayout = new javax.swing.GroupLayout(HistoryPage);
        HistoryPage.setLayout(HistoryPageLayout);
        HistoryPageLayout.setHorizontalGroup(
            HistoryPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HistoryPageLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HistoryPageLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(HistoryPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(HistoryTitle2)
                    .addComponent(HistoryTitle1))
                .addGap(25, 25, 25))
        );
        HistoryPageLayout.setVerticalGroup(
            HistoryPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HistoryPageLayout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(HistoryTitle1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(HistoryTitle2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        Tab.add(HistoryPage, "card4");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(NavBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Tab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(NavBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Tab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HomeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeButtonActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_HomeButtonActionPerformed

    private void HistoryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HistoryButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HistoryButtonActionPerformed

    private void OrderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrderButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OrderButtonActionPerformed

    private void PayButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PayButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PayButtonActionPerformed

    private void HomeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeButtonMouseClicked
        // TODO add your handling code here:
        // Remove Panel
        Tab.removeAll();
        Tab.repaint();
        Tab.revalidate();
        
        // Add Panel
        Tab.add(HomePage);
        Tab.repaint();
        Tab.revalidate();
    }//GEN-LAST:event_HomeButtonMouseClicked

    private void OrderButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OrderButtonMouseClicked
        // TODO add your handling code here:
        // Remove Panel
        Tab.removeAll();
        Tab.repaint();
        Tab.revalidate();
        
        // Add Panel
        Tab.add(OrderPage);
        Tab.repaint();
        Tab.revalidate();
    }//GEN-LAST:event_OrderButtonMouseClicked

    private void HistoryButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HistoryButtonMouseClicked
        // TODO add your handling code here:
        // Remove Panel
        Tab.removeAll();
        Tab.repaint();
        Tab.revalidate();
        
        // Add Panel
        Tab.add(HistoryPage);
        Tab.repaint();
        Tab.revalidate();
    }//GEN-LAST:event_HistoryButtonMouseClicked

    private void PayButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PayButtonMouseClicked
        // TODO add your handling code here:
        int check = (Integer) SeatsInput.getValue();
        
        if (check <= 0 || check > 9) {
            JOptionPane.showMessageDialog(this, "You can't input this much numbers of seats", "Try again", JOptionPane.ERROR_MESSAGE);
        } else {
            // Remove Panel
            Display.removeAll();
            Display.repaint();
            Display.revalidate();
        
            // Add Panel
            Display.add(Display2);
            Display.repaint();
            Display.revalidate();
        }
    }//GEN-LAST:event_PayButtonMouseClicked

    private void BackButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackButtonMouseClicked
        // TODO add your handling code here:
        Display.removeAll();
        Display.repaint();
        Display.revalidate();
        
        // Add Panel
        Display.add(Display1);
        Display.repaint();
        Display.revalidate();
    }//GEN-LAST:event_BackButtonMouseClicked

    private void OrderFixButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OrderFixButtonMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_OrderFixButtonMouseClicked

    private void OrderFixButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrderFixButtonActionPerformed
        // TODO add your handling code here:
        String location = (String) LocationInput.getSelectedItem();
        String movie = (String) MovieNameInput.getSelectedItem();
        int seats = (Integer) SeatsInput.getValue();
        String time = (String) TimeInput.getSelectedItem();
        
        if (location.isEmpty() || movie.isEmpty() || time.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter all fields", "Try again", JOptionPane.ERROR_MESSAGE);
        } else if (seats < 1 || seats > 9) {
            JOptionPane.showMessageDialog(this, "You can't input this much numbers of seats", "Try again", JOptionPane.ERROR_MESSAGE);
        } else {
            DefaultTableModel model = (DefaultTableModel) HistoryTable.getModel();
            model.addRow(new Object[] {location, movie, seats, time});
            JOptionPane.showMessageDialog(null, "We have confirm your order!");
        }
    }//GEN-LAST:event_OrderFixButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(WelcomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(WelcomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(WelcomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(WelcomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WelcomeFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Display;
    private javax.swing.JPanel Display1;
    private javax.swing.JPanel Display2;
    private javax.swing.JLabel Headline1;
    private javax.swing.JLabel Headline2;
    private javax.swing.JButton HistoryButton;
    private javax.swing.JPanel HistoryPage;
    private javax.swing.JTable HistoryTable;
    private javax.swing.JLabel HistoryTitle1;
    private javax.swing.JLabel HistoryTitle2;
    private javax.swing.JButton HomeButton;
    private javax.swing.JPanel HomePage;
    private javax.swing.JLabel HomePageTitle1;
    private javax.swing.JLabel HomePageTitle2;
    private javax.swing.JComboBox<String> LocationInput;
    private javax.swing.JLabel LocationLabel;
    private javax.swing.JComboBox<String> MovieNameInput;
    private javax.swing.JLabel MovieNameLabel;
    private javax.swing.JPanel NavBar;
    private javax.swing.JButton OrderButton;
    private javax.swing.JPanel OrderPage;
    private javax.swing.JLabel OrderTitle1;
    private javax.swing.JLabel OrderTitle2;
    private javax.swing.JLabel SeatsImagePlot;
    private javax.swing.JSpinner SeatsInput;
    private javax.swing.JLabel SeatsLabel;
    private javax.swing.JPanel SeatsPicturePanel;
    private javax.swing.JPanel Tab;
    private javax.swing.JComboBox<String> TimeInput;
    private javax.swing.JLabel TimeLabel;
    private javax.swing.JLabel TopMovieTitle;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
