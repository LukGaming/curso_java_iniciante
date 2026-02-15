package poo;

public class PagamentoCartao  extends Pagamento{
    @Override
    public void realizarPagamento(){
        IO.println("Pagamento com cartão de crédito!");
    }
}
