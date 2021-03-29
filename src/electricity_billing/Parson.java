/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package electricity_billing;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author OWNER
 */
public  class Parson {
    
    String name;
    String username;
    String password;
    String email;
    
    
    
    Connection con;
     Statement stat;
            
    
    
    Parson(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/database1","root","root1234");
            
            
            stat =con.createStatement();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Parson.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Parson.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public void login(String name,String pass){
        int count = 0;
        try {
            
            
            String sql="select count(1) from customer where username='"+name+"'and password='"+pass+"' ";
            
            ResultSet res=stat.executeQuery(sql);
            while(res.next()){
                count =res.getInt("count(1)");
            }
            if(count==1){
                JOptionPane.showMessageDialog(null,"Login Sucessfully","sucess",JOptionPane.INFORMATION_MESSAGE);
                String sql1="select id from customer where username='"+name+"'and password='"+pass+"' ";
            
                 ResultSet res1=stat.executeQuery(sql1);
                 int ID = 0;
            while(res1.next()){
                ID =res1.getInt("id");
            }
                Control_By_Customer c=new Control_By_Customer(ID);
                c.setSize(650, 550);
                c.setLocation(650, 250);
                 c.setVisible(true);
                 
                
            }else{
                sql="select count(1) from operator where username='"+name+"'and password='"+pass+"' ";
                
                res=stat.executeQuery(sql);
                
                while(res.next()){
                    count =res.getInt("count(1)");
                }
                if(count==1){
                    JOptionPane.showMessageDialog(null,"Login Sucessfully","sucess",JOptionPane.INFORMATION_MESSAGE);
                    Control_By_Operator c=new Control_By_Operator();
                    c.setSize(825, 590);
                    c.setLocation(650, 250);
                     c.setVisible(true);
                      
                }else{
                    sql="select count(1) from admin where username='"+name+"' and password='"+pass+"' ";
                
                res=stat.executeQuery(sql);
                
                while(res.next()){
                    count =res.getInt("count(1)");
                }
                if(count==1){
                    JOptionPane.showMessageDialog(null,"Login Sucessfully","sucess",JOptionPane.INFORMATION_MESSAGE);
                    Control_By_Admin l= new Control_By_Admin();
                    l.setSize(725, 550);
                   l.setLocation(650, 250);
                   l.setVisible(true);
                }else{
                    JOptionPane.showMessageDialog(null,"invaled password or username","Error",JOptionPane.ERROR_MESSAGE);
                    Login n=new Login();
                    n.setSize(725, 550);
                    n.setLocation(650, 250);
                    n.setVisible(true);
                    
                }
                
                }
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(Parson.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
        
    }
    
    
    
    
    
    
    
   

    
}
