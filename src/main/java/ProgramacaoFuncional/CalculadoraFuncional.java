package ProgramacaoFuncional;

@FunctionalInterface
interface Calculadora {
    double calcular(double a, double b);
}

public class CalculadoraFuncional {
    public static void main(String[] args) {
        Calculadora soma = (a, b) -> a + b;
        System.out.println("Soma: " + soma.calcular(5, 3));
        Calculadora sub = ( a, b) -> a - b;
        System.out.println("Subtração: " + sub.calcular(5, 3));
        Calculadora mult = (a, b) -> a * b;
        System.out.println("Multiplicação: " + mult.calcular(5, 0));
        Calculadora div = (a, b) ->  {
            if (b == 0) {
                throw new IllegalArgumentException("Divisão por zero não é permitida.");
            }
            return a / b;
        };
        System.out.println("Divisão: " + div.calcular(5, 0));

    }
}
