package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.time.LocalDate;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import modelo.*;
import vista.vista;

public final class Facade {

vista vis= new vista();
DAO dao= new DAO();
Ubicacion u= new Ubicacion();
cuentadante c= new cuentadante();
proveedor pro=new proveedor();
sofware s= new sofware();
equipo e= new equipo();
DefaultTableModel modelo= new DefaultTableModel();

public Facade(vista v){
this.vis= v;
accionar();
}

public void accionar(){
  ActionListener llamada= new ActionListener(){
  
      public void actionPerformed(ActionEvent e){
       if(e.getSource()== vis.bEquipoIN){
       insertarEquipo();
       } 
       if(e.getSource()== vis.bEquipoBus){
       buscarEquipo();
       buscarUbicacion();
       buscarCuentadante();
       buscarProveedor();
       }
       if(e.getSource()== vis.bEquipoMo){
       editarEquipo();
       editarCuentadante();
       editarProveedor();
       editarUbicacion();
       }
       if(e.getSource()== vis.bEquipoEli){
       eliminaEquipo();
       }
       if(e.getSource()== vis.bTabla){
      // limpiar();    
       lista(vis.tabla_1);
       }
  }
  };
  vis.bTabla.addActionListener(llamada);
  vis.bEquipoEli.addActionListener(llamada);
  vis.bEquipoMo.addActionListener(llamada);
  vis.bEquipoBus.addActionListener(llamada);
  vis.bEquipoIN.addActionListener(llamada);
    
}
/*
  
  

  public void eliminarTUbicacion(){

    int id= Integer.valueOf(vis.txtUbicarId.getText());
     Ubicacion u= new Ubicacion(id);
       int row=dao.eliminaTUbicacion(u);
         if(row==1){
          JOptionPane.showMessageDialog(vis, "Eliminado"); 
     }else{
         JOptionPane.showMessageDialog(vis, "NO delete");     
     }
}
 
    public void eliminarCuentadante(){

    int id= Integer.valueOf(vis.txtCuentaId.getText());
     cuentadante cu= new cuentadante(id);
       int row=dao.eliminaCuentadante(cu);
         if(row==1){
          JOptionPane.showMessageDialog(vis, "Eliminado fila cuantadante"); 
     }else{
         JOptionPane.showMessageDialog(vis, "NO delete cuentadante");     
     }
}
     public void eliminarProveedor(){

    int id= Integer.valueOf(vis.txtprovedorId.getText());
     proveedor pr= new proveedor(id);
       int row=dao.eliminaProveedor(pr);
       
         if(row==1){
          JOptionPane.showMessageDialog(vis, "Eliminado fila proveedor"); 
     }else{
         JOptionPane.showMessageDialog(vis, "NO delete proveedor");     
     }
}
      public void insertarSoftware(){

    s.setNombre(vis.txtSoftwareNom.getText());
    s.setVersion(vis.txtSoftwareVer.getText());
    s.setDescripcion(vis.txtSoftwareDes.getText());
    
    int row= dao.insertarSoftware(s);
     if(row==1){
      JOptionPane.showMessageDialog(vis, "Se insertó columna software");
   
       }else{
        JOptionPane.showMessageDialog(vis, "algo pasa en insertar software");
    }
}
      public  void  obtenerSoftware(){
        
        int id= Integer.valueOf(vis.txtSoftwareId.getText());
        
        if(vis.txtCuentaId.equals("")){
        JOptionPane.showMessageDialog(vis, "ingrese Id de la tabla software");
        }else{
            sofware s= dao.buscarSoftware(id);
             vis.txtSoftwareNom.setText(s.getNombre());
             vis.txtSoftwareVer.setText(s.getVersion());
             vis.txtSoftwareDes.setText(s.getDescripcion());
             
        }
 } 
       public void modificarSoftware(){
  
      String n= vis.txtSoftwareNom.getText();
      String v= vis.txtSoftwareVer.getText();
      String d= vis.txtSoftwareDes.getText();
      
      int id=Integer.valueOf(vis.txtSoftwareId.getText());
      sofware s= new sofware(id,n,v,d); 
         int row= dao.modificaSoftware(s);
           if(row==1){
             JOptionPane.showMessageDialog(vis, "todo bien");
           }else{
              JOptionPane.showMessageDialog(vis, "error al modificar");
           }
  }
       public void eliminarSoftware(){

         int id= Integer.valueOf(vis.txtSoftwareId.getText());
           sofware s= new sofware(id);
           int row=dao.eliminaSoftware(s);
       
            if(row==1){
              JOptionPane.showMessageDialog(vis, "Eliminado fila proveedor"); 
            }else{
              JOptionPane.showMessageDialog(vis, "NO delete proveedor");     
          }
       }*/
   public void insertarEquipo(){
       String date= String.valueOf(vis.txtEquipoDate.getCalendar());
     try{
         
        u.setUbi_Nombre(vis.txtUbicarN.getText());
        u.setUbi_Indicaciones(vis.txtUbicaIndica.getText());
        u.setUbi_Responsables(vis.txtUbicaRes.getText());
         
        pro.setNit(vis.txtProvedorNi.getText());
        pro.setRaSo(vis.txtProvedorRS.getText());
        pro.setDireccion(vis.txtProvedorDi.getText());
        pro.setTelefono(vis.txtProvedorTe.getText());
        pro.setEmail(vis.txtProvedorEm.getText());
        pro.setSweb(vis.txtProvedorSW.getText());
       
        c.setDocumento(vis.txtCuentaDocu.getText()); 
        c.setNombre(vis.txtCuentaNom.getText());
        c.setApelido(vis.txtCuentaApe.getText());
        c.setEmail(vis.txtCuentaEmail.getText());

        
        String fechita= ((JTextField)vis.txtEquipoDate.getDateEditor().getUiComponent()).getText();
        e.setSerial(vis.txtEquipoSe.getText());
        e.setTipo(vis.txtEquipoTipo.getText());
        e.setMarca(vis.txtEquipoMa.getText());
        e.setModelo(vis.txtEquipoMo.getText());
        e.setFecha(Date.valueOf(fechita));
        e.setGarantia(Integer.valueOf(vis.txtEquipoGar.getText()));
        e.setClon(Boolean.valueOf(vis.txtEquipoClo.getText()));
        e.setUso(vis.txtEquipoUs.getText());
        c.setId(Integer.valueOf(vis.txtEquipoIdCue.getText()));
        pro.setId(Integer.valueOf(vis.txtEquipoIdPro.getText()));
        u.setUbi_Id(Integer.valueOf(vis.txtEquipoIdUbi.getText()));
        //e.setIdCuentadante(Integer.valueOf(vis.txtEquipoIdCue.getText()));
        //e.setIdProveedor(Integer.valueOf(vis.txtEquipoIdPro.getText()));
        //e.setIdUbicacion(Integer.valueOf(vis.txtEquipoIdUbi.getText()));
    int row= dao.insertarEquipo(e,c,pro,u);
        if(row==1){
           JOptionPane.showMessageDialog(vis, "Se insertó columna Equipo");
        }     
     }catch(Exception ex ){
         ex.printStackTrace();
          JOptionPane.showMessageDialog(vis, "Algo pasa en insertar Equipo facade " + ex.getMessage());
     }
}
   public void buscarEquipo(){
   
        int id= Integer.valueOf(vis.txtEquipoId.getText());
        
          if(vis.txtEquipoId.equals("")){
             JOptionPane.showMessageDialog(vis, "ingrese Id de la tabla Equipo");
             }else{
               equipo eq = dao.buscarEquipo(id);
            
               vis.txtEquipoSe.setText(eq.getSerial());
               vis.txtEquipoTipo.setText(eq.getTipo());
               vis.txtEquipoMa.setText(eq.getMarca());
               vis.txtEquipoMo.setText(eq.getModelo());
               vis.txtEquipoDate.setDate(eq.getFecha());
               vis.txtEquipoGar.setText(String.valueOf(eq.getGarantia()));
               vis.txtEquipoClo.setText(String.valueOf(eq.getClon()));
               vis.txtEquipoUs.setText(eq.getUso());
               vis.txtEquipoIdCue.setText(String.valueOf(eq.getIdCuentadante()));
               vis.txtEquipoIdPro.setText(String.valueOf(eq.getIdProveedor()));
               vis.txtEquipoIdUbi.setText(String.valueOf(eq.getIdUbicacion()));
        }} 
    public  void  buscarUbicacion(){
        int id= Integer.valueOf(vis.txtUbicarId.getText());
        
         if(vis.txtUbicarId.equals("")){
           JOptionPane.showMessageDialog(vis, "ingrese Id de la table ubicación");
         }else{
             Ubicacion ub = dao.buscarTUbicacion(id);
             vis.txtUbicarN.setText(ub.getUbi_Nombre());
             vis.txtUbicaIndica.setText(ub.getUbi_Indicaciones());
             vis.txtUbicaRes.setText(ub.getUbi_Responsables());
        }}  
    public  void  buscarCuentadante(){
        int id= Integer.valueOf(vis.txtCuentaId.getText());
        
        if(vis.txtCuentaId.equals("")){
            JOptionPane.showMessageDialog(vis, "ingrese Id de la tabla cuantadante");
        }else{
            cuentadante cu = dao.buscarcuentadante(id);
             vis.txtCuentaDocu.setText(cu.getDocumento());
             vis.txtCuentaNom.setText(cu.getNombre());
             vis.txtCuentaApe.setText(cu.getApelido());
             vis.txtCuentaEmail.setText(cu.getEmail());
        }} 
    public  void  buscarProveedor(){
        
        int id= Integer.valueOf(vis.txtprovedorId.getText());
        
          if(vis.txtUbicarId.equals("")){
              JOptionPane.showMessageDialog(vis, "ingrese Id de la table proveedor");
           }else{
              proveedor pro = dao.buscarProveedor(id);
              vis.txtProvedorNi.setText(pro.getNit());
              vis.txtProvedorRS.setText(pro.getRaSo());
              vis.txtProvedorDi.setText(pro.getDireccion());
              vis.txtProvedorTe.setText(pro.getTelefono());
              vis.txtProvedorEm.setText(pro.getEmail());
              vis.txtProvedorSW.setText(pro.getSweb());
        }} 
    public void editarEquipo(){
       String fechita= ((JTextField)vis.txtEquipoDate.getDateEditor().getUiComponent()).getText();
        try{
         String s=  vis.txtEquipoSe.getText();
         String t=  vis.txtEquipoTipo.getText();
         String m=  vis.txtEquipoMa.getText();
         String mo=  vis.txtEquipoMo.getText();
        Date f = Date.valueOf(fechita);
         int g= Integer.valueOf(vis.txtEquipoGar.getText());
         boolean c= Boolean.valueOf(vis.txtEquipoClo.getText());
         String u= vis.txtEquipoUs.getText();
         int idc= Integer.valueOf(vis.txtEquipoIdCue.getText());
         int idp= Integer.valueOf(vis.txtEquipoIdPro.getText());
         int idu= Integer.valueOf(vis.txtEquipoIdUbi.getText());
     int id= Integer.parseInt(vis.txtEquipoId.getText());
     
     equipo eq= new equipo(id,s,t,m,mo,f,g,c,u,idc,idp,idu);
            int row= dao.modificarEquipo(eq);
              if(row==1){
                 JOptionPane.showMessageDialog(vis, "Exito al editat Equipo");
              }
        }catch(Exception ex){
                    JOptionPane.showMessageDialog(vis, "ERROR al editat Equipo");
        }}
    public void editarUbicacion(){
  
         String n= vis.txtUbicarN.getText();
         String i= vis.txtUbicaIndica.getText();
         String r= vis.txtUbicaRes.getText();
       int id=Integer.valueOf(vis.txtUbicarId.getText());
      
       Ubicacion u= new Ubicacion(id,n,i,r); 
          int row= dao.modificaTUbicacion(u);
            if(row==1){
               JOptionPane.showMessageDialog(vis, "todo bien");
            }else{
               JOptionPane.showMessageDialog(vis, "error al modificar");
         }}
    public void editarCuentadante(){
  
        String d= vis.txtCuentaDocu.getText();
        String n= vis.txtCuentaNom.getText();
        String a= vis.txtCuentaApe.getText();
        String e= vis.txtCuentaEmail.getText();
      int id=Integer.valueOf(vis.txtCuentaId.getText());
      
          cuentadante cu= new cuentadante(id,d,n,a,e); 
           int row= dao.modificacuentadante(cu);
             if(row==1){
                JOptionPane.showMessageDialog(vis, "modificado tabla cuentadante");
             }else{
                JOptionPane.showMessageDialog(vis, "error al modificar cuentadante");
         }}
    public void  editarProveedor(){
  
          String n= vis.txtProvedorNi.getText();
          String rs= vis.txtProvedorRS.getText();
          String d= vis.txtProvedorDi.getText();
          String t= vis.txtProvedorTe.getText();
          String e= vis.txtProvedorEm.getText();
          String w=vis.txtProvedorSW.getText();
        int id=Integer.valueOf(vis.txtprovedorId.getText());
      
          proveedor pr= new proveedor(id,n,rs,d,t,e,w); 
           int row= dao.modificaProveedor(pr);
             if(row==1){
                JOptionPane.showMessageDialog(vis, "todo bien");
             }else{
               JOptionPane.showMessageDialog(vis, "error al modificar");
         }}
    public void eliminaEquipo(){
          try{
        int id= Integer.parseInt(vis.txtEquipoId.getText());
         equipo eq= new equipo(id); 
            int row=dao.eliminarEquipo(eq);
                if(row>0){
                 JOptionPane.showMessageDialog(null, "Eliminado fila equipo");
                }}catch(Exception ex){
                 JOptionPane.showMessageDialog(null, "NO SE ELIMONÓ FILA DE EQUIPO");
                }}
    public void lista(JTable tabla){
           modelo= (DefaultTableModel)tabla.getModel();
           List<equipo> lista=dao.tabla();
      
           Object[] objeto= new Object[11];
           
           for(int i=0; i<lista.size(); i++){
               objeto[0]= lista.get(i).getSerial();
               objeto[1]= lista.get(i).getTipo();
               objeto[2]= lista.get(i).getMarca();
               objeto[3]= lista.get(i).getModelo();
               objeto[4]= lista.get(i).getFecha();
               objeto[5]= lista.get(i).getGarantia();
               objeto[6]= lista.get(i).getClon();
               objeto[7]= lista.get(i).getUso();
               objeto[8]= lista.get(i).getIdCuentadante();
               objeto[9]= lista.get(i).getIdProveedor();
               objeto[10]= lista.get(i).getIdUbicacion();
               modelo.addRow(objeto);
           } vis.tabla_1.setModel(modelo);
    }
     public void limpiar(){
           for(int i=0; i< vis.tabla_1.getRowCount(); i++){
                modelo.removeRow(i);
                 i--;
     }}
}
