package empresa.dados;

public class TesteStatic {
    public static void exibirValor(int a){
        System.out.println("Valor: " + a);
    }

    public static void exibirValor(String str){
        System.out.println("A palavra é: " + str);

    }

    public static void main(String[] args) {
        exibirValor("oi");
        exibirValor(10);


    }
}
