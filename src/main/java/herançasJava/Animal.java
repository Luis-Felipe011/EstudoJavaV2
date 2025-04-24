package herançasJava;

class Bixo {
    void comer(){
        System.out.println("Animal come");
    }
}

class Cachorro extends Bixo {
    void latir(){
        System.out.println("Cachorro late");
    }
}

public class Animal{
    public static void main(String[] args) {
        Cachorro c = new Cachorro();
        c.comer(); // Chama o método da classe pai
        c.latir(); // Chama o método da classe filho
    }
}
