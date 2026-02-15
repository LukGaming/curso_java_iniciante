package poo;

public class PagamentoPix extends Pagamento{
    @Override
    public void realizarPagamento() {
        IO.println("Pagando com Pix!");
    }
}
