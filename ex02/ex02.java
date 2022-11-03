package ex02;
import java.util.*;

public class ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos produtos serão cadastrados?");
        int quantidade = sc.nextInt();
        Produto produtos[] = new Produto[quantidade];

        for (int i = 0; i < quantidade; i++) {
            System.out.println("Digite o código do produto: ");
            int _codigo = sc.nextInt();
            if (i > 0) {
                while (confere(produtos, _codigo, i)) {
                    System.out.println("Esse produto já existe!!! Digite um novo produto!");
                    System.out.println("Digite o código do produto: ");
                    System.out.println("Digite o nome do produto: ");
                    _codigo = sc.nextInt();
                }
            }
            System.out.println("Digite o nome do produto: ");
            String _nome = sc.next();
            if (_nome.length() > 50) {
                while (_nome.length() > 50) {
                    System.out.println("O nome do produto não pode ter mais de 50 caracteres!!!");
                    _nome = sc.next();
                }
            }
            System.out.println("Digite o estoque do produto: ");
            int _estoque = sc.nextInt();
            System.out.println("Digite o preço do produto: ");
            Float _preço = sc.nextFloat();
            Insere(_codigo, _nome, _estoque, _preço, i, produtos);
        }
        print(produtos);
        sc.close();
    }

    public static Produto[] Insere(int codigo, String nome, int estoque, float preço, int i, Produto[] produtos) {
        produtos[i] = new Produto(codigo, nome, estoque, preço);
        return produtos;
    }

    public static boolean confere(Produto produtos[], int _codigo, int cont) {
        for (int i = 0; i < cont; i++) {
            if (_codigo == produtos[i].getcodigo()) {
                return true;
            }
        }
        return false;
    }

    public static void print(Produto[] produtos) {
        for (int i = 0; i < produtos.length; i++) {
            System.out.println("Código do produto: " + produtos[i].getcodigo());
            System.out.println("Nome do produto: " + produtos[i].getnome());
            System.out.println("Estoque do produto: " + produtos[i].getestoque());
            System.out.println("Preço do produto: " + produtos[i].getpreço() + " R$");
            System.out.println("");
        }
    }
}