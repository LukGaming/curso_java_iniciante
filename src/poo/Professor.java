package poo;

public class Professor extends Pessoa {

    private String disciplina;

     Professor(String nome, int idade, String disciplina){
         super(nome, idade);
         this.disciplina = disciplina;
     }

     String getDisciplina(){
         return disciplina;
     }

     void setDisciplina(String disciplina){
         this.disciplina = disciplina;
     }

}
