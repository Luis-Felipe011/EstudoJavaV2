package Polimorfismo;

abstract class Animal {
    abstract void fazerSom();

    public void tipoObjeto(){
        System.out.println("Objeto tipo animal");
    }
}

class Cachorro extends Animal{
    public void fazerSom(){
        System.out.println("O chachorro late");
    }
}

class Gato extends Animal {
    public void fazerSom(){
        System.out.println("O gato mia");
    }
}

public class TestePolimorfismo {
    public static void main(String[] args) {
        Animal meuChachorro = new Cachorro();
        Animal meuGato = new Gato();

        meuChachorro.fazerSom();
        meuGato.fazerSom();

        meuChachorro.tipoObjeto();
        meuGato.tipoObjeto();
    }
}
