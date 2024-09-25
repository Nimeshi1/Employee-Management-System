
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;



public class Welcome extends javax.swing.JFrame {

    
    public Welcome() {
        initComponents();
        
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        hrloginbutton = new javax.swing.JButton();
        assistantloginbutton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        singupbutton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        hrloginbutton.setBackground(new java.awt.Color(102, 102, 255));
        hrloginbutton.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        hrloginbutton.setForeground(new java.awt.Color(255, 255, 255));
        hrloginbutton.setText("HR Manager");
        hrloginbutton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        hrloginbutton.setContentAreaFilled(false);
        hrloginbutton.setOpaque(true);
        hrloginbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hrloginbuttonActionPerformed(evt);
            }
        });
        jPanel1.add(hrloginbutton);
        hrloginbutton.setBounds(30, 100, 370, 50);

        assistantloginbutton.setBackground(new java.awt.Color(102, 102, 255));
        assistantloginbutton.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        assistantloginbutton.setForeground(new java.awt.Color(255, 255, 255));
        assistantloginbutton.setText("Assistant");
        assistantloginbutton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        assistantloginbutton.setContentAreaFilled(false);
        assistantloginbutton.setOpaque(true);
        assistantloginbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assistantloginbuttonActionPerformed(evt);
            }
        });
        jPanel1.add(assistantloginbutton);
        assistantloginbutton.setBounds(30, 170, 370, 50);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 153));
        jLabel2.setText("LOGIN");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(160, 30, 130, 50);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 26)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 153));
        jLabel3.setText("Create a new account:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(30, 270, 252, 31);

        singupbutton.setBackground(new java.awt.Color(51, 204, 0));
        singupbutton.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        singupbutton.setForeground(new java.awt.Color(255, 255, 255));
        singupbutton.setText("Sing Up");
        singupbutton.setContentAreaFilled(false);
        singupbutton.setOpaque(true);
        singupbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                singupbuttonActionPerformed(evt);
            }
        });
        jPanel1.add(singupbutton);
        singupbutton.setBounds(290, 270, 120, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/logo5.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setSize(new java.awt.Dimension(1107, 464));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void hrloginbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hrloginbuttonActionPerformed
        try {
            new LoginPage().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(Welcome.class.getName()).log(Level.SEVERE, null, ex);
        }
    this.setVisible(false);
     
    }//GEN-LAST:event_hrloginbuttonActionPerformed

    private void assistantloginbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assistantloginbuttonActionPerformed
        try {
            new LoginPage1().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(Welcome.class.getName()).log(Level.SEVERE, null, ex);
        }
       this.setVisible(false);
    }//GEN-LAST:event_assistantloginbuttonActionPerformed

    private void singupbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_singupbuttonActionPerformed
      
       new Singup().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_singupbuttonActionPerformed

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
               new Welcome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assistantloginbutton;
    private javax.swing.JButton hrloginbutton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton singupbutton;
    // End of variables declaration//GEN-END:variables
}
