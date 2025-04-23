package empresa.dados;

public class FolhaDePagamento {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Luis", 10000.00);
        System.out.println(funcionario.obterInfo());
        funcionario.aumentarSalario(10);
        System.out.println(funcionario.obterInfo());


    }
}
