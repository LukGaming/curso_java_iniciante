package LacosRepeticoes;

public class ExercicioFor {
    void main(){
        double[] notas = {8.5, 7.0, 6.5, 9.0, 5.5, 10.0};

        double soma = 0;

        double maiorNota = notas[0];
        double menorNota = notas[0];

        int quantidadeNotaMedia = 0;

        for(int i=0; i<notas.length; i++){
            IO.println("Nota " + (i + 1 ) + ": " + notas[i]);
            soma += notas[i];

            if(notas[i] > maiorNota){
                maiorNota = notas[i];
            }

            if(notas[i] < menorNota){
                menorNota = notas[i];
            }

            if(notas[i] >= 7.0){
                quantidadeNotaMedia++;
            }
        }

        double media = soma / notas.length;

        IO.println("Média da turma: " + media);

        IO.println("Maior nota: " + maiorNota);

        IO.println("Menor nota: " + menorNota);

        IO.println("Notas > 7: " + quantidadeNotaMedia);
    }
}
