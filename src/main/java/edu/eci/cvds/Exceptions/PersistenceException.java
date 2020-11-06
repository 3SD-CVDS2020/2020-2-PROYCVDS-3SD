package edu.eci.cvds.Exceptions;

public class PersistenceException extends Exception{
	
	public PersistenceException(String mensaje, Exception e) {
		super(mensaje,e);
	}

	public PersistenceException(String mensaje) {
		super(mensaje);
	}
}
