/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package electricity_billing;

import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author OWNER
 */
public class show_billing extends javax.swing.JFrame {

    /**
     * Creates new form show_billing
     */
    DefaultTableModel dtm=new DefaultTableModel();
    public show_billing() {
        initComponents();
        table2.setModel(dtm);
        Operator o=new Operator();
        o.invoice(dtm);
        
        
        scroll.setOpaque(false);
        scroll.setBackground(new Color(0,0,0,0));
        scroll.getViewport().setOpaque(false);
       
        
        
        table2.setGridColor(new Color(0,0,0,0));
        table2.setBackground(new Color(0,0,0,0));
        table2.setOpaque(false);
        
        
        b1.setBackground(new Color(0,0,0,0));
         b2.setBackground(new Color(0,0,0,0));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        scroll = new javax.swing.JScrollPane();
        table2 = new javax.swing.JTable();
        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jLabel1.setText("                                please select on one Row");

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton4.setText("Back");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Show Billing");
        getContentPane().setLayout(null);

        table2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        table2.setForeground(new java.awt.Color(204, 0, 0));
        table2.setModel(new javax.swing.table.DefaultTableModel(
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
        table2.setOpaque(false);
        scroll.setViewportView(table2);

        getContentPane().add(scroll);
        scroll.setBounds(0, 0, 730, 260);

        b1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        b1.setForeground(new java.awt.Color(0, 255, 255));
        b1.setText("Show");
        b1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(102, 255, 255), new java.awt.Color(0, 153, 153), null, null));
        b1.setOpaque(false);
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        getContentPane().add(b1);
        b1.setBounds(500, 360, 162, 44);

        b2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        b2.setForeground(new java.awt.Color(51, 255, 0));
        b2.setText("Back");
        b2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(102, 255, 51), new java.awt.Color(102, 255, 102), null, null));
        b2.setOpaque(false);
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });
        getContentPane().add(b2);
        b2.setBounds(20, 370, 110, 44);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/electricity_billing/picture5.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 730, 510);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        // TODO add your handling code here:
//        int row=table.getSelectedRow();
//        int id =(int) table.getValueAt(row, 0);
        int row=0;
        
        
        try
        { row=table2.getSelectedRow();
         
        int id =(int) table2.getValueAt(row, 0);
         
        Bill o=new Bill(id);
        o.setSize(670, 540);
        o.setLocation(650, 250);
       o.setVisible(true);
        }catch(Exception e){
           JOptionPane.showMessageDialog(null,"please select on one row","success",JOptionPane.INFORMATION_MESSAGE);
           show_billing s=new show_billing();
           s.setSize(700, 550);
        s.setLocation(650, 250);
       s.setVisible(true);
       this.dispose();
        }
        this.dispose();
        
        
        
        
    }//GEN-LAST:event_b1ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        // TODO add your handling code here:
        Control_By_Operator c=new Control_By_Operator();
        c.setSize(825, 590);
        c.setLocation(650, 250);
       c.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_b2ActionPerformed

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
            java.util.logging.Logger.getLogger(show_billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(show_billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(show_billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(show_billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new show_billing().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane scroll;
    private javax.swing.JTable table2;
    // End of variables declaration//GEN-END:variables
}