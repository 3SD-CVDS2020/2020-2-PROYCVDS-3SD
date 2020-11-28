package edu.eci.cvds.view;

import java.io.IOException;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

import org.apache.shiro.authz.annotation.RequiresGuest;

import javax.faces.event.ActionEvent;

import com.google.inject.Inject;

import edu.eci.cvds.Exceptions.PersistenceException;
import edu.eci.cvds.Services.ServicesFactory;
import edu.eci.cvds.Auth.*;

@SuppressWarnings("deprecation")
@ManagedBean(name = "LoginBean")
@SessionScoped
public class LoginBean extends BasePageBean{

	private static final long serialVersionUID = -5223360388656378877L;
    
    @Inject
    private SessionLogger sessionLogger;
    private String correo;
    private String password;
    private Boolean remember;

    
    @RequiresGuest
    public void login() throws IOException, PersistenceException{
        boolean isLogger = sessionLogger.isLogged();
        if(!isLogger) {        	
            sessionLogger.login(correo, password, false);
            FacesContext.getCurrentInstance().getExternalContext().redirect("../nuevoMenu.xhtml");
        } else{
            existingSession();
            sessionLogger.logout();
        }
        
    }

    public void existingSession() throws IOException{
        FacesContext facesContext = FacesContext.getCurrentInstance();
        facesContext.getExternalContext().redirect("../usuario.xhtml");
    }

    public void register() throws IOException{
        FacesContext facesContext = FacesContext.getCurrentInstance();
        facesContext.getExternalContext().redirect("../Register.xhtml");
    }

    public void logout() throws IOException{
        FacesContext facesContext = FacesContext.getCurrentInstance();
        facesContext.getExternalContext().redirect("../usuario.xhtml");
        sessionLogger.logout();
    }

   

    public String getCorreo(){
        return correo;
    }

    public void setCorreo(String correo){
        this.correo = correo;
    }

    public boolean getRemember(){
        return remember;
    }

    public void setRemember(boolean remember){
        this.remember = remember;
    }

    public String getPassword(){
        return password;
    }

    public void setPassword(String password){
        this.password = password;
    }

}