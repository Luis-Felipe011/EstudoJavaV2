package EntradaESaida;
import java.io.*;

public class ExemploIO {
    public static void main(String[] args) {
        try {
            // escrevendo no arquivo
            FileWriter writer = new FileWriter("meuArquivo.txt");
            writer.write("Olá, mundo!\n");
            writer.close();

            // lendo do arquivo
            FileReader reader = new FileReader("meuArquivo.txt");
            int data = reader.read();

            while (data != -1) {
                System.out.print((char) data);
                data = reader.read();
            }
            reader.close();

        } catch (Exception e) {
            System.out.println("Ocorreu um erro: " + e.getMessage());
        }
    }
}
