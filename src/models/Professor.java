package models;

public class Professor {
    private String nomeProfessor;
    private String disciplinaProfessor;
    private int idadeProfessor;


    public Professor(String nomeProfessor, String disciplinaProfessor, int idadeProfessor) {
        this.nomeProfessor = nomeProfessor;
        this.disciplinaProfessor = disciplinaProfessor;
        this.idadeProfessor = idadeProfessor;
    }

    public String getNomeProfessor() {
        return nomeProfessor;
    }

    public String getDisciplinaProfessor() {
        return disciplinaProfessor;
    }

    public int getIdadeProfessor() {
        return idadeProfessor;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "nomeProfessor='" + nomeProfessor + '\'' +
                ", disciplinaProfessor='" + disciplinaProfessor + '\'' +
                ", idadeProfessor=" + idadeProfessor +
                '}';
    }
}
