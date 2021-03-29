/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package electricity_billing;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author OWNER
 */
public class Old_customer extends Parson implements interface_class{
    int id;
    int address;
    
    
    
    public void pay_bill(int id,int pay){
        try {
            String sql3="select count(1) from bills where id='"+id+"' ";//to check if he pay before that
             ResultSet res1=stat.executeQuery(sql3);
             int count = 0;
             while(res1.next()){
               count=  res1.getInt("count(1)");
             }
             
            if(count==1){
                JOptionPane.showMessageDialog(null,"You paid before ","Error",JOptionPane.ERROR_MESSAGE);
                
                
            }else{
            
            String sql="UPDATE `customer` SET `payment`='"+pay+"' WHERE id='"+id+"'";
            
            int ch=0;
                    ch=stat.executeUpdate(sql);
            String n = null;
            
            if(ch==1){
                String sql1="select name from customer where id='"+id+"' ";
                ResultSet res=stat.executeQuery(sql1);
                while(res.next()){
                    n=res.getString("name");
                }
                String sql2="insert into bills(id,name,payment) value('"+id+"','"+n+"','"+pay+"') ";
                stat.executeUpdate(sql2);
                
                JOptionPane.showMessageDialog(null,"payment successful","successful",JOptionPane.INFORMATION_MESSAGE);
                
            }else{
                JOptionPane.showMessageDialog(null,"Check the electricity meter number","Error",JOptionPane.ERROR_MESSAGE);
            }
           
            }//end of Else statement
            
        } catch (Exception ex) {
                       JOptionPane.showMessageDialog(null,"enter price of payment","Error",JOptionPane.ERROR_MESSAGE);
        }
       
    }
    
    
    
    
   public void complain(int id,String s){
       
        try {
             String sql3="select count(1) from complain where id='"+id+"' ";
             ResultSet res1=stat.executeQuery(sql3);
             int count = 0;
             while(res1.next()){
               count=  res1.getInt("count(1)");
             }
             
            if(count==1){
                JOptionPane.showMessageDialog(null,"You complained before that ","Eroor",JOptionPane.ERROR_MESSAGE);
                
                
            }else{
                String sql="INSERT INTO complain(id, complain1) VALUES ('"+id+"','"+s+"')";
            
            
            int ch=stat.executeUpdate(sql);
            if(ch==1){
                JOptionPane.showMessageDialog(null,"your complain is regestered","successful",JOptionPane.INFORMATION_MESSAGE);
                
            }else{
                JOptionPane.showMessageDialog(null,"Error Massge","Error",JOptionPane.ERROR_MESSAGE);
                
            } 
        }
        } catch (SQLException ex) {
            Logger.getLogger(Old_customer.class.getName()).log(Level.SEVERE, null, ex);
        }
      
      
   }
   
   
   
    public void view_bill(int id,JLabel l2,JLabel l3){
        
        try {
            String sql="select *from bills where id='"+id+"'";
            
            ResultSet res=stat.executeQuery(sql);
            while(res.next()){
                l2.setText(res.getString("name"));
                l3.setText(res.getString("payment")+" ");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Operator.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    
}
}
