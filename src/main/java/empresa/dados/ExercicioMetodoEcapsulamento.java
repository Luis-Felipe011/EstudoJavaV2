package empresa.dados;

public class ExercicioMetodoEcapsulamento {
    private String nome;
    private double preco;
    private int quantidadeEstoque;

    public ExercicioMetodoEcapsulamento(String nome, double preco, int quantidadeEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;

    }
    public void exibirProduto() {
        System.out.println("Nome: " + nome);
        System.out.println("Preço: " + preco);
        System.out.println("Quantidade em Estoque: " +
                quantidadeEstoque);
    }

    public static void main(String[] args) {
        ExercicioMetodoEcapsulamento produto1 = new ExercicioMetodoEcapsulamento("Iphone 15", 8600.00, 10);
        ExercicioMetodoEcapsulamento produto2 = new ExercicioMetodoEcapsulamento("Samsung Galaxy S23", 5000.00, 5);
        produto1.exibirProduto();
        System.out.printf("\n");
        produto2.exibirProduto();
    }
}
