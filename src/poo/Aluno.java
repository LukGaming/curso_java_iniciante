package poo;

public class Aluno {
    private int numeroInscricao;
    private String nome;

    Aluno(String nome, int numeroIncricao){
        this.nome = nome;

        if(numeroIncricao > 0){
            this.numeroInscricao = numeroIncricao;
        }
    }


    void setNome(String nome){
        this.nome = nome;
    }

    void setNumeroInscricao(int numeroInscricao){
        this.numeroInscricao = numeroInscricao;
    }

    String getNome(){
        return this.nome;
    }

    int getNumeroInscricao(){
        return this.numeroInscricao;
    }
}
