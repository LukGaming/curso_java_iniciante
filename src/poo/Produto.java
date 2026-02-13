package poo;

public class Produto {
    private String nome;
    private double preco;

    void mostrarNome(){
        IO.println("Nome: " + nome);
    }

    void mostrarPreco(){
        IO.println("Preço: " + preco);
    }

    void setNome(String nome){
        this.nome = nome;
    }

    void setPreco(double preco){
        if(preco > 0){
            this.preco = preco;
        }
    }

    String getNome(){
        return this.nome;
    }

    double getPreco(){
        return this.preco;
    }


}
