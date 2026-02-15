package poo;

public abstract class Notificacao {
    protected String mensagem;

    public Notificacao(String mensagem){
        this.mensagem = mensagem;
    }

    public void exibirMensagem(){
        IO.println("Mensagem: " + mensagem);
    }

    public abstract void enviar();
}
