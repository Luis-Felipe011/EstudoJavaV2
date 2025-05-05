package Generics;

public class Caixa <T>{
    private T coisaNaCaixa;

    public void guardarCoisaNaCaixa(T coisa){
        this.coisaNaCaixa = coisa;
    }
    public T pegar (){
        return this.coisaNaCaixa;
    }

    public static void main(String[] args) {
        Caixa<String> caixaDeString = new Caixa<>();
        caixaDeString.guardarCoisaNaCaixa("Uma coisa");
        String texto = caixaDeString.pegar();
        System.out.println(texto);

        // com int
        Caixa<Integer> caixaDeInteiro = new Caixa<>();
        caixaDeInteiro.guardarCoisaNaCaixa(1);
        Integer numero = caixaDeInteiro.pegar();
        System.out.println(numero);
    }
}
