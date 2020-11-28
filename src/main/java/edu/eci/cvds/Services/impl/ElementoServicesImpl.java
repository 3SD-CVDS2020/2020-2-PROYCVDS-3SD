package edu.eci.cvds.Services.impl;

import java.util.ArrayList;

import com.google.inject.Inject;

import edu.eci.cvds.Exceptions.PersistenceException;
import edu.eci.cvds.Services.ElementoServices;
import edu.eci.cvds.entities.Elemento;
import edu.eci.cvds.sampleprj.ElementoDAO;
import edu.eci.cvds.sampleprj.EquipoDAO;

public class ElementoServicesImpl implements ElementoServices {
	
	@Inject 
	private ElementoDAO elementoDao;
	
	@Inject
	private EquipoDAO equipoDao;
	
	@Override
	public ArrayList<Elemento> getElementos() throws PersistenceException {
		try {
			return elementoDao.getElementos();
		}catch(Exception e) {
			throw new PersistenceException("No se puede consultar los elementos",e);
		}
	}
	
	@Override
	public void registrarElemento(int id, String tipoElemento, String marca, String descripcion, int idEquipo)throws PersistenceException{
		try {
			elementoDao.registrarElemento(id, tipoElemento, marca, descripcion, idEquipo);
		}catch(Exception e) {
			throw new PersistenceException("No se puede registar el elemento",e);
		}
	}

	

	private boolean elementoAsociadoaEquipo(int idElemento) {
		return this.elementoDao.elementoAsociadoaEquipo(idElemento);
	}

	public Elemento getElemento(int id) throws PersistenceException  {
		try {
			return elementoDao.getElemento(id);
		} catch (PersistenceException e) {
			throw new PersistenceException("No se puede obtener el elemento");
		}
	}

	@Override
	public void asociarElemento(int id, int idEquipo) throws PersistenceException {
		try {
			elementoDao.asociarElemento(id,idEquipo);
		}catch(Exception e) {
			throw new PersistenceException("No se puede asociar el elemento",e);
		}
		
	}

	@Override
	public void darBajaElemento(int id, String descripcion) throws PersistenceException {
		try {
			elementoDao.darBajaElemento(id,descripcion);
		}catch(Exception e) {
			throw new PersistenceException("No se puede dar de baja el elemento",e);
		}
		
	}
		
}