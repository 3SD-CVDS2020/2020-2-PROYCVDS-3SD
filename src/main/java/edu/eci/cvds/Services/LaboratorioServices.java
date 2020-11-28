package edu.eci.cvds.Services;

import java.util.ArrayList;

import edu.eci.cvds.Exceptions.PersistenceException;
import edu.eci.cvds.entities.Laboratorio;

public interface LaboratorioServices {
	public ArrayList<Laboratorio> getLaboratorios() throws PersistenceException;

	public void registrarLaboratorio(String nombre, String horario, String caracteristicas) throws PersistenceException;

	public int getUltimoId()throws PersistenceException;
}
