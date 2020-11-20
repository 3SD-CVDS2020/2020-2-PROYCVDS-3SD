package edu.eci.cvds.entities;

import java.sql.Date;

public class Elemento {
    private String tipoElemento;
    private String descripcion;
    private String marca;
    private int id;
    private String nombre;
    private Date fechaInicioActividad;
	private Date fechaFinActividad;

    public Elemento(int id,String nombre,String tipoElemento,String marca, String descripcion){
        this.tipoElemento = tipoElemento;
        this.descripcion = descripcion;
        this.id  = id;
        this.marca = marca;
        this.nombre = nombre;
    }

    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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
    public String getNombre(){
        return nombre;
    }


	public Object getFechaFinActividad() {
		return this.fechaFinActividad;
	}
}
