package poo;


public class AulaEncapsulamento {
    void main(){
        Conta conta = new Conta(0);

        IO.println("Saldo: " + conta.getSaldo());

         conta.depositar(1000);

        IO.println("Saldo: " + conta.getSaldo());

        conta.sacar(-1000);

        IO.println("Saldo: " + conta.getSaldo());
    }
}
