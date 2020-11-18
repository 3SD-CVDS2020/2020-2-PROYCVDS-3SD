package edu.eci.cvds.sampleprj.mybatis;


import com.google.inject.Inject;

import edu.eci.cvds.sampleprj.mybatis.Mappers.EquipoMapper;

public class MyBatisEquipoDao {
    @Inject
    private EquipoMapper equipoMapper;

    private void RegistrarEquipo(int idEquipo, int idLaboratorio){
        equipoMapper.registrarEquipo(idEquipo, idLaboratorio);
    }

}





