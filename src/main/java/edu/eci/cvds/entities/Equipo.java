package edu.eci.cvds.entities;

import java.util.Date;

public class Equipo {
    private int idEquipo;
    private String estado;
    private String enUso;
    private int idLaboratorio;
    private String nombre;

    public Equipo(int idEquipo,String nombre,String estado,String enUso,int idLaboratorio){
        this.idEquipo = idEquipo;
        this.estado = estado;
        this.enUso = enUso;
        this.idLaboratorio = idLaboratorio;
        this.nombre = nombre;
    }

    public String getEstado() {
    	return this.estado;
    }
    public void setEstado(String estado) {
    	this.estado=estado;
    }
    public void setIdEquipo(int idEquipo) {
        this.idEquipo = idEquipo;
    }

    public int getIdEquipo() {
        return idEquipo;
    }
    public int getIdLaboratorio() {
        return idLaboratorio;
    }

    public void setIdLaboratorio(int idLaboratorio) {
        this.idLaboratorio = idLaboratorio;
    }

	public String getNombre() {
		return this.nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}

	public String getEnUso() {
		return enUso;
	}

	public void setEnUso(String enUso) {
		this.enUso = enUso;
	}
}
