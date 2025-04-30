package FinalKeyword.Exercicio;

class Calculadora {
    final int soma(int a, int b) {
        return a + b;
    }
}
public class SomaFinal extends Calculadora {
//    @Override // gera um erro pois estamos sobreecrevendo o metodo somar.
//        int soma( int a, int b){
//            return a + b;
//        }

    public static void main(String[] args) {
        Calculadora somaNumeros = new Calculadora();
        System.out.println("Resultado: " + somaNumeros.soma(5, 10));
    }
}


