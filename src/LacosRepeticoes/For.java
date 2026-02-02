package LacosRepeticoes;

public class For {
    void main(){
        for(int i=0; i<=5; i++){
            IO.println(i);
        }

        IO.println("-----------------------------");

        for(int i=1; i<=10; i++){
            IO.println(i);
        }

        IO.println("-----------------------------");

        int[] numeros = {10, 20, 30, 40};

        for(int i=0; i<numeros.length; i++){
            IO.println(numeros[i]);
        }

        IO.println("-----------------------------");

        int soma = 0;

        for(int i=1; i<=1000; i++){
            soma += (i *  i);
        }

        IO.println("Soma: "+ soma);

        for(int i=10; i>=0; i--){
            IO.println(i);
        }

    }
}
