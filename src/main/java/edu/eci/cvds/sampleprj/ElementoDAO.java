package edu.eci.cvds.sampleprj;

import java.util.ArrayList;

import edu.eci.cvds.Exceptions.PersistenceException;
import edu.eci.cvds.entities.Elemento;

public interface ElementoDAO {
	public void registrarElemento(int id,String nombre,String tipoElemento,String marca,String descripcion) throws PersistenceException;
	public ArrayList<Elemento> getElementos()throws PersistenceException;
}
