package arrays;

public class arrays01 {
    void main(){
        int[] x = new int[3];

        x[0] = 10;
        x[1] = 20;
        x[2] = 30;

        IO.println(x[0]);
        IO.println(x[1]);
        IO.println(x[2]);

        int[] y = {30,40,50};

        IO.println(y[0]);
        IO.println(y[1]);
        IO.println(y[2]);

        String[] frutas = {"Maça", "Banana", "Uva"};

        IO.println(frutas[0]);
        IO.println(frutas[1]);
        IO.println(frutas[2]);

        double[] notas = {9.5, 8.7, 6.5};

        IO.println("Nota 01: "+ notas[0]);
        IO.println("Nota 02: "+ notas[1]);
        IO.println("Nota 03: "+ notas[2]);

        double media = (notas[0] + notas[1] + notas[2]) / notas.length;

        IO.println("Média de notas: "+ media);
    }
}
