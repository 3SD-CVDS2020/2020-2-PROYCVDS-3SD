package main.java.edu.eci.cvds.sampleprj.mybatis;

import main.java.edu.eci.cvds.sampleprj.mybatis.Mappers.ElementoMapper;
import main.java.edu.eci.cvds.sampleprj.mybatis.Mappers.EquipoMapper;

public class MyBatisEquipoDao {
    @Inject
    private EquipoMapper equipoMapper;

    private void RegistrarEquipo(int idEquipo, int idLaboratorio){
        equipoMapper.registrarEquipo(idEquipo, idLaboratorio);
    }

}





