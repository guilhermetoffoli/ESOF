package Modelo;

import java.time.LocalTime;
import java.util.ArrayList;

public class Projeto {
    private String id;
    private String nome;
    private String descricao;
    private LocalTime criadoEm;
    private ArrayList<Historia> historiaLista;
    private ArrayList<User> equipeProjeto;

    public Projeto(String id, String nome, String descricao, LocalTime criadoEm, ArrayList<User> equipeProjeto,ArrayList<Historia> historiaLista) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.criadoEm = criadoEm;
        this.equipeProjeto = new ArrayList<>();
        this.historiaLista = new ArrayList<>();
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

    public LocalTime getCriadoEm() {
        return criadoEm;
    }

    public void setCriadoEm(LocalTime criadoEm) {
        this.criadoEm = criadoEm;
    }
    
    
}
