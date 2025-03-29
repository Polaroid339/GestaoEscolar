package models;

import java.util.ArrayList;

public class Turma {
    private String nomeTurma;
    private int anoLetivo;
    private Professor professorTurma;
    private ArrayList<Aluno> alunosTurma;


    public Turma(String nomeTurma, int anoLetivo, Professor professorTurma) {
        this.nomeTurma = nomeTurma;
        this.anoLetivo = anoLetivo;
        this.professorTurma = professorTurma;
        this.alunosTurma = new ArrayList<>();
    }

    public void adicionarAlunoTurma(Aluno aluno) {alunosTurma.add(aluno);}

    public void listarTurma() {
        System.out.println("Lista de Alunos na Turma:");
        for (Aluno alunos : alunosTurma) {
            System.out.println(alunos);
        }
    }
}
