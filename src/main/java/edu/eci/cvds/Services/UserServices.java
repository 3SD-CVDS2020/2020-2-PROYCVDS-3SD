package edu.eci.cvds.Services;

import edu.eci.cvds.Exceptions.PersistenceException;
import edu.eci.cvds.entities.Usuario;

public interface UserServices {

	public void registrarUsuario(Usuario usuario) throws PersistenceException;
}
