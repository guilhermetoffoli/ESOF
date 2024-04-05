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
    
    public static void cadastrar(User u){
        usersList.add(u);
        boolean r = Persist.gravar(u, "usuarios.dat");
    }
}
