package ex03;
import java.util.*;

public class ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos alunos serão cadastrados?");
        int quantidade = sc.nextInt();
        Aluninho turma[] = new Aluninho[quantidade];

        for (int i = 0; i < quantidade; i++) {
            System.out.println("Digite a matrícula do aluno: ");
            int _matricula = sc.nextInt();
            if (i > 0) {
                while (confere(turma, _matricula, i)) {
                    System.out.println("Esse aluno já foi cadastrado!!! Digite uma nova matrícula!");
                    System.out.println("Digite a matrícula do aluno: ");
                    _matricula = sc.nextInt();
                }
            }
            System.out.println("Digite o nome do aluno: ");
            String _nome = sc.next();
            System.out.println("Digite a turma do aluno (a, b, c): ");
            char _turma = sc.next().charAt(0);
            System.out.println("Digite a nota da prova 1: ");
            float _p1 = sc.nextFloat();
            System.out.println("Digite a nota da prova 2: ");
            float _p2 = sc.nextFloat();
            System.out.println("Digite a nota da prova 3: ");
            float _p3 = sc.nextFloat();
            float _media = media(_p1, _p2, _p3);
            Insere(_nome, _matricula, _turma, _p1, _p2, _p3, i, turma, _media);
        }
        print(turma);
        System.out.println("De qual turma deseja ver a média? \n(a, b, c)");
        char entrada = sc.next().charAt(0);
        mediafinal(turma, entrada);
        sc.close();
    }

    public static float media(float p1, float p2, float p3) {
        float media = (p1+ p2 + p3) / 3;
        return media;

    }

    public static void mediafinal(Aluninho turma[], char entrada){
        float mediafinal, contaluno = 0, mediaprova = 0;
        for(int i = 0; i < turma.length; i++){
            if(entrada == turma[i].getturma()){
                mediaprova += turma[i].getmedia();
                contaluno++;
            }
        }
        mediafinal = mediaprova / contaluno;
        System.out.println("A média final da turma selecionada foi de: " + mediafinal + " pontos.");
    }

    public static void print(Aluninho[] turma) {
        for (int i = 0; i < turma.length; i++) {
            System.out.println("Nome do aluno: " + turma[i].getnome());
            System.out.println("Matrícula: " + turma[i].getmatricula());
            System.out.println("Turma: " + turma[i].getturma());
            System.out
                    .println("Nota  1: " + turma[i].getp1() + "  2: " + turma[i].getp2() + "  3: " + turma[i].getp3());
            System.out.println("");
        }
    }

    public static boolean confere(Aluninho turma[], int _matricula, int cont) {
        for (int i = 0; i < cont; i++) {
            if (_matricula == turma[i].getmatricula()) {
                return true;
            }
        }
        return false;
    }

    public static Aluninho[] Insere(String _nome, int _matricula, char _turma, float _p1, float _p2, float _p3, int i,
            Aluninho turma[], float _media) {
        turma[i] = new Aluninho(_nome, _matricula, _turma, _p1, _p2, _p3, _media);
        return turma;
    }
}
