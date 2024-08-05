package arquivo;

import java.io.File;
import java.io.IOException;

public class ImpotadorArquivo {


    public void criarArquivo(String nomeArquivo) {
        File arquivo = new File(nomeArquivo);

        try {
            arquivo.createNewFile();
        } catch (IOException ex) {
            System.out.printf("Houve um problema ao criar o arquivo:%n%s%n", ex.getMessage());
            ex.printStackTrace();

        }

    }

    public void salvarInformacoes() {

    }

    public void lerInformacoes() {

    }
    public  void removerInformacoes(){
        
    }
}
