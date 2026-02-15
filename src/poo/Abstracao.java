package poo;

public class Abstracao {
    void main(){
        Email notificacao = new Email("Hello world");

        notificacao.exibirMensagem();

        notificacao.enviar();

        Sms sms = new Sms("Olá programadores Java!");

        sms.exibirMensagem();

        sms.enviar();

        PushNotification pushNotification = new PushNotification("Bem-vindo ao curso de Java!");

        pushNotification.exibirMensagem();

        pushNotification.enviar();
    }
}
