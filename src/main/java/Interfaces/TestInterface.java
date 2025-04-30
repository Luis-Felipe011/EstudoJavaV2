package Interfaces;

interface SerVivo { // interface
    void respirar(); // método abstrato
}

interface Animal extends SerVivo {  // interface herda de outra interface
    void fazerSom(); // método abstrato
}

class Cachorro implements Animal {
    public void respirar(){}
    public void fazerSom() {
        System.out.println("Cachorro late");
    }
}

class Gato implements Animal {
    public void respirar() {}
    public void fazerSom(){
        System.out.println("Gato mia");
    }
}

public class TestInterface {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        cachorro.fazerSom(); // deve imprimir "Cachorro late"

        Gato gato = new Gato ();
        gato.fazerSom(); // deve imprimir "Gato mia"
    }
}
