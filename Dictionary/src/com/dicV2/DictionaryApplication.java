package com.dicV2;

import com.darkprograms.speech.synthesiser.Synthesiser;
import com.darkprograms.speech.translator.GoogleTranslate;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.advanced.AdvancedPlayer;

/**
 *
 * @hiveThongs
 */
public class DictionaryApplication extends javax.swing.JFrame {

    int xMouse, yMouse;
    boolean searchMode, savedWordMode, historyWordMode, translateMode;
    DictionaryManagement dicMana = new DictionaryManagement();

    DefaultListModel<String> dlmWord = new DefaultListModel<>();
    ArrayList<Word> listShow = new ArrayList<>();

    public DictionaryApplication() {
        initComponents();
        initDefault();
        this.setLocationRelativeTo(null);
        updateCntWord();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton6 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jHome = new javax.swing.JLabel();
        jImportant = new javax.swing.JLabel();
        jHistory = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jMic = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jboxSearch = new javax.swing.JFormattedTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListWord = new javax.swing.JList<>();
        jTranslate = new javax.swing.JLabel();
        jPaneDrag = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jExit = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabelCntWord = new javax.swing.JLabel();
        jPaneEditAction = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jBoxEdit1 = new javax.swing.JFormattedTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jBoxEdit2 = new javax.swing.JFormattedTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jBoxEdit4 = new javax.swing.JFormattedTextField();
        jBtnOkEdit = new javax.swing.JButton();
        jBtnRefreshEdit = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jPaneAddAction = new javax.swing.JPanel();
        jSeparator7 = new javax.swing.JSeparator();
        jBoxAdd1 = new javax.swing.JFormattedTextField();
        jSeparator9 = new javax.swing.JSeparator();
        jBoxAdd3 = new javax.swing.JFormattedTextField();
        jBtnOkAdd = new javax.swing.JButton();
        jBtnRefreshAdd = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jPaneDefaultInfo = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPaneOptionSearchMode = new javax.swing.JPanel();
        jBtnDelSearchMode = new javax.swing.JButton();
        jBtnSaveSearchMode = new javax.swing.JButton();
        jBtnAddSearchMode = new javax.swing.JButton();
        jBtnEditSearchMode = new javax.swing.JButton();
        jPaneOptionSaveMode = new javax.swing.JPanel();
        jBtnDelSaveMode = new javax.swing.JButton();
        jPaneOptionHistoryMode = new javax.swing.JPanel();
        jBtnSaveHistoryMode = new javax.swing.JButton();
        jBtnDelHistoryMode = new javax.swing.JButton();
        jPaneInfo = new javax.swing.JPanel();
        jInfoExplain = new javax.swing.JLabel();
        jInfoSpelling = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jBtnSpeaker = new javax.swing.JButton();
        jPaneTranslate = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jComboBox = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jButtonTran = new javax.swing.JButton();

        jButton6.setText("jButton6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(174, 99, 228));
        setBounds(new java.awt.Rectangle(1, 1, 0, 0));
        setLocationByPlatform(true);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 34));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(432, 80, 2, 290));

        jPanel2.setBackground(new java.awt.Color(0, 0, 56));
        jPanel2.setToolTipText("");
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jHome.setBackground(new java.awt.Color(0, 0, 3));
        jHome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_Home_30px.png"))); // NOI18N
        jHome.setToolTipText("Home");
        jHome.setOpaque(true);
        jHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jHomeMouseClicked(evt);
            }
        });
        jPanel2.add(jHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 52, 50));

        jImportant.setBackground(new java.awt.Color(0, 0, 56));
        jImportant.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jImportant.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_Check_File_30px.png"))); // NOI18N
        jImportant.setToolTipText("Từ đã lưu");
        jImportant.setOpaque(true);
        jImportant.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jImportantMouseClicked(evt);
            }
        });
        jPanel2.add(jImportant, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 0, 52, 50));

        jHistory.setBackground(new java.awt.Color(0, 0, 56));
        jHistory.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jHistory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_Time_Machine_30px_2.png"))); // NOI18N
        jHistory.setToolTipText("Lịch sử");
        jHistory.setOpaque(true);
        jHistory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jHistoryMouseClicked(evt);
            }
        });
        jPanel2.add(jHistory, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 0, 52, 50));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -30, 10, -1));

        jPanel4.setBackground(new java.awt.Color(0, 30, 56));
        jPanel4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jMic.setBackground(new java.awt.Color(0, 30, 56));
        jMic.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_Microphone_25px.png"))); // NOI18N
        jPanel4.add(jMic, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 30, 40));

        jSeparator6.setOpaque(true);
        jPanel4.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 32, 170, 1));

        jboxSearch.setBackground(new java.awt.Color(0, 30, 56));
        jboxSearch.setBorder(null);
        jboxSearch.setForeground(new java.awt.Color(255, 255, 255));
        jboxSearch.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jboxSearch.setToolTipText(null);
        jboxSearch.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jboxSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jboxSearchKeyReleased(evt);
            }
        });
        jPanel4.add(jboxSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 0, 200, 40));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 210, 40));

        jScrollPane1.setBorder(null);

        jListWord.setBackground(new java.awt.Color(0, 0, 56));
        jListWord.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jListWord.setForeground(new java.awt.Color(255, 255, 255));
        jListWord.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jListWordMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jListWord);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 90, 200, 240));

        jTranslate.setBackground(new java.awt.Color(0, 0, 56));
        jTranslate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jTranslate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-google-translate-30 (1).png"))); // NOI18N
        jTranslate.setToolTipText("Translate");
        jTranslate.setOpaque(true);
        jTranslate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTranslateMouseClicked(evt);
            }
        });
        jPanel2.add(jTranslate, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 0, 52, 50));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 40, 208, 344));

        jPaneDrag.setBackground(new java.awt.Color(0, 0, 34));
        jPaneDrag.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPaneDragMouseDragged(evt);
            }
        });
        jPaneDrag.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPaneDragMousePressed(evt);
            }
        });
        jPaneDrag.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPaneDrag.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 170, -1));

        jLabel5.setBackground(new java.awt.Color(0, 0, 56));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("hiveThongs");
        jLabel5.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel5.setOpaque(true);
        jPaneDrag.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 208, 40));

        jExit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_Cancel_30px.png"))); // NOI18N
        jExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jExitMouseClicked(evt);
            }
        });
        jPaneDrag.add(jExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 0, 50, 40));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("~DICTIONARY~");
        jPaneDrag.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, 259, 40));

        jLabelCntWord.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelCntWord.setForeground(new java.awt.Color(255, 255, 255));
        jPaneDrag.add(jLabelCntWord, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 120, 40));

        jPanel1.add(jPaneDrag, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 2, 810, 38));

        jPaneEditAction.setBackground(new java.awt.Color(0, 0, 34));
        jPaneEditAction.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPaneEditAction.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 220, 2));

        jBoxEdit1.setEditable(false);
        jBoxEdit1.setBackground(new java.awt.Color(0, 0, 34));
        jBoxEdit1.setBorder(null);
        jBoxEdit1.setForeground(new java.awt.Color(255, 255, 255));
        jBoxEdit1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPaneEditAction.add(jBoxEdit1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 220, 36));
        jPaneEditAction.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 220, -1));

        jBoxEdit2.setBackground(new java.awt.Color(0, 0, 34));
        jBoxEdit2.setBorder(null);
        jBoxEdit2.setForeground(new java.awt.Color(153, 153, 153));
        jBoxEdit2.setText("Nhập từ mới ......");
        jBoxEdit2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jBoxEdit2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jBoxEdit2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jBoxEdit2FocusLost(evt);
            }
        });
        jPaneEditAction.add(jBoxEdit2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 220, 36));
        jPaneEditAction.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 220, 2));

        jBoxEdit4.setBackground(new java.awt.Color(0, 0, 34));
        jBoxEdit4.setBorder(null);
        jBoxEdit4.setForeground(new java.awt.Color(153, 153, 153));
        jBoxEdit4.setText("Nghĩa Tiếng Việt ......");
        jBoxEdit4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jBoxEdit4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jBoxEdit4FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jBoxEdit4FocusLost(evt);
            }
        });
        jPaneEditAction.add(jBoxEdit4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 220, 36));

        jBtnOkEdit.setBackground(new java.awt.Color(0, 0, 56));
        jBtnOkEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_Ok_40px.png"))); // NOI18N
        jBtnOkEdit.setToolTipText("Sửa");
        jBtnOkEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnOkEditActionPerformed(evt);
            }
        });
        jPaneEditAction.add(jBtnOkEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 50, 50));

        jBtnRefreshEdit.setBackground(new java.awt.Color(0, 0, 56));
        jBtnRefreshEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_Refresh_40px.png"))); // NOI18N
        jBtnRefreshEdit.setToolTipText("Làm mới");
        jBtnRefreshEdit.setBorder(null);
        jBtnRefreshEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnRefreshEditActionPerformed(evt);
            }
        });
        jPaneEditAction.add(jBtnRefreshEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 50, 50));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("SỬA TỪ");
        jPaneEditAction.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 120, 30));

        jPanel1.add(jPaneEditAction, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 50, 230, 300));

        jPaneAddAction.setBackground(new java.awt.Color(0, 0, 34));
        jPaneAddAction.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPaneAddAction.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 220, -1));

        jBoxAdd1.setBackground(new java.awt.Color(0, 0, 34));
        jBoxAdd1.setBorder(null);
        jBoxAdd1.setForeground(new java.awt.Color(153, 153, 153));
        jBoxAdd1.setText("Nhập từ mới ......");
        jBoxAdd1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jBoxAdd1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jBoxAdd1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jBoxAdd1FocusLost(evt);
            }
        });
        jPaneAddAction.add(jBoxAdd1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 220, 36));
        jPaneAddAction.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 220, 2));

        jBoxAdd3.setBackground(new java.awt.Color(0, 0, 34));
        jBoxAdd3.setBorder(null);
        jBoxAdd3.setForeground(new java.awt.Color(153, 153, 153));
        jBoxAdd3.setText("Nghĩa Tiếng Việt ......");
        jBoxAdd3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jBoxAdd3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jBoxAdd3FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jBoxAdd3FocusLost(evt);
            }
        });
        jPaneAddAction.add(jBoxAdd3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 220, 36));

        jBtnOkAdd.setBackground(new java.awt.Color(0, 0, 56));
        jBtnOkAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_Ok_40px.png"))); // NOI18N
        jBtnOkAdd.setToolTipText("Thêm");
        jBtnOkAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnOkAddActionPerformed(evt);
            }
        });
        jPaneAddAction.add(jBtnOkAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 50, 50));

        jBtnRefreshAdd.setBackground(new java.awt.Color(0, 0, 56));
        jBtnRefreshAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_Refresh_40px.png"))); // NOI18N
        jBtnRefreshAdd.setToolTipText("Làm mới");
        jBtnRefreshAdd.setBorder(null);
        jBtnRefreshAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnRefreshAddActionPerformed(evt);
            }
        });
        jPaneAddAction.add(jBtnRefreshAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 50, 50));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("THÊM TỪ");
        jPaneAddAction.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 120, 30));

        jPanel1.add(jPaneAddAction, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 50, 220, 270));

        jPaneDefaultInfo.setBackground(new java.awt.Color(0, 0, 34));
        jPaneDefaultInfo.setForeground(new java.awt.Color(0, 0, 34));
        jPaneDefaultInfo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Nghĩa Tiếng Việt");
        jPaneDefaultInfo.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 180, 40));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Từ vựng");
        jPaneDefaultInfo.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 180, 40));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_Sphere_8px.png"))); // NOI18N
        jLabel10.setText("jLabel10");
        jPaneDefaultInfo.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 20, 40));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_Sphere_8px.png"))); // NOI18N
        jLabel11.setText("jLabel10");
        jPaneDefaultInfo.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 20, 40));

        jPanel1.add(jPaneDefaultInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, 210, 290));

        jPaneOptionSearchMode.setBackground(new java.awt.Color(0, 0, 34));
        jPaneOptionSearchMode.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jBtnDelSearchMode.setBackground(new java.awt.Color(0, 0, 56));
        jBtnDelSearchMode.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_Trash_30px.png"))); // NOI18N
        jBtnDelSearchMode.setToolTipText("Xóa từ");
        jBtnDelSearchMode.setBorder(null);
        jBtnDelSearchMode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnDelSearchModeActionPerformed(evt);
            }
        });
        jPaneOptionSearchMode.add(jBtnDelSearchMode, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 50, 50));

        jBtnSaveSearchMode.setBackground(new java.awt.Color(0, 0, 56));
        jBtnSaveSearchMode.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_Save_30px_1.png"))); // NOI18N
        jBtnSaveSearchMode.setToolTipText("Lưu từ này");
        jBtnSaveSearchMode.setBorder(null);
        jBtnSaveSearchMode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSaveSearchModeActionPerformed(evt);
            }
        });
        jPaneOptionSearchMode.add(jBtnSaveSearchMode, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, 50));

        jBtnAddSearchMode.setBackground(new java.awt.Color(0, 0, 56));
        jBtnAddSearchMode.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_Add_40px_2.png"))); // NOI18N
        jBtnAddSearchMode.setToolTipText("Thêm từ");
        jBtnAddSearchMode.setBorder(null);
        jBtnAddSearchMode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAddSearchModeActionPerformed(evt);
            }
        });
        jPaneOptionSearchMode.add(jBtnAddSearchMode, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 50, 50));

        jBtnEditSearchMode.setBackground(new java.awt.Color(0, 0, 56));
        jBtnEditSearchMode.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_Edit_30px.png"))); // NOI18N
        jBtnEditSearchMode.setToolTipText("Sửa từ");
        jBtnEditSearchMode.setBorder(null);
        jBtnEditSearchMode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnEditSearchModeActionPerformed(evt);
            }
        });
        jPaneOptionSearchMode.add(jBtnEditSearchMode, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 50, 50));

        jPanel1.add(jPaneOptionSearchMode, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 130, 70, 240));

        jPaneOptionSaveMode.setBackground(new java.awt.Color(0, 0, 34));
        jPaneOptionSaveMode.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jBtnDelSaveMode.setBackground(new java.awt.Color(0, 0, 56));
        jBtnDelSaveMode.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_Trash_30px.png"))); // NOI18N
        jBtnDelSaveMode.setToolTipText("Xóa khỏi mục Đã lưu");
        jBtnDelSaveMode.setBorder(null);
        jBtnDelSaveMode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnDelSaveModeActionPerformed(evt);
            }
        });
        jPaneOptionSaveMode.add(jBtnDelSaveMode, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, 50));

        jPanel1.add(jPaneOptionSaveMode, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 130, 70, 240));

        jPaneOptionHistoryMode.setBackground(new java.awt.Color(0, 0, 34));
        jPaneOptionHistoryMode.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jBtnSaveHistoryMode.setBackground(new java.awt.Color(0, 0, 56));
        jBtnSaveHistoryMode.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_Save_30px_1.png"))); // NOI18N
        jBtnSaveHistoryMode.setToolTipText("Lưu từ");
        jBtnSaveHistoryMode.setBorder(null);
        jBtnSaveHistoryMode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSaveHistoryModeActionPerformed(evt);
            }
        });
        jPaneOptionHistoryMode.add(jBtnSaveHistoryMode, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, 50));

        jBtnDelHistoryMode.setBackground(new java.awt.Color(0, 0, 56));
        jBtnDelHistoryMode.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_Trash_30px.png"))); // NOI18N
        jBtnDelHistoryMode.setToolTipText("Xóa toàn bộ lịch sử");
        jBtnDelHistoryMode.setBorder(null);
        jBtnDelHistoryMode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnDelHistoryModeActionPerformed(evt);
            }
        });
        jPaneOptionHistoryMode.add(jBtnDelHistoryMode, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 50, 50));

        jPanel1.add(jPaneOptionHistoryMode, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 130, 70, 240));

        jPaneInfo.setBackground(new java.awt.Color(0, 0, 34));
        jPaneInfo.setForeground(new java.awt.Color(0, 0, 34));
        jPaneInfo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jInfoExplain.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jInfoExplain.setForeground(new java.awt.Color(255, 255, 255));
        jPaneInfo.add(jInfoExplain, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 180, 90));

        jInfoSpelling.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jInfoSpelling.setForeground(new java.awt.Color(255, 255, 255));
        jPaneInfo.add(jInfoSpelling, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 180, 60));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_Sphere_8px.png"))); // NOI18N
        jLabel19.setText("jLabel10");
        jPaneInfo.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 20, 40));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_Sphere_8px.png"))); // NOI18N
        jLabel20.setText("jLabel10");
        jPaneInfo.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 20, 40));

        jBtnSpeaker.setBackground(new java.awt.Color(0, 0, 56));
        jBtnSpeaker.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_Speaker_30px_1.png"))); // NOI18N
        jBtnSpeaker.setToolTipText("Phát âm");
        jBtnSpeaker.setBorder(null);
        jBtnSpeaker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSpeakerActionPerformed(evt);
            }
        });
        jPaneInfo.add(jBtnSpeaker, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, 50, 50));

        jPanel1.add(jPaneInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, 280, 290));

        jPaneTranslate.setBackground(new java.awt.Color(0, 0, 34));
        jPaneTranslate.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("TRANSLATE");
        jPaneTranslate.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 120, 40));

        jComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "VI -> EN", "EN -> VI" }));
        jPaneTranslate.add(jComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, -1, 25));

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setHorizontalScrollBar(null);

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jPaneTranslate.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 230, 100));

        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jTextArea2.setEditable(false);
        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jTextArea2.setLineWrap(true);
        jTextArea2.setRows(5);
        jScrollPane3.setViewportView(jTextArea2);

        jPaneTranslate.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 230, 110));

        jButtonTran.setText("Dịch");
        jButtonTran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTranActionPerformed(evt);
            }
        });
        jPaneTranslate.add(jButtonTran, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, -1, -1));

        jPanel1.add(jPaneTranslate, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 50, 270, 330));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

