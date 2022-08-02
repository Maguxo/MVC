package controlador;
import java.util.List;
import modelo.*;

import java.sql.*;
import java.sql.Date;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class DAO {
    
    Connection cone= null;
    PreparedStatement pt= null;
    ResultSet rs= null;
    
    conexion co= new conexion();
 
    public int  insertarEquipo(equipo e,cuentadante c, proveedor p, Ubicacion u) throws ClassNotFoundException{
       
        try{
           String query="INSERT INTO tb_cuentadante (cue_documento,cue_nombres,cue_apellidos,cue_email)VALUES (?,?,?,?)";  
           cone= co.conectar(); 
           pt= cone.prepareStatement(query,Statement.RETURN_GENERATED_KEYS);
    
           pt.setString(1, c.getDocumento());
           pt.setString(2, c.getNombre());
           pt.setString(3, c.getApelido());
           pt.setString(4, c.getEmail());
    
           query="INSERT INTO tb_proveedor (pro_nit,pro_razonSocial,pro_direccion,pro_telefono,pro_email,pro_web)"
                 + " VALUES (?,?,?,?,?,?)";
        PreparedStatement pt2= cone.prepareStatement(query,Statement.RETURN_GENERATED_KEYS);
        
            pt2.setString(1, p.getNit());
            pt2.setString(2, p.getRaSo());
            pt2.setString(3, p.getDireccion());
            pt2.setString(4, p.getTelefono());
            pt2.setString(5, p.getEmail());
            pt2.setString(6, p.getSweb());
        
          query="INSERT INTO tb_ubicacion (ubi_nombre,ubi_indicaciones,ubi_responsable) VALUES (?,?,?)";
        PreparedStatement pt3= cone.prepareStatement(query,Statement.RETURN_GENERATED_KEYS);
        
            pt3.setString(1, u.getUbi_Nombre());
            pt3.setString(2, u.getUbi_Indicaciones());
            pt3.setString(3, u.getUbi_Responsables());
        
            int row =pt.executeUpdate(); // prepared statement de cuentadante 
            int row2= pt2.executeUpdate();// prepared statement de proveedor
            int row3= pt3.executeUpdate(); // preparedstatement ubicacion 
        
               if((row>0 || row2 >0 || row3 > 0) ){
                ResultSet rs1=  pt.getGeneratedKeys();
                ResultSet rs2=  pt2.getGeneratedKeys();
                ResultSet rs3=  pt3.getGeneratedKeys();
                
                if(rs1.next()){
                    if(rs2.next()){
                           if(rs3.next()){
                               int id_cuen= rs1.getInt(1);
                               int id_pro= rs2.getInt(1);
                               int id_ubi= rs3.getInt(1);
                               query="INSERT INTO tb_equipo (equ_serial, equ_tipo, equ_marca, equ_modelo,equ_fechaCompra, "
                            + " equ_mesesGarantia, equ_clon, equ_uso, cue_id, pro_id, ubi_id) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
                        PreparedStatement pt4= cone.prepareStatement(query);
                          
                            pt4.setString(1, e.getSerial());
                            pt4.setString(2, e.getTipo());
                            pt4.setString(3, e.getMarca());
                            pt4.setString(4,e.getModelo());
                            pt4.setDate(5, e.getFecha());
                            pt4.setInt(6,e.getGarantia());
                            pt4.setBoolean(7, e.getClon());
                            pt4.setString(8, e.getUso());
                            pt4.setInt(9,id_cuen);
                            pt4.setInt(10,id_pro);
                            pt4.setInt(11,id_ubi);
                            
                            int ru= pt4.executeUpdate();
                      }}}}
        }catch(SQLException ex){
          ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Algo pasa en DAO "+ ex.getMessage() );
        }
     return 1;
    }
    public equipo buscarEquipo(int id){
         
        String s,t,ma,mo,us;
        Date f; boolean cl;        
        int g,idc,idp,idu;
        equipo eq= null;
        String query="SELECT * FROM tb_equipo AS e WHERE e.equ_id= ?";
        try{
            cone=co.conectar();
            pt = cone.prepareStatement(query);
                 
            pt.setInt(1, id);
            rs=pt.executeQuery();
            
            while(rs.next()){
             s=   rs.getString(2);
             t=   rs.getString(3);
             ma=  rs.getString(4);
             mo=  rs.getString(5);
             f=   rs.getDate(6);
             g=   rs.getInt(7);
             cl=  rs.getBoolean(8);
             us=  rs.getString(9);
             idc= rs.getInt(10);
             idp= rs.getInt(11);
             idu= rs.getInt(12);
            eq= new equipo(s,t,ma,mo,f,g,cl,us,idc,idp,idu); 
            }
            return eq;
        }catch(Exception ex){
           ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "no se pudo buscar equipo "+ ex.getMessage());
            return eq;
        }}
    public Ubicacion buscarTUbicacion(int id){
            String n,i,r;
            Ubicacion ub= null;
            
            String query= "SELECT * FROM tb_ubicacion AS u WHERE u.ubi_id= ?";
        try{
            cone= co.conectar();
            pt=cone.prepareStatement(query);
            
            pt.setInt(1, id);
            rs= pt.executeQuery();
         
            while(rs.next()){
             n=(rs.getString(2));
            i=(rs.getString(3));
            r=(rs.getString(4));
             ub= new Ubicacion(n,i,r);
            }
            return ub;
           
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "no se pudo buscar tabla ubicación " + e.getMessage());
              return ub;
        }}
    public cuentadante buscarcuentadante(int id){
           String d,n,a,e;
           cuentadante cu=null;
           String query="SELECT * FROM tb_cuentadante As C WHERE C.cue_id=?";
        try{
           cone= co.conectar();
           pt=cone.prepareStatement(query);
        
           pt.setInt(1, id);
           rs= pt.executeQuery();
        
          while(rs.next()){
           d= rs.getString(2);
           n =rs.getString(3);
           a= rs.getString(4);
           e=rs.getString(5);
           cu= new cuentadante(d,n,a,e);
    }
          return cu;
    }catch(Exception ex){
     JOptionPane.showMessageDialog(null, "No se logro buscar");
     return cu;
    }}
    public proveedor buscarProveedor(int id){
            String n,r,d,t,e,w;
            proveedor pro= null;
            String query= "SELECT * FROM tb_proveedor AS u WHERE u.pro_id= ?";
        try{
            cone= co.conectar();
            pt=cone.prepareStatement(query);
            
            pt.setInt(1, id);
            rs= pt.executeQuery();
         
            while(rs.next()){
             n=(rs.getString(2));
             r=(rs.getString(3));
             d=(rs.getString(4));
             t=rs.getString(5);
             e=rs.getString(6);
             w=rs.getString(7);
             pro= new proveedor(n,r,d,t,e,w);
            }
          return pro;
           
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "no se pudo buscar tabla proveedor " + ex.getMessage());
              return pro;
        }}
    public  int modificarEquipo(equipo e){
      String query="UPDATE tb_equipo AS e Set equ_serial= ?, equ_tipo= ?, equ_marca= ?, equ_modelo= ?, equ_fechaCompra= ?,"
              + "equ_mesesGarantia= ?, equ_clon= ?, equ_uso= ?, cue_id= ?, pro_id= ?, ubi_id= ? WHERE e.equ_id= ?";
            try{
                cone= co.conectar();
                pt= cone.prepareStatement(query);
                
                pt.setString(1, e.getSerial());
                pt.setString(2, e.getTipo());
                pt.setString(3, e.getMarca());
                pt.setString(4, e.getModelo());
                pt.setDate(5, e.getFecha());
                pt.setInt(6, e.getGarantia());
                pt.setBoolean(7, e.getClon());
                pt.setString(8, e.getUso());
                pt.setInt(9, e.getIdCuentadante());
                pt.setInt(10, e.getIdProveedor());
                pt.setInt(11, e.getIdUbicacion());
                pt.setInt(12, e.getId());
            
                int row= pt.executeUpdate();
            if(row>0){
                JOptionPane.showMessageDialog(null, "Se editó tabla Equipo");
            }
            
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null, "NO SE LOGRÓ EDITAR");
            }
        return 1;
    }
    public int modificaTUbicacion(Ubicacion u){
        String query="UPDATE tb_ubicacion AS u SET ubi_nombre= ?, ubi_indicaciones= ?, ubi_responsable= ? WHERE u.ubi_id =?";
     try{
         cone= co.conectar();
         pt= cone.prepareStatement(query);
         
         pt.setString(1, u.getUbi_Nombre());
         pt.setString(2, u.getUbi_Indicaciones());
         pt.setString(3, u.getUbi_Responsables());
         pt.setInt(4, u.getUbi_Id());
         
         int r=pt.executeUpdate();
         if(r>0){
         JOptionPane.showMessageDialog(null, "Se editó tabla ubicacion ");
         }
        }catch(Exception e){
         JOptionPane.showMessageDialog(null, "No se  editó tabla ubicacion ");
        }
       return 1;
    }
    public int modificacuentadante(cuentadante cu){
    
        String query="UPDATE tb_cuentadante AS c SET cue_documento= ?, cue_nombres= ?, cue_apellidos= ?, cue_email= ? WHERE c.cue_id =?";
    try{
         cone= co.conectar();
         pt= cone.prepareStatement(query);
         
         pt.setString(1, cu.getDocumento());
         pt.setString(2, cu.getNombre());
         pt.setString(3, cu.getApelido());
         pt.setString(4, cu.getEmail());
         pt.setInt(5, cu.getId());
         
         int r=pt.executeUpdate();
         if(r>0){
         JOptionPane.showMessageDialog(null, "Se editó tabla cuentadante ");
         }
        }catch(Exception e){
         JOptionPane.showMessageDialog(null, "No se  editó tabla ubicacion ");
        }
    return 1;
    }
    public int modificaProveedor(proveedor pr){
           String query="UPDATE tb_proveedor AS pr SET pro_nit= ?, pro_razonSocial= ?,"
                + " pro_direccion= ?, pro_telefono= ?,pro_email= ?, pro_web= ? WHERE pr.pro_id =?";
            try{
               cone= co.conectar();
               pt= cone.prepareStatement(query);
         
               pt.setString(1, pr.getNit());
               pt.setString(2, pr.getRaSo());
               pt.setString(3, pr.getDireccion());
               pt.setString(4, pr.getTelefono());
               pt.setString(5, pr.getEmail());
               pt.setString(6, pr.getSweb());
               pt.setInt(7, pr.getId());
         
             int r=pt.executeUpdate();
               if(r>0){
                  JOptionPane.showMessageDialog(null, "Se editó tabla cuentadante ");
         }}catch(Exception e){
                  JOptionPane.showMessageDialog(null, "No se  editó tabla ubicacion ");
        }
       return 1;
    }
    public int eliminarEquipo(equipo e){
           String query="DELETE FROM tb_equipo WHERE equ_id= ?";
         try{
            cone= co.conectar();
            pt= cone.prepareStatement(query);
            
            pt.setInt(1, e.getId());
            int row= pt.executeUpdate();
                  if(row>0){
                     JOptionPane.showMessageDialog(null, "Se elimino fila de tabla equipos ");
                  }
         }catch(Exception ex){
                     JOptionPane.showMessageDialog(null, "NO SE ELIMONÓ FILA TABLA EQUIPOS ");
         }
        return 1;
    }
    
    public List tabla(){
        
        List<equipo> lista= new ArrayList<>();
        String query="SELECT * FROM  tb_equipo";
     try{
       cone=co.conectar();
       pt= cone.prepareStatement(query);
       rs= pt.executeQuery();
         
            while(rs.next()){
             equipo e= new equipo();
             e.setSerial(rs.getString(2));
             e.setTipo(rs.getString(3));
             e.setMarca(rs.getString(4));
             e.setModelo(rs.getString(5));
             e.setFecha(rs.getDate(6));
             e.setGarantia(rs.getInt(7));
             e.setClon(rs.getBoolean(8));
             e.setUso(rs.getString(9));
             e.setIdCuentadante(rs.getInt(10));
             e.setIdProveedor(rs.getInt(11));
             e.setIdUbicacion(rs.getInt(12));
            lista.add(e);
       }}catch(Exception ex){
     JOptionPane.showMessageDialog(null, "Lista agregada");
     } 
    return lista;
    }
}
  