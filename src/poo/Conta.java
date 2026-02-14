package poo;

public class Conta {
    private double saldo;

    Conta(double saldo){
        if(saldo < 0){
            IO.println("Saldo inicializado de forma errada");
            return;
        }
        this.saldo = saldo;
    }

    double getSaldo(){
        return saldo;
    }

    void depositar(double valor){
        if(valor <= 0){

            IO.println("Depósito inválido");
            return;
        }
        this.saldo = valor;
    }

    void sacar(double valor){
        if(valor <= 0){
            IO.println("Valor a sacar inválido");
        } else if(valor > this.saldo){
                IO.println("Saldo insuficiente");
        }else{
            this.saldo -= valor;
        }

    }
}
