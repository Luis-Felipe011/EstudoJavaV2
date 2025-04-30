package herançasJava.PalavraSuper;

class Bixo4 {  //classe pai
    String nome;
    Bixo4(String nome){
        this.nome=nome;
    }
}

class Cachorro4 extends Bixo4 { //classe filha
    String raca;
    Cachorro4(String nome, String raca){
        super(nome); // Chama o construtor da classe pai
        this.raca=raca;
    }
}

public class PalavraSuperConstrutor {
    public static void main(String[] args){
        Cachorro4 c = new Cachorro4 ("amora", "poodle");
        System.out.printf("O nome do cachorro é: %s \ne a raça é: %s", c.nome, c.raca);
    }
}