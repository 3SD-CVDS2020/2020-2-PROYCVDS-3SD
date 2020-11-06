package edu.eci.cvds.entities;

public class Usuario{
	
	private String usuario;
	private boolean estado;
	private String correo;
	private String clave;
	private String carnet;
	private String semestre;
	
	
	public Usuario(){
		
	}
	
	public Usuario(String usuario, boolean estado, String correo, String clave, String carnet, String semestre){
		this.usuario = usuario;
		this.estado = estado;
		this.correo = correo;
		this.clave = clave;
		this.carnet = carnet;
		this.semestre = semestre;
	}
	
	public String getUsuario(){
		return usuario;
	}
	
	public boolean getEstado(){
		return estado;
	}
	
	public String getCorreo(){
		return correo;
	}
	
	public String getContrasena(){
		return clave;
	}
	
	public String getCarnet(){
		return carnet;
	}
	
	public String getSemestre(){
		return semestre;
	}
	
	public void setUsuario(String usuario){
		this.usuario = usuario;
	}
	
	public void setEstado(boolean estado){
		this.estado = estado;
	}
	
	public void setCorreo(){
		this.correo = correo;
	}
	
	public void setContrasena(String clave){
		this.clave = clave;
	}
	
	public void setCarnet(String carnet){
		this.carnet = carnet;
	}
	
	public void setSemestre(String semestre){
		this.semestre = semestre;
	}
	
	
	
	
	
	
	
	
	
	
}