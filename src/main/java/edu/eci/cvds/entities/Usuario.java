package edu.eci.cvds.entities;

public class Usuario{
	
	private int carnet;
    private String nombre;
    private String correo;
    private String clave;
    private String apellido;
    private String cargo;
	
	
	public Usuario(){
		
	}
	
	public Usuario( int carnet,String correo,String clave,String nombre,String apellido, String cargo){
		this.carnet= carnet;
		this.nombre = nombre;
		this.correo = correo;
		this.clave = clave;
		this.apellido = apellido;
		this.cargo = cargo;
	}
	
	public int getCarnet(){
    	return carnet;
    }

    public void setCarnet(int carnet){
    	this.carnet=carnet;
    }
    
    public String getCargo(){
        return cargo;
    }

    public void setCargo(String cargo){
        this.cargo=cargo;
    }

    public String getApellido(){
        return apellido;
    }

    public void setApellido(String apellido){
        this.apellido = apellido;
    }

    public String getCorreo(){
        return correo;
    }

    public void setCorreo(String correo){
        this.correo=correo;
    }

    public String getClave(){
        return clave;
    }

    public void setClave(String clave){
        this.clave=clave;
    }

    
    
    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }
	

}