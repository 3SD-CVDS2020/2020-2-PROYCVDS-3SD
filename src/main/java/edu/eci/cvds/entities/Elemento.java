package main.java.edu.eci.cvds.entities;

public class Elemento {
    private String tipoElemento;
    private String descripcion;
    private String fecha;
    private int idEquipo;
    private int idElemento;

    public Elemento(String tipoElemento, String descripcion, int idEquipo, int idElemento){
        this.tipoElemento = tipoElemento;
        this.descripcion = descripcion;
        this.idEquipo  = idEquipo;
        this.idElemento = idElemento;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setTipoElemento(String tipoElemento) {
        this.tipoElemento = tipoElemento;
    }

    public void setIdEquipo(int idEquipo) {
        this.idEquipo = idEquipo;
    }

    public void setIdElemento(int idElemento) {
        this.idElemento = idElemento;
    }

    public String getTipoElemento(){
        return tipoElemento;
    }
    public String getDescripcion(){
        return descripcion;
    }
    public int getIdEquipo(){
        return idEquipo;
    }
    public int getIdElemento() {
        return idElemento;
    }
    public String getFecha(){
        return fecha;
    }
}
