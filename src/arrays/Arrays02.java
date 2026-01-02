package arrays;

public class Arrays02 {
    void main(){
        int[] numeros = new int[100];

        for(int i=0; i<numeros.length; i++){
            numeros[i] = i + 1;
            IO.println("Índice: " +i+ " valor: "+ numeros[i]);
        }
    }
}
