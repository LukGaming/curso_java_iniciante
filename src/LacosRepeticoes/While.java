package LacosRepeticoes;

public class While {
    void main(){
        int contador = 0;

        while (contador < 5){
            IO.println("Contador: "+ contador);
            contador++;
        }

        int senha = 0;

        while(senha != 1234){
            IO.println("Digite a senha: ");
            senha = Integer.parseInt(IO.readln());
        }

        int[] numeros = {10, 20, 30};

        int i = 0;

        while(i<numeros.length){
            IO.println("Número: " + numeros[i]);
            i++;
        }




    }
}
