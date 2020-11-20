package edu.eci.cvds.Services;

import java.util.ArrayList;

import edu.eci.cvds.Exceptions.PersistenceException;
import edu.eci.cvds.entities.Equipo;

public interface EquipoServices {
	public void registrarEquipo(String estado,boolean enUso,int idLaboratorio)throws PersistenceException;

	public ArrayList<Equipo> getEquipos()throws PersistenceException;
}
