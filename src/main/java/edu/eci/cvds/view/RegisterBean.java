package edu.eci.cvds.view;

import java.io.IOException;
import java.util.*;


import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import com.google.inject.Inject;

import edu.eci.cvds.entities.Usuario;
import edu.eci.cvds.Exceptions.PersistenceException;
import edu.eci.cvds.Services.UserServices;

@SuppressWarnings("deprecation")
@ManagedBean(name = "RegisterBean")
@SessionScoped
public class RegisterBean extends BasePageBean {
    @Inject
    private UserServices userService;
    private static final long serialVersionUID = 1L;
    private String carnet;
    private String nombre;
    private String correo;
    private String clave;
    private String apellido;
    private String cargo;

    public void registerNewUser() throws PersistenceException, IOException{
        try {
        	System.out.println("ENTRA POR LO MENOS");
        	System.out.println("ENTRA POR LO MENOS");
        	System.out.println("ENTRA POR LO MENOS");
        	System.out.println("ENTRA POR LO MENOS");
        	System.out.println("ENTRA POR LO MENOS");
        	System.out.println("ENTRA POR LO MENOS");
        	System.out.println("ENTRA POR LO MENOS");
            userService.registrarUsuario(new Usuario(carnet, nombre,correo,clave,apellido,cargo));
            FacesContext facesContext = FacesContext.getCurrentInstance();
            facesContext.getExternalContext().redirect("../usuario.xhtml");
            
        } catch (PersistenceException e) {
            throw new PersistenceException("Error al registrar el equipo");
        }
    }

    public void redirectToLogin() throws IOException{
        System.out.println("Redirect to login");
        FacesContext facesContext = FacesContext.getCurrentInstance();
        facesContext.getExternalContext().redirect("../usuario.xhtml");
    }

    public String getCarnet(){
    	return carnet;
    }

    public void setCarnet(String carnet){
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