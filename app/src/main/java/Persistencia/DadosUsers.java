package Persistencia;

import Modelo.*;
import java.util.ArrayList;

public class DadosUsers {
    private static ArrayList<User> usersList;
    
    static{
        usersList = (ArrayList<User>)Persist.recuperar("usuarios.dat");
        if(usersList == null)
            usersList = new ArrayList<User>();
    }

    public static ArrayList<User> getUsersList() {
        return usersList;
    }
    
    public static void cadastrar(User u){
        usersList.add(u);
        boolean r = Persist.gravar(u, "usuarios.dat");
    }
    
    public static boolean validacaoUsuario(User user) {
    for (User u : DadosUsers.usersList) {
        if (u.getNome().equals(user.getNome()) && u.getSenha().equals(user.getSenha()) && u.getTipoUsuario().equals(user.getTipoUsuario())) {
            return true;
        }
    }
    return false;
}
}
