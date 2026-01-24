package condicionais;

public class ExercicioCondicionais01 {
    void main(){
        String usuario = "admin";
        String senha = "1234";
        int nivelAcesso = 20;

        if(usuario.equals("admin") && senha.equals("1234")){
            IO.println("Login realizado com sucesso!");
            if(nivelAcesso == 1){
                IO.println("Nível de acesso: Básico");
            }
            else if(nivelAcesso == 2){
                IO.println("Nível de acesso: Intermediário");
            }
            else if(nivelAcesso == 3){
                IO.println("Nível de acesso: Acesso total");
            }else{
                IO.println("Nível de acesso inválido");
            }
        }else{
            IO.println("Usuário ou senha invalidos");
        }
    }
}
