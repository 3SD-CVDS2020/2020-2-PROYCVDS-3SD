package edu.eci.cvds.entities;


public class Elemento {
    private String tipoElemento;
    private String descripcion;
    private String marca;
    private int id;
    private int idEquipo;

    public Elemento(int id,String tipoElemento,String marca, String descripcion,int idEquipo){
        this.tipoElemento = tipoElemento;
        this.descripcion = descripcion;
        this.id  = id;
        this.marca = marca;
        this.idEquipo = idEquipo;
    }

    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setIdEquipo(int idEquipo) {
        this.idEquipo = idEquipo;
    }

    public void setTipoElemento(String tipoElemento) {
        this.tipoElemento = tipoElemento;
    }

    public void setId(int id) {
        this.id= id;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipoElemento(){
        return tipoElemento;
    }
    public String getDescripcion(){
        return descripcion;
    }
    public int getId(){
        return id;
    }
    public String getMarca() {
        return marca;
    }
    public int getIdEquipo(){
        return idEquipo;
    }

}
