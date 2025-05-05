package Polimorfismo;
interface Veiculo {
    void acelerar();
}

class Carro implements Veiculo {
    @Override
    public void acelerar (){
System.out.println("O carro está acelerando!");  }
}

class Moto implements Veiculo {
    @Override
    public void acelerar (){
        System.out.println("A moto está acelerando!");
    }
}

public class PolimorfismoInterface {
    public static void main(String[] args) {
        Veiculo meuCarro = new Carro();
        Veiculo minhaMoto = new Moto();

        minhaMoto.acelerar();
        meuCarro.acelerar();
;
    }
}
