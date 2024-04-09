package Controller;

import Modelo.Sprint;
import Persistencia.DadosProjeto;
import java.util.Random;

public class SprintController {
    
    public void adicionarSprint(String nomeProjeto, String dataInicio, String dataFim, String objetivo){
        Sprint sprint = new Sprint(gerarId(), dataInicio, dataFim, objetivo);
        DadosProjeto.inserirSprint(nomeProjeto, sprint);
    }
    
    public static String gerarId() {
        String LETRAS_PERMITIDAS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int TAMANHO_ID = 5;
        Random random = new Random();
        
        StringBuilder idBuilder = new StringBuilder();
        for (int i = 0; i < TAMANHO_ID; i++) {
            int index = random.nextInt(LETRAS_PERMITIDAS.length());
            char letra = LETRAS_PERMITIDAS.charAt(index);
            idBuilder.append(letra);
        }
        return idBuilder.toString();
    }
}
