import models.*;

public class Main {
    public static void main(String[] args) {
        Escola escola = new Escola("Senai");

        Aluno aluno1 = new Aluno("Victor", 21, "555588877");
        Aluno aluno2 = new Aluno("Sophia", 16, "1122334456");

        Professor professor1 = new Professor("Francisco", "Java", 40);
        Professor professor2 = new Professor("Rogerio", "Python", 42);

        Turma turma1 = new Turma("Turma Java", 2025, professor1);

        Disciplina disciplina1 = new Disciplina("Java", 80, professor2);

        escola.adicionarAluno(aluno1);
        escola.adicionarAluno(aluno2);

        turma1.adicionarAlunoTurma(aluno1);
        turma1.adicionarAlunoTurma(aluno2);

        escola.adicionarProfessor(professor1);
        escola.adicionarProfessor(professor2);

        escola.listarAlunos();
        escola.listarProfessores();
        turma1.listarTurma();

    }
}