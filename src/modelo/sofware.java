package modelo;


public class sofware {


private int Id;
private String Nombre;
private String version;
private String Descripcion;

public sofware(){}
public sofware(String n, String v, String d){
this.Nombre=n;
this.version=v;
this.Descripcion=d;
}
public sofware(int id,String n, String v, String d){
this.Id=id;
this.Nombre=n;
this.version=v;
this.Descripcion=d;
}
public sofware(int id){
this.Id=id;
}
    public void setId(int Id) {
        this.Id = Id;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public int getId() {
        return Id;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getVersion() {
        return version;
    }

    public String getDescripcion() {
        return Descripcion;
    }

}
