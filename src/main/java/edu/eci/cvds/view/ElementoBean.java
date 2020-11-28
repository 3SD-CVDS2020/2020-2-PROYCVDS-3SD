package edu.eci.cvds.view;


import java.util.ArrayList;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

import org.primefaces.PrimeFaces;

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
	private String tipoElemento;
	private String marca;
	private String descripcion;
	private Elemento elemento;
	private int idEquipo =0;
	private ArrayList<Elemento> teclados;
	private ArrayList<Elemento> monitores;
	private ArrayList<Elemento> mouses;
	private ArrayList<Elemento> cpus;
	
	private ElementoServices elementoServices = ServicesFactory.getInstance().getElementoServices();
	private ArrayList<Elemento> elementos;
	
	
	public void darBajaElemento() throws PersistenceException{
    	try{
    		System.out.println("Entró");
            elementoServices.darBajaElemento(elemento.getId(),"baja");
            System.out.println("si lo hizo");
            FacesContext.getCurrentInstance().addMessage(null,new FacesMessage("Elemento dado de baja con exito"));

        }catch (Exception e){
            FacesContext.getCurrentInstance().addMessage(null,new FacesMessage(FacesMessage.SEVERITY_ERROR,"No se pudo dar de baja el Elemento","Error"));
            throw e;
        }
    }
	public void registrarElemento() throws PersistenceException{
		elementoServices.registrarElemento(id,tipoElemento,marca,descripcion,idEquipo);
		FacesContext facesContext = FacesContext.getCurrentInstance();
		HttpSession session = (HttpSession) facesContext.getExternalContext().getSession(true);
	    String correoSession = (String) session.getAttribute("correo");
	}
	public ArrayList<Elemento> getElementos() throws PersistenceException {
        ArrayList<Elemento> elementos=new ArrayList<Elemento>();
        elementos=elementoServices.getElementos();
        return elementos;
    }

	public ArrayList<Elemento> getTeclados() throws PersistenceException {
		elementos = getElementos();
		teclados = new ArrayList<Elemento>();
		for(int i=0;i<elementos.size();i++) {
			if(elementos.get(i).getTipoElemento().equals("Teclado") && elementos.get(i).getIdEquipo()==0) {
				teclados.add(elementos.get(i));
			}
		}
		return teclados;
	}
	
	public ArrayList<Elemento> getMonitores() throws PersistenceException{
		elementos = getElementos();
		monitores = new ArrayList<Elemento>();
		for(int i=0;i<elementos.size();i++) {
			if(elementos.get(i).getTipoElemento().equals("Monitor") && elementos.get(i).getIdEquipo()==0) {
				monitores.add(elementos.get(i));
			}
		}
		return monitores;
	}
	
	public ArrayList<Elemento> getMouses() throws PersistenceException{
		elementos = getElementos();
		mouses = new ArrayList<Elemento>();
		for(int i=0;i<elementos.size();i++) {
			if(elementos.get(i).getTipoElemento().equals("Mouse") && elementos.get(i).getIdEquipo()==0) {
				mouses.add(elementos.get(i));
			}
		}
		return mouses;
	}
	
	public ArrayList<Elemento> getCpus() throws PersistenceException{
		elementos = getElementos();
		cpus = new ArrayList<Elemento>();
		for(int i=0;i<elementos.size();i++) {
			if(elementos.get(i).getTipoElemento().equals("Cpu") && elementos.get(i).getIdEquipo()==0) {
				cpus.add(elementos.get(i));
			}
		}
		return cpus;
	}
	
	public void setCpus(ArrayList<Elemento> cpus) {
		this.cpus = cpus;
	}
	
	public void setMouses(ArrayList<Elemento> mouses) {
		this.mouses = mouses;
	}
	
	
	public void setMonitores(ArrayList<Elemento> monitores) {
		this.monitores = monitores;
	}
	
	public void setTeclados(ArrayList<Elemento> teclados) {
		this.teclados = teclados;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return this.id;
	}
	public void setIdEquipo(int idEquipo) {
		this.idEquipo = idEquipo;
	}
	public int getIdEquipo() {
		return this.idEquipo;
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
	
	public void setElemento(Elemento elemento) {
		this.elemento=elemento;
	}
	public Elemento getElemento() {
		return elemento;
	}
}