
package InstitutePackgae;

import InstituteClass.DepartmentClass;
import InstituteClass.EmployeeClass;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import javax.swing.JTextArea;


public class SearchFrame extends javax.swing.JFrame {

    public SearchFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnSearchD = new javax.swing.JButton();
        btnSearchE = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaAllInformation = new javax.swing.JTextArea();
        txtDepartmentIDSearch = new javax.swing.JTextField();
        txtEmployeeIDSearch = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(115, 167, 206));

        jLabel1.setFont(new java.awt.Font("Stencil", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Search Information ");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/InstitutePackgae/NEWBLUE.png"))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(199, 220, 240));

        btnSearchD.setBackground(new java.awt.Color(93, 145, 193));
        btnSearchD.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnSearchD.setText("Search");
        btnSearchD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchDActionPerformed(evt);
            }
        });

        btnSearchE.setBackground(new java.awt.Color(93, 145, 193));
        btnSearchE.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnSearchE.setText("Search");
        btnSearchE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchEActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setText("Department ID");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setText("Employee ID");

        txtAreaAllInformation.setColumns(20);
        txtAreaAllInformation.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtAreaAllInformation.setRows(5);
        jScrollPane1.setViewportView(txtAreaAllInformation);

        txtDepartmentIDSearch.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        txtDepartmentIDSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDepartmentIDSearchActionPerformed(evt);
            }
        });

        txtEmployeeIDSearch.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N

        jButton1.setBackground(new java.awt.Color(93, 145, 193));
        jButton1.setFont(new java.awt.Font("SimSun-ExtB", 2, 24)); // NOI18N
        jButton1.setText("Logout");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtDepartmentIDSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEmployeeIDSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSearchE)
                            .addComponent(btnSearchD)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 941, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(348, 348, 348)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtDepartmentIDSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearchD))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmployeeIDSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearchE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnBack.setBackground(new java.awt.Color(136, 197, 253));
        btnBack.setFont(new java.awt.Font("Stencil", 1, 24)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBack)
                .addGap(50, 50, 50)
                .addComponent(jLabel1)
                .addGap(41, 41, 41)
                .addComponent(jLabel2)
                .addGap(108, 108, 108))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchDActionPerformed
        String Keyword = txtDepartmentIDSearch.getText();
        
        if (Keyword.isEmpty()) 
        {
            JOptionPane.showMessageDialog(null, "Sorry! You Have To Enter ID.",
                    "Search",JOptionPane.WARNING_MESSAGE);
        } 
        else 
        {
            DepartmentClass Department = new DepartmentClass();
            
            String DepartmentInformation = "Department ID\tDepartment Name\tDepartment Floor\tDepartment Lab\tDepartment Type\n---------------------------------------------------------------------------------------------------------------------------------------------------\n";
            
            if (Department.SearchDepartmentID(Keyword)) 
            {
                txtAreaAllInformation.setText(DepartmentInformation + Department.getDepartmentID()+"\t"+
                        Department.getDepartmentName()+"\t"+Department.getDepartmentLocationF()+"\t"+
                        Department.getDepartmentLocationL()+"\t"+Department.getDepartmentType());
            } 
            else 
            {
                JOptionPane.showMessageDialog(null, "Sorry! No Department ID Matching.",
                        "Search",JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnSearchDActionPerformed

    private void btnSearchEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchEActionPerformed
        String Keyword = txtEmployeeIDSearch.getText();
        
        if (Keyword.isEmpty()) 
        {
            JOptionPane.showMessageDialog(null, "Sorry! You Have To Enter ID.",
                    "Search",JOptionPane.WARNING_MESSAGE);
        } 
        else 
        {
            EmployeeClass Employee = new EmployeeClass();
            
            String EmployeeInformation = "Employee ID\tEmployee FullName\tAge\tAddress\tDOB\tGender\tPhone Number\tEmail\tDepartment\tDesignation\n--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n";
            
            if (Employee.searchEmployee(Keyword)) 
            {
                txtAreaAllInformation.setText(EmployeeInformation + Employee.getEmployeeID()+"\t"+
                        Employee.getEmployeeFirstName()+"\t"+Employee.getEmployeeLastName()+"\t"+
                        Employee.getAge()+"\t"+Employee.getDOB()+"\t"+Employee.getGender()+"\t"+
                        Employee.getPhoneNumber()+"\t"+Employee.getEmail()+"\t"+
                        Employee.getAddress()+"\t"+Employee.getDepartment()+"\t"+Employee.getDesignation());
            } 
            else 
            {
                JOptionPane.showMessageDialog(null, "Sorry! No Employee ID Matching.",
                        "Search",JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnSearchEActionPerformed

    private void txtDepartmentIDSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDepartmentIDSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDepartmentIDSearchActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new LoginFrame().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
       MainFrame mainFrame = new MainFrame();
        mainFrame.show();
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

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
            java.util.logging.Logger.getLogger(SearchFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSearchD;
    private javax.swing.JButton btnSearchE;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtAreaAllInformation;
    private javax.swing.JTextField txtDepartmentIDSearch;
    private javax.swing.JTextField txtEmployeeIDSearch;
    // End of variables declaration//GEN-END:variables
}
