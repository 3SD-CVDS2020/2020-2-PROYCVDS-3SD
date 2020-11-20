package edu.eci.cvds.sampleprj.mybatis.Mappers;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Param;

import edu.eci.cvds.entities.Equipo;

public interface EquipoMapper {
    public void registrarEquipo(@Param ("estado") String estado,@Param ("enUso")boolean enUso,@Param ("idLaboratorio")int idLaboratorio);

	public ArrayList<Equipo> getEquipos();

	public Equipo getEquipo(@Param("idEquipo")int id);

	public void asociarElemento(int idElemento, int idEquipo);
}



