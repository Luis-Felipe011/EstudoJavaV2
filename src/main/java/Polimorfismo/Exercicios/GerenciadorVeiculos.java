package Polimorfismo.Exercicios;


abstract class Veiculo {
    private String placa;
    private int ano;

    public Veiculo (String placa, int ano){
        this.placa = placa;
        this.ano = ano;
    }

    public void exibirDados(){
        System.out.println("Placa: " + placa);
        System.out.println("Ano: " + ano);
    }
}

class Onibus extends Veiculo {
    private int assentos;

    public Onibus (String placa, int ano, int assentos){
        super(placa, ano);
        this.assentos = assentos;
    }
    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Assentos: " + assentos);
    }
}


class Caminhao extends Veiculo {
    private int eixos;
    public Caminhao (String placa, int ano, int eixos){
        super(placa, ano);
        this.eixos = eixos;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Eixos: " + eixos);
    }
}
public class GerenciadorVeiculos {
    public static void main(String[] args) {
        Veiculo onibus = new Onibus ("abc123", 2020, 50);
        Veiculo caminhao = new Caminhao ("xyz456", 2018, 4);
        onibus.exibirDados();
        System.out.println();
        caminhao.exibirDados();
    }
}
