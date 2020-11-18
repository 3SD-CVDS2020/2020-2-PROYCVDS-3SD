package edu.eci.cvds.sampleprj.mybatis.Mappers;

import org.apache.ibatis.annotations.Param;

public interface EquipoMapper {
    public void registrarEquipo(@Param ("idEquipo") int idElemento, @Param ("idLaboratorio") int idLaboratorio);
}



