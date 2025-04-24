package herançasJava;

class Bixo2 {
    public void fazerSom(){
        System.out.println("Animal faz som");
    }
}

class Cachorro2 extends Bixo2 {
    public void fazerSom(){
        System.out.println("Cachorro late");
    }
}

public class Overriding {
    public static void main(String[] args) {
        Cachorro2 c = new Cachorro2();
        c.fazerSom(); // Chama o método sobrescrito
    }
}