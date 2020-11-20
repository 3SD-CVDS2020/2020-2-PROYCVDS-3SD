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
	public void registrarEquipo(String estado, boolean enUso, int idLaboratorio) throws PersistenceException {
		equipoDao.registrarEquipo(estado,enUso,idLaboratorio);
		
	}

	@Override
	public ArrayList<Equipo> getEquipos() throws PersistenceException {
		return equipoDao.getEquipos();
	}

	@Override
	public Equipo getEquipo(int equipo) throws PersistenceException {
		try {
			return equipoDao.getEquipo(equipo);
		} catch (PersistenceException e) {
			throw new PersistenceException("No se puede obtener el equipo");
		}
	}
}
