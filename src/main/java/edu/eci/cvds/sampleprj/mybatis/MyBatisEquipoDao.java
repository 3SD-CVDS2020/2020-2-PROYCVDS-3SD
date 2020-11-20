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
	public void registrarEquipo(String estado, boolean enUso, int idLaboratorio) throws PersistenceException {
		try {
			System.out.println("Quiero ver que llegue aqui");
			equipoMapper.registrarEquipo(estado,enUso, idLaboratorio);
		}catch(Exception e) {
			throw new PersistenceException("No es posible registrar el equipo");
		}
		
	}

	@Override
	public ArrayList<Equipo> getEquipos() throws PersistenceException {
		try {
			return equipoMapper.getEquipos();
		}catch(Exception e) {
			throw new PersistenceException("No se encontraron equipos");
		}
	}

	@Override
	public Equipo getEquipo(int idEquipo) throws PersistenceException {
		try {
			return equipoMapper.getEquipo(idEquipo);
		}catch(Exception e) {
			throw new PersistenceException("No se encuentra el equipo");
		}
	}

	@Override
	public void asociarElemento(int idElemento, int idEquipo) throws PersistenceException {
		Equipo e = getEquipo(idEquipo);
		if ((e!=null) && (e.getFechaFinActividad()==null)){
			equipoMapper.asociarElemento(idElemento,idEquipo);
		}else {
			throw new PersistenceException("El equipo no se puede asociar");
		}
		
	}
}





