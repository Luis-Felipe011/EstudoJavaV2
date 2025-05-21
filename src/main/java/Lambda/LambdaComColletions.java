package Lambda;
import java.util.*;
import java.util.Arrays;
public class LambdaComColletions {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        numeros.forEach((Integer elemento) -> System.out.println(elemento));
    }
}
