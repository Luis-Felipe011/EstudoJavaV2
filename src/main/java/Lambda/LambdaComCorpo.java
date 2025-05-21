package Lambda;
import java.util.*;
import java.util.Arrays;

public class LambdaComCorpo {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> numerosPar = new ArrayList<>();
        numeros.forEach(numero -> {
            if (numero % 2 == 0){
                numerosPar.add(numero);
            }
        });
        System.out.println("Numeros par: " + numerosPar);
    }
}
