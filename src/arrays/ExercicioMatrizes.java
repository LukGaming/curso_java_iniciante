package arrays;

public class ExercicioMatrizes {
    void main(){
        int[][] estoque = {
                {50,20},
                {40, 10},
                {60,25},
                {75,55},
                {50,20},
                {40, 10},
                {60,25},
                {75,55},
        };

        int totalProdutosVendidos = 0;

        for(int i=0; i<estoque.length; i++){
                int qtdEstoque = estoque[i][0];
                int qtdVendido = estoque[i][1];
                int restante = estoque[i][0] - estoque[i][1];
            totalProdutosVendidos += qtdVendido;

            IO.println(
                    "Produto: "+ (i + 1)+
                    " | Estoque: "+ qtdEstoque +
                    " | Vendido: "+ qtdVendido+
                    " | Restante: "+ restante
            );
        }

        IO.println("Total de itens vendidos: "+ totalProdutosVendidos);
    }
}
