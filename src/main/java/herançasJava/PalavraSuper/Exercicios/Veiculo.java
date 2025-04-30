package herançasJava.PalavraSuper.Exercicios;

class Velocidade {
    void acelerar() {
        System.out.println("Veículo acelerando");
    }
}

class Carro extends Velocidade {
    @Override
    void acelerar(){
        System.out.println("Carro acelerando");
        super.acelerar();
    }
}

public class Veiculo {
    public static void main(String[] args) {
        Carro c = new Carro();
        c.acelerar();
    }
}
