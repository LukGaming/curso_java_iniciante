package poo;

public class Sms extends Notificacao{
    Sms(String mensagem){
        super(mensagem);
    }

    @Override
    public void enviar() {
        IO.println("Enviando mensagem por SMS: " + mensagem);
    }
}
