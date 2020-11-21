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
		
		return elementoDao.getElementos();
	}
	
	@Override
	public void registrarElemento(int id, String nombre, String tipoElemento, String marca, String descripcion)throws PersistenceException{
		try {
			elementoDao.registrarElemento(id, nombre, tipoElemento, marca, descripcion);
		}catch(Exception e) {
			throw new PersistenceException("No se puede registar el elemento",e);
		}
	}

	@Override
	public void asociarElemento(int idElemento, int idEquipo) throws PersistenceException {
		Elemento e = getElemento(idElemento);
		if(e==null) throw new PersistenceException("No existe el elemento a vincular.");
		if(elementoAsociadoaEquipo(idElemento)) throw new PersistenceException("Este elemento ya se encuentra vinculado a otro equipo");
		if(e.getFechaFinActividad()!=null) throw new PersistenceException("El elemento a sido dado de baja, este no puede ser vinculado a ningun equipo.");
		if(equipoDao.getEquipo(idEquipo)==null) throw new PersistenceException("No existe este equipo.");
		elementoDao.desvincularElementos(e.getTipoElemento(),idEquipo);
		equipoDao.asociarElemento(idElemento, idEquipo);
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
		
}