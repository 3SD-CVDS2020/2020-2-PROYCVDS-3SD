package edu.eci.cvds.sampleprj.mybatis.Mappers;

import java.time.LocalDate;
import java.util.ArrayList;

import org.apache.ibatis.annotations.Param;

import edu.eci.cvds.entities.Novedad;

public interface NovedadMapper {
	
public void registrarNovedad(@Param("fecha")LocalDate fecha,@Param("titulo")String titulo,@Param("detalle")String detalle,@Param("responsable")String responsable,@Param("estado")String estado,@Param("tipo")String tipo,@Param("idElemNovedad")int idElemNovedad); 
public ArrayList<Novedad> getNovedades(); 
}
