package poo;

public class CriarProduto {
    void main(){
        Produto notebook = new Produto();

        notebook.mostrarNome();
        notebook.mostrarPreco();

        notebook.setNome("Acer intel i5");
        notebook.setPreco(5000);

        notebook.mostrarNome();
        notebook.mostrarPreco();

        IO.println(notebook.getNome());

        IO.println(notebook.getPreco());

    }
}
