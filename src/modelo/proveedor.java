package modelo;

public class proveedor {
    

private int Id;
private String Nit;
private String RaSo;
private String Direccion;
private String Telefono;
private String Email;
private String Sweb;

public proveedor(){}

public proveedor(String Nit,String RaSo,String direccion,String Telefono, String Email,String web){
    this.Nit=Nit;
    this.RaSo=RaSo;
    this.Direccion=direccion;
    this.Telefono=Telefono;
    this.Email=Email;
    this.Sweb=web;
    
}
public proveedor(int id,String Nit,String RaSo,String direccion,String Telefono, String Email,String web){
    this.Id=id;
    this.Nit=Nit;
    this.RaSo=RaSo;
    this.Direccion=direccion;
    this.Telefono=Telefono;
    this.Email=Email;
    this.Sweb=web;
}
public proveedor(int id){
this.Id=id;
}

    public void setId(int Id) {
        this.Id = Id;
    }

    public void setNit(String Nit) {
        this.Nit = Nit;
    }

    public void setRaSo(String RaSo) {
        this.RaSo = RaSo;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public void setSweb(String Sweb) {
        this.Sweb = Sweb;
    }

    public int getId() {
        return Id;
    }

    public String getNit() {
        return Nit;
    }

    public String getRaSo() {
        return RaSo;
    }

    public String getDireccion() {
        return Direccion;
    }

    public String getTelefono() {
        return Telefono;
    }

    public String getEmail() {
        return Email;
    }

    public String getSweb() {
        return Sweb;
    }

}


