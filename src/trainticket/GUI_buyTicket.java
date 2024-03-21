/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package trainticket;

import DBM.FileManager;
import User.GUI_PassengerMainMenu;
import User.Passenger;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import trainticket.TicketBooking.GUI_Booking;

/**
 *
 * @author jingwen
 */
public class GUI_buyTicket extends javax.swing.JFrame {

    /**
     * Creates new form GUI_showTrainSchedule
     */
    private Passenger current_passenger;
    
    public GUI_buyTicket(Passenger currentPassenger) {
        this.current_passenger = currentPassenger;
        initComponents();
        displayTrainScheduleTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        trainScheduleTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        buyTicketButton = new javax.swing.JButton();
        BackToMainMenuButton = new javax.swing.JButton();
        trainScheduleIDTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        trainScheduleTable.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        trainScheduleTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ScheduleID", "Train Number", "Departure Time", "Arrival Time", "Departure Location", "Arrival Location"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        trainScheduleTable.setRowHeight(24);
        jScrollPane2.setViewportView(trainScheduleTable);

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 36)); // NOI18N
        jLabel2.setText("Train Schedules");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 792, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(254, 254, 254)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel2)
                .addGap(29, 29, 29)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 458, Short.MAX_VALUE)
                .addContainerGap())
        );

        buyTicketButton.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        buyTicketButton.setText("Buy Ticket");
        buyTicketButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buyTicketButtonActionPerformed(evt);
            }
        });

        BackToMainMenuButton.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        BackToMainMenuButton.setText("Back");
        BackToMainMenuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackToMainMenuButtonActionPerformed(evt);
            }
        });

        trainScheduleIDTextField.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel1.setText("Train Schedule ID:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buyTicketButton, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(trainScheduleIDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(BackToMainMenuButton)
                    .addContainerGap(711, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(trainScheduleIDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buyTicketButton)
                .addGap(19, 19, 19))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(624, Short.MAX_VALUE)
                    .addComponent(BackToMainMenuButton)
                    .addGap(16, 16, 16)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackToMainMenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackToMainMenuButtonActionPerformed
        // TODO add your handling code here:
        GUI_PassengerMainMenu passengerMainMenu = new GUI_PassengerMainMenu(current_passenger);
        passengerMainMenu.setVisible(true);
        dispose();
    }//GEN-LAST:event_BackToMainMenuButtonActionPerformed

    private void buyTicketButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buyTicketButtonActionPerformed
        // TODO add your handling code here:
        String enteredTrainScheduleID = trainScheduleIDTextField.getText();
        String[] savedData = searchForRespectiveTrain(enteredTrainScheduleID);
        if(savedData[3].equals("Not Found")){
            JOptionPane.showMessageDialog(null, "Incorrect Train Schedule ID");
        } else{
            Train buyTicket = new Train(savedData);
            GUI_Booking gui_booking = new GUI_Booking(buyTicket,current_passenger);
            gui_booking.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_buyTicketButtonActionPerformed

    public void displayTrainScheduleTable(){
        // read dataline from file
        DefaultTableModel model = (DefaultTableModel) trainScheduleTable.getModel();
        FileManager getrow = new FileManager("/Assets/trainschedules.txt");
        ArrayList<String> rows =  getrow.readFile();

        // Separate line into data
        // ArrayList with String
        for(int i=0 ; i< rows.size();i++){
            String line = rows.get(i);
            // System.out.println(line);
            String[] data = line.split("\\|");
            if(data[6].equals("Pending")){
                model.addRow(data);
            }
        }
        System.out.println(rows.get(0));
    }
    
    public static String[] searchForRespectiveTrain(String trainScheduleNumber){
       FileManager file = new FileManager("/Assets/trainschedules.txt");
        ArrayList<String[]> allTrainSchedule = file.saveTo2DArrayList();
        String[] savedData = new String[6];
        boolean isFound = false;

        for(String[] data : allTrainSchedule){
            if(trainScheduleNumber.equals(data[0])){
                savedData = data;
                isFound = true;
                break;
            }
        }

        if(!isFound){
            savedData[3]="Not Found";
        }
        return savedData;
    }
    
    
    
    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
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
//            java.util.logging.Logger.getLogger(GUI_showTrainSchedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(GUI_showTrainSchedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(GUI_showTrainSchedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(GUI_showTrainSchedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new GUI_showTrainSchedule().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackToMainMenuButton;
    private javax.swing.JButton buyTicketButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField trainScheduleIDTextField;
    private javax.swing.JTable trainScheduleTable;
    // End of variables declaration//GEN-END:variables
}