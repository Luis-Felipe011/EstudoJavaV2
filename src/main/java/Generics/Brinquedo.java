package Generics;

class Carrinho {
    private final String modelo;

    public Carrinho (String modelo){
        this.modelo = modelo;
    }
    public String getModelo (){
        return modelo;
    }
}

class Boneca {
    private String nome;

    public Boneca (String nome) {
        this.nome = nome;
    }
    public String getNome (){
        return nome;
    }
}

public class Brinquedo {
    public static void main(String[] args) {
        Carrinho c = new Carrinho("Hot wheels");
        Boneca b = new Boneca("Barbie");

        System.out.println("O carro é: " + c.getModelo());
        System.out.println("A boneca é: " + b.getNome());
    }
}
