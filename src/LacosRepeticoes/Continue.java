package LacosRepeticoes;

public class Continue {
    void main(){
        for(int i=0; i<10; i++){
            if(i == 2 || i == 5){
                continue;
            }
            IO.println(i);
        }

        for(int i=1; i<=100; i++){
            if(i % 2 != 0){
                continue;
            }
            IO.println("Numero par: " + i);
        }

        int[] numeros = {5, -2, 8, -1 ,10, -20, 30};

        for(int i=0; i<numeros.length; i++){
            if(numeros[i] < 0){
                continue;
            }
            IO.println("Numero maior que zero: " + numeros[i]);
        }

    }
}
