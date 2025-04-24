package Arrays.exercicios;

public class ExercicioArrayPares {
    public static void main(String[] args) {
        int tamannho = 6;
        int [] pares = new int [tamannho];
        pares [0] = 1;
        pares [1] = 2;
        pares [2] = 3;
        pares [3] = 4;
        pares [4] = 5;
        pares [5] = 6;

        for (int i = 0; i< pares.length; i++){
            if (pares[i] % 2 == 0){
                System.out.printf("%d, ", pares[i]);
            }
        }
    }



}
