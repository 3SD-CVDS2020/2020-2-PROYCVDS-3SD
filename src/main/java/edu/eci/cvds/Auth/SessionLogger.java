package edu.eci.cvds.Auth;

import edu.eci.cvds.Exceptions.PersistenceException;

public interface SessionLogger {

	void login(String nombre, String clave,boolean remember) throws PersistenceException;
	
	void logout();
	
	boolean isAdmin();

	boolean isLogged();

	boolean isUser();

}
