package Modelo;

import java.io.Serializable;

public class Sprint implements Serializable{
    private String sprintId;
    private String dataInicio;
    private String dataFim;
    private String objetivo;

    public Sprint(String sprintId, String dataInicio, String dataFim, String objetivo) {
        this.sprintId = sprintId;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.objetivo = objetivo;
    }

    public String getSprintId() {
        return sprintId;
    }

    public void setSprintId(String sprintId) {
        this.sprintId = sprintId;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public String getDataFim() {
        return dataFim;
    }

    public void setDataFim(String dataFim) {
        this.dataFim = dataFim;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

}
