package turma;

import java.time.LocalDate;

public class Turma {

    private String cursoTurma;

    private int codigoTurma;

    private int capacidadeMaxima;

    public int getCapacidadeMaxima() {
        return capacidadeMaxima;
    }

    public void setCapacidadeMaxima(int capacidadeMaxima) {
        this.capacidadeMaxima = capacidadeMaxima;
    }

    public void setCursoTurma(String cursoTurma) {
        this.cursoTurma = cursoTurma;
    }

    public String getCursoTurma() {
        return cursoTurma;

    }

    public int getCodigoTurma() {
        return codigoTurma;
    }

    public void setCodigoTurma(int codigoTurma) {
        this.codigoTurma = codigoTurma;
    }


}