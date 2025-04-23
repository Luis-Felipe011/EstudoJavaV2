package Arrays;

public class Arrays {
    public static void main(String[] args) {
        int [] meuArray;
        meuArray = new int[3];
        meuArray[0] = 1;
        meuArray[1] = 2;
        meuArray[2] = 3;

        meuArray = new int[]{1,2,3};
        System.out.println(meuArray[0]);
        System.out.println(meuArray[1]);
        System.out.println(meuArray[2]);

        // alterando uma valor dentro do array
        meuArray[0] = 10;
        System.out.println("Valor do primeiro elemento alterado para: " + meuArray[0]);

        //percorrendo array
        for(int i=0; i<meuArray.length; i++){ //length é o tamanho maximo do array
            System.out.println(meuArray[i]);

        }
    }
}
