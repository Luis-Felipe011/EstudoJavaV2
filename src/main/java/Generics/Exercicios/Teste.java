package Generics.Exercicios;

class Peixe {
    private String nome;
    private int tamanho;
    public Peixe (String nome, int tamanho){
        this.nome =nome;
        this.tamanho = tamanho;
    }
    public String getNome(){
        return nome;
    }
    public int getTamanho(){
        return tamanho;
    }
}

class Polvo {
    private String nome;
    private int tentaculos;
    public Polvo(String nome, int tentaculos){
        this.nome = nome;
        this.tentaculos = tentaculos;
    }
    public String getNome(){
        return nome;
    }
    public int getTentaculos(){
        return tentaculos;
    }
}

class Cesto <T> {
    private T conteudo;
    public void guardar(T conteudo){
        this.conteudo = conteudo;
    }
    public T pegar(){
        return conteudo;
    }
}

public class Teste {
    public static void main(String[] args) {
        Cesto<Peixe> cestoDePeixe = new Cesto<>();
        cestoDePeixe.guardar(new Peixe("Salmão", 30));
        Peixe peixe = cestoDePeixe.pegar();
        System.out.println("O peixe é: " + peixe.getNome() + " e o tamanho é: " + peixe.getTamanho());

        Cesto<Polvo> cestoDePolvo = new Cesto<>();
        cestoDePolvo.guardar(new Polvo("Octopus", 8));
        Polvo polvo = cestoDePolvo.pegar();
        System.out.println("O polvo é: " + polvo.getNome() + " e o número de tentáculos é: " + polvo.getTentaculos());
    }
}