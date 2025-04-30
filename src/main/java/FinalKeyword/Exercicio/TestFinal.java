package FinalKeyword.Exercicio;

class VariaveisFinal
{
    final int numeroMaximo = 1000;
    final String mensagem="Bem vindo";
}

public class TestFinal {
    public static void main(String[] args) {
        VariaveisFinal imprimirValoresFinais = new VariaveisFinal();
        // imprimirValoresFinais.numeroMaximo = 2000; // isso gera um erro pois estamos querendo alterar o valor da constante
        //imprimirValoresFinais.mensagem = "Oi"; // isso gera um erro pois estamos querendo alterar o valor da constante
        System.out.println("Número máximo: " + imprimirValoresFinais.numeroMaximo);
        System.out.println("Mensagem: " + imprimirValoresFinais.mensagem);
    }
}
