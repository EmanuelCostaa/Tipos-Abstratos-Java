package ex01;
import java.util.*;

public class ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantas pessoas serão cadastradas?");
        int quantidade = sc.nextInt();
        Aluno[] alunos = new Aluno[quantidade];
        Funcionario[] funcionarios = new Funcionario[quantidade];

        for (int i = 0; i < alunos.length; i++) {
            System.out.println("Digite o primeiro nome do aluno");
            String _nome = sc.next();
            System.out.println("Digite o ultimo nome do aluno");
            String _sobrenome = sc.next();
            if (i > 0) {
                while (jatem(_nome, _sobrenome, i, funcionarios)) {
                    System.out.println("Nome inválido!! Digite um nome não cadastrado!");
                    System.out.println("Digite o primeiro nome do aluno");
                    _nome = sc.next();
                    System.out.println("Digite o ultimo nome do aluno");
                    _sobrenome = sc.next();
                }
            }
            
            float _nota;
            do {
                System.out.println("Digite a nota do aluno");
                _nota = sc.nextFloat(); 
                if (_nota < 0 || _nota > 10) {
                    System.out.println("Nota Inválida!!! \nDigite uma nota entre 0 e 10!");
                }
            } while (_nota < 0 || _nota > 10);
            
            System.out.println("Digite o salário");
            double _salario = sc.nextDouble();
            alunos[i] = new Aluno(_nome, _sobrenome, _nota);
            funcionarios[i] = new Funcionario(_nome, _sobrenome, _salario);
        }
        
        Arrays.sort(funcionarios, (a, b) -> String.format(a.getnome() + " " + a.getsobrenome())
                .compareTo(String.format(b.getnome() + " " + b.getsobrenome())));
        Arrays.sort(alunos, (a, b) -> String.format(a.getnome() + " " + a.getsobrenome())
                .compareTo(String.format(b.getnome() + " " + b.getsobrenome())));

        System.out.println("Nomes cadastrados: ");
        for (int i = 1; i <= alunos.length; i++) {
            System.out.println(i + ". " + "Nome: " + funcionarios[i - 1].getnome() + " " + funcionarios[i - 1].getsobrenome());
            System.out.println("Salário: " + funcionarios[i - 1].getsalario() + "R$. ");
            System.err.println("Nota: " + alunos[i - 1].getNota() + " pontos.");
        }
        System.out.println("Nomes dos ganhadores do aumento e seus novos salários: ");
        for (int i = 1; i <= alunos.length; i++) {
            if (aumento(alunos, funcionarios, i - 1)) {
                System.out.println(
                        i + ". " + "Nome: " + funcionarios[i - 1].getnome() + " " + funcionarios[i - 1].getsobrenome());
                System.out.println("Salário: " + funcionarios[i - 1].getsalario() + "R$. ");
            }
        }

        sc.close();
    }

    public static boolean aumento(Aluno alunos[], Funcionario funcionarios[], int cont) {
        if (alunos[cont].getNota() > 7.0) {
            double salario = funcionarios[cont].getsalario() + (funcionarios[cont].getsalario() * 0.1);
            funcionarios[cont].setsalario(salario);
            return true;
        }
        return false;
    }

    public static boolean jatem(String nome, String sobrenome, int cont, Funcionario funcionarios[]) {
        for (int i = 0; i < cont; i++) {
            if (nome.equals(funcionarios[i].getnome()) ) {
                if (sobrenome.equals(funcionarios[i].getsobrenome())) {
                    return true;
                }
            }
        }
        return false;
    }
}
