package main.java.edu.eci.cvds.sampleprj.mybatis.Mappers;

public interface ElementoMapper {
    public void registrarElemento(@Param ("tipoElemento") String tipoElemento, @Param ("descripcion") String descripcion);

}
