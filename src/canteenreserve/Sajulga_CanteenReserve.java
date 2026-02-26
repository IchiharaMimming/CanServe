/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package canteenreserve;

/**
 *
 * @author Honey
 */

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.SpinnerNumberModel;
import javax.swing.table.DefaultTableModel;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

    /**
     * Main canteen reservation window.
     * Displays menu items and lets the user reserve food until a selected time.
     */
    public class Sajulga_CanteenReserve extends javax.swing.JFrame {

        private static final int COLUMN_QUANTITY = 2;
        private static final int COLUMN_STATUS = 3;

        private DefaultTableModel model;
        private List<FoodItem> foodItems;

    public Sajulga_CanteenReserve() {
        initComponents();

        initializeFoodItems();
        setupTable();
        setupActions();
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
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelHeader.setBackground(new java.awt.Color(84, 119, 146));

        jPanel1.setBackground(new java.awt.Color(136, 171, 200));
        jPanel1.setLayout(null);

        jLabelTitle.setBackground(new java.awt.Color(92, 64, 51));
        jLabelTitle.setFont(new java.awt.Font("Ravie", 1, 36)); // NOI18N
        jLabelTitle.setForeground(new java.awt.Color(251, 251, 219));
        jLabelTitle.setText("CanteenReserve");
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
        jLabelSubtitle.setBounds(10, 60, 459, 29);

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
        jComboBoxTime.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "9:30 AM", "10:00 AM", "10:30 AM", "11:00 AM" }));

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
    }

    private void setupTable() {
        model = (DefaultTableModel) jTableFoodMenu.getModel();

        model.setRowCount(0);
        for (FoodItem item : foodItems) {
            String status = item.quantity > 0 ? "Available" : "Out of Stock";
            model.addRow(new Object[] { item.name, String.valueOf(item.price), item.quantity, status });
        }

        jTableFoodMenu.setRowHeight(25);
    }

    private void setupActions() {
        jButtonReserve1.addActionListener(e -> reserveFood());
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

                    if (item.quantity == 0) {
                        model.setValueAt("Out of Stock", rowIndex, COLUMN_STATUS);
                    }

                    jLabelMessage.setForeground(Color.GREEN);
                    jLabelMessage.setText("Reserved " + requestedQuantity + " " + selectedFood + " until " + time
                            + ". Remaining: " + item.quantity + ".");
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

    private void jButtonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClearActionPerformed
        jSpinnerQuantity.setValue(1);
        jComboBoxFood.setSelectedIndex(0);
        jComboBoxTime.setSelectedIndex(0);
        jLabelMessage.setText("");
    }//GEN-LAST:event_jButtonClearActionPerformed

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> new Sajulga_CanteenReserve().setVisible(true));
    }

    private void customizeUi() {
        jLabelMessage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelMessage.setForeground(new java.awt.Color(85, 85, 85));
        jButtonReserve1.setFocusPainted(false);
        jButtonClear.setFocusPainted(false);
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
