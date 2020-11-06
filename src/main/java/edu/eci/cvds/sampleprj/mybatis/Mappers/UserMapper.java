package edu.eci.cvds.sampleprj.mybatis.Mappers;

import org.apache.ibatis.annotations.Param;

import edu.eci.cvds.entities.Usuario;

public interface UserMapper {
	
	public void registrarUsuario(@Param("usuario")Usuario usuario);

}
