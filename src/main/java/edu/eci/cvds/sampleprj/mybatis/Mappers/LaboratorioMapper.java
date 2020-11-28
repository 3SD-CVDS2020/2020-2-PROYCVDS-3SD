package edu.eci.cvds.sampleprj.mybatis.Mappers;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Param;

import edu.eci.cvds.entities.Laboratorio;

public interface LaboratorioMapper {

		public ArrayList<Laboratorio> getLaboratorios();

		public void registrarLaboratorio(@Param ("nombre")String nombre,@Param ("horario")String horario,@Param("caracteristicas")String caracteristicas);

		public int getUltimoId();
}
