package edu.eci.cvds.Services;

import java.util.ArrayList;

import edu.eci.cvds.Exceptions.PersistenceException;
import edu.eci.cvds.entities.Elemento;

public interface ElementoServices {

	public ArrayList<Elemento> getElementos() throws PersistenceException;

	public void registrarElemento(int id, String tipoElemento, String marca, String descripcion, int idEquipo) throws PersistenceException;

	public void asociarElemento(int id, int idEquipo)throws PersistenceException;

	public void darBajaElemento(int id, String descripcion)throws PersistenceException;

	public void desasociar(int id)throws PersistenceException;
	
	

}
