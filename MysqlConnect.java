package DB_part;

import InterFace.*;
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;

public class MysqlConnect {
        
    public static Connection ConnectDB()
    {
       Connection conn = null;
       
       try{
           
           Class.forName("com.mysql.jdbc.Driver");
           conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/entrydb","root","");
                     
       }catch(Exception e)
       {
           System.out.println("e");
       }
       return conn;
   }
    
    
}
