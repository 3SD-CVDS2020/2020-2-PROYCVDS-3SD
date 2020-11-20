package edu.eci.cvds.sampleprj.mybatis;
import java.util.ArrayList;

import com.google.inject.Inject;

import edu.eci.cvds.Exceptions.PersistenceException;
import edu.eci.cvds.entities.Elemento;
import edu.eci.cvds.sampleprj.ElementoDAO;
import edu.eci.cvds.sampleprj.mybatis.Mappers.ElementoMapper;

public class MyBatisElementoDAO implements ElementoDAO{
    @Inject
    private ElementoMapper elementoMapper;

	@Override
	public void registrarElemento(int id,String nombre,String tipoElemento,String marca,String descripcion) throws PersistenceException {
		try {
			System.out.println("AQUI SE QUEDA TAMBIEN");
			elementoMapper.registrarElemento(id,nombre,tipoElemento,marca,descripcion);
		}catch(Exception e) {
			throw new PersistenceException("Error al ingresar nuevo elemento");
		}
		
	}

	@Override
	public ArrayList<Elemento> getElementos() throws PersistenceException {
		try {
			System.out.println("AQUI SE QUEDA TAMBIEN");
			return elementoMapper.getElementos();
		}catch(Exception e) {
			throw new PersistenceException("No es posible consultar elementos");
			}
		}

	@Override
	public Elemento getElemento(int id) throws PersistenceException {
		return elementoMapper.getElemento(id);
	}

	@Override
	public boolean elementoAsociadoaEquipo(int idElemento) {
		return elementoMapper.elementoAsociadoaEquipo(idElemento);
	}

	@Override
	public void desvincularElementos(String tipoElemento, int idEquipo) throws PersistenceException {
		try {
			elementoMapper.desvincularElementos(tipoElemento,idEquipo);
		}catch(Exception e) {
			throw new PersistenceException("Elemento sin vinculo");
		}
		
	}

}

