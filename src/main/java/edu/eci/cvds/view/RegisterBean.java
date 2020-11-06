package edu.eci.cvds.view;

import java.io.IOException;
import java.util.*;

import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

import com.google.inject.Inject;

import org.apache.shiro.crypto.hash.Sha512Hash;

import edu.eci.cvds.entities.Usuario;
import edu.eci.cvds.Exceptions.PersistenceException;
import edu.eci.cvds.Services.UserServices;

@ManagedBean(name = "registerBean")
@SessionScoped
public class RegisterBean extends BasePageBean {
    @Inject
    private UserServices userService;

    private static final long serialVersionUID = 1L;
    private String id;
    private boolean estado;
    private String correo;
    private String clave;
    private String carnet;
    private String semestre;

    public void registerNewUser() throws PersistenceException, IOException{
        try {
            userService.registrarUsuario(new Usuario(id, estado,correo,new Sha512Hash(clave).toHex(),carnet,semestre));
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

    public String getDocumento(){
        return id;
    }

    public void setDocumento(String documento){
        this.id=documento;
    }

    public String getCorreo(){
        return correo;
    }

    public void setCorreo(String correo){
        this.correo=correo;
    }

//   public String getNombre(){
  //      return nombre;
//    }
//
//    public void setNombre(String nombre){
//        this.nombre=nombre;
//    }


    public String getClave(){
        return clave;
    }

    public void setClave(String clave){
        this.clave=clave;
    }


}