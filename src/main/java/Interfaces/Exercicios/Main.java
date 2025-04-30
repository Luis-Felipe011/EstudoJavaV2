package Interfaces.Exercicios;

interface Veiculo {
    void iniciar ();
    void parar ();

    default void buzinar (){
        System.out.println("Buzina acionada");
    }
}

class Carro implements Veiculo {
    public void iniciar(){
        System.out.println("Carro iniciado");
    }
    public void parar(){
        System.out.println("Carro parado");
    }
}

class Caminhao implements Veiculo {
    public void iniciar(){
        System.out.println("Caminhão iniciado");
    }
    public void parar(){
        System.out.println("Caminhão parado");
    }
}

public class Main {
    public static void main(String[] args) {
        Caminhao caminhao = new Caminhao();
        caminhao.iniciar();
        caminhao.parar();
        caminhao.buzinar();

        Carro carro = new Carro();
        carro.iniciar();
        carro.parar();
        carro.buzinar();
    }
}
