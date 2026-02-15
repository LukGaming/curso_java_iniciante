package poo;

public class Polimorfismo {
    void main(){
        Pagamento pagamento = new Pagamento();

        pagamento.realizarPagamento();

        Pagamento pagamentoCartao = new PagamentoCartao();

        pagamentoCartao.realizarPagamento();

        Pagamento pagamentoPix = new PagamentoPix();

        pagamentoPix.realizarPagamento();


        Pagamento pagamentoBoleto = new PagamentoBoleto();

        pagamentoBoleto.realizarPagamento();
    }
}
