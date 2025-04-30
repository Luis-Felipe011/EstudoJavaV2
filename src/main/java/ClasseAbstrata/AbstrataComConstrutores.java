package ClasseAbstrata;

abstract class Carro2 {
    int codigo;
    Carro2 (int cod){
    this.codigo = cod;
    }
    abstract void Acelerar();
    void Frear(){
        System.out.println("O carro esta freando!");
    }
}

class CarroF2 extends Carro2{
    CarroF2(int cod){
        super(cod);
    }
    @Override
    public void Acelerar() {
        System.out.println("O carro de F1 esta acelerando!");
    }
}

public class AbstrataComConstrutores {
    public static void main(String[] args) {
        CarroF2 carro = new CarroF2(100);
        System.out.println(carro.codigo);
    }
}

