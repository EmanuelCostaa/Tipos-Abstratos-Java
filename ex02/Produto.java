package ex02;
public class Produto {
    int codigo;
    String nome;
    int estoque;
    float preço;

    public Produto(int codigo, String nome, int estoque, float preço){
        this.codigo = codigo;
        this.nome = nome;
        this.estoque = estoque;
        this.preço = preço;
    }

    public int getcodigo() {
        return codigo;
    }
    public void setcodigo(int _codigo){
        this.codigo = _codigo;
    }

    public String getnome() {
        return nome;
    }
    public void setnome(String _nome){
        this.nome = _nome;
    }

    public int getestoque() {
        return estoque;
    }
    public void setestoque(int _estoque){
        this.estoque = _estoque;
    }
    
    public float getpreço() {
        return preço;
    }
    public void setpreço(float _preço){
        this.preço = _preço;
    }
}
