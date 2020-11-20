package edu.eci.cvds.view;

import java.util.ArrayList;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import edu.eci.cvds.Exceptions.PersistenceException;
import edu.eci.cvds.Services.ElementoServices;
import edu.eci.cvds.Services.EquipoServices;
import edu.eci.cvds.Services.ServicesFactory;
import edu.eci.cvds.entities.Equipo;



public class EquipoBean{
	
	private String estado;
	private boolean enUso;
	private int idLaboratorio;

	EquipoServices equipoServices = ServicesFactory.getInstance().getEquipoServices();
	ElementoServices elementoServices = ServicesFactory.getInstance().getElementoServices();
	
	
	public void registrarEquipo() throws PersistenceException{
		try {
			equipoServices.registrarEquipo(estado, enUso, idLaboratorio);
			FacesContext.getCurrentInstance().addMessage(null,new FacesMessage("Equipo agregado"));
		}catch(Exception e) {
			FacesContext.getCurrentInstance().addMessage(null,new FacesMessage("No fue posible agregar el equipo","Error"));
			throw new PersistenceException("No se puede agregar el equipo");
		}
	}
	
	public ArrayList<Equipo> getEquipos()throws PersistenceException{
        ArrayList<Equipo>equipos=equipoServices.getEquipos();
        return equipoServices.getEquipos();
    }
	
	public void setEstado(String estado) {
		this.estado=estado;
	}
	
	public String getEstado() {
		return estado;
	}
	
	public void setEnUso(boolean enUso) {
		this.enUso=enUso;
	}
	
	public boolean getEnUso() {
		return enUso;
	}
	
	public void setIdLaboratorio(int idLaboratorio) {
		this.idLaboratorio=idLaboratorio;
	}
	
	public int getIdLaboratorio() {
		return idLaboratorio;
	}
		
}