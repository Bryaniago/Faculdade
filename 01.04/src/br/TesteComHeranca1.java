package br;

public class TesteComHeranca1 {
    public static void main(String[] args) {
        AlunoDeGraduacao aluno = new AlunoDeGraduacao();
        aluno.nome = "José";
        aluno.idade = 19;
        System.out.printf("nome: %s, idade: %d", aluno.nome, aluno.idade);
    }
}
