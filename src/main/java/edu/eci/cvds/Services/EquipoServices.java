package edu.eci.cvds.Services;

import java.util.ArrayList;

import edu.eci.cvds.Exceptions.PersistenceException;
import edu.eci.cvds.entities.Equipo;

public interface EquipoServices {
	public void registrarEquipo(String nombre,String estado,String enUso,int idLaboratorio)throws PersistenceException;

	public ArrayList<Equipo> getEquipos()throws PersistenceException;

	public Equipo getEquipo(int equipo) throws PersistenceException;

	public int getIdEquipo()throws PersistenceException;

	public ArrayList<Equipo> getEquiposDisponibles()throws PersistenceException;

	public void asociarEquipo(int idEquipo, int ultimoID)throws PersistenceException;

	public void darBajaEquipo(int idEquipo, String estado)throws PersistenceException;
}
