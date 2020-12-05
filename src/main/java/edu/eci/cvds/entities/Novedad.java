package edu.eci.cvds.entities;

import java.time.LocalDate;

public class Novedad {
	private int idNovedad;
	private LocalDate fecha;
	private String titulo;
	private String responsable;
	private String detalle;
	private String tipo;
	private String estado;
	private int idElemNovedad;
	
	public void Novedad(int idNovedad,LocalDate fecha,String titulo,String responsable,String detalle,String tipo,String estado,int idElemNovedad) {
		this.setIdNovedad(idNovedad);
		this.setFecha(fecha);
		this.setTitulo(titulo);
		this.setResponsable(responsable);
		this.setDetalle(detalle);
		this.setTipo(tipo);
		this.setEstado(estado);
		this.idElemNovedad=idElemNovedad;
	}

	public int getIdNovedad() {
		return idNovedad;
	}

	public void setIdNovedad(int idNovedad) {
		this.idNovedad = idNovedad;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getResponsable() {
		return responsable;
	}

	public void setResponsable(String responsable) {
		this.responsable = responsable;
	}

	public String getDetalle() {
		return detalle;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public int getIdElemNovedad() {
		return idElemNovedad;
	}

	public void setIdElemNovedad(int idElemNovedad) {
		this.idElemNovedad = idElemNovedad;
	}
	
}
