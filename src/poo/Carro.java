package poo;

public class Carro {
    String marca;
    String modelo;

    void acelerar(){
        IO.println("Acelerando!");
    }

    void freiar(){
        IO.println("Freando");
    }

    void mostrarModelo(){
        IO.println("Modelo: " + modelo);
    }

    void mostrarMarca(){
        IO.print("Marca: "+ marca);
    }
}
