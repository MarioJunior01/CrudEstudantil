package curso;

import java.util.Date;

public class Curso {

    private int quantidadeTurmas;
    private int codigoIndetificador;
    private String nomeCurso;
    private int  duracaoCurso;


    public int  getDuracaoCuros() {
        return duracaoCurso;
    }

    public void setDuracaoCuros(int duracaoCuros) {
        this.duracaoCurso = duracaoCuros;
    }

    public int getCodigoIdentificador() {
        return codigoIndetificador;
    }

    public void setCodigoIndetificador(int codigoIdentificador) {
        this.codigoIndetificador = codigoIdentificador;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public int getQuantidadeTurmas() {
        return quantidadeTurmas;
    }

    public void setQuantidadeTurmas(int quantidadeTurmas) {
        this.quantidadeTurmas = quantidadeTurmas;
    }


}
