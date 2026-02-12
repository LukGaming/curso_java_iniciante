package LacosRepeticoes;

public class ExercicioWhile {
    void main(){
        int[] numeros = {5, 8, 12, 3, 7, 20, 15, 2};

        int contador = 0;
        int numerosPares = 0;
        int numerosImpares = 0;
        int maior = numeros[0];
        int menor = numeros[0];
        int somaPares = 0;
        int somaImpares = 0;


        while(contador < numeros.length){
            IO.println("Numero: " + numeros[contador]);
            if(numeros[contador] % 2 == 0){
                numerosPares++;
                somaPares += numeros[contador];
            }
            else{
                numerosImpares++;
                somaImpares += numeros[contador];
            }

            if(numeros[contador] > maior){
                maior = numeros[contador];
            }

            if(numeros[contador] < menor){
                menor = numeros[contador];
            }


            contador++;
        }

        IO.println("Numeros pares: " + numerosPares);
        IO.println("Numeros impares: " + numerosImpares);
        IO.println("Maior número: " + maior);
        IO.println("Menor número: " + menor);
        IO.println("Soma dos pares: " + somaPares);
        IO.println("Soma impares: " + somaImpares);


    }
}
