package edu.eci.cvds.sampleprj.mybatis;


import java.util.ArrayList;

import com.google.inject.Inject;

import edu.eci.cvds.Exceptions.PersistenceException;
import edu.eci.cvds.entities.Equipo;
import edu.eci.cvds.sampleprj.EquipoDAO;
import edu.eci.cvds.sampleprj.mybatis.Mappers.EquipoMapper;

public class MyBatisEquipoDao implements EquipoDAO {
    @Inject
    private EquipoMapper equipoMapper;
    

	@Override
	public void registrarEquipo(String nombre,String estado, String enUso, int idLaboratorio) throws PersistenceException {
		try {
			equipoMapper.registrarEquipo(nombre,estado,enUso, idLaboratorio);
		}catch(Exception e) {
			throw new PersistenceException("No es posible registrar el equipo",e);
		}
		
	}

	@Override
	public ArrayList<Equipo> getEquipos() throws PersistenceException {
		try {
			return equipoMapper.getEquipos();
		}catch(Exception e) {
			throw new PersistenceException("No se encontraron equipos",e);
		}
	}

	@Override
	public Equipo getEquipo(int idEquipo) throws PersistenceException {
		try {
			return equipoMapper.getEquipo(idEquipo);
		}catch(Exception e) {
			throw new PersistenceException("No se encuentra el equipo",e);
		}
	}

	@Override
	public int getIdEquipo() throws PersistenceException {
		try {
			return equipoMapper.getIdEquipo();
		}catch(Exception e) {
			throw new PersistenceException("No fue posible consultar el ultimo Id",e);
		}
	}

	@Override
	public ArrayList<Equipo> getEquiposDisponibles() throws PersistenceException {
		try {
			return equipoMapper.getEquiposDisponibles();
		}catch(Exception e) {
			throw new PersistenceException("No fue posible consultar los equipos disponibles",e);
		}
	}

	@Override
	public void asociarEquipo(int idEquipo, int ultimoID) throws PersistenceException {
		try {
			equipoMapper.asociarEquipo(idEquipo,ultimoID);
		}catch(Exception e) {
			throw new PersistenceException("No se pudo asociar el equipo",e);
		}
		
	}

}





