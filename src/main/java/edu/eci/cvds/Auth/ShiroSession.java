package edu.eci.cvds.Auth;


import com.google.inject.Inject;
import edu.eci.cvds.Auth.SessionLogger;
import edu.eci.cvds.Exceptions.PersistenceException;
import edu.eci.cvds.Services.UserServices;

import javax.swing.JOptionPane;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.crypto.hash.Sha512Hash;
import org.apache.shiro.subject.Subject;

public class ShiroSession implements SessionLogger {
    @Inject
    private UserServices userServices;
    private String correo;

    public UserServices getUserServices() {
        return userServices;
    }

    public void setUserServices(UserServices userServices) {
        this.userServices = userServices;
    }
    @Override
    public void login(String correo,String clave,boolean remember) throws PersistenceException{
        try{
        	
        	
            Subject currentUser = SecurityUtils.getSubject();
            UsernamePasswordToken token = new UsernamePasswordToken(correo,clave,remember);
            currentUser.getSession().setAttribute("correo",correo);
            currentUser.login(token);
            

        } catch ( UnknownAccountException e ) {
        	JOptionPane.showMessageDialog(null,"Cuenta Incorrecta");
            throw new PersistenceException("Usuario o contraseña incorrectos",e);
        } catch ( IncorrectCredentialsException ex ) {
        	JOptionPane.showMessageDialog(null,"Usuario o contraseña incorrectos");
            throw new PersistenceException("Usuario o contraseña incorrectos",ex);
        }
    }

    @Override
    public boolean isLogged() {
        return SecurityUtils.getSubject().isAuthenticated();
    }

	@Override
	public void logout() {
		SecurityUtils.getSubject().logout();
		
	}

	@Override
	public boolean isAdmin() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isUser() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String correo() {
		Subject currentUser = SecurityUtils.getSubject();
		return currentUser.getSession().getHost();
	}

}
