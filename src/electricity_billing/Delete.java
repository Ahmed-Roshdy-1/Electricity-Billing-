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
public class Delete extends javax.swing.JFrame {

    /**
     * Creates new form Delete
     */
    DefaultTableModel dtm=new DefaultTableModel();
    public Delete() {
        initComponents();
        
        table.setModel(dtm);
        Operator o=new Operator();
        o.show_customer_info(dtm);
        
        
        
         scroll.setOpaque(false);
        scroll.setBackground(new Color(0,0,0,0));
        scroll.getViewport().setOpaque(false);
       
        
        
        table.setGridColor(new Color(0,0,0,0));
        table.setBackground(new Color(0,0,0,0));
        table.setOpaque(false);
        
        
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

        jButton2 = new javax.swing.JButton();
        scroll = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Delete customer");
        getContentPane().setLayout(null);

        table.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        table.setForeground(new java.awt.Color(51, 255, 255));
        table.setModel(new javax.swing.table.DefaultTableModel(
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
        scroll.setViewportView(table);

        getContentPane().add(scroll);
        scroll.setBounds(0, 0, 758, 248);

        b1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        b1.setForeground(new java.awt.Color(255, 51, 0));
        b1.setText("Delete");
        b1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(0, 255, 255), new java.awt.Color(0, 255, 255), null, null));
        b1.setOpaque(false);
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        getContentPane().add(b1);
        b1.setBounds(567, 370, 159, 50);

        b2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        b2.setForeground(new java.awt.Color(102, 255, 51));
        b2.setText("Back");
        b2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(255, 51, 204), new java.awt.Color(255, 0, 255), null, null));
        b2.setOpaque(false);
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });
        getContentPane().add(b2);
        b2.setBounds(38, 370, 120, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/electricity_billing/pictuer9.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(1, -4, 760, 510);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        // TODO add your handling code here:
        try
        {int row=table.getSelectedRow();
        int id=(int ) table.getValueAt(row,0);
        Operator o=new Operator();
        o.Delete_Customer(id);
        JOptionPane.showMessageDialog(null,"Delete costomer ","Success",JOptionPane.INFORMATION_MESSAGE);
        this.dispose();
        Delete d=new Delete();
        
        d.setSize(750, 550);
        d.setLocation(650, 250);
       
        d.setVisible(true);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"please select on one row","sucess",JOptionPane.INFORMATION_MESSAGE);
            Delete d=new Delete();
        d.setSize(750, 550);
        d.setLocation(650, 250);
       d.setVisible(true);
       this.dispose();

        }
        
        
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
            java.util.logging.Logger.getLogger(Delete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Delete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Delete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Delete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Delete().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane scroll;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
