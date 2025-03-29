package models;

import java.util.ArrayList;

public class Escola {
    private String nomeEscola;
    private ArrayList<Aluno> alunosEscola;
    private ArrayList<Professor> professoresEscola;

    public Escola(String nomeEscola) {
        this.nomeEscola = nomeEscola;
        this.alunosEscola = new ArrayList<>();
        this.professoresEscola = new ArrayList<>();
    }

    public void adicionarAluno(Aluno aluno) {
        alunosEscola.add(aluno);
    }

    public void adicionarProfessor(Professor professor) {
        professoresEscola.add(professor);
    }

    public void listarAlunos() {
        System.out.println("Lista de Alunos:");
        for (Aluno aluno : alunosEscola) {
            System.out.println(aluno);
        }
    }

    public void listarProfessores() {
        System.out.println("Lista de Professores:");
        for (Professor professor : professoresEscola) {
            System.out.println(professor);
        }
    }
}
