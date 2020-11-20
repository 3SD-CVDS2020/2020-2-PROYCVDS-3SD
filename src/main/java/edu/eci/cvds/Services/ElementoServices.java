package edu.eci.cvds.Services;

import java.util.ArrayList;

import edu.eci.cvds.Exceptions.PersistenceException;
import edu.eci.cvds.entities.Elemento;

public interface ElementoServices {

	public ArrayList<Elemento> getElementos() throws PersistenceException;

	public void registrarElemento(int id, String nombre, String tipoElemento, String marca, String descripcion) throws PersistenceException;

}
