package Persistencia;

import Modelo.Projeto;
import Modelo.User;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Random;

public class DadosProjeto {
    private static ArrayList<User> equipeProjeto;
    private static ArrayList<Projeto> projetos;

    static{
        projetos = (ArrayList<Projeto>)Persist.recuperar("Projetos.dat");
        if(projetos == null)
            projetos = new ArrayList<Projeto>();
    }
    
    public static ArrayList<Projeto> getProjetos() {
        return projetos;
    }
    
    //Metodos de adicionar na equipe 

    public static ArrayList<User> getEquipeProjeto() {
        return equipeProjeto;
    }
    
    public static void inserirEquipe(User dev){
        equipeProjeto.add(dev);
        boolean r = Persist.gravar(dev, "equipeProjeto.dat");
    }  
    
    public static void inserirProjeto(Projeto projeto){
        projetos.add(projeto);
        boolean r = Persist.gravar(projeto, "Projetos.dat");
    }
    
    public static String gerarID() {
        String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int ID_LENGTH = 6;
        
        Random random = new Random();
        StringBuilder sb = new StringBuilder();

        // Gerando letras aleatórias
        for (int i = 0; i < ID_LENGTH; i++) {
            int index = random.nextInt(ALPHABET.length());
            char randomChar = ALPHABET.charAt(index);
            sb.append(randomChar);
        }

        return sb.toString();
    }
    
    public static LocalDateTime obterHoraProjeto() {
        // Obtendo a hora atual
        LocalDateTime horaAtual = LocalDateTime.now();

        // Formatando a hora no formato desejado (HH:mm:ss)

        return horaAtual;
    }
    
}
