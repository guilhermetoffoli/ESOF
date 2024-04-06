package Controller;

import Modelo.Projeto;
import Modelo.User;
import Persistencia.DadosProjeto;

public class ProjetoController {
    //Para criação de projetos e enviar para DadosProjeto a equipe de desenvolvimento.
    
    public void adicionarEquipe(User dev){
        if(DadosProjeto.getEquipeProjeto().size() <= 5){
            DadosProjeto.inserirEquipe(dev);
        }
    }
    
    public void adicionarProjeto(String nomeProjeto, String descricao){
        Projeto novoprojeto = new Projeto(DadosProjeto.gerarID(), nomeProjeto, descricao, DadosProjeto.obterHoraProjeto());
        DadosProjeto.inserirProjeto(novoprojeto);
    }
}
