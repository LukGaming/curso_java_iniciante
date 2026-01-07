package arrays;

public class ExercicioArrays {
    void main(){
        double[] notas = {7.5, 8.0, 6.5, 9.0, 7.0};

        double soma = 0;
        double media = 0;
        double maior = notas[0];
        double menor = notas[0];

        for(int i=0; i<notas.length; i++){
            IO.println("Nota "+ (i + 1)+ ": "+ notas[i]);

            soma += notas[i];
            if(notas[i] > maior){
                maior = notas[i];
            }

            if(notas[i] < menor){
                menor = notas[i];
            }
        }

        media = soma / notas.length;
        IO.println("Soma: " + soma);
        IO.println("Média: " + media);
        IO.println("Maior: " + maior);
        IO.println("Menor: "+ menor);


    }
}
