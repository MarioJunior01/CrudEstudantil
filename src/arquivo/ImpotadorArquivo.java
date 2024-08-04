package arquivo;

import java.io.File;
import java.io.IOException;

public class ImpotadorArquivo {

    public static File nomeDiretorio = new File("src/arquivo");

    public void criarArquivo(File nomeDiretorio) {
        if (nomeDiretorio.mkdir()) {
            System.out.println("Diretório criado");
        } else {
            System.out.println("Diretório não criado");
        }
        try {
            File file = new File(nomeDiretorio, "Alunos.csv");
            if (file.createNewFile()) {
                System.out.println("Arquivo criado");
            } else {
                System.out.println("Arquivo não criado");
            }
        } catch (
                IOException ex) {
            ex.printStackTrace();
        }
    }
}
