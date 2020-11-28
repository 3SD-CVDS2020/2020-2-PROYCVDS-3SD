package edu.eci.cvds.sampleprj.mybatis.Mappers;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Param;

import edu.eci.cvds.entities.Equipo;

public interface EquipoMapper {
    public void registrarEquipo(@Param ("nombre")String nombre,@Param ("estado") String estado,@Param ("enUso")String enUso,@Param ("idLaboratorio")int idLaboratorio);

	public ArrayList<Equipo> getEquipos();

	public Equipo getEquipo(@Param("idEquipo")int id);

	public int getIdEquipo();

	public ArrayList<Equipo> getEquiposDisponibles();

	public void asociarEquipo(@Param("idEquipo")int idEquipo,@Param("ultimoID") int ultimoID);
}



