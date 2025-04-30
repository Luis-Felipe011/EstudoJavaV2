package herançasJava.PalavraSuper;

class Bixo3 {  //classe pai
    public String nome;
    public void fazerSom(){

        System.out.println("Animal faz som");
    }
}

class Cachorro3 extends Bixo3 { //classe filha
    public void fazerSom(){
        super.fazerSom(); // Chama o método da classe pai primeiro
        System.out.println("Cachorro late");
    }
}

public class PalavraSuper {
    public static void main(String[] args) {
        Cachorro3 c = new Cachorro3();
        c.nome="Amora";
        System.out.println(c.nome);
        c.fazerSom();// Chama o método sobrescrito
    }
}