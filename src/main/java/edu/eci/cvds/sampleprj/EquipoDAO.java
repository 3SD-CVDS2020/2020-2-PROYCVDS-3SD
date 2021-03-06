package edu.eci.cvds.sampleprj;

import java.util.ArrayList;

import edu.eci.cvds.Exceptions.PersistenceException;
import edu.eci.cvds.entities.Equipo;

public interface EquipoDAO {
    public void registrarEquipo(String nombre,String estado,String enUso,int idLaboratorio)throws PersistenceException;

	public ArrayList<Equipo> getEquipos()throws PersistenceException;

	public Equipo getEquipo(int idEquipo)throws PersistenceException;

	public int getIdEquipo()throws PersistenceException;

	public ArrayList<Equipo> getEquiposDisponibles()throws PersistenceException;

	public void asociarEquipo(int idEquipo, int ultimoID)throws PersistenceException;

	public void darBajaEquipo(int idEquipo, String estado)throws PersistenceException;

	public void desasociar(int idEquipo)throws PersistenceException;
}
