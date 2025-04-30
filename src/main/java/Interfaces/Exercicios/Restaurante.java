package Interfaces.Exercicios;

interface PedidoRestaurante {
    void adicionarItem(String nome, double preco);
    double calcularTotal();
}

public class Restaurante implements PedidoRestaurante {
    private double total = 0;
    @Override
    public void adicionarItem(String nome, double preco){
        System.out.println("Item adicionado: " + nome + " Preço: " + preco);
        total += preco;
    }
    @Override
    public double calcularTotal(){
        return total;
    }

    public static void main(String[] args) {
        PedidoRestaurante pedido = new Restaurante();
        pedido.adicionarItem("Pastel", 5.50);
        pedido.adicionarItem("Refrigerante", 3.00);
        System.out.printf("O Valor total é: " + pedido.calcularTotal());
    }
}