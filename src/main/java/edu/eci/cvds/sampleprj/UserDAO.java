package edu.eci.cvds.sampleprj;

import java.util.List;

import edu.eci.cvds.Exceptions.PersistenceException;
import edu.eci.cvds.entities.Usuario;

public interface UserDAO {
	public void registrarUsuario(Usuario usuario)	throws PersistenceException;
	public void modificar(Usuario usuario)	throws Exception;
	public void eliminar(Usuario usuario)	throws Exception;
	public List<Usuario> listar(Usuario usuario)	throws Exception;
	
}
