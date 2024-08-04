package main;

import java.io.File;
import java.util.Scanner;
import java.util.List;
import aluno.GerenciarAluno;
import aluno.Aluno;


public class ProgramaPrincipal {

    private Scanner lerTeclado;
    private final static int CADASTRAR_ESTUDANTE = 1;
    private final static int EDITAR_ESTUDANTE = 2;
    private final static int LISTAR_ESTUDANTTES = 3;
    private final static int REMOVER_ESTUDANTE = 4;
    private final static int CADASTRAR_TURMA = 5;
    private final static int EDITAR_TURMA = 6;
    private final static int LISTAR_TURMA = 7;
    private final static int REMOVER_TURMA = 8;
    private final static int SAIR = 9;
    private GerenciarAluno gerenciarAluno;

    public ProgramaPrincipal() {
        lerTeclado = new Scanner(System.in);
        gerenciarAluno = new GerenciarAluno();


    }

    public static void main(String[] args) {
        new ProgramaPrincipal().executar();


    }

    private void executar() {

        int opcao = 0;

        do {
            mostrarMenu();

            opcao = lerTeclado.nextInt();

            if (opcao == CADASTRAR_ESTUDANTE) {
                System.out.println("Cadastrar usuário");
                cadastrar();
            } else if (opcao == EDITAR_ESTUDANTE) {
                System.out.println("Editar Estudante");
                editarEstudante();
            } else if (opcao == LISTAR_ESTUDANTTES) {
                System.out.println("Listar usuários");
                listarEstudantes();
            } else if (opcao == REMOVER_ESTUDANTE) {
                System.out.println("Remover usuário");
                removerEstudante();
            } else if (opcao == CADASTRAR_TURMA) {
                System.out.println("Cadastrar turma");
                cadastrarTurma();
            } else if (opcao == REMOVER_TURMA) {
                System.out.println("Remover turma");
                removerTurma();
            } else if (opcao == EDITAR_TURMA) {
                System.out.println("Editar turma");
                editarTurma();
            } else if (opcao == LISTAR_TURMA) {
                System.out.println("Listar turma");
                listarTurma();
            }

        } while (opcao != SAIR);
    }


    private void cadastrar() {

    }

    private void editarEstudante() {
        System.out.println("digite a  matricula do estudante ");
        int id = lerTeclado.nextInt();


    }

    private void listarEstudantes() {

    }

    private void removerEstudante() {


    }

    private void cadastrarTurma() {

    }

    private void editarTurma() {


    }

    private void removerTurma() {


    }

    private void listarTurma() {


    }

    private void mostrarMenu() {
        System.out.println("\n------ CrudEstudantil ------\n");
        System.out.println("1 - Cadastrar usuário");
        System.out.println("2 - Editar usuário");
        System.out.println("3 - Listar usuários");
        System.out.println("4 - Remover usuário");
        System.out.println("5 - Cadastrar turma");
        System.out.println("6 - Editar turma");
        System.out.println("7 - Remover turma");
        System.out.println("8 - Listar turma");
        System.out.println("9 - Sair");
    }

}