package LacosRepeticoes;

public class DoWhile {
    void main(){
        int contador = 0;

        do{
            IO.println("Contador: " + contador);
            contador++;
        }while(contador < -2000);

        int x = 10;

        do {
            IO.println("Do While executou");
            x++;
        } while(x < 0);

        int opcao = 10;

        do {
            if(opcao == 0){
                IO.println("Saindo...");
            } else if(opcao == 1){
                IO.println("Cadastrando...");
            } else if(opcao == 2){
                IO.println("Listando...");
            } else {
                IO.println("Opção invalida!");
            }

            IO.println("1- Cadastrar");
            IO.println("2- Listar");
            IO.println("0- Sair");


           opcao = Integer.parseInt(IO.readln());
        }
        while(opcao !=0);
    }
}
