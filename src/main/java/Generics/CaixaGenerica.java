package Generics;

public class CaixaGenerica<T> {
    private T coisaNaCaixa;

    public void guardar(T coisaNaCaixa) {
        this.coisaNaCaixa = coisaNaCaixa;
    }

    public T pegar () {
        return coisaNaCaixa;
    }

    public static void main(String[] args) {
        CaixaGenerica<Carrinho> caixaDeCarrinho = new CaixaGenerica<>();
        caixaDeCarrinho.guardar(new Carrinho("Hot Wheels"));

        CaixaGenerica<Boneca> caixaDeBoneca = new CaixaGenerica<>();
        caixaDeBoneca.guardar(new Boneca("Barbie"));

        Carrinho carrinho = caixaDeCarrinho.pegar();
        Boneca boneca = caixaDeBoneca.pegar();
        System.out.println("O carro é: " + carrinho.getModelo());
        System.out.println("A boneca é: " + boneca.getNome());
    }
}
