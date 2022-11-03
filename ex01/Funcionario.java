package ex01;
public class Funcionario {
    public String nome;
    public String sobrenome;
    public double salario;

    public Funcionario(String nome, String sobrenome, double salario) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salario = salario;
    }


    public String getnome() {
        return nome;
    }

    public double getsalario() {
        return salario;
    }

    public String getsobrenome() {
        return sobrenome;
    }

    public void setnome(String nome) {
        this.nome = nome;
    }

    public void setsalario(double salario) {
        this.salario = salario;
    }

    public void setsobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
}
