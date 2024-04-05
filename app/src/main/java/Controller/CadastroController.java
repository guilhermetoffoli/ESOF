package Controller;

import Modelo.*;
import Persistencia.DadosUsers;
import View.Cadastro;

public class CadastroController {
    
    private Cadastro cadastro;
    
    public void realizarCadastro(String nome, String senha, String tipoUsuario){       
        // Cria um novo usuário com o nome de usuário e a senha
        User novoUsuario = new User(nome, senha, tipoUsuario);

        // Adiciona o novo usuário à lista de usuários da TelaInicial
        DadosUsers.cadastrar(novoUsuario);
    }
}