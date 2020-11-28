package edu.eci.cvds.entities;

public class Laboratorio {
	
	private int idLaboratorio;
	private String nombre;
	private String horario;
	private String caracteristicas;
	
	
	public Laboratorio (int idLaboratorio, String nombre, String horario, String caracteristicas) {
		this.setIdLaboratorio(idLaboratorio);
		this.setNombre(nombre);
		this.setHorario(horario);
		this.setCaracteristicas(caracteristicas);
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getHorario() {
		return horario;
	}


	public void setHorario(String horario) {
		this.horario = horario;
	}


	public String getCaracteristicas() {
		return caracteristicas;
	}


	public void setCaracteristicas(String caracteristicas) {
		this.caracteristicas = caracteristicas;
	}


	public int getIdLaboratorio() {
		return idLaboratorio;
	}


	public void setIdLaboratorio(int idLaboratorio) {
		this.idLaboratorio = idLaboratorio;
	}
	
}
