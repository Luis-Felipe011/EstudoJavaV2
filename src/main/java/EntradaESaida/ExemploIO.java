package EntradaESaida;
import java.io.*;

public class ExemploIO {
    public static void main(String[] args) {
        try {
            //arquivo criado na pasta raiz do projeto
            //FileWriter writer = new FileWriter("meuArquivo2.txt");
            // criando um arquivo em um diretório específico
            FileWriter writer = new FileWriter("C:\\Users\\luis.felipe\\Documents\\EstudoJavaV2\\EstudoJavaV2\\testeArquivo\\meuArquivoDiretorio.txt");
            writer.write("Olá, mundo!\n");
            writer.close();

            // Lendo o arquivo criado na raiz
           // FileReader reader = new FileReader("meuArquivo2.txt");
            //lendo o arquivo em um diretório específico
            FileReader reader = new FileReader("C:\\Users\\luis.felipe\\Documents\\EstudoJavaV2\\EstudoJavaV2\\testeArquivo\\meuArquivoDiretorio.txt");
            int data = reader.read();
            while (data != -1) {
                System.out.print((char) data); // traduzinho o byte lido para char
                //System.out.println((data)); // sem traduzir o byte lido, mostrando o valor numérico
                data = reader.read();
            }
            reader.close();
        }catch (Exception e){
            System.out.println("Ocorreu o seguinte erro: " + e.getMessage());
        }
    }
}
