package Modelo;

import java.io.Serializable;
import java.util.ArrayList;

public class Projeto implements Serializable{
    private String id;
    private String nome;
    private String descricao;
    private long criadoEm;
    private ArrayList<Historia> historiaLista;
    private ArrayList<Sprint> sprintLista;
    private ArrayList<User> equipeProjeto;

    public Projeto(String id, String nome, String descricao, long criadoEm, ArrayList<User> equipeProjeto, ArrayList<Historia> historiaLista, ArrayList<Sprint> sprintLista) {
        this.id = id; 
        this.nome = nome;
        this.descricao = descricao;
        this.criadoEm = criadoEm;
        this.equipeProjeto = new ArrayList<>();
        this.historiaLista = new ArrayList<>();
        this.sprintLista = new ArrayList<>();
    } 

    public ArrayList<Sprint> getSprintLista() {
        return sprintLista;
    }

    public void setSprintLista(ArrayList<Sprint> sprintLista) {
        this.sprintLista = sprintLista;
    }
    
    public ArrayList<Historia> getHistoriaLista() {
        return historiaLista;
    }

    public void setHistoriaLista(ArrayList<Historia> historiaLista) {
        this.historiaLista = historiaLista;
    }  
    
    public ArrayList<User> getEquipeProjeto() {
        return equipeProjeto;
    }

    public void setEquipeProjeto(ArrayList<User> equipeProjeto) {
        this.equipeProjeto = equipeProjeto;
    }  
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public long getCriadoEm() {
        return criadoEm;
    }

    public void setCriadoEm(long criadoEm) {
        this.criadoEm = criadoEm;
    }

}
