package EntradaESaida;
import java.nio.file.*;
import java.io.IOException;

public class ExemploNIO {
    public static void main(String[] args) {
        Path path = Paths.get("meuArquivoNIO.txt");

        try {
            // escrevendo no arquivo
            Files.write(path, "olá, mundo!".getBytes());

            // lendo o arquivo
            byte[] bytes = Files.readAllBytes(path);
            String conteudo = new String(bytes);
            System.out.println(conteudo);

        } catch (Exception e) {
            System.out.println("Ocorreu o seguinte erro de NIO: " + e.getMessage());
        }
    }
}
