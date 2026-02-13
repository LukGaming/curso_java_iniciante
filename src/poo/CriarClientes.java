package poo;


public class CriarClientes {
    void main(){
        Cliente cliente1 = new Cliente();

        cliente1.email = "paulo.mendes@email.com";
        cliente1.saldo = 1000;
        cliente1.nome = "Paulo Mendes";

        cliente1.mostrarEmail();
        cliente1.mostrarSaldo();
        cliente1.mostrarNome();

        Cliente cliente2 = new Cliente();

        cliente2.email = "joao.mendes@email.com";
        cliente2.saldo = 2000;
        cliente2.nome = "João Mendes";

        cliente2.mostrarEmail();
        cliente2.mostrarSaldo();
        cliente2.mostrarNome();
    }
}
