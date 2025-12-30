package variaveis;

public class Strings {
    void main(){
        String nome = "Paulo";

        IO.println("Nome: "+ nome);

        String vazia = "";

        String espacoEmbraco = " ";

        String caracteresEspeciais = "@#$%¨&*()!";

        String frase = "Bem-vindo ao curso de Java Iniciante!";

        IO.println("Inicia com bem? "+ frase.startsWith("Bem"));

        IO.println("Finaliza com iniciante?: " + frase.endsWith("Iniciante!"));

        IO.println(frase);

        String nomeCompleto = "PAULO ANTÔNIO FERREIRA MENDES MACÊDO";

        IO.println("Número de caracteres: "+nomeCompleto.length());

        nomeCompleto = nomeCompleto.replace("A", "");

        IO.println("Número de caracteres: "+nomeCompleto.length());

        IO.println(nomeCompleto);

        String email = "pauloemail.com";

        if(email.contains("@")){
            IO.println("É um E-mail válido");
        }
        else{
            IO.println("Não é um E-mail válido!");
        }

    }
}
