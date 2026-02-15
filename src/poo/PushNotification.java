package poo;

public class PushNotification extends Notificacao{
    PushNotification(String mensagem){
        super(mensagem);
    }

    @Override
    public void enviar() {
        IO.println("Enviando notificação Push: " + mensagem);
    }
}
