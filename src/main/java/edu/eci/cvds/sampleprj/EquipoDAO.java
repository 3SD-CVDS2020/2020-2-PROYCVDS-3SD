package edu.eci.cvds.sampleprj;

import java.util.ArrayList;

import edu.eci.cvds.Exceptions.PersistenceException;
import edu.eci.cvds.entities.Equipo;

public interface EquipoDAO {
    public void registrarEquipo(String estado,boolean enUso,int idLaboratorio)throws PersistenceException;

	public ArrayList<Equipo> getEquipos()throws PersistenceException;

	public Equipo getEquipo(int idEquipoN)throws PersistenceException;

	public void asociarElemento(int idElemento, int idEquipo)throws PersistenceException;
}
