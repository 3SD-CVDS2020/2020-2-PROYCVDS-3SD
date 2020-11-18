package edu.eci.cvds.sampleprj.mybatis.Mappers;

import org.apache.ibatis.annotations.Param;

import edu.eci.cvds.entities.Elemento;

public interface ElementoMapper {
	public void registrarElemento(@Param("elemento") Elemento elemento);

}
