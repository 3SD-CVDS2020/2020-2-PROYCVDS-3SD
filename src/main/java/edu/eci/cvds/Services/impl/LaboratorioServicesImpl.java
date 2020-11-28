package edu.eci.cvds.Services.impl;

import java.util.ArrayList;

import com.google.inject.Inject;

import edu.eci.cvds.Exceptions.PersistenceException;
import edu.eci.cvds.Services.LaboratorioServices;
import edu.eci.cvds.entities.Laboratorio;
import edu.eci.cvds.sampleprj.LaboratorioDAO;


public class LaboratorioServicesImpl implements LaboratorioServices{

	@Inject
	private LaboratorioDAO laboratorioDao;
	
	@Override
	public ArrayList<Laboratorio> getLaboratorios() throws PersistenceException {
		try {
			return laboratorioDao.getLaboratorios();			
		}catch(Exception e) {
			throw new PersistenceException("No se pueden consultar los laboratorios",e);
		}
	}

	@Override
	public void registrarLaboratorio(String nombre, String horario, String caracteristicas)
			throws PersistenceException {
		try {
			laboratorioDao.registrarLaboratorio(nombre,horario,caracteristicas);
		}catch(Exception e) {
			throw new PersistenceException("No se puede registrar el laboratorio",e);
		}
		
	}

	@Override
	public int getUltimoId() throws PersistenceException {
		try {
			return laboratorioDao.getUltimoId();
		}catch(Exception e) {
			throw new PersistenceException("No se puede obtener el ultimo ID",e);
		}
	}

}
