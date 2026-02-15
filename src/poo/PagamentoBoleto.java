package poo;

public class PagamentoBoleto extends Pagamento{
    @Override
    public void realizarPagamento() {
        IO.println("Pagamento com Boleto!");
    }
}
