package arrays;


import java.util.Arrays;

public class Matrizes {
    void main(){
        int[][] matrizSimples = new int[2][2];

        matrizSimples[0][0] = 1;
        matrizSimples[0][1] = 2;
        matrizSimples[1][0] = 3;
        matrizSimples[1][1] = 4;

        IO.println(Arrays.deepToString(matrizSimples));

        int[][] matrizEmLinha =  {
                {1,2,3},//primeira
                {4,5,6},//segunda
                {7,8,9},//terceira
                {10,11,12},//quarta
        };

        IO.println(matrizEmLinha[2][2]);

        IO.println(Arrays.deepToString(matrizEmLinha));


        for(int i=0; i<matrizEmLinha.length; i++){
            for(int j=0; j<matrizEmLinha[i].length; j++){
                IO.println("Linha: "+ i + " Coluna: " +j+" Valor: " + matrizEmLinha[i][j]);
            }
        }



    }
}
// 1,2
// 1,2

//[0][0] = 1
//[0][1] = 2

//[1][0] = 3
//[1][1] = 4


