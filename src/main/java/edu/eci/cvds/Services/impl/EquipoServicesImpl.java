package edu.eci.cvds.Services.impl;

import java.util.ArrayList;

import com.google.inject.Inject;

import edu.eci.cvds.Exceptions.PersistenceException;
import edu.eci.cvds.Services.EquipoServices;
import edu.eci.cvds.entities.Equipo;
import edu.eci.cvds.sampleprj.EquipoDAO;

public class EquipoServicesImpl implements EquipoServices{
	@Inject
	private EquipoDAO equipoDao;

	@Override
	public void registrarEquipo(String nombre,String estado, String enUso, int idLaboratorio) throws PersistenceException {
		try {
			equipoDao.registrarEquipo(nombre,estado,enUso,idLaboratorio);
		}catch(Exception e){
			throw new PersistenceException("Por que no sabia esta",e);
		}
	}

	@Override
	public ArrayList<Equipo> getEquipos() throws PersistenceException {
		try {
			return equipoDao.getEquipos();
		}catch(Exception e) {
			throw new PersistenceException("No se obtuvieron los equipos",e);
		}
	}

	@Override
	public Equipo getEquipo(int equipo) throws PersistenceException {
		try {
			return equipoDao.getEquipo(equipo);
		} catch (PersistenceException e) {
			throw new PersistenceException("No se puede obtener el equipo",e);
		}
	}

	@Override
	public int getIdEquipo() throws PersistenceException {
		try {
			return equipoDao.getIdEquipo();
		}catch(Exception e) {
			throw new PersistenceException("No se pudo consultar el ultimo Id",e);
		}
	}

	@Override
	public ArrayList<Equipo> getEquiposDisponibles() throws PersistenceException {
		try {
			return equipoDao.getEquiposDisponibles();
		}catch(Exception e) {
			throw new PersistenceException("No se pueden consultar los equipos disponibles",e);
		}
		
	}

	@Override
	public void asociarEquipo(int idEquipo, int ultimoID) throws PersistenceException {
		try {
			equipoDao.asociarEquipo(idEquipo,ultimoID);
		}catch(Exception e) {
			throw new PersistenceException("No se puede asociar el equipo",e);
		}
		
		
	}
}
