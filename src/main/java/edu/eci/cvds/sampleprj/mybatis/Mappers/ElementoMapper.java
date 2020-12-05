package edu.eci.cvds.sampleprj.mybatis.Mappers;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Param;

import edu.eci.cvds.entities.Elemento;

public interface ElementoMapper {
	public void registrarElemento(@Param("id")int id,@Param("tipoElemento")String tipoElemento,@Param("marca")String marca,@Param("descripcion")String descripcion,@Param("idEquipo")int idEquipo);

	public ArrayList<Elemento> getElementos();

	public Elemento getElemento(@Param("id")int id);

	public boolean elementoAsociadoaEquipo(@Param("idElemento")int idElemento);

	public void desvincularElementos(@Param("tipoElemento")String tipoElemento,@Param("idEquipo")int idEquipo);

	public void asociarElemento(@Param("id")int id,@Param("idEquipo") int idEquipo);

	public void darBajaElemento(@Param("id")int id,@Param("descripcion") String descripcion);

	public void desasociar(@Param("id")int id);

}
