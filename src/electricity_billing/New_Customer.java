/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package electricity_billing;

import static java.awt.image.ImageObserver.HEIGHT;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author OWNER
 */
public class New_Customer extends Parson{
    
    
    
    
    
    
    public  void sign_up(String name,String username,String password,String email){
        
        try {
            String sql="INSERT INTO `customer`(`name`, `username`, `password`, `email`) VALUES ('"+name+"','"+username+"','"+password+"','"+email+"') ";
            
            int ch=stat.executeUpdate(sql);
            if(ch==1){
                JOptionPane.showMessageDialog(null,"Sign up successful","successful",JOptionPane.INFORMATION_MESSAGE);//to get meter number and print it in JOption 
                String sql3="select id from customer where username='"+username+"' and password='"+password+"' ";
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
    
}
