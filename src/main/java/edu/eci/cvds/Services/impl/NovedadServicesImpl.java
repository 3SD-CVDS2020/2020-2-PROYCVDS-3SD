package edu.eci.cvds.Services.impl;

import java.util.ArrayList;

import com.google.inject.Inject;

import edu.eci.cvds.Exceptions.PersistenceException;
import edu.eci.cvds.Services.NovedadServices;
import edu.eci.cvds.entities.Novedad;
import edu.eci.cvds.sampleprj.NovedadDAO;

public class NovedadServicesImpl implements NovedadServices{

	@Inject
	private NovedadDAO novedadDao;
	
	@Override
	public void registrarNovedad(String titulo, String detalle, String responsable, String estado, String tipo,int idElemNovedad)
			throws PersistenceException {
		if(detalle==null) {
			throw new PersistenceException("Información incompleta");
		}else {
			novedadDao.registrarNovedad(titulo, detalle, responsable, estado, tipo,idElemNovedad);
		}
		
	}

	@Override
	public ArrayList<Novedad> getNovedades() throws PersistenceException {
		try{
			return novedadDao.getNovedades();
		}catch(Exception e) {
			throw new PersistenceException("No se pueden obtener las novedades",e);
		}
	}

	public NovedadDAO getNovedadDao() {
		return novedadDao;
	}

	public void setNovedadDao(NovedadDAO novedadDao) {
		this.novedadDao = novedadDao;
	}

}
