package condicionais;

public class Condicionais {
    void main(){
        int idade = 17;

        if(idade >= 18){
            IO.println("Maior de idade");
        }else{
            IO.println("Menor de idade");
        }

        double nota = 4.5;

        double notaMinima = 6.0;

        double notaParaRecuperacao = 5.0;

        double notaMaxima = 10;

        if(nota >= 6.0){
            IO.println("Aluno Aprovado");

            if(nota == notaMaxima){
                IO.println("Aluno passou com nota máxima");
            }

        } else if (nota >= 5){
            IO.println("Aluno em recuperação");
        }else{
            IO.println("Aluno reprovado");
        }

        int numero = 21;

        int sobra = numero % 2;

        IO.println("Sobra: " + sobra);

        if(sobra == 0){
            IO.println("O número é par");

        }else{
            IO.println("O número é impar");
        }




    }
}
