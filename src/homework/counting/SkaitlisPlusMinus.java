/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework.counting;

/**
 *
 * @author r2k
 */
public class SkaitlisPlusMinus extends javax.swing.JFrame {

    /**
     * Creates new form SkaitlisPlusMinus
     */
    public SkaitlisPlusMinus() {
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

        btnPlusViens = new javax.swing.JButton();
        brnMinusViens = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        tfSkaitlis = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnPlusViens.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnPlusViens.setText("+1");
        btnPlusViens.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlusViensActionPerformed(evt);
            }
        });

        brnMinusViens.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        brnMinusViens.setText("-1");
        brnMinusViens.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brnMinusViensActionPerformed(evt);
            }
        });

        btnReset.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        tfSkaitlis.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        tfSkaitlis.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfSkaitlis.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnReset, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                    .addComponent(brnMinusViens, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPlusViens, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(79, 79, 79)
                .addComponent(tfSkaitlis, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(171, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(btnPlusViens, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tfSkaitlis, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addComponent(brnMinusViens, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(108, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPlusViensActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlusViensActionPerformed
//        System.out.println("Poga nospiesta");
//          tfSkaitlis.setText("1");
        String strSk = tfSkaitlis.getText();
        int intSk = Integer.parseInt(strSk);
        int sum;
        sum = intSk + 1;
        //1
//        
//        tfSkaitlis.setText(Integer.toString(sum));
        tfSkaitlis.setText(String.valueOf(sum));
//        tfSkaitlis.setText(sum + "");
//        tfSkaitlis.setText(Integer.parseInt(tfSkaitlis.getText()) + 1 + "");

    
    }//GEN-LAST:event_btnPlusViensActionPerformed

    private void brnMinusViensActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brnMinusViensActionPerformed
        String strSk = tfSkaitlis.getText();
        int intSk = Integer.parseInt(strSk);
        int sum;
        sum = intSk - 1;
        tfSkaitlis.setText(String.valueOf(sum));
    }//GEN-LAST:event_brnMinusViensActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        tfSkaitlis.setText("0");
    }//GEN-LAST:event_btnResetActionPerformed

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
            java.util.logging.Logger.getLogger(SkaitlisPlusMinus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SkaitlisPlusMinus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SkaitlisPlusMinus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SkaitlisPlusMinus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SkaitlisPlusMinus().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton brnMinusViens;
    private javax.swing.JButton btnPlusViens;
    private javax.swing.JButton btnReset;
    private javax.swing.JTextField tfSkaitlis;
    // End of variables declaration//GEN-END:variables
}
