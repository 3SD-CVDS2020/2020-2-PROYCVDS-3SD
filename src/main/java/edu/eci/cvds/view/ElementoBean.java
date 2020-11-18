package edu.eci.cvds.view;


import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

import com.google.inject.Inject;

import edu.eci.cvds.Exceptions.PersistenceException;
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
	
	
	
	public void registrarElemento() throws PersistenceException{
		Elemento elemento = new Elemento(id,nombre,tipoElemento,marca,descripcion);
		userServices.registrarElemento(elemento);
		FacesContext facesContext = FacesContext.getCurrentInstance();
		HttpSession session = (HttpSession) facesContext.getExternalContext().getSession(true);
	    String correoSession = (String) session.getAttribute("correo");
	}
}