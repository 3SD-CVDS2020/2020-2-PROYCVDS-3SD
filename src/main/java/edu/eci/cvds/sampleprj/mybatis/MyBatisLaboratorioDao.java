package edu.eci.cvds.sampleprj.mybatis;

import java.time.LocalDate;
import java.util.ArrayList;

import com.google.inject.Inject;

import edu.eci.cvds.Exceptions.PersistenceException;
import edu.eci.cvds.entities.Laboratorio;
import edu.eci.cvds.sampleprj.LaboratorioDAO;
import edu.eci.cvds.sampleprj.mybatis.Mappers.LaboratorioMapper;

public class MyBatisLaboratorioDao implements LaboratorioDAO{
	
	@Inject LaboratorioMapper laboratorioMapper;

	@Override
	public ArrayList<Laboratorio> getLaboratorios() throws PersistenceException {
		try {
			return laboratorioMapper.getLaboratorios();
		}catch(Exception e) {
			throw new PersistenceException("No se pueden consultar los laboratorios",e);
		}
	}

	@Override
	public void registrarLaboratorio(String nombre,String horario,String caracteristicas,LocalDate fechaCreacion,boolean cerrado) throws PersistenceException {
		try {
			laboratorioMapper.registrarLaboratorio(nombre,horario,caracteristicas,fechaCreacion,cerrado);
		}catch(Exception e) {
			throw new PersistenceException("No se puede registrar el laboratorio",e);
		}
		
	}

	@Override
	public int getUltimoId() throws PersistenceException {
		try {
			return laboratorioMapper.getUltimoId();
		}catch(Exception e) {
			throw new PersistenceException("No se puede consultar el ultimo ID",e);
		}
	}

	@Override
	public void cerrarLaboratorio(int idLaboratorio) throws PersistenceException {
		try {
			laboratorioMapper.cerrarLaboratorio(idLaboratorio);
		}catch(Exception e) {
			throw new PersistenceException("No se puede cerrar el laboratorio",e);
		}
		
	}
}
