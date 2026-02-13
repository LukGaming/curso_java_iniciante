package poo;

public class Cliente {
    String nome;
    double saldo;
    String email;

    void mostrarNome(){
        IO.println("Nome do cliente: " + nome);
    }

    void mostrarSaldo(){
        IO.println("Saldo do cliente: " + saldo);
    }

    void mostrarEmail(){
        IO.println("E-mail do cliente: " + email);
    }
}
