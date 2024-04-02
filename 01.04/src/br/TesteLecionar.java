package br;

public class TesteLecionar {
    public static void main(String[] args) {
        ProfessorHorista professorHorista = new ProfessorHorista();
        ProfessorHorista.nome = "Rodrigo";
        ProfessorPesquisador ProfessorPesquisador = new ProfessorPesquisador();
        ProfessorPesquisador.nome = "José";
        ProfessorHorista.lecionar();
        ProfessorPesquisador.lecionar();
    }
}