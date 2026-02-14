package poo;

public class CriarAluno {
    void main(){
        Aluno aluno1 = new Aluno("Paulo Mendes", 5);

        IO.println("Nome: " + aluno1.getNome());
        IO.println("Número inscrição: " + aluno1.getNumeroInscricao());

        aluno1.setNome("Paulo Antonio Mendes");
        aluno1.setNumeroInscricao(20);

        IO.println("Nome: " + aluno1.getNome());
        IO.println("Número inscrição: " + aluno1.getNumeroInscricao());


        Aluno aluno2 = new Aluno("João Mendes", 6);

        IO.println("Nome: " + aluno2.getNome());
        IO.println("Número inscrição: " + aluno2.getNumeroInscricao());

        aluno2.setNome("João Antonio Mendes");
        aluno2.setNumeroInscricao(20);

        IO.println("Nome: " + aluno2.getNome());
        IO.println("Número inscrição: " + aluno2.getNumeroInscricao());

    }
}
