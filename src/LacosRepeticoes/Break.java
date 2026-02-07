package LacosRepeticoes;

public class Break {
    void main(){
        for(int i=0; i<10; i++){
            if(i == 5){
                break;
            }
            IO.println("Contador: "+ i);
        }

        int contador = 0;

        int pararEm = 200;

        while(true){
            IO.println("Contador While: " + contador );
            contador++;
            if(contador == pararEm){
                break;
            }

        }
    }
}
