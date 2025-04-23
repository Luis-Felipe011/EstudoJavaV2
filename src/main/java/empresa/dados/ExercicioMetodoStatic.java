package empresa.dados;

class Contagem {
    static int numeroTotal = 0;

    public static void Adicionando() {
        numeroTotal++;
    }

    public static void total() {
        System.out.println("Total de objetos criados: " + numeroTotal);
    }

}
public class ExercicioMetodoStatic {
    public static void main(String[] args) {
        Contagem sala1 = new Contagem();
        Contagem sala2 = new Contagem();
        Contagem sala3 = new Contagem();

        Contagem.Adicionando();
        Contagem.Adicionando();
        Contagem.Adicionando();

        Contagem.total();

    }
}

