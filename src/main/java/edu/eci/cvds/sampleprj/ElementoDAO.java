package edu.eci.cvds.sampleprj;

import edu.eci.cvds.Exceptions.PersistenceException;
import edu.eci.cvds.entities.Elemento;

public interface ElementoDAO {
	public void registrarElemento(Elemento elemento) throws PersistenceException;
	
}
