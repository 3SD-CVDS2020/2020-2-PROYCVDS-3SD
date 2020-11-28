package edu.eci.cvds.Services.impl;

import com.google.inject.Inject;

import edu.eci.cvds.Exceptions.PersistenceException;
import edu.eci.cvds.Services.UserServices;
import edu.eci.cvds.entities.Elemento;
import edu.eci.cvds.entities.Usuario;
import edu.eci.cvds.sampleprj.ElementoDAO;
import edu.eci.cvds.sampleprj.UserDAO;

public class UserServicesImpl implements UserServices{
	
	@Inject
	private UserDAO userDao;
	@Inject
	private ElementoDAO elementoDao;

	@Override
	public void registrarUsuario(int carnet,String correo,String clave,String nombre,String apellido,String cargo) throws PersistenceException {
		try {
			userDao.registrarUsuario(carnet,correo,clave,nombre,apellido,cargo);
		}catch(PersistenceException e) {
			throw new PersistenceException("Error al registrar",e);
		}
		
	}

	@Override
	public Usuario consultarIdUsuarioPorCorreo(String correoSession) throws PersistenceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int consultarUltimoIdElement() throws PersistenceException {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
	
	

}
