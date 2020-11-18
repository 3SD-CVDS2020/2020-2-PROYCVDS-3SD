package edu.eci.cvds.sampleprj.mybatis;
import com.google.inject.Inject;

import edu.eci.cvds.Exceptions.PersistenceException;
import edu.eci.cvds.entities.Elemento;
import edu.eci.cvds.sampleprj.ElementoDAO;
import edu.eci.cvds.sampleprj.mybatis.Mappers.ElementoMapper;

public class MyBatisElementoDAO implements ElementoDAO{
    @Inject
    private ElementoMapper ElementoMapper;

	@Override
	public void registrarElemento(Elemento elemento) throws PersistenceException {
		try {
			ElementoMapper.registrarElemento(elemento);
		}catch(Exception e) {
			throw new PersistenceException("Error al ingresar nuevo elemento");
		}
		
	}
}
