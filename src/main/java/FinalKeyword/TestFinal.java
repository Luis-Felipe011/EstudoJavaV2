package FinalKeyword;

class FinalClass {
    final int x = 10;

    final void meuMetodo(){
        System.out.println("Método final");
    }
}

public class TestFinal {
    public static void main(String[] args) {
        FinalClass test = new FinalClass();
        System.out.println("Valor de x: " + test.x);
        test.meuMetodo();
    }
}
