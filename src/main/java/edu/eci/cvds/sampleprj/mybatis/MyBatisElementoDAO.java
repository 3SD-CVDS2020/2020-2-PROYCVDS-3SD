package main.java.edu.eci.cvds.sampleprj.mybatis;
import com.google.inject.Inject;
import main.java.edu.eci.cvds.sampleprj.mybatis.Mappers.ElementoMapper;

public class MyBatisElementoDAO {
    @Inject
    private ElementoMapper elementoMapper;

    private void RegistrarElemeto(int idEquipo, String tipoElemento, String descripcion){
        elementoMapper.registrarElemento(tipoElemento, descripcion);
    }
}
