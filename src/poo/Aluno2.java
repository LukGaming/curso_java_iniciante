package poo;

public class Aluno2 extends Pessoa {

    private int matricula;

    Aluno2(String nome, int idade, int matricula){
        super(nome, idade);
        this.matricula = matricula;
    }

    int getMatricula(){
        return matricula;
    }

    void setMatricula(int matricula){
        this.matricula = matricula;
    }

}