//    private void initData() {
//        
//    }
    private void updateCntWord() {
        jLabelCntWord.setText(Dictionary.listWord.size() + " từ");
    }

    private void initDefault() {
        if (!dicMana.initData()) {
            JOptionPane.showMessageDialog(rootPane, "Không load được dữ liệu!");
            System.exit(0);
        }

        setCursor();
        setDefaultConfig();
        setModeSearch(true, false, false, false);
    }

    private void DLMLoadList(ArrayList<Word> list) {
        dlmWord.clear();
        listShow = dicMana.createListSearched(list, jboxSearch.getText());
        listShow.forEach((ele) -> {
            dlmWord.addElement(ele.getWord_taget());
        });

    }

    private void setDefaultConfig() {
        jPaneOptionSearchMode.setVisible(true);
        jPaneOptionSaveMode.setVisible(false);
        jPaneOptionHistoryMode.setVisible(false);
        jPaneDefaultInfo.setVisible(true);
        jPaneInfo.setVisible(false);
        jPaneAddAction.setVisible(true);
        jPaneEditAction.setVisible(false);
        jPaneTranslate.setVisible(false);
    }

    private void setModeSearch(boolean _searchMode, boolean _savedWordMode, boolean _historyWordMode, boolean _translateMode) {
        searchMode = _searchMode;
        if (searchMode) {
            jHome.setBackground(new Color(0, 0, 3));
            jImportant.setBackground(new Color(0, 0, 56));
            jHistory.setBackground(new Color(0, 0, 56));
            jTranslate.setBackground(new Color(0, 0, 56));
            jPaneEditAction.setVisible(!searchMode);
        }
        savedWordMode = _savedWordMode;
        if (savedWordMode) {
            jHome.setBackground(new Color(0, 0, 56));
            jImportant.setBackground(new Color(0, 0, 3));
            jHistory.setBackground(new Color(0, 0, 56));
            jTranslate.setBackground(new Color(0, 0, 56));
        }
        historyWordMode = _historyWordMode;
        if (historyWordMode) {
            jHome.setBackground(new Color(0, 0, 56));
            jImportant.setBackground(new Color(0, 0, 56));
            jHistory.setBackground(new Color(0, 0, 3));
            jTranslate.setBackground(new Color(0, 0, 56));
        }
        translateMode = _translateMode;
        if (translateMode) {
            jHome.setBackground(new Color(0, 0, 56));
            jImportant.setBackground(new Color(0, 0, 56));
            jHistory.setBackground(new Color(0, 0, 56));
            jTranslate.setBackground(new Color(0, 0, 3));
        }
        jPaneAddAction.setVisible(searchMode);
        jPaneOptionSearchMode.setVisible(searchMode);
        jPaneOptionSaveMode.setVisible(savedWordMode);
        jPaneOptionHistoryMode.setVisible(historyWordMode);
        jPaneTranslate.setVisible(translateMode);
        jPaneDefaultInfo.setVisible(true);
        jPaneInfo.setVisible(false);
    }

    private void setCursor() {
        jHome.setCursor(new Cursor(Cursor.HAND_CURSOR));
        jImportant.setCursor(new Cursor(Cursor.HAND_CURSOR));
        jHistory.setCursor(new Cursor(Cursor.HAND_CURSOR));
        jBtnDelSearchMode.setCursor(new Cursor(Cursor.HAND_CURSOR));
        jBtnAddSearchMode.setCursor(new Cursor(Cursor.HAND_CURSOR));
        jBtnSaveSearchMode.setCursor(new Cursor(Cursor.HAND_CURSOR));
        jBtnEditSearchMode.setCursor(new Cursor(Cursor.HAND_CURSOR));
        jBtnOkAdd.setCursor(new Cursor(Cursor.HAND_CURSOR));
        jBtnOkEdit.setCursor(new Cursor(Cursor.HAND_CURSOR));
        jBtnRefreshAdd.setCursor(new Cursor(Cursor.HAND_CURSOR));
        jBtnRefreshEdit.setCursor(new Cursor(Cursor.HAND_CURSOR));
        jBtnSpeaker.setCursor(new Cursor(Cursor.HAND_CURSOR));
        jExit.setCursor(new Cursor(Cursor.HAND_CURSOR));
        jBtnSaveHistoryMode.setCursor(new Cursor(Cursor.HAND_CURSOR));
        jBtnDelHistoryMode.setCursor(new Cursor(Cursor.HAND_CURSOR));
        jBtnDelSaveMode.setCursor(new Cursor(Cursor.HAND_CURSOR));
        jTranslate.setCursor(new Cursor(Cursor.HAND_CURSOR));
        jButtonTran.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }

    private void jPaneDragMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPaneDragMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_jPaneDragMouseDragged

    private void jPaneDragMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPaneDragMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jPaneDragMousePressed

    private void jBtnRefreshEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnRefreshEditActionPerformed
        jBoxEdit2.setText("Nhập từ mới ......");
        jBoxEdit4.setText("Nghĩa Tiếng Việt ......");
        jBoxEdit2.setForeground(new Color(153, 153, 153));
        jBoxEdit4.setForeground(new Color(153, 153, 153));
    }//GEN-LAST:event_jBtnRefreshEditActionPerformed

    private void jBtnRefreshAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnRefreshAddActionPerformed
        jBoxAdd1.setText("Nhập từ mới ......");
        jBoxAdd3.setText("Nghĩa Tiếng Việt ......");
        jBoxAdd1.setForeground(new Color(153, 153, 153));
        jBoxAdd3.setForeground(new Color(153, 153, 153));
    }//GEN-LAST:event_jBtnRefreshAddActionPerformed

    private void jExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jExitMouseClicked
        dicMana.updateDataBeforeClosing();
        System.exit(0);
    }//GEN-LAST:event_jExitMouseClicked

    private void jHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jHomeMouseClicked
        if (evt.getButton() == java.awt.event.MouseEvent.BUTTON1) {
            setModeSearch(true, false, false, false);
            jboxSearch.setText("");
            dlmWord.clear();
        }
    }//GEN-LAST:event_jHomeMouseClicked

    private void jImportantMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jImportantMouseClicked
        if (evt.getButton() == java.awt.event.MouseEvent.BUTTON1) {
            setModeSearch(false, true, false, false);
            jboxSearch.setText("");
            DLMLoadList(ListWordSaved.listWordSaved);
            jListWord.setModel(dlmWord);
        }
    }//GEN-LAST:event_jImportantMouseClicked

    private void jHistoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jHistoryMouseClicked
        if (evt.getButton() == java.awt.event.MouseEvent.BUTTON1) {
            setModeSearch(false, false, true, false);
            jboxSearch.setText("");
            DLMLoadList(ListWordHistory.listWordHistory);
            jListWord.setModel(dlmWord);

        }
    }//GEN-LAST:event_jHistoryMouseClicked

    private void jBtnSaveSearchModeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSaveSearchModeActionPerformed
        if (jListWord.isSelectionEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Chọn một từ trong danh sách để lưu!");
        } else {
            if (dicMana.saveWord(new Word(jInfoSpelling.getText(), jInfoExplain.getText()))) {
                JOptionPane.showMessageDialog(rootPane, "Lưu thành công");
            } else {
                JOptionPane.showMessageDialog(rootPane, "Từ này đã được lưu trước đó");
            }
        }
    }//GEN-LAST:event_jBtnSaveSearchModeActionPerformed

    private void jBtnAddSearchModeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAddSearchModeActionPerformed
        jPaneAddAction.setVisible(true);
        jPaneEditAction.setVisible(false);


    }//GEN-LAST:event_jBtnAddSearchModeActionPerformed

    private void jBtnEditSearchModeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnEditSearchModeActionPerformed
        if (jListWord.isSelectionEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Chọn một từ trong danh sách để sửa!");
        } else {
            jPaneAddAction.setVisible(false);
            jPaneEditAction.setVisible(true);
            jBoxEdit1.setText(jListWord.getSelectedValue());

        }
    }//GEN-LAST:event_jBtnEditSearchModeActionPerformed

    private void jboxSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jboxSearchKeyReleased
        jPaneInfo.setVisible(false);
        jPaneDefaultInfo.setVisible(true);
        if (searchMode) {
            if (jboxSearch.getText().equals("")) {
                dlmWord.clear();
            } else {
                DLMLoadList(Dictionary.listWord);
            }
        } else if (savedWordMode) {
            DLMLoadList(ListWordSaved.listWordSaved);
        } else if (historyWordMode) {
            DLMLoadList(ListWordHistory.listWordHistory);
        }
        jListWord.setModel(dlmWord);
    }//GEN-LAST:event_jboxSearchKeyReleased

    private void jListWordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListWordMouseClicked
        if (!dlmWord.isEmpty() && !translateMode) {
            jBoxEdit1.setText(jListWord.getSelectedValue());
            int pos = BinarySearch.binarySearchWord(listShow, jListWord.getSelectedValue());
            Word w = new Word(listShow.get(pos));
            if (searchMode) {
                dicMana.addToHistory(w);
            }
            jPaneDefaultInfo.setVisible(false);
            jPaneInfo.setVisible(true);
            jInfoSpelling.setText(w.getWord_taget());
            jInfoExplain.setText(w.getWord_explain());
        }
    }//GEN-LAST:event_jListWordMouseClicked

    private void jBtnDelSearchModeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnDelSearchModeActionPerformed
        if (jListWord.isSelectionEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Chọn một từ trong danh sách để xóa!");
        } else {
            int response = JOptionPane.showConfirmDialog(null, "Bạn có muốn xóa ?", "Warning!",
                    JOptionPane.YES_NO_OPTION);
            switch (response) {
                case JOptionPane.NO_OPTION:
                    break;
                case JOptionPane.YES_OPTION:
                    dicMana.deleteWordInDictionary(new Word(jInfoSpelling.getText(), jInfoExplain.getText()));
                    JOptionPane.showMessageDialog(rootPane, "Xóa thành công");
                    updateCntWord();
                    jPaneDefaultInfo.setVisible(true);
                    jPaneInfo.setVisible(false);
                    DLMLoadList(Dictionary.listWord);
                    break;
                case JOptionPane.CLOSED_OPTION:
                    break;
                default:
                    break;
            }
        }
    }//GEN-LAST:event_jBtnDelSearchModeActionPerformed

    private void jBtnSaveHistoryModeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSaveHistoryModeActionPerformed
        if (jListWord.isSelectionEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Chọn một từ trong danh sách để lưu!");
        } else {
            if (dicMana.saveWord(new Word(jInfoSpelling.getText(), jInfoExplain.getText()))) {
                JOptionPane.showMessageDialog(rootPane, "Lưu thành công");
            } else {
                JOptionPane.showMessageDialog(rootPane, "Từ này đã được lưu trước đó");
            }
        }
    }//GEN-LAST:event_jBtnSaveHistoryModeActionPerformed

    private void jBoxEdit2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jBoxEdit2FocusGained
        if (jBoxEdit2.getText().equals("Nhập từ mới ......")) {
            jBoxEdit2.setText("");
            jBoxEdit2.setForeground(new Color(255, 255, 255));
        }
    }//GEN-LAST:event_jBoxEdit2FocusGained

    private void jBoxEdit2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jBoxEdit2FocusLost
        if (jBoxEdit2.getText().equals("")) {
            jBoxEdit2.setText("Nhập từ mới ......");
            jBoxEdit2.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_jBoxEdit2FocusLost

    private void jBoxEdit4FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jBoxEdit4FocusGained
        if (jBoxEdit4.getText().equals("Nghĩa Tiếng Việt ......")) {
            jBoxEdit4.setText("");
            jBoxEdit4.setForeground(new Color(255, 255, 255));
        }
    }//GEN-LAST:event_jBoxEdit4FocusGained

    private void jBoxEdit4FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jBoxEdit4FocusLost
        if (jBoxEdit4.getText().equals("")) {
            jBoxEdit4.setText("Nghĩa Tiếng Việt ......");
            jBoxEdit4.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_jBoxEdit4FocusLost

    private void jBtnOkEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnOkEditActionPerformed
        if (jBoxEdit2.getText().equals("Nhập từ mới ......")
                || jBoxEdit4.getText().equals("Nghĩa Tiếng Việt ......")) {
            JOptionPane.showMessageDialog(rootPane, "Không được để trống");
        } else {
            if (dicMana.editWordInDictionary(new Word(jInfoSpelling.getText(), jInfoExplain.getText()),
                    new Word(jBoxEdit2.getText(), jBoxEdit4.getText()))) {
                JOptionPane.showMessageDialog(rootPane, "Sửa thành công");
                updateCntWord();
            } else {
                JOptionPane.showMessageDialog(rootPane, "Từ này đã tồn tại");
            }
            jPaneDefaultInfo.setVisible(true);
            jPaneInfo.setVisible(false);
            DLMLoadList(Dictionary.listWord);
            jBoxEdit1.setText("");
            jBoxEdit2.setText("Nhập từ mới ......");
            jBoxEdit4.setText("Nghĩa Tiếng Việt ......");
            jBoxEdit2.setForeground(new Color(153, 153, 153));
            jBoxEdit4.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_jBtnOkEditActionPerformed

    private void jBoxAdd1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jBoxAdd1FocusGained
        if (jBoxAdd1.getText().equals("Nhập từ mới ......")) {
            jBoxAdd1.setText("");
            jBoxAdd1.setForeground(new Color(255, 255, 255));
        }
    }//GEN-LAST:event_jBoxAdd1FocusGained

    private void jBoxAdd3FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jBoxAdd3FocusGained
        if (jBoxAdd3.getText().equals("Nghĩa Tiếng Việt ......")) {
            jBoxAdd3.setText("");
            jBoxAdd3.setForeground(new Color(255, 255, 255));
        }
    }//GEN-LAST:event_jBoxAdd3FocusGained

    private void jBoxAdd1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jBoxAdd1FocusLost
        if (jBoxAdd1.getText().equals("")) {
            jBoxAdd1.setText("Nhập từ mới ......");
            jBoxAdd1.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_jBoxAdd1FocusLost

    private void jBoxAdd3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jBoxAdd3FocusLost
        if (jBoxAdd3.getText().equals("")) {
            jBoxAdd3.setText("Nghĩa Tiếng Việt ......");
            jBoxAdd3.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_jBoxAdd3FocusLost

    private void jBtnOkAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnOkAddActionPerformed
        if (jBoxAdd1.getText().equals("Nhập từ mới ......")
                || jBoxAdd3.getText().equals("Nghĩa Tiếng Việt ......")) {
            JOptionPane.showMessageDialog(rootPane, "Không được để trống");
        } else {
            if (dicMana.addWordToDictionary(new Word(jBoxAdd1.getText(), jBoxAdd3.getText()))) {
                JOptionPane.showMessageDialog(rootPane, "Thêm thành công");
                updateCntWord();
            } else {
                JOptionPane.showMessageDialog(rootPane, "Từ này đã tồn tại");
            }
            jPaneDefaultInfo.setVisible(true);
            jPaneInfo.setVisible(false);
            DLMLoadList(Dictionary.listWord);
            jBoxAdd1.setText("Nhập từ mới ......");
            jBoxAdd3.setText("Nghĩa Tiếng Việt ......");
            jBoxAdd1.setForeground(new Color(153, 153, 153));
            jBoxAdd3.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_jBtnOkAddActionPerformed

    private void jBtnSpeakerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSpeakerActionPerformed
        if (jListWord.isSelectionEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Chọn một từ");
        } else {
            Synthesiser synthesizer = new Synthesiser();
            Thread thread = new Thread(() -> {
                try {
                    AdvancedPlayer player = new AdvancedPlayer(synthesizer.getMP3Data(jListWord.getSelectedValue()));
                    player.play();
                } catch (IOException | JavaLayerException e) {
                    JOptionPane.showMessageDialog(rootPane, "Vui lòng kết nối mạng");
                }
            });
            thread.setDaemon(false);
            thread.start();
        }
    }//GEN-LAST:event_jBtnSpeakerActionPerformed

    private void jBtnDelHistoryModeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnDelHistoryModeActionPerformed
        int response = JOptionPane.showConfirmDialog(null, "Xóa toàn bộ lịch sử ?", "Warning!",
                JOptionPane.YES_NO_OPTION);
        switch (response) {
            case JOptionPane.NO_OPTION:
                break;
            case JOptionPane.YES_OPTION:
                ListWordHistory.listWordHistory.clear();
                JOptionPane.showMessageDialog(rootPane, "Xóa thành công");
                jPaneDefaultInfo.setVisible(true);
                jPaneInfo.setVisible(false);
                dlmWord.clear();
                break;
            case JOptionPane.CLOSED_OPTION:
                break;
            default:
                break;
        }
    }//GEN-LAST:event_jBtnDelHistoryModeActionPerformed

    private void jBtnDelSaveModeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnDelSaveModeActionPerformed
        if (jListWord.isSelectionEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Chọn một từ trong danh sách để xóa!");
        } else {
            int response = JOptionPane.showConfirmDialog(null, "Bạn có muốn xóa ?", "Warning!",
                    JOptionPane.YES_NO_OPTION);
            switch (response) {
                case JOptionPane.NO_OPTION:
                    break;
                case JOptionPane.YES_OPTION:
                    dicMana.deleteWordInSaved(new Word(jInfoSpelling.getText(), jInfoExplain.getText()));
                    JOptionPane.showMessageDialog(rootPane, "Xóa thành công");
                    jPaneDefaultInfo.setVisible(true);
                    jPaneInfo.setVisible(false);
                    DLMLoadList(ListWordSaved.listWordSaved);
                    break;
                case JOptionPane.CLOSED_OPTION:
                    break;
                default:
                    break;
            }
        }
    }//GEN-LAST:event_jBtnDelSaveModeActionPerformed

    private void jTranslateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTranslateMouseClicked
        if (evt.getButton() == java.awt.event.MouseEvent.BUTTON1) {
            setModeSearch(false, false, false, true);
            jboxSearch.setText("");
            jTextArea1.setText("");
            jTextArea2.setText("");
            dlmWord.clear();
        }
    }//GEN-LAST:event_jTranslateMouseClicked

    private void jButtonTranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTranActionPerformed
        String in, out;
        if (jComboBox.getSelectedIndex() == 0) {
            in = "vi";
            out = "en";
        } else {
            in = "en";
            out = "vi";
        }
        try {
            jTextArea2.setText(GoogleTranslate.translate(in, out, jTextArea1.getText()));
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Có lỗi xảy ra");
        }
    }//GEN-LAST:event_jButtonTranActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DictionaryApplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new DictionaryApplication().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField jBoxAdd1;
    private javax.swing.JFormattedTextField jBoxAdd3;
    private javax.swing.JFormattedTextField jBoxEdit1;
    private javax.swing.JFormattedTextField jBoxEdit2;
    private javax.swing.JFormattedTextField jBoxEdit4;
    private javax.swing.JButton jBtnAddSearchMode;
    private javax.swing.JButton jBtnDelHistoryMode;
    private javax.swing.JButton jBtnDelSaveMode;
    private javax.swing.JButton jBtnDelSearchMode;
    private javax.swing.JButton jBtnEditSearchMode;
    private javax.swing.JButton jBtnOkAdd;
    private javax.swing.JButton jBtnOkEdit;
    private javax.swing.JButton jBtnRefreshAdd;
    private javax.swing.JButton jBtnRefreshEdit;
    private javax.swing.JButton jBtnSaveHistoryMode;
    private javax.swing.JButton jBtnSaveSearchMode;
    private javax.swing.JButton jBtnSpeaker;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButtonTran;
    private javax.swing.JComboBox<String> jComboBox;
    private javax.swing.JLabel jExit;
    private javax.swing.JLabel jHistory;
    private javax.swing.JLabel jHome;
    private javax.swing.JLabel jImportant;
    private javax.swing.JLabel jInfoExplain;
    private javax.swing.JLabel jInfoSpelling;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelCntWord;
    private javax.swing.JList<String> jListWord;
    private javax.swing.JLabel jMic;
    private javax.swing.JPanel jPaneAddAction;
    private javax.swing.JPanel jPaneDefaultInfo;
    private javax.swing.JPanel jPaneDrag;
    private javax.swing.JPanel jPaneEditAction;
    private javax.swing.JPanel jPaneInfo;
    private javax.swing.JPanel jPaneOptionHistoryMode;
    private javax.swing.JPanel jPaneOptionSaveMode;
    private javax.swing.JPanel jPaneOptionSearchMode;
    private javax.swing.JPanel jPaneTranslate;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JLabel jTranslate;
    private javax.swing.JFormattedTextField jboxSearch;
    // End of variables declaration//GEN-END:variables
}
