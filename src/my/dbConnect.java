
package my;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import javax.swing.JOptionPane;



public class dbConnect {

    public static Statement st;
     public static Connection c;
    public static PreparedStatement insertClient,getClient,updateClient,getClient1,getClient2;
    
    
    
    
    
    static{
   
    
        try {
            Class.forName("com.mysql.jdbc.Driver");
       
        
    Connection c=DriverManager.getConnection
        ("jdbc:mysql://localhost:3306/carsale","root","priya");
               st=c.createStatement();
                insertClient = c.prepareStatement("insert into addcar_info(manufacture,model,year,carname,price,cartype,kmtravelled,extrainformation)values(?,?,?,?,?,?,?,?)");
                 updateClient = c.prepareStatement("update addcar_info set manufacture=? ,model=?,year=? ,carname=? ,price=? ,cartype=? ,kmtravelled=?,extrainformation=? where cid=?");
                getClient =  c.prepareStatement("Select * from addcar_info where manufacture like ?");
           getClient1 =  c.prepareStatement("Select carname from addcar_info");
           getClient2 =  c.prepareStatement("Select model from addcar_info where carname=?");
    }
               
               
               
 
    catch(Exception ex){
    JOptionPane.showMessageDialog(null,ex);
} 
    
}

}
             
               
               
 