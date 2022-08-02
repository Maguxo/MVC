package controlador;

import java.sql.*;

public class conexion {
    
   private String user= "root";
   private String password= "";
   private String driver="com.mysql.cj.jdbc.Driver"; 
   private String url= "jdbc:mysql://127.0.0.1:3306/proyecto_5";
   
   public conexion(){}
   
    Connection co=null;
  
   
   public Connection conectar() throws ClassNotFoundException{
   try{
       
    Class.forName(driver);
    co= (Connection)DriverManager.getConnection(url,user,password);
    
    if(co != null){
    System.out.println("conexión Exitosa");
    }
    
   }catch(SQLException ex){
   System.out.println("No se logró conectar" +ex.getMessage());
   
   
   }    
       
           
           
           
           
   
   return co;
   }
   
    
}
