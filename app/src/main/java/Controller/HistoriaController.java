package Controller;

import Modelo.Historia;
import Persistencia.DadosProjeto;
import java.util.Random;

public class HistoriaController {
    
    public void adicionarHistoria(String nomeProjeto, String titulo, String descricao, Integer prioridade){
        Historia newHistoria = new Historia(gerarId(), titulo, descricao, prioridade, "Em progresso");
        DadosProjeto.inserirHistoria(nomeProjeto, newHistoria);
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
