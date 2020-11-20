package edu.eci.cvds.view;

import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import org.apache.shiro.SecurityUtils;

import com.google.inject.Injector;

import edu.eci.cvds.Exceptions.PersistenceException;
import edu.eci.cvds.Services.ElementoServices;
import edu.eci.cvds.Services.EquipoServices;
import edu.eci.cvds.Services.ServicesFactory;
import edu.eci.cvds.entities.Equipo;

@SuppressWarnings("deprecation")
@ManagedBean(name="AsociarBean")
@RequestScoped
public class AsociarBean extends BasePageBean{
	
	private int idEquipo;
	private int idElemento;
	private int idLaboratorio;
	private Injector injector;
	private int equipo;
	private ElementoServices elementoServices = ServicesFactory.getInstance().getElementoServices();
	private EquipoServices equipoServices = ServicesFactory.getInstance().getEquipoServices();
	
	public void setIdEquipo(int id) {
		this.idEquipo = id;
	}
	public int getIdEquipo() {
		return idEquipo;
	}
	public void setIdElemento(int id) {
		idElemento = id;
	}
	public int getIdElemento() {
		return idElemento;
	}
	public void asociarElemento() {
		FacesContext context = FacesContext.getCurrentInstance();
		try {
			elementoServices.asociarElemento(idElemento, idEquipo);
			context.addMessage(null, new FacesMessage("Succesfull","se ha asociado correctamente"));
		} catch (PersistenceException e) {
	        context.addMessage(null, new FacesMessage("Error",e.getMessage()));
		}
	}
	public List<Equipo> getEquipos() throws PersistenceException{
		try {
			return equipoServices.getEquipos();
		} catch (PersistenceException e) {
			throw new PersistenceException("No se puede obtener los equipos");
		}
	}
	

	
	public Equipo getEquipo() throws PersistenceException {
		try {
			return equipoServices.getEquipo(equipo);
		} catch (PersistenceException e) {
			throw new PersistenceException("No se puede obtener el equipo");
		}
	}

	public void setEquipo(int equipo) {
		this.equipo = equipo;
	}
	
	
}