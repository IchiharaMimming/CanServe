/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package canteenreserve;

/**
 * Main CanteenReserve Duo window.
 * Displays menu items and lets the user reserve food until a selected time.
 *
 * @author Honey
 */
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.SpinnerNumberModel;
import javax.swing.table.DefaultTableModel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.util.ArrayList;
import java.util.List;

public class CanteenReserveDuo extends javax.swing.JFrame {

    private static final int COLUMN_QUANTITY = 2;
    private static final int COLUMN_STATUS = 3;
    private static final int MAX_PER_RESERVATION = 10;
    private static final int HIGH_TOTAL_WARNING = 200;
    private static final int LOW_STOCK_THRESHOLD = 3;

    private DefaultTableModel model;
    private DefaultTableModel reservationSummaryModel;
    private List<FoodItem> foodItems;

    private JTable reservationsTable;
    private JButton cancelReservationButton;
    private JButton cancelAllReservationButton;
    private JLabel overallTotalLabel;

    public CanteenReserveDuo() {
        initComponents();

        initializeFoodItems();
        populateFoodComboBox();
        setupTable();
        initializeReservationSummary();
        setupActions();
        createMenuBar();
        customizeUi();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jDialog1 = new javax.swing.JDialog();
        jLabelSubtitle3 = new javax.swing.JLabel();
        jPanelHeader = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabelTitle = new javax.swing.JLabel();
        jLabelSubtitle = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanelFoodTable = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableFoodMenu = new javax.swing.JTable();
        jPanelFoodMenuText = new javax.swing.JPanel();
        jLabelSubtitle2 = new javax.swing.JLabel();
        jPanelActions = new javax.swing.JPanel();
        jLabelMessage = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabelSubtitle4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanelReservation = new javax.swing.JPanel();
        jLabelSubtitle1 = new javax.swing.JLabel();
        jLabelSelectFood = new javax.swing.JLabel();
        jLabelQuantity = new javax.swing.JLabel();
        jLabelTime = new javax.swing.JLabel();
        jComboBoxTime = new javax.swing.JComboBox<>();
        jSpinnerQuantity = new javax.swing.JSpinner();
        jComboBoxFood = new javax.swing.JComboBox<>();
        jButtonReserve1 = new javax.swing.JButton();
        jButtonClear = new javax.swing.JButton();

        jMenuItem1.setText("jMenuItem1");

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jLabelSubtitle3.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabelSubtitle3.setForeground(new java.awt.Color(85, 85, 85));
        jLabelSubtitle3.setText("Check and reserve available food");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CanteenReserve Duo");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelHeader.setBackground(new java.awt.Color(84, 119, 146));

        jPanel1.setBackground(new java.awt.Color(136, 171, 200));
        jPanel1.setLayout(null);

        jLabelTitle.setBackground(new java.awt.Color(92, 64, 51));
        jLabelTitle.setFont(new java.awt.Font("Ravie", 1, 36)); // NOI18N
        jLabelTitle.setForeground(new java.awt.Color(251, 251, 219));
        jLabelTitle.setText("CanteenReserve Duo");
        jLabelTitle.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabelTitle.setMaximumSize(new java.awt.Dimension(406, 40));
        jLabelTitle.setMinimumSize(new java.awt.Dimension(406, 40));
        jLabelTitle.setPreferredSize(new java.awt.Dimension(406, 40));
        jLabelTitle.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(jLabelTitle);
        jLabelTitle.setBounds(6, 18, 409, 55);

        jLabelSubtitle.setFont(new java.awt.Font("Lucida Handwriting", 3, 20)); // NOI18N
        jLabelSubtitle.setForeground(new java.awt.Color(119, 97, 72));
        jLabelSubtitle.setText("Check and reserve available food");
        jPanel1.add(jLabelSubtitle);
        jLabelSubtitle.setBounds(10, 60, 459, 28);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/canteenreserve/Untitled (300 x 300 px) (50 x 50 px) (2).png"))); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(421, 24, 59, 48);

        javax.swing.GroupLayout jPanelHeaderLayout = new javax.swing.GroupLayout(jPanelHeader);
        jPanelHeader.setLayout(jPanelHeaderLayout);
        jPanelHeaderLayout.setHorizontalGroup(
            jPanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHeaderLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 710, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanelHeaderLayout.setVerticalGroup(
            jPanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelHeaderLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanelHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 120));

        jPanelFoodTable.setBackground(new java.awt.Color(84, 119, 146));

        jTableFoodMenu.setBackground(new java.awt.Color(245, 235, 224));
        jTableFoodMenu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTableFoodMenu.setForeground(new java.awt.Color(92, 64, 51));
        jTableFoodMenu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Food", "Price", "Qty", "Stat"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableFoodMenu.setGridColor(new java.awt.Color(245, 235, 224));
        jTableFoodMenu.setSelectionBackground(new java.awt.Color(245, 235, 224));
        jScrollPane1.setViewportView(jTableFoodMenu);

        jPanelFoodMenuText.setBackground(new java.awt.Color(245, 235, 224));

        jLabelSubtitle2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabelSubtitle2.setForeground(new java.awt.Color(92, 64, 51));
        jLabelSubtitle2.setText("FOOD MENU TABLE");

        javax.swing.GroupLayout jPanelFoodMenuTextLayout = new javax.swing.GroupLayout(jPanelFoodMenuText);
        jPanelFoodMenuText.setLayout(jPanelFoodMenuTextLayout);
        jPanelFoodMenuTextLayout.setHorizontalGroup(
            jPanelFoodMenuTextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFoodMenuTextLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabelSubtitle2, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(114, Short.MAX_VALUE))
        );
        jPanelFoodMenuTextLayout.setVerticalGroup(
            jPanelFoodMenuTextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFoodMenuTextLayout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jLabelSubtitle2)
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout jPanelFoodTableLayout = new javax.swing.GroupLayout(jPanelFoodTable);
        jPanelFoodTable.setLayout(jPanelFoodTableLayout);
        jPanelFoodTableLayout.setHorizontalGroup(
            jPanelFoodTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFoodTableLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanelFoodTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelFoodMenuText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelFoodTableLayout.setVerticalGroup(
            jPanelFoodTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFoodTableLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanelFoodMenuText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        getContentPane().add(jPanelFoodTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(-5, 120, 450, 440));

        jPanelActions.setBackground(new java.awt.Color(84, 119, 146));

        jLabelMessage.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelMessage.setForeground(new java.awt.Color(92, 64, 51));
        jLabelMessage.setText("Ready to reserve your order...");

        jLabelSubtitle4.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabelSubtitle4.setForeground(new java.awt.Color(85, 85, 85));
        jLabelSubtitle4.setText("Displays reservation confirmation or error messages");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelSubtitle4, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(jLabelSubtitle4)
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout jPanelActionsLayout = new javax.swing.GroupLayout(jPanelActions);
        jPanelActions.setLayout(jPanelActionsLayout);
        jPanelActionsLayout.setHorizontalGroup(
            jPanelActionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelActionsLayout.createSequentialGroup()
                .addGroup(jPanelActionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelActionsLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabelMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelActionsLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanelActionsLayout.setVerticalGroup(
            jPanelActionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelActionsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(106, 106, 106))
        );

        getContentPane().add(jPanelActions, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 560, 750, 80));

        jPanel3.setBackground(new java.awt.Color(84, 119, 146));

        jPanelReservation.setBackground(new java.awt.Color(245, 235, 224));

        jLabelSubtitle1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabelSubtitle1.setForeground(new java.awt.Color(92, 64, 51));
        jLabelSubtitle1.setText("RESERVATION");

        jLabelSelectFood.setBackground(new java.awt.Color(121, 85, 72));
        jLabelSelectFood.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelSelectFood.setForeground(new java.awt.Color(85, 85, 85));
        jLabelSelectFood.setText("Select Food");

        jLabelQuantity.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelQuantity.setForeground(new java.awt.Color(85, 85, 85));
        jLabelQuantity.setText("Quantity");

        jLabelTime.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelTime.setForeground(new java.awt.Color(85, 85, 85));
        jLabelTime.setText("Reserve Until");

        jComboBoxTime.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jComboBoxTime.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "9:30 AM", "10:00 AM", "10:30 AM", "11:00 AM", " " }));

        jSpinnerQuantity.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jSpinnerQuantity.setModel(new javax.swing.SpinnerNumberModel(1, 1, 32, 1));

        jComboBoxFood.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jComboBoxFood.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pizza", "Siomai", "Lumpia", "Chicken" }));

        jButtonReserve1.setBackground(new java.awt.Color(181, 136, 99));
        jButtonReserve1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonReserve1.setForeground(new java.awt.Color(255, 255, 255));
        jButtonReserve1.setText("Reserve Food");
        jButtonReserve1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.gray, java.awt.Color.gray, null, null));

        jButtonClear.setBackground(new java.awt.Color(245, 242, 242));
        jButtonClear.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonClear.setForeground(new java.awt.Color(60, 60, 60));
        jButtonClear.setText("Clear ");
        jButtonClear.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonClear.addActionListener(this::jButtonClearActionPerformed);

        javax.swing.GroupLayout jPanelReservationLayout = new javax.swing.GroupLayout(jPanelReservation);
        jPanelReservation.setLayout(jPanelReservationLayout);
        jPanelReservationLayout.setHorizontalGroup(
            jPanelReservationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelReservationLayout.createSequentialGroup()
                .addGroup(jPanelReservationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelReservationLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanelReservationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBoxTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelTime, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelSelectFood, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxFood, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSpinnerQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonReserve1, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                            .addComponent(jButtonClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanelReservationLayout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jLabelSubtitle1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanelReservationLayout.setVerticalGroup(
            jPanelReservationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelReservationLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabelSubtitle1)
                .addGap(45, 45, 45)
                .addComponent(jLabelSelectFood)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBoxFood, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabelQuantity)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSpinnerQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jLabelTime)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBoxTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jButtonReserve1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonClear, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addComponent(jPanelReservation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelReservation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 120, 340, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void initializeFoodItems() {
        foodItems = new ArrayList<>();
        foodItems.add(new FoodItem("Pizza", 50, 10));
        foodItems.add(new FoodItem("Siomai", 25, 15));
        foodItems.add(new FoodItem("Lumpia", 20, 12));
        foodItems.add(new FoodItem("Chicken", 60, 8));
        foodItems.add(new FoodItem("Tapsilog", 75, 12));
        foodItems.add(new FoodItem("Longsilog", 65, 12));
        foodItems.add(new FoodItem("Tocilog", 60, 12));
        foodItems.add(new FoodItem("Adobo", 55, 15));
        foodItems.add(new FoodItem("Sinigang", 70, 10));
        foodItems.add(new FoodItem("Kare-kare", 95, 8));
        foodItems.add(new FoodItem("Porkchop", 75, 10));
        foodItems.add(new FoodItem("Bangus", 80, 8));
        foodItems.add(new FoodItem("Fried Tilapia", 65, 10));
        foodItems.add(new FoodItem("Pancit", 45, 15));
        foodItems.add(new FoodItem("Giniling", 50, 12));
        foodItems.add(new FoodItem("Menudo", 55, 12));
        foodItems.add(new FoodItem("Rice", 15, 30));
    }

    private void populateFoodComboBox() {
        if (foodItems == null || jComboBoxFood == null) return;
        String[] names = foodItems.stream()
                .map(item -> item.name)
                .toArray(String[]::new);
        jComboBoxFood.setModel(new javax.swing.DefaultComboBoxModel<>(names));
    }

    private void setupTable() {
        model = (DefaultTableModel) jTableFoodMenu.getModel();

        model.setRowCount(0);
        for (FoodItem item : foodItems) {
            String status = statusForQuantity(item.quantity);
            model.addRow(new Object[] { item.name, String.valueOf(item.price), item.quantity, status });
        }

        jTableFoodMenu.setRowHeight(25);
    }

    private static String statusForQuantity(int quantity) {
        if (quantity <= 0) return "Out of Stock";
        if (quantity <= LOW_STOCK_THRESHOLD) return "Low stock";
        return "Available";
    }

    private void recalculateOverallTotal() {
        if (overallTotalLabel == null || reservationSummaryModel == null) return;
        int total = 0;
        for (int row = 0; row < reservationSummaryModel.getRowCount(); row++) {
            Object totalObj = reservationSummaryModel.getValueAt(row, 3);
            if (totalObj != null) {
                String totalStr = totalObj.toString().trim();
                if (totalStr.startsWith("₱")) totalStr = totalStr.substring(1).trim();
                try {
                    total += Integer.parseInt(totalStr);
                } catch (NumberFormatException ignored) { }
            }
        }
        overallTotalLabel.setText("Total Reserved Amount: ₱" + total);
    }

    private void setupActions() {
        jButtonReserve1.addActionListener(e -> reserveFood());
        // Clear button is already wired via designer to jButtonClearActionPerformed
        // Reset actions and summary table are initialized in initializeReservationSummary.
    }

    private void createMenuBar() {
        JMenuBar menuBar = new JMenuBar();

        JMenu menuFile = new JMenu("File");
        JMenuItem resetInventoryItem = new JMenuItem("Reset Inventory");
        resetInventoryItem.addActionListener(e -> resetInventory());
        JMenuItem exitItem = new JMenuItem("Exit");
        exitItem.addActionListener(e -> System.exit(0));
        menuFile.add(resetInventoryItem);
        menuFile.addSeparator();
        menuFile.add(exitItem);

        JMenu menuView = new JMenu("View");
        JMenuItem summaryItem = new JMenuItem("Reservation Summary");
        summaryItem.addActionListener(e -> showReservationSummaryDialog());
        menuView.add(summaryItem);

        JMenu menuHelp = new JMenu("Help");
        JMenuItem aboutItem = new JMenuItem("About");
        aboutItem.addActionListener(e -> showAboutDialog());
        menuHelp.add(aboutItem);

        menuBar.add(menuFile);
        menuBar.add(menuView);
        menuBar.add(menuHelp);

        setJMenuBar(menuBar);
    }

    private void initializeReservationSummary() {
        reservationSummaryModel = new DefaultTableModel(
                new Object[] { "Food", "Qty", "Time", "Total" }, 0);
    }

    private void reserveFood() {
        Object selectedFoodObject = jComboBoxFood.getSelectedItem();
        Object selectedTimeObject = jComboBoxTime.getSelectedItem();

        if (selectedFoodObject == null || selectedTimeObject == null) {
            jLabelMessage.setForeground(Color.RED);
            jLabelMessage.setText("Please select a food item and time.");
            return;
        }

        String selectedFood = selectedFoodObject.toString();
        int requestedQuantity = ((Number) jSpinnerQuantity.getValue()).intValue();

        if (requestedQuantity <= 0) {
            jLabelMessage.setForeground(Color.RED);
            jLabelMessage.setText("Quantity must be at least 1.");
            return;
        }

        if (requestedQuantity > MAX_PER_RESERVATION) {
            int choice = JOptionPane.showConfirmDialog(this,
                    "You\u2019re reserving more than " + MAX_PER_RESERVATION + " of this item. Are you sure?",
                    "Large quantity",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.WARNING_MESSAGE);
            if (choice != JOptionPane.YES_OPTION) {
                jLabelMessage.setForeground(new Color(85, 85, 85));
                jLabelMessage.setText("Reservation cancelled.");
                return;
            }
        }

        String time = selectedTimeObject.toString();

        for (int rowIndex = 0; rowIndex < foodItems.size(); rowIndex++) {
            FoodItem item = foodItems.get(rowIndex);

            if (item.name.equals(selectedFood)) {
                if (item.quantity <= 0) {
                    jLabelMessage.setForeground(Color.RED);
                    jLabelMessage.setText(selectedFood + " is out of stock.");
                    return;
                }

                if (requestedQuantity <= item.quantity) {
                    item.quantity -= requestedQuantity;
                    model.setValueAt(item.quantity, rowIndex, COLUMN_QUANTITY);
                    model.setValueAt(statusForQuantity(item.quantity), rowIndex, COLUMN_STATUS);

                    int totalPrice = item.price * requestedQuantity;

                    if (reservationSummaryModel != null) {
                        reservationSummaryModel.addRow(
                                new Object[] { selectedFood, requestedQuantity, time, "₱" + totalPrice });
                    }

                    recalculateOverallTotal();
                    jSpinnerQuantity.setValue(1);

                    StringBuilder message = new StringBuilder();
                    message.append("Reserved ")
                            .append(requestedQuantity)
                            .append(" ")
                            .append(selectedFood)
                            .append(" until ")
                            .append(time)
                            .append(". Total: ₱")
                            .append(totalPrice)
                            .append(". Remaining: ")
                            .append(item.quantity)
                            .append(".");

                    if (totalPrice > HIGH_TOTAL_WARNING) {
                        message.append(" (Large order!)");
                    }

                    if (item.quantity > 0 && item.quantity <= LOW_STOCK_THRESHOLD) {
                        message.append(" Low stock: only ").append(item.quantity).append(" left.");
                    }

                    jLabelMessage.setForeground(Color.GREEN);
                    jLabelMessage.setText(message.toString());
                } else {
                    jLabelMessage.setForeground(Color.RED);
                    jLabelMessage.setText("Not enough stock: requested " + requestedQuantity + ", available "
                            + item.quantity + ".");
                }

                return;
            }
        }

        jLabelMessage.setForeground(Color.RED);
        jLabelMessage.setText("Selected food not found.");
    }

    private void resetInventory() {
        initializeFoodItems();
        setupTable();
        if (reservationSummaryModel != null) {
            reservationSummaryModel.setRowCount(0);
        }
        recalculateOverallTotal();
        jLabelMessage.setForeground(new Color(85, 85, 85));
        jLabelMessage.setText("Inventory reset. Ready to reserve your order...");
    }

    private void showReservationSummaryDialog() {
        if (reservationSummaryModel == null || reservationSummaryModel.getRowCount() == 0) {
            JOptionPane.showMessageDialog(this,
                    "No reservations have been made yet.",
                    "Reservation Summary",
                    JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        JTable summaryTable = new JTable(reservationSummaryModel);
        summaryTable.setEnabled(false);

        JScrollPane scrollPane = new JScrollPane(summaryTable);
        scrollPane.setPreferredSize(new Dimension(420, 200));

        JOptionPane.showMessageDialog(this,
                scrollPane,
                "Reservation Summary",
                JOptionPane.INFORMATION_MESSAGE);
    }

    private void showAboutDialog() {
        JOptionPane.showMessageDialog(this,
                "CanteenReserve Duo\nReserve canteen food in advance.\nCreated by Honey & partner.",
                "About CanteenReserve Duo",
                JOptionPane.INFORMATION_MESSAGE);
    }

    private void cancelSelectedReservation() {
        if (reservationsTable == null || reservationSummaryModel == null) {
            jLabelMessage.setForeground(Color.RED);
            jLabelMessage.setText("Reservation list is not available.");
            return;
        }

        int selectedRow = reservationsTable.getSelectedRow();
        if (selectedRow == -1) {
            jLabelMessage.setForeground(Color.RED);
            jLabelMessage.setText("Select a reservation to cancel.");
            return;
        }

        String foodName = reservationSummaryModel.getValueAt(selectedRow, 0).toString();
        int quantity = Integer.parseInt(reservationSummaryModel.getValueAt(selectedRow, 1).toString());
        String time = reservationSummaryModel.getValueAt(selectedRow, 2).toString();

        FoodItem matchedItem = null;
        for (FoodItem item : foodItems) {
            if (item.name.equals(foodName)) {
                matchedItem = item;
                break;
            }
        }

        if (matchedItem == null) {
            jLabelMessage.setForeground(Color.RED);
            jLabelMessage.setText("Unable to find menu item for cancellation.");
            return;
        }

        matchedItem.quantity += quantity;

        for (int rowIndex = 0; rowIndex < model.getRowCount(); rowIndex++) {
            Object value = model.getValueAt(rowIndex, 0);
            if (value != null && value.toString().equals(foodName)) {
                model.setValueAt(matchedItem.quantity, rowIndex, COLUMN_QUANTITY);
                model.setValueAt(statusForQuantity(matchedItem.quantity), rowIndex, COLUMN_STATUS);
                break;
            }
        }

        reservationSummaryModel.removeRow(selectedRow);
        recalculateOverallTotal();

        jLabelMessage.setForeground(new Color(85, 85, 85));
        jLabelMessage.setText("Cancelled reservation: " + quantity + " " + foodName + " at " + time
                + ". Stock restored.");
    }

    private void cancelAllReservations() {
        if (reservationSummaryModel == null || reservationSummaryModel.getRowCount() == 0) {
            jLabelMessage.setForeground(new Color(85, 85, 85));
            jLabelMessage.setText("No reservations to cancel.");
            return;
        }

        int rowCount = reservationSummaryModel.getRowCount();
        for (int row = rowCount - 1; row >= 0; row--) {
            String foodName = reservationSummaryModel.getValueAt(row, 0).toString();
            int quantity = Integer.parseInt(reservationSummaryModel.getValueAt(row, 1).toString());

            for (FoodItem item : foodItems) {
                if (item.name.equals(foodName)) {
                    item.quantity += quantity;
                    break;
                }
            }
        }

        for (int rowIndex = 0; rowIndex < model.getRowCount(); rowIndex++) {
            Object nameObj = model.getValueAt(rowIndex, 0);
            if (nameObj == null) continue;
            String foodName = nameObj.toString();
            for (FoodItem item : foodItems) {
                if (item.name.equals(foodName)) {
                    model.setValueAt(item.quantity, rowIndex, COLUMN_QUANTITY);
                    model.setValueAt(statusForQuantity(item.quantity), rowIndex, COLUMN_STATUS);
                    break;
                }
            }
        }

        reservationSummaryModel.setRowCount(0);
        recalculateOverallTotal();
        jLabelMessage.setForeground(new Color(85, 85, 85));
        jLabelMessage.setText("All reservations cancelled and stock restored.");
    }

    private void jButtonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClearActionPerformed
        jSpinnerQuantity.setValue(1);
        jComboBoxFood.setSelectedIndex(0);
        jComboBoxTime.setSelectedIndex(0);
        jLabelMessage.setText("");
    }//GEN-LAST:event_jButtonClearActionPerformed

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> new CanteenReserveDuo().setVisible(true));
    }

    private void customizeUi() {
        jLabelMessage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelMessage.setForeground(new java.awt.Color(85, 85, 85));
        jButtonReserve1.setFocusPainted(false);
        jButtonClear.setFocusPainted(false);
        jTableFoodMenu.setFillsViewportHeight(true);
        jPanelReservation.setBorder(javax.swing.BorderFactory.createEmptyBorder(16, 16, 16, 16));

        reservationsTable = new JTable(reservationSummaryModel);
        reservationsTable.setEnabled(true);

        JScrollPane reservationsScrollPane = new JScrollPane(reservationsTable);
        reservationsScrollPane.setPreferredSize(new Dimension(420, 160));

        JLabel reservationsTitle = new JLabel("Today's Reservations");
        reservationsTitle.setFont(new java.awt.Font("Tahoma", java.awt.Font.BOLD, 14));
        reservationsTitle.setForeground(new Color(251, 251, 219));

        cancelReservationButton = new JButton("Cancel Selected");
        cancelReservationButton.addActionListener(e -> cancelSelectedReservation());
        cancelReservationButton.setFocusPainted(false);

        cancelAllReservationButton = new JButton("Cancel All");
        cancelAllReservationButton.addActionListener(e -> cancelAllReservations());
        cancelAllReservationButton.setFocusPainted(false);

        JPanel reservationButtonsPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 8, 4));
        reservationButtonsPanel.setOpaque(false);
        reservationButtonsPanel.add(cancelReservationButton);
        reservationButtonsPanel.add(cancelAllReservationButton);

        overallTotalLabel = new JLabel("Total Reserved Amount: ₱0");
        overallTotalLabel.setFont(new java.awt.Font("Tahoma", java.awt.Font.BOLD, 12));
        overallTotalLabel.setForeground(new Color(251, 251, 219));

        JPanel southPanel = new JPanel(new BorderLayout(0, 4));
        southPanel.setOpaque(false);
        southPanel.add(reservationButtonsPanel, BorderLayout.NORTH);
        southPanel.add(overallTotalLabel, BorderLayout.CENTER);

        JPanel reservationsPanel = new JPanel(new BorderLayout(0, 4));
        reservationsPanel.setOpaque(false);
        reservationsPanel.add(reservationsTitle, BorderLayout.NORTH);
        reservationsPanel.add(reservationsScrollPane, BorderLayout.CENTER);
        reservationsPanel.add(southPanel, BorderLayout.SOUTH);

        JPanel messagePanel = new JPanel(new BorderLayout());
        messagePanel.setOpaque(false);
        messagePanel.add(jPanel2, BorderLayout.NORTH);
        messagePanel.add(jLabelMessage, BorderLayout.SOUTH);

        jPanelActions.removeAll();
        jPanelActions.setLayout(new BorderLayout(0, 8));
        jPanelActions.add(messagePanel, BorderLayout.NORTH);
        jPanelActions.add(reservationsPanel, BorderLayout.CENTER);
        jPanelActions.revalidate();
        jPanelActions.repaint();
    }

    private static class FoodItem {
        private final String name;
        private final int price;
        private int quantity;

        private FoodItem(String name, int price, int quantity) {
            this.name = name;
            this.price = price;
            this.quantity = quantity;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonClear;
    private javax.swing.JButton jButtonReserve1;
    private javax.swing.JComboBox<String> jComboBoxFood;
    private javax.swing.JComboBox<String> jComboBoxTime;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelMessage;
    private javax.swing.JLabel jLabelQuantity;
    private javax.swing.JLabel jLabelSelectFood;
    private javax.swing.JLabel jLabelSubtitle;
    private javax.swing.JLabel jLabelSubtitle1;
    private javax.swing.JLabel jLabelSubtitle2;
    private javax.swing.JLabel jLabelSubtitle3;
    private javax.swing.JLabel jLabelSubtitle4;
    private javax.swing.JLabel jLabelTime;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanelActions;
    private javax.swing.JPanel jPanelFoodMenuText;
    private javax.swing.JPanel jPanelFoodTable;
    private javax.swing.JPanel jPanelHeader;
    private javax.swing.JPanel jPanelReservation;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinnerQuantity;
    private javax.swing.JTable jTableFoodMenu;
    // End of variables declaration//GEN-END:variables
}

