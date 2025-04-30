package Anotacoes.Exercicios;

class SuperClasse{
   void imprime(){
        System.out.println("Imprime");
    }
}

class Minhaclasse extends SuperClasse{
    @Override
    void imprime(){
        System.out.println("Imprime SubClasse");
    }
}


public class Over {
    public static void main(String[] args) {
        Minhaclasse m = new  Minhaclasse();
        m.imprime(); // Chama o método sobrescrito
    }
}
