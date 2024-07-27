package aluno;

import java.time.LocalDate;

public class Aluno {

    private String nomeAluno;

    private LocalDate dataNascAluno;

    private long matriculaAluno;

    private int idadeAluno;

    public int getIdadeAluno() {
        return idadeAluno;
    }

    public void setIdadeAluno(int idadeAluno) {
        this.idadeAluno = idadeAluno;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public LocalDate getDataNascAluno() {
        return dataNascAluno;
    }

    public void setDataNascAluno(LocalDate dataNascAluno) {
        this.dataNascAluno = dataNascAluno;
    }

    public long getMatriculaAluno() {
        return matriculaAluno;
    }

    public void setMatriculaAluno(long matriculaAluno) {
        this.matriculaAluno = matriculaAluno;
    }

}
