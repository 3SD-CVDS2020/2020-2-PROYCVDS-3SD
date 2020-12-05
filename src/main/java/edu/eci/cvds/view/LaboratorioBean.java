package edu.eci.cvds.view;

import java.time.LocalDate;
import java.util.ArrayList;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import edu.eci.cvds.Auth.SessionLogger;
import edu.eci.cvds.Exceptions.PersistenceException;
import edu.eci.cvds.Services.EquipoServices;
import edu.eci.cvds.Services.LaboratorioServices;
import edu.eci.cvds.Services.NovedadServices;
import edu.eci.cvds.Services.ServicesFactory;
import edu.eci.cvds.entities.Equipo;
import edu.eci.cvds.entities.Laboratorio;

@SuppressWarnings("deprecation")
@ManagedBean(name = "LaboratorioBean")
@SessionScoped
public class LaboratorioBean {

	private int idLaboratorio;
	private String nombre;
	private String horario;
	private String caracteristicas;
	private Equipo equipo;
	private Laboratorio laboratorio;
	private LocalDate fechaCreacion = LocalDate.now();
	private boolean cerrado;
	private ArrayList<Laboratorio> laboratorios = new ArrayList<Laboratorio>();
	
	LaboratorioServices laboratorioServices = ServicesFactory.getInstance().getLaboratorioServices();
	EquipoServices equipoServices = ServicesFactory.getInstance().getEquipoServices();
	SessionLogger logerServices = ServicesFactory.getInstance().getLoginServices();
	NovedadServices novedadServices = ServicesFactory.getInstance().getNovedadServices();
	
	public ArrayList<Laboratorio> getLaboratorios() throws PersistenceException{
		laboratorios = laboratorioServices.getLaboratorios();
		return laboratorios;
	}
	
	public void registrarLaboratorio() throws PersistenceException{
		try {
			laboratorioServices.registrarLaboratorio(nombre,horario,caracteristicas,fechaCreacion,cerrado);
            FacesContext facesContext = FacesContext.getCurrentInstance();
			facesContext.addMessage(null,new FacesMessage("Laboratorio agregado"));
            facesContext.getExternalContext().redirect("../registrarLaboratorio.xhtml");

		}catch(Exception e) {
			FacesContext.getCurrentInstance().addMessage(null,new FacesMessage("No fue posible agregar el Laboratorio","Error"));
			throw new PersistenceException("No se puede agregar el laboratorio",e);
		}
		
		
	}
	
	public void addEquipo() throws PersistenceException{
		try {
			int ultimoID =  laboratorioServices.getUltimoId();
			equipoServices.asociarEquipo(equipo.getIdEquipo(),ultimoID+1);
            FacesContext facesContext = FacesContext.getCurrentInstance();
			facesContext.addMessage(null,new FacesMessage("Equipo asignado Correctamente"));
            facesContext.getExternalContext().redirect("../registrarLaboratorio.xhtml");

		}catch(Exception e) {
			FacesContext.getCurrentInstance().addMessage(null,new FacesMessage("No fue posible agregar equipo al laboratorio","Error"));
			throw new PersistenceException("No se puede agregar el equipo al laboratorio",e);
		}
	}
	
	public void cerrarLaboratorio() throws PersistenceException{
		try {
			
			ArrayList<Equipo> equipos = equipoServices.getEquipos();
			for(int i=0;i<equipos.size();i++){
				if(equipos.get(i).getIdLaboratorio()==laboratorio.getIdLaboratorio()) {
					equipoServices.desasociar(equipos.get(i).getIdEquipo());
				}
			}
			laboratorioServices.cerrarLaboratorio(laboratorio.getIdLaboratorio());;
			novedadServices.registrarNovedad("Cierre Laboratorio","fue cerrado el laboratorio",logerServices.correo(),"finalizado","Laboratorio",laboratorio.getIdLaboratorio());
			
			
		}catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	
	
	
	public int getIdLaboratorio() {
		return idLaboratorio;
	}
	public void setIdLaboratorio(int idLaboratorio) {
		this.idLaboratorio = idLaboratorio;
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

	public LocalDate getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(LocalDate fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	
}
