package condicionais;

public class SwitchCases {
    void main(){
        int diaSemana = 10;

        switch (diaSemana){
            case 1:
                IO.println("Segunda-feira");
                break;
            case 2:
                IO.println("Terça-feira");
                break;
            case 3:
                IO.println("Quarta-feira");
                break;
            case 4:
                IO.println("Quinta-feira");
                break;
            case 5:
                IO.println("Sexta-feira");
                break;
            case 6:
                IO.println("Sábado");
                break;
            case 7:
                IO.println("Domingo");
                break;
            default:
                IO.println("Dia inválido");
        }


        String tipoAcesso = "_INVALID";

        switch(tipoAcesso){
            case "ADMIN":
                IO.println("Acesso total");
                break;
            case "USER":
                IO.println("Acesso limitado");
            default:
                IO.println("Acesso invalido");
        }
    }
}
