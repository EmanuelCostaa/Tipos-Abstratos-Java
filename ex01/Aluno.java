package ex01;
public class Aluno {
    public String nome;
    public String sobrenome;
    public float nota;

    public Aluno(String nome, String sobrenome, float nota) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.nota = nota;
    }

    public String getsobrenome() {
        return sobrenome;
    }

    public String getnome() {
        return nome;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    public void setnome(String nome) {
        this.nome = nome;
    }

    public void setsobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
}
