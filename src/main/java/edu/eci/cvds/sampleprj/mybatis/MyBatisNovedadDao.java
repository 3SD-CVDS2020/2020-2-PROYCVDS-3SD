package edu.eci.cvds.sampleprj.mybatis;

import java.time.LocalDate;
import java.util.ArrayList;

import com.google.inject.Inject;

import edu.eci.cvds.Exceptions.PersistenceException;
import edu.eci.cvds.entities.Novedad;
import edu.eci.cvds.sampleprj.NovedadDAO;
import edu.eci.cvds.sampleprj.mybatis.Mappers.NovedadMapper;

public class MyBatisNovedadDao implements NovedadDAO {

	@Inject
	private NovedadMapper novedadMapper;
	
	
	
	
	@Override
	public void registrarNovedad(String titulo, String detalle, String responsable, String estado, String tipo,int idElemNovedad)
			throws PersistenceException {
		try {
			LocalDate fecha = LocalDate.now();
			novedadMapper.registrarNovedad(fecha, titulo, detalle, responsable, estado, tipo,idElemNovedad);
		}catch(Exception e) {
			throw new PersistenceException("No se puede registar la novedad",e);
		}
		
	}

	@Override
	public ArrayList<Novedad> getNovedades() throws PersistenceException {
		return novedadMapper.getNovedades();
	}

	public NovedadMapper getNovedadMapper() {
		return novedadMapper;
	}

	public void setNovedadMapper(NovedadMapper novedadMapper) {
		this.novedadMapper = novedadMapper;
	}

}
