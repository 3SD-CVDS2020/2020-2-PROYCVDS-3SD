package main.java.edu.eci.cvds.entities;

public class Equipo {
    private int idEquipo;
    private int idLaboratorio;

    public Equipo(int idEquipo, int idLaboratorio){
        this.idEquipo = idEquipo;
        this.idLaboratorio = idLaboratorio;
    }

    public void setIdEquipo(int idEquipo) {
        this.idEquipo = idEquipo;
    }

    public int getIdEquipo() {
        return idEquipo;
    }

    public int getIdLaboratorio() {
        return idLaboratorio;
    }

    public void setIdLaboratorio(int idLaboratorio) {
        this.idLaboratorio = idLaboratorio;
    }
}
