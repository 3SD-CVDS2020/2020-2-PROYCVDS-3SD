package edu.eci.cvds.view;

import java.time.LocalDate;
import java.util.ArrayList;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import edu.eci.cvds.Auth.SessionLogger;
import edu.eci.cvds.Exceptions.PersistenceException;
import edu.eci.cvds.Services.ElementoServices;
import edu.eci.cvds.Services.EquipoServices;
import edu.eci.cvds.Services.LaboratorioServices;
import edu.eci.cvds.Services.NovedadServices;
import edu.eci.cvds.Services.ServicesFactory;
import edu.eci.cvds.entities.Elemento;
import edu.eci.cvds.entities.Equipo;
import edu.eci.cvds.entities.Laboratorio;
import edu.eci.cvds.entities.Novedad;

@SuppressWarnings("deprecation")
@ManagedBean(name = "NovedadBean")
@SessionScoped
public class NovedadBean {
	private int idNovedad;
	private String detalle;
	private String titulo;
	private String tipo;
	private String estado;
	private Elemento elemento;
	private Equipo equipo;
	private Laboratorio laboratorio;
	private LocalDate fecha = LocalDate.now(); 
	
	
	NovedadServices novedadServices = ServicesFactory.getInstance().getNovedadServices();
	ElementoServices elementoServices = ServicesFactory.getInstance().getElementoServices();
	EquipoServices equipoServices = ServicesFactory.getInstance().getEquipoServices();
	LaboratorioServices laboratorioServices = ServicesFactory.getInstance().getLaboratorioServices();
	SessionLogger logerServices = ServicesFactory.getInstance().getLoginServices();
	
	public void registrarNovedad() throws PersistenceException{
		try {
			if(tipo.equals("Elemento")) {
				novedadServices.registrarNovedad(titulo, detalle, logerServices.correo(), estado, tipo,elemento.getId());
			}else if(tipo.equals("Equipo")) {
				novedadServices.registrarNovedad(titulo, detalle, logerServices.correo(), estado, tipo,equipo.getIdEquipo());
			}else if(tipo.equals("Laboratorio")) {
				novedadServices.registrarNovedad(titulo, detalle, logerServices.correo(), estado, tipo,laboratorio.getIdLaboratorio());
			}
			FacesContext.getCurrentInstance().addMessage(null,new FacesMessage("Novedad Registrada"));
		}catch(Exception e) {
			throw new PersistenceException("No se pudo registrar la novedad",e);
		}
	}
	
	public ArrayList<Novedad> getNovedades() throws PersistenceException{
		try {
			return novedadServices.getNovedades();
		}catch(Exception e) {
			throw new PersistenceException("No se pueden listar las novedades",e);
		}
	}
	
	public ArrayList<Elemento>getElementos() throws PersistenceException{
	        return elementoServices.getElementos();
	    }

	public ArrayList<Equipo>getEquipos() throws PersistenceException{
		return equipoServices.getEquipos();
	}
	
	public ArrayList<Laboratorio>getLaboratorios() throws PersistenceException{
		return laboratorioServices.getLaboratorios();
	}


	public String getDetalle() {
		return detalle;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getIdNovedad() {
		return idNovedad;
	}

	public void setIdNovedad(int idNovedad) {
		this.idNovedad = idNovedad;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}



	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Elemento getElemento() {
		return elemento;
	}

	public void setElemento(Elemento elemento) {
		this.elemento = elemento;
	}

	public Equipo getEquipo() {
		return equipo;
	}

	public void setEquipo(Equipo equipo) {
		this.equipo = equipo;
	}

	public Laboratorio getLaboratorio() {
		return laboratorio;
	}

	public void setLaboratorio(Laboratorio laboratorio) {
		this.laboratorio = laboratorio;
	}

	
}
