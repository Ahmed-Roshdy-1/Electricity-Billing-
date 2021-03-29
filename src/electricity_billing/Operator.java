/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package electricity_billing;


import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author OWNER
 */
public class Operator extends Parson implements Interface_Class2{
    int id;
       

    
    
    Operator(){

       
    }
 
    public  void invoice(DefaultTableModel dtm){
        
        try {
            dtm.addColumn("meter_number");
            dtm.addColumn("name");
            dtm.addColumn("payment");
            
            String sql="select * from bills";
            ResultSet res=stat.executeQuery(sql);
            while(res.next()){
                dtm.addRow(new Object[]{res.getInt("id"),res.getString("name"),res.getString("payment")});
            }
        } catch (SQLException ex) {
            Logger.getLogger(Operator.class.getName()).log(Level.SEVERE, null, ex);
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
public int collect_payment(){
    int x=0;
        try {
            
            String sql="SELECT SUM(payment) from bills ";
            ResultSet res =stat.executeQuery(sql);
            while(res.next()){
                x=res.getInt("SUM(payment)");
                
            }   } catch (SQLException ex) {
            Logger.getLogger(Operator.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return x;
        
}
public void validate_meter(int id,JLabel l){
        try {
            int count = 0;
            
            
            
            String sql="select count(1) from customer where id='"+id+"' ";
            
            ResultSet res=stat.executeQuery(sql);
            while(res.next()){
                count =res.getInt("count(1)");
            }
            if(count==1){
              l.setText("'"+id+"' is Validated");
            }else{
                    l.setText("not Validated");

            }
        } catch (SQLException ex) {
            Logger.getLogger(Operator.class.getName()).log(Level.SEVERE, null, ex);
        }
}
public void Delete_Customer(int id){
    
        try {
            String sql="delete from customer where id='"+id+"'";
            
            int res=stat.executeUpdate(sql);
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Operator.class.getName()).log(Level.SEVERE, null, ex);
        }
   
   
    
}
public  void show_customer_info(DefaultTableModel dtm){//to delete selected row
        
        try {
            dtm.addColumn("meter_number");
            dtm.addColumn("name");
            dtm.addColumn("username");
            dtm.addColumn("password");
            dtm.addColumn("email");
            dtm.addColumn("payment");
            
            
            String sql="select * from customer";
            ResultSet res=stat.executeQuery(sql);
            while(res.next()){
                dtm.addRow(new Object[]{res.getInt("id"),res.getString("name"),res.getString("username"),res.getString("password"),res.getString("email"),res.getString("payment")});
            }
        } catch (SQLException ex) {
            Logger.getLogger(Operator.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
