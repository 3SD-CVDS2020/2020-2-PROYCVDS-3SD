package edu.eci.cvds.view;

import java.io.IOException;
import java.util.*;


import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

import com.google.inject.Inject;

import edu.eci.cvds.entities.Usuario;
import edu.eci.cvds.Exceptions.PersistenceException;
import edu.eci.cvds.Services.ServicesFactory;
import edu.eci.cvds.Services.UserServices;

@SuppressWarnings("deprecation")
@ManagedBean(name = "RegistrarBean")
@RequestScoped
public class RegistrarBean extends BasePageBean {
    @Inject
    
    private static final long serialVersionUID = 1L;
    private int carnet;
    private String correo;
    private String clave;
    private String nombre;
    private String apellido;
    private String cargo;
    
    private UserServices userService = ServicesFactory.getInstance().getUserServices();

    public void registerNewUser() throws PersistenceException, IOException{

    	userService.registrarUsuario(carnet,correo,clave,nombre,apellido,cargo);
    	FacesContext facesContext = FacesContext.getCurrentInstance();
        facesContext.getExternalContext().redirect("../usuario.xhtml");
    }

    public void redirectToLogin() throws IOException{
        System.out.println("Redirect to login");
        FacesContext facesContext = FacesContext.getCurrentInstance();
        facesContext.getExternalContext().redirect("../usuario.xhtml");
    }

    public int getCarnet(){
    	return carnet;
    }

    public void setCarnet(int carnet){
    	this.carnet=carnet;
    }
    
    public String getCargo(){
        return cargo;
    }

    public void setCargo(String cargo){
        this.cargo=cargo;
    }

    public String getApellido(){
        return apellido;
    }

    public void setApellido(String apellido){
        this.apellido = apellido;
    }

    public String getCorreo(){
        return correo;
    }

    public void setCorreo(String correo){
        this.correo=correo;
    }

    public String getClave(){
        return clave;
    }

    public void setClave(String clave){
        this.clave=clave;
    }

    
    
    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }



    

}