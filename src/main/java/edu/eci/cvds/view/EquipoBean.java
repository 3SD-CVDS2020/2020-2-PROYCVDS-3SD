package edu.eci.cvds.view;

import java.util.ArrayList;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import edu.eci.cvds.Exceptions.PersistenceException;
import edu.eci.cvds.Services.ElementoServices;
import edu.eci.cvds.Services.EquipoServices;
import edu.eci.cvds.Services.ServicesFactory;
import edu.eci.cvds.entities.Elemento;
import edu.eci.cvds.entities.Equipo;
import edu.eci.cvds.entities.Laboratorio;


@SuppressWarnings("deprecation")
@ManagedBean(name ="EquipoBean")
@SessionScoped
public class EquipoBean extends BasePageBean{
	
	private int idEquipo;
	private String estado;
	private String enUso;
	private int idLaboratorio = 0;
	private String nombre;
	private Laboratorio laboratorio;
	private Elemento teclado;
	private Elemento mouse;
	private Elemento cpu;
	private Elemento monitor;
	private Equipo equipo;

	EquipoServices equipoServices = ServicesFactory.getInstance().getEquipoServices();
	ElementoServices elementoServices = ServicesFactory.getInstance().getElementoServices();
	
	private ArrayList<Equipo> equipos;
	
	
	public void registrarEquipo() throws PersistenceException{
		try {
			equipoServices.registrarEquipo(nombre,estado, enUso, idLaboratorio);
			int ultimoID =  equipoServices.getIdEquipo();
			elementoServices.asociarElemento(teclado.getId(),ultimoID);
			elementoServices.asociarElemento(mouse.getId(),ultimoID);
            elementoServices.asociarElemento(cpu.getId(),ultimoID);
            elementoServices.asociarElemento(monitor.getId(),ultimoID);
            FacesContext facesContext = FacesContext.getCurrentInstance();
			facesContext.addMessage(null,new FacesMessage("Equipo agregado"));
            facesContext.getExternalContext().redirect("../registrarEquipo.xhtml");

		}catch(Exception e) {
			FacesContext.getCurrentInstance().addMessage(null,new FacesMessage("No fue posible agregar el equipo","Error"));
			throw new PersistenceException("No se puede agregar el equipo",e);
		}
	}
	
	public ArrayList<Equipo> getEquiposDisponibles() throws PersistenceException{
		equipos = getEquipos();
		ArrayList<Equipo> disponibles = new ArrayList<Equipo>();
		for(int i=0;i<equipos.size();i++) {
			if(equipos.get(i).getIdLaboratorio()==0) {
				disponibles.add(equipos.get(i));
			}
		}
		return disponibles;
	}
	
	public ArrayList<Equipo> getEquipos()throws PersistenceException{
        ArrayList<Equipo> equipos =equipoServices.getEquipos();
        return equipos;
    }
	
	
	
	public void setEstado(String estado) {
		this.estado=estado;
	}
	
	public String getEstado() {
		return estado;
	}
	
	public void setEnUso(String enUso) {
		this.enUso=enUso;
	}
	
	public String getEnUso() {
		return enUso;
	}
	
	public void setIdLaboratorio(int idLaboratorio) {
		this.idLaboratorio=idLaboratorio;
	}
	
	public int getIdLaboratorio() {
		return idLaboratorio;
	}
	
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
	public String getNombre() {
		return nombre;
	}

	public int getIdEquipo() {
		return idEquipo;
	}

	public void setIdEquipo(int idEquipo) {
		this.idEquipo = idEquipo;
	}

	public Laboratorio getLaboratorio() {
		return laboratorio;
	}

	public void setLaboratorio(Laboratorio laboratorio) {
		this.laboratorio = laboratorio;
	}

	public Elemento getTeclado() {
		return teclado;
	}

	public void setTeclado(Elemento teclado) {
		this.teclado = teclado;
	}

	public Elemento getMouse() {
		return mouse;
	}

	public void setMouse(Elemento mouse) {
		this.mouse = mouse;
	}

	public Elemento getCpu() {
		return cpu;
	}

	public void setCpu(Elemento cpu) {
		this.cpu = cpu;
	}

	public Elemento getMonitor() {
		return monitor;
	}

	public void setMonitor(Elemento monitor) {
		this.monitor = monitor;
	}

	public Equipo getEquipo() {
		return equipo;
	}

	public void setEquipo(Equipo equipo) {
		this.equipo = equipo;
	}
		
}