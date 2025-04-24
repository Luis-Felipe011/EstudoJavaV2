package Arrays.exercicios;

public class ExecicioArrayNotas {
    public static void main(String[] args) {
        int tamanho = 5;
        int [] meuArray = new int[tamanho];
        meuArray[0] = 10;
        meuArray[1] = 8;
        meuArray[2] = 7;
        meuArray[3] = 9;
        meuArray[4] = 6;

        for (int i=0; i<meuArray.length; i++){
            System.out.printf("%d, ", meuArray[i]);
        };
    }
}



