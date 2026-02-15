package poo;

public class Email extends Notificacao {
    public Email(String mensagem){
        super(mensagem);
    }

    @Override
    public void enviar() {
        IO.println("Enviando notificação por E-mail: " + mensagem);
    }
}
