package edu.eci.cvds.Services;

import edu.eci.cvds.Exceptions.PersistenceException;
import edu.eci.cvds.entities.Elemento;
import edu.eci.cvds.entities.Usuario;

public interface UserServices {

	public void registrarUsuario(int carnet,String nombre,String corrreo,String clave,String apellido,String cargo) throws PersistenceException;

	

	public Usuario consultarIdUsuarioPorCorreo(String correoSession) throws PersistenceException;

	public int consultarUltimoIdElement() throws PersistenceException;
	
}
