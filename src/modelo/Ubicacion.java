package modelo;



public class Ubicacion {

private int    ubi_Id;
private String ubi_Nombre;
private String ubi_Indicaciones;
private String ubi_Responsables;

public Ubicacion(){}
public Ubicacion(String n,String i,String r){
this.ubi_Nombre= n;
this.ubi_Indicaciones= i;
this.ubi_Responsables= r;
}
public Ubicacion(int id,String n,String i,String r){
this.ubi_Id=id;
this.ubi_Nombre= n;
this.ubi_Indicaciones= i;
this.ubi_Responsables= r;
}
public Ubicacion(int id){
this.ubi_Id=id;
}
public void setUbi_Id(int ubi_Id) {
        this.ubi_Id = ubi_Id;
    }

    public void setUbi_Nombre(String ubi_Nombre) {
        this.ubi_Nombre = ubi_Nombre;
    }

    public void setUbi_Indicaciones(String ubi_Indicaciones) {
        this.ubi_Indicaciones = ubi_Indicaciones;
    }

    public void setUbi_Responsables(String ubi_Responsables) {
        this.ubi_Responsables = ubi_Responsables;
    }
    
    public int getUbi_Id() {
        return ubi_Id;
    }

    public String getUbi_Nombre() {
        return ubi_Nombre;
    }

    public String getUbi_Indicaciones() {
        return ubi_Indicaciones;
    }

    public String getUbi_Responsables() {
        return ubi_Responsables;
    }

}
