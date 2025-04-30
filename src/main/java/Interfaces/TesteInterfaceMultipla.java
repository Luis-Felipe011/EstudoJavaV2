package Interfaces;

interface Interface1 {
    void metodo1();
}

interface  Interface2{
    void metodo2();
}

interface Interface3 extends Interface1, Interface2{

    void metodo3();
}

class ClasseImplementa implements Interface3 {
// ou podemos fazer a implementação de todas as interfaces
// class ClasseImplementa implements Interface1, Interface2, Interface3{
    @Override
    public void metodo1(){
        System.out.println("metodo 1");
    }
    public void metodo2(){
        System.out.println("metodo 2");
    }
    public void metodo3(){
        System.out.println("metodo 3");
    }
}

public class TesteInterfaceMultipla {
    public static void main(String[] args) {
        ClasseImplementa obj = new ClasseImplementa();
        obj.metodo1();
        obj.metodo2();
        obj.metodo3();
    }
}
