package edu.eci.cvds.sampleprj;

import java.time.LocalDate;
import java.util.ArrayList;

import edu.eci.cvds.Exceptions.PersistenceException;
import edu.eci.cvds.entities.Laboratorio;

public interface LaboratorioDAO {
	public ArrayList<Laboratorio> getLaboratorios() throws PersistenceException;

	public void registrarLaboratorio(String nombre, String horario, String caracteristicas,LocalDate fechaCreacion,boolean cerrado)throws PersistenceException;

	public int getUltimoId()throws PersistenceException;

	public void cerrarLaboratorio(int idLaboratorio)throws PersistenceException;
}
