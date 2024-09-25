
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class Search extends javax.swing.JFrame {

   Connection con;
   ResultSet rs;
   PreparedStatement pst;
    public Search() {
        initComponents();
         try {
           Class.forName("com.mysql.cj.jdbc.Driver");
           con=DriverManager.getConnection("jdbc:mysql://localhost:3308/employeesystem","root","");
           pst=con.prepareStatement("select * from employees");
           rs=pst.executeQuery();
           ResultSetMetaData rsmd=rs.getMetaData();
           int n=rsmd.getColumnCount();
           DefaultTableModel dtm=(DefaultTableModel) jtablesearch.getModel();
           dtm.setRowCount(0);
           while(rs.next()){
               Vector v=new Vector();
               for(int i=1;i<=n;i++){
                   v.add(rs.getString("ID"));
                   v.add(rs.getString("EmployeeName"));
                   v.add(rs.getString("Department"));
                   v.add(rs.getString("Designation"));
                   v.add(rs.getString("EPFNO"));
               }
               dtm.addRow(v);
           }
           
       } catch (ClassNotFoundException ex) {
           Logger.getLogger(Addemployees.class.getName()).log(Level.SEVERE, null, ex);
       } catch (SQLException ex) {
           Logger.getLogger(Addemployees.class.getName()).log(Level.SEVERE, null, ex);
       }
    }

    private void searching(String str){
        DefaultTableModel dtm=(DefaultTableModel) jtablesearch.getModel();
        TableRowSorter<DefaultTableModel> tr=new TableRowSorter<>(dtm);
        jtablesearch.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(str));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtablesearch = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        semployeeid = new javax.swing.JTextField();
        serchdepartment = new javax.swing.JTextField();
        searchdesignation = new javax.swing.JTextField();
        searchlogoutbutton = new javax.swing.JButton();
        searchbackbutton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 102));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Search");

        jtablesearch.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "EmployeeName", "Department", "Designation"
            }
        ));
        jScrollPane1.setViewportView(jtablesearch);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Employee ID:");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Department:");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Designatino:");

        semployeeid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                semployeeidKeyReleased(evt);
            }
        });

        serchdepartment.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                serchdepartmentKeyReleased(evt);
            }
        });

        searchdesignation.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchdesignationKeyReleased(evt);
            }
        });

        searchlogoutbutton.setBackground(new java.awt.Color(0, 51, 204));
        searchlogoutbutton.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        searchlogoutbutton.setForeground(new java.awt.Color(255, 255, 255));
        searchlogoutbutton.setText("Logout");
        searchlogoutbutton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        searchlogoutbutton.setContentAreaFilled(false);
        searchlogoutbutton.setOpaque(true);
        searchlogoutbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchlogoutbuttonActionPerformed(evt);
            }
        });

        searchbackbutton.setBackground(new java.awt.Color(0, 102, 153));
        searchbackbutton.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        searchbackbutton.setForeground(new java.awt.Color(255, 255, 255));
        searchbackbutton.setText("Back");
        searchbackbutton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        searchbackbutton.setContentAreaFilled(false);
        searchbackbutton.setOpaque(true);
        searchbackbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchbackbuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(454, 454, 454)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(semployeeid, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(serchdepartment, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchdesignation, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(searchbackbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(searchlogoutbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(57, 57, 57))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchlogoutbutton)
                    .addComponent(searchbackbutton))
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(semployeeid, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(serchdepartment, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(searchdesignation, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)))
                .addGap(42, 42, 42)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void semployeeidKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_semployeeidKeyReleased
        String searchString = semployeeid.getText();
        searching(searchString);
    }//GEN-LAST:event_semployeeidKeyReleased

    private void serchdepartmentKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_serchdepartmentKeyReleased
        String searchString = serchdepartment.getText();
        searching(searchString);
    }//GEN-LAST:event_serchdepartmentKeyReleased

    private void searchdesignationKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchdesignationKeyReleased
        String searchString = searchdesignation.getText();
        searching(searchString);
    }//GEN-LAST:event_searchdesignationKeyReleased

    private void searchlogoutbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchlogoutbuttonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_searchlogoutbuttonActionPerformed

    private void searchbackbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchbackbuttonActionPerformed
        new Addemployees().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_searchbackbuttonActionPerformed

    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Search().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtablesearch;
    private javax.swing.JButton searchbackbutton;
    private javax.swing.JTextField searchdesignation;
    private javax.swing.JButton searchlogoutbutton;
    private javax.swing.JTextField semployeeid;
    private javax.swing.JTextField serchdepartment;
    // End of variables declaration//GEN-END:variables
}
