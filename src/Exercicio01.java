public class Exercicio01 {
    void main(){
        String nomeMissao = "Voyager-X";
        byte tripulacao = 3;
        long distancia = 150000000000L;
        boolean statusMissao = true;
        float nivelOxigenio = 98.5F;

        IO.println("--- DADOS DA MISSÃO ---");

        IO.println("Nome: "+ nomeMissao);
        IO.println("Tripulação: "+ tripulacao);
        IO.println("Distância: "+ distancia + " km");
        IO.println("Status Ativo: " + statusMissao);
        IO.println("Nível Oxigênio: "+ nivelOxigenio + "%");
    }


}
