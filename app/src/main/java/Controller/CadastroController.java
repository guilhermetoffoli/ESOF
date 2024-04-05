package Controller;

import Modelo.User;
import View.Cadastro;
import java.util.ArrayList;

public class CadastroController {
    
    private Cadastro cadastro;
    private ArrayList<User> userList = new ArrayList<User>();
    
    public void realizarCadastro(String nome, String senha, String tipoUsuario){
        if (!nome.isBlank() && !senha.isBlank()) {
            // Cria um novo usuário com o nome de usuário e a senha
            User novoUsuario = new User(nome, senha, tipoUsuario);

            // Adiciona o novo usuário à lista de usuários da TelaInicial
            userList.add(novoUsuario);            
        }  
        
    }
}