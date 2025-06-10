package ProgramacaoFuncional;

public class CalculadoraTradicional {
    public double soma (double a, double b){
        return a + b;
    }
    public double sub ( double a, double b){
        return a - b;
    }
    public double mult (double a, double b){
        return a * b;
    }
    public double div ( double a, double b){
        if(b == 0) {
            throw new IllegalArgumentException("Divisão por zero não é permitida.");
        }
        return a / b;
    }

    public static void main(String[] args) {
        CalculadoraTradicional calculadora = new CalculadoraTradicional();
        double resultadoSoma = calculadora.soma(5, 3);
        System.out.println("soma: " + resultadoSoma);
        double resultadoSub = calculadora.sub(5, 3);
        System.out.println("Subtração: " + resultadoSub);
        double resultadoMult = calculadora.mult(5, 3);
        System.out.println("Multiplicação: " + resultadoMult);
        double resultadoDiv = calculadora.div(5, 3);
        System.out.println("Divisão: " + resultadoDiv);
    }
}
