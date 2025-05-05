package Collections.Exercicios;
import java.util.*;

public class SetExercise {
    public static void main(String[] args) {
        Set<Integer> numeros = new HashSet<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        System.out.println("O numero '1' esta no conjunto? " + numeros.contains(1));

        numeros.remove(1);
        System.out.println("Conjunto apos a remoção de uma elemento " + numeros);

        numeros.add(4);
        numeros.add(5);
        System.out.println("O conjunto completo após adicionar outros numeros é: " + numeros);

    }
    
}
