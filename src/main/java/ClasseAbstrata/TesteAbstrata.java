package ClasseAbstrata;

abstract class Carro {
    abstract void acelerar();
    void frear(){
        System.out.println("O carro esta freando!");
    }
}

class CarroF1 extends Carro {
    @Override
    public void acelerar (){
        System.out.println("O carro de F1 esta acelerando!");
    }
}

class Porshe extends Carro {
    @Override
    public void acelerar (){
        System.out.println("O Porshe esta acelerando!");
    }
}

public class TesteAbstrata {
    public static void main(String[] args) {
        CarroF1 carro = new CarroF1();
        Porshe porshe = new Porshe();

        carro.acelerar();
        carro.frear();
        porshe.acelerar();
        porshe.frear();
    }
}
