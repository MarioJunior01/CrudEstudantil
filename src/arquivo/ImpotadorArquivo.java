package arquivo;

import java.io.File;
import java.io.IOException;

public class ImpotadorArquivo {


    private static File caminhoDiretorio = new File("src/arquivo/");


    public void criarArquivo(File caminhoDiretorio) {


        try {
            File arquivo = new File(caminhoDiretorio,"aluno.csv");
            arquivo.createNewFile();
        }
        catch (IOException ex) {
            System.out.printf("Houve um problema ao criar o arquivo:%n%s%n", ex.getMessage());
            ex.printStackTrace();

        }

    }

    public void salvarInformacoes(){

    }
  


}