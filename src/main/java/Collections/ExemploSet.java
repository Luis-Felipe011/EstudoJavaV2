package Collections;
import java.util.*;

public class ExemploSet {
    public static void main(String[] args) {
        Set<String> nome = new HashSet<>();
        nome.add("Luis");
        nome.add("Ana");
        nome.add("Carlos");
        System.out.println("Contem 'Luis'? " + nome.contains("Luis"));

        nome.add("Bia");
        nome.add("Beatriz");
        System.out.println("Conjunto completo:" + nome);

        nome.remove("Carlos");
        System.out.println("conjunto de nomes apos a remoção: " + nome);

        boolean foiAdiconado = nome.add("Felipe");
        System.out.println("Foi adicionado Felipe? " + foiAdiconado);
        System.out.println("Conjunto apos a adioção de 'Felipe': " + nome);


        nome.clear();
        System.out.println("Conjunto de nomes após a limpeza: " + nome);
    }

}
