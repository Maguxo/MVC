package modelo;

import java.text.SimpleDateFormat;
import java.sql.Date;


public class equipo {

    
private int id;
private String serial;
private String tipo;
private String marca;
private String modelo;
private Date fecha;
private int garantia;
private boolean clon;
private int idCuentadante;
private int idProveedor;
private String uso;

public equipo(){}
public equipo(String s, String t,String m, String mo, Date f, int g, boolean c, String u,int idc, int idp, int idu){
      this.serial=s;
      this.tipo=t;
      this.marca= m;
      this.modelo=mo;
      this.fecha=f;
      this.garantia=g;
      this.clon=c;
      this.uso=u;
      this.idCuentadante=idc;
      this.idProveedor=idp;
      this.idUbicacion=idu;
}
public equipo(int id,String s, String t,String m, String mo, Date f, int g, boolean c, String u,int idc, int idp, int idu){
      this.id=id;
      this.serial=s;
      this.tipo=t;
      this.marca= m;
      this.modelo=mo;
      this.fecha=f;
      this.garantia=g;
      this.clon=c;
      this.uso=u;
      this.idCuentadante=idc;
      this.idProveedor=idp;
      this.idUbicacion=idu;
}

public equipo(int id){
this.id=id;
}
    public void setUso(String uso) {
        this.uso = uso;
    }

    public String getUso() {
        return uso;
    }
    public void setId(int id) {
        this.id = id;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setFecha(Date fecha) {
        
        this.fecha = fecha;
    }

    public void setGarantia(int garantia) {
        this.garantia = garantia;
    }

    public void setClon(boolean clon) {
        this.clon = clon;
    }

    public void setIdCuentadante(int idCuentadante) {
        this.idCuentadante = idCuentadante;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    public void setIdUbicacion(int idUbicacion) {
        this.idUbicacion = idUbicacion;
    }

    public int getId() {
        return id;
    }

    public String getSerial() {
        return serial;
    }

    public String getTipo() {
        return tipo;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public Date getFecha() {
        return  fecha;
    }

    public int getGarantia() {
        return garantia;
    }

    public boolean getClon() {
        return clon;
    }

    public int getIdCuentadante() {
        return idCuentadante;
    }

    public int getIdProveedor() {
        return idProveedor;
    }

    public int getIdUbicacion() {
        return idUbicacion;
    }
private int idUbicacion;


}
