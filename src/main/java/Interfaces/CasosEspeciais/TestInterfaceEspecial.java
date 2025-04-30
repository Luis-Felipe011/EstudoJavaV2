package Interfaces.CasosEspeciais;

interface CasosEspeciais {
    void metodoAbstrato();

    default void metodoDefault() {
        System.out.println("Método default");
    }

    static void metodoStatic(){
        System.out.println("Método estático");
    }
}

class TesteInterfacesEspecial implements CasosEspeciais {
    @Override
    public void metodoAbstrato() {
        System.out.println("Método abstrato implementado");
    }

    public static void main(String[] args) {
        TesteInterfacesEspecial teste = new TesteInterfacesEspecial();
        teste.metodoAbstrato();
        teste.metodoDefault();
        CasosEspeciais.metodoStatic();
    }
}


