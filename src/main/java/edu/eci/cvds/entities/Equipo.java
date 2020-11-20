package edu.eci.cvds.entities;

import java.util.Date;

public class Equipo {
    private int idEquipo;
    private String estado;
    private boolean enUso;
    private int idLaboratorio;
    private Date fechaInicioActividad;
	private Date fechaFinActividad;

    public Equipo(int idEquipo,String estado,boolean enUso,int idLaboratorio){
        this.idEquipo = idEquipo;
        this.estado = estado;
        this.enUso = enUso;
        this.idLaboratorio = idLaboratorio;
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

    public boolean enUso() {
    	return this.enUso;
    }
    
    public void setEnUso(boolean enUso) {
    	this.enUso=enUso;
    }
    public int getIdLaboratorio() {
        return idLaboratorio;
    }

    public void setIdLaboratorio(int idLaboratorio) {
        this.idLaboratorio = idLaboratorio;
    }

	public Date getFechaFinActividad() {
		return this.fechaFinActividad;
	}
	
	public void setFechaFinActividad(Date fechaFinActividad) {
		this.fechaFinActividad=fechaFinActividad;
	}
}
