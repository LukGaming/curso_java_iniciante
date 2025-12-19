package primitivos;

public class Primitivos02 {
    void main(){
        int idade = 17;
        IO.println("Idade: "+ idade);

        if(idade >= idade){
            IO.println("Maior de idade");
        }else{
            IO.println("Menor de idade");
        }

        int contador = 0;

        IO.println("Contador: " + contador);

        contador++;

        IO.println("Contador: " + contador);

        contador++;

        IO.println("Contador: " + contador);

        int compra01 = 1500;

        int compra02 = 1600;

        IO.println("Primeira compra: "+ compra01);

        IO.println("Segunda compra: "+ compra02);

        int totalCompras = compra01 + compra02;

        IO.println("Total de compras: " + totalCompras);


        int pontos = 0;

        IO.println("Pontos: "+ pontos);

        pontos += 10;

        IO.println("Pontos: "+ pontos);

        pontos += 20;

        IO.println("Pontos: "+ pontos);


        int estoque = 1000;

        IO.println("Estoque inicial: " + estoque);

        int vendidos = 652;

        IO.println("Vendidos: " + vendidos);

        int restante = estoque - vendidos;

        IO.println("Estoque atual: " + restante);

        int numero = 2147483647; //Dois bilhões, centro e quarenta e sete milhões,
                                 // quatrocentos e oitenta e três mil e quatrocentros e quarenta e sete

        long populacao =  8000000000L; //Oito bilhões

        IO.println("População estimada mundialmente: "+ populacao);

        long acessos = 15000000000L;

        IO.println("Acessos: "+ acessos );

        long numero1 = 15;

        long numero2 = 30;

        long soma = numero1 + numero2;

        IO.println("Soma: "+ soma);


    }


}
