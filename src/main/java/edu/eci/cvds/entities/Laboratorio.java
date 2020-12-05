package edu.eci.cvds.entities;

import java.time.LocalDate;

public class Laboratorio {
	
	private int idLaboratorio;
	private String nombre;
	private String horario;
	private String caracteristicas;
	private LocalDate fechaCreacion;
	private LocalDate fechaCierre;
	
	
	public Laboratorio (int idLaboratorio, String nombre, String horario, String caracteristicas, LocalDate fechaCreacion, LocalDate fechaCierre) {
		this.setIdLaboratorio(idLaboratorio);
		this.setNombre(nombre);
		this.setHorario(horario);
		this.setCaracteristicas(caracteristicas);
		this.fechaCreacion = fechaCreacion;
		this.fechaCierre = fechaCierre;
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


	public LocalDate getFechaCreacion() {
		return fechaCreacion;
	}


	public void setFechaCreacion(LocalDate fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}


	public LocalDate getFechaCierre() {
		return fechaCierre;
	}


	public void setFechaCierre(LocalDate fechaCierre) {
		this.fechaCierre = fechaCierre;
	}
	
}
