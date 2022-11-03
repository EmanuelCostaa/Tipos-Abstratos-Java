package ex03;

public class Aluninho {
    String nome;
    int matricula;
    char turma;
    float p1;
    float p2;
    float p3;
    float media;

    public Aluninho(String nome, int matricula, char turma, float p1, float p2, float p3, float media){
        this.nome = nome;
        this.matricula = matricula;
        this.turma = turma;
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.media = media;
    }

    public String getnome(){
        return nome;
    }

    public int getmatricula(){
        return matricula;
    }

    public char getturma(){
        return turma;
    }

    public float getp1(){
        return p1;
    }

    public float getp2(){
        return p2;
    }

    public float getp3(){
        return p3;
    }

    public float getmedia(){
        return media;
    }
    
    public void setnome(String _nome){
        this.nome = _nome;
    }

    public void setmatricula(int _matricula){
        this.matricula = _matricula;
    }

    public void setturma(char _turma){
        this.turma = _turma;
    }

    public void setp1(float _p1){
        this.p1 = _p1;
    }

    public void setp2(float _p2){
        this.p2 = _p2;
    }

    public void setp3(float _p3){
        this.p3 = _p3;
    }

}
