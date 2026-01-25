package condicionais;

public class ExercicioSwitchCases {
    void main(){
        char conceito = 'S';

        switch(conceito){
            case 'A':
                IO.println("Excelente");
                break;
            case 'B':
                IO.println("Bom");
                break;
            case 'C':
                IO.println("Regular");
                break;
            case 'D':
                IO.println("Ruim");
                break;
            case 'F':
                IO.println("Reprovado");
                break;
            default:
                IO.println("Conceito inválido");
        }
    }
}
