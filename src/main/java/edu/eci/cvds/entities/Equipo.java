package edu.eci.cvds.entities;

public class Equipo {
    private int idEquipo;
    private String estado;
    private boolean enUso;
    private int idLaboratorio;

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
}
