package poo;

public class AulaHeranca {

    void main(){
        Aluno2 pessoa = new Aluno2("Paulo Mendes", 27, 1);
        IO.println("==================");
        IO.println("Aluno");
        IO.println(pessoa.getNome());
        IO.println(pessoa.getIdade());
        IO.println(pessoa.getMatricula());

        Professor professor = new Professor("Marlus", 27, "Mobile");


        IO.println("==================");
        IO.println("Professor");
        IO.println(professor.getIdade());
        IO.println(professor.getNome());
        IO.println(professor.getDisciplina());

    }
}
