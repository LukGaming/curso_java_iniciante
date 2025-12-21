package primitivos;

public class Primitivos04 {
    void main(){
        char letra = 'A';

        IO.println("Letra: "+ letra);

        char numero = '9';

        IO.println("Número: "+ numero);

        char espaco = ' ';

        char genero = 'O';

        if(genero == 'M'){
            IO.println("Genero Masculino");
        }else if(genero == 'F'){
            IO.println("Genero Feminino");
        }else{
            IO.println("Outro");
        }

        /// ------------------ booleans

        boolean ligado = false;

        IO.println("Ligado: "+ ligado);

        boolean desligado = false;

        IO.println("Desligado: "+ desligado);

        int idade = 17;

        boolean maiorIdade = idade >= 18;

        IO.println("Maior de idade: " + maiorIdade);

        boolean primeiroBoolean = false;//V


        boolean segundoBoolean = false; //F

        boolean resultado = primeiroBoolean || segundoBoolean; // V V

        IO.println("Resultado: "+ resultado);


    }
}
