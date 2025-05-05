package Polimorfismo.Exercicios;

abstract class Operacao {
    abstract double calcular(double a, double b);
}

class Soma extends Operacao {
    @Override
    double calcular(double a, double b) {
        return a + b;
    }
}

class Sub extends Operacao {
    @Override
    double calcular(double a, double b) {
        return a - b;
    }
}

class mult extends Operacao {
    @Override
    double calcular(double a, double b) {
        return a * b;
    }
}

class div extends Operacao {
    @Override
    double calcular(double a, double b) {
        if ( b == 0) {
            throw new ArithmeticException("Divisão por zero não é permitida.");
        }
        return a / b;
    }
}


public class Calculadora {
    public static void main(String[] args) {
        Operacao soma = new Soma();
        Operacao sub = new Sub();
        Operacao mult = new mult();
        Operacao div = new div();

        double a = 10;
        double b = 5;

        System.out.println("Soma: " + soma.calcular(a, b));
        System.out.println("Subtração: " + sub.calcular(a, b));
        System.out.println("Multiplicação: " + mult.calcular(a, b));
        System.out.println("Divisão: " + div.calcular(a, b));
    }
}
