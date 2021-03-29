
package electricity_billing;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Admin extends Parson implements Interface_Class2{

   
   public void add_user(String name,String username,String pass ,String email)
   {

      try {
            String sql="INSERT INTO `customer`(`name`, `username`, `password`, `email`) VALUES ('"+name+"','"+username+"','"+password+"','"+email+"') ";
            
            int ch=stat.executeUpdate(sql);
            if(ch==1){
                JOptionPane.showMessageDialog(null,"Sign up successful","successful",JOptionPane.INFORMATION_MESSAGE);
                String sql3="select id from customer where username='"+username+"' and password='"+password+"' ";//meter number and print it in JOption message
             ResultSet res1=stat.executeQuery(sql3);
             int count=0;
             while(res1.next()){
               count=  res1.getInt("id");
             }
             JOptionPane.showMessageDialog(null,"your meter number is '"+count+"'","meter number",JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null,"unsuccessful","Error",JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"username Already exists change your username or Your information is not complete","error",JOptionPane.ERROR_MESSAGE);
        }
      
      
   }
   
   
   
   
   
 
    public  void view_customer(DefaultTableModel dtm){//to delete selected row
        
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
   
      
      
    public  void view_Coplain(DefaultTableModel dtm){//to delete selected row
        
        try {
            dtm.addColumn("meter_number");
            dtm.addColumn("complaine");
           
            
            
            String sql="select * from complain";
            ResultSet res=stat.executeQuery(sql);
            while(res.next()){
                dtm.addRow(new Object[]{res.getInt("id"),res.getString("complain1")});
            }
        } catch (SQLException ex) {
            Logger.getLogger(Operator.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   
   
   
   
   
 
   
   
   
   
  
    public void Delete_Customer(int ID)
       {

          
       try {
           String sql="DELETE FROM `customer` WHERE  id='"+ID+"'";
           int x=  stat.executeUpdate(sql);
           if(x==1)
           {
              
               JOptionPane.showMessageDialog(null, "user has been Deleted", "Succsess", JOptionPane.INFORMATION_MESSAGE);
           }
           else
               
           {
               JOptionPane.showMessageDialog(null, "user not Deleted from database", "ERROR", JOptionPane.ERROR_MESSAGE);
               
           }
       } catch (SQLException ex) {
           Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
       }
             
    }



    public void Update_User(int id,String name,String username,String pass ,String email)
   {
       

       try {
           String sql="UPDATE `customer` SET name='"+name+"', username='"+username+"',password='"+pass+"',email='"+email+"' WHERE id='"+id+"'";
           int x=  stat.executeUpdate(sql);
           if(x==1){
               JOptionPane.showMessageDialog(null,"update is seccussful","Sccusses",JOptionPane.INFORMATION_MESSAGE);

               
           }else{
               JOptionPane.showMessageDialog(null, "user not Update try change username", "ERROR", JOptionPane.ERROR_MESSAGE);
               
               
           }
           
           
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "username already existed try change username", "ERROR", JOptionPane.ERROR_MESSAGE);
       }
    }
         
         
         
         
         
    public  void view_operator(DefaultTableModel dtm){//to Edit selected row
        
        try {
            dtm.addColumn("ID");
            dtm.addColumn("name");
            dtm.addColumn("username");
            dtm.addColumn("password");
            dtm.addColumn("email");
         
            
            
            String sql="SELECT * FROM `operator`";
            ResultSet res=stat.executeQuery(sql);
            while(res.next()){
                dtm.addRow(new Object[]{res.getInt("id"),res.getString("name"),res.getString("username"),res.getString("password"),res.getString("email")});
            }
        } catch (SQLException ex) {
            Logger.getLogger(Operator.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
    
    
    
    
    
    public void Update_Operator(int id,String name,String username,String pass ,String email)
   {
       

       try {
           String sql="UPDATE `operator` SET name='"+name+"', username='"+username+"',password='"+pass+"',email='"+email+"' WHERE id='"+id+"'";
           int x=  stat.executeUpdate(sql);
           if(x==1){
               JOptionPane.showMessageDialog(null,"update is seccussful","Sccusses",JOptionPane.INFORMATION_MESSAGE);

               
           }else{
               JOptionPane.showMessageDialog(null, "user not Update try change username", "ERROR", JOptionPane.ERROR_MESSAGE);
               
               
           }
           
           
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "username already existed try change username", "ERROR", JOptionPane.ERROR_MESSAGE);
       }
    }
         
         
         
         
         
         
         
         
         
    public void add_operator(String name,String username,String password,String email){//add Employee
       try {
           String sql="INSERT INTO `operator`(`name`, `username`, `password`, `email`) VALUES ('"+name+"','"+username+"','"+password+"','"+email+"') ";
           
           int ch=stat.executeUpdate(sql);
           
           
           
           if(ch==1){
               JOptionPane.showMessageDialog(null,"Insert is successful","successful",JOptionPane.INFORMATION_MESSAGE);
               
           }else{
               JOptionPane.showMessageDialog(null,"unsuccessful","Error",JOptionPane.ERROR_MESSAGE);
               
           }
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"username Already exists change your username or Your information is not complete","error",JOptionPane.ERROR_MESSAGE);
       }
            
         }
         
         
         
         
         
         
         
    public void Delete_Operator(int ID)//delete Employee
       {

          
       try {
           String sql="DELETE FROM `operator` WHERE  id='"+ID+"'";
           int x=  stat.executeUpdate(sql);
           if(x==1)
           {
              
               JOptionPane.showMessageDialog(null, "employee has been Deleted", "Succsess", JOptionPane.INFORMATION_MESSAGE);
           }
           else
               
           {
               JOptionPane.showMessageDialog(null, "employee not Deleted from database", "ERROR", JOptionPane.ERROR_MESSAGE);
               
           }
       } catch (SQLException ex) {
           Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
       }
             
    }
         
         
         
   
         
         
         
         
         
         
         
         
         
         
         
         
         
    }
         
         
         
         
         
         
         
         
         
         
         
         
         


   



   
