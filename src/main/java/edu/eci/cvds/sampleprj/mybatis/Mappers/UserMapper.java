package edu.eci.cvds.sampleprj.mybatis.Mappers;

import org.apache.ibatis.annotations.Param;

import edu.eci.cvds.entities.Usuario;

public interface UserMapper {
	
	public void registrarUsuario(@Param("carnet")int carnet,@Param("nombre")String nombre,@Param("correo")String correo,@Param("clave")String clave,@Param("apellido")String apellido,@Param("cargo")String cargo);

}
