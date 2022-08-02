package modelo;


public class cuentadante {



private int Id;
private String documento;
private String nombre;
private String apelido;
private String email;

public cuentadante(){}
public cuentadante(String documento,String nombre,String apellido,String email){
    this.documento=documento;
    this.nombre=nombre;
    this.apelido=apellido;
    this.email=email;
}
public cuentadante(int id,String documento,String nombre,String apellido,String email){
    this.Id=id;
    this.documento=documento;
    this.nombre=nombre;
    this.apelido=apellido;
    this.email=email;
}
public cuentadante(int id){
this.Id=id;
}
    public void setId(int Id) {
        this.Id = Id;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return Id;
    }

    public String getDocumento() {
        return documento;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApelido() {
        return apelido;
    }

    public String getEmail() {
        return email;
    }


}
