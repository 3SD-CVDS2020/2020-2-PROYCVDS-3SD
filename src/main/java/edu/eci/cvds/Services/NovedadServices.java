package edu.eci.cvds.Services;

import java.util.ArrayList;

import edu.eci.cvds.Exceptions.PersistenceException;
import edu.eci.cvds.entities.Novedad;

public interface NovedadServices {

	public void registrarNovedad(String titulo,String detalle,String responsable,String estado,String tipo,int idElemNovedad)throws PersistenceException;
	public ArrayList<Novedad>getNovedades()throws PersistenceException;
	
	
}
