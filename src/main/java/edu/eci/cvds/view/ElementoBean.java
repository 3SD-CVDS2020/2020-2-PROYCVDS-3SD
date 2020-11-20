package edu.eci.cvds.view;


import java.util.ArrayList;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

import com.google.inject.Inject;

import edu.eci.cvds.Exceptions.PersistenceException;
import edu.eci.cvds.Services.ElementoServices;
import edu.eci.cvds.Services.ServicesFactory;
import edu.eci.cvds.Services.UserServices;
import edu.eci.cvds.entities.Elemento;

@SuppressWarnings("deprecation")
@ManagedBean(name ="ElementoBean")
@SessionScoped
public class ElementoBean extends BasePageBean{
	@Inject
	private UserServices userServices;
	private int id;
	private String nombre;
	private String tipoElemento;
	private String marca;
	private String descripcion;
	
	private ElementoServices elementoServices = ServicesFactory.getInstance().getElementoServices();
	
	
	
	public void registrarElemento() throws PersistenceException{
		elementoServices.registrarElemento(id,nombre,tipoElemento,marca,descripcion);
		FacesContext facesContext = FacesContext.getCurrentInstance();
		HttpSession session = (HttpSession) facesContext.getExternalContext().getSession(true);
	    String correoSession = (String) session.getAttribute("correo");
	}
	public ArrayList<Elemento> getElementos()throws PersistenceException {
        ArrayList<Elemento> elementos=new ArrayList<Elemento>();
        elementos=elementoServices.getElementos();
        return elementos;
    }
	
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return this.id;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNombre() {
		return this.nombre;
	}
	public void setTipoElemento(String tipoElemento) {
		this.tipoElemento = tipoElemento;
	}
	public String getTipoElemento() {
		return this.tipoElemento;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getMarca() {
		return this.marca;
	}
	public void setDescripcion (String descripcion) {
		this.descripcion = descripcion;
	}
	public String getDescripcion() {
		return this.descripcion;
	}
	
}