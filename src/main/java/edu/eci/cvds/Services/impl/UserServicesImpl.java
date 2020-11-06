package edu.eci.cvds.Services.impl;

import com.google.inject.Inject;

import edu.eci.cvds.Exceptions.PersistenceException;
import edu.eci.cvds.Services.UserServices;
import edu.eci.cvds.entities.Usuario;
import edu.eci.cvds.sampleprj.UserDAO;

public class UserServicesImpl implements UserServices{
	
	@Inject
	private UserDAO userDao;

	@Override
	public void registrarUsuario(Usuario usuario) throws PersistenceException {
		try {
			userDao.registrarUsuario(usuario);
		}catch(PersistenceException e) {
			throw new PersistenceException("Error al registrar");
		}
		
	}
	
	
	
	
	

}
