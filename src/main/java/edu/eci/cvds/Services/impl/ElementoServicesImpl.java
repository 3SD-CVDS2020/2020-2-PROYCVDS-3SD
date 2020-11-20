package edu.eci.cvds.Services.impl;

import java.util.ArrayList;

import com.google.inject.Inject;

import edu.eci.cvds.Exceptions.PersistenceException;
import edu.eci.cvds.Services.ElementoServices;
import edu.eci.cvds.entities.Elemento;
import edu.eci.cvds.sampleprj.ElementoDAO;

public class ElementoServicesImpl implements ElementoServices {
	
	@Inject 
	private ElementoDAO elementoDao;
	
	@Override
	public ArrayList<Elemento> getElementos() throws PersistenceException {
		
		return elementoDao.getElementos();
	}
	
	@Override
	public void registrarElemento(int id, String nombre, String tipoElemento, String marca, String descripcion)throws PersistenceException{
		try {
			elementoDao.registrarElemento(id, nombre, tipoElemento, marca, descripcion);
		}catch(Exception e) {
			throw new PersistenceException("No se puede registar el elemento");
		}
	}
		
}