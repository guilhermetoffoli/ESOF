package Controller;

import Modelo.*;
import Persistencia.DadosProjeto;
import View.ProjetoDPView;
import java.util.ArrayList;

public class ProjetoController {
    //Para criação de projetos e enviar para DadosProjeto a equipe de desenvolvimento.
    DadosProjeto dadosProjeto = new DadosProjeto();
    private ProjetoDPView projetoDPView;

    public ProjetoController() {
        this.projetoDPView = new ProjetoDPView(this);
    }
    
    
    
    public Projeto adicionarProjeto(String nomeProjeto, String descricao){
        ArrayList<User> Equipe = new ArrayList<>();
        ArrayList<Historia> historiaLista = new ArrayList<>();
        Projeto novoprojeto = new Projeto(DadosProjeto.gerarID(), nomeProjeto, descricao, DadosProjeto.obterHoraProjeto(), Equipe, historiaLista);
        DadosProjeto.inserirProjeto(novoprojeto);
        
        return novoprojeto;
    }
    
    public Projeto getProjetoNome(String projetoSelecionado){
       ArrayList<Projeto> projetos = DadosProjeto.getProjetos();
        
        // Percorrer a lista de projetos para encontrar o projeto com o nome especificado
        for (Projeto projeto : projetos) {
            if(!projetos.isEmpty()){
                if (projeto.getNome().equals(projetoSelecionado)) {
                    // Se encontrarmos o projeto, retornamos os detalhes
                    return projeto; 
                }
            }else{
                return null;
            }
                
        }
        
        // Se não encontrarmos o projeto, retornamos null ou uma mensagem indicando que o projeto não foi encontrado
        return null;
    }

 }

