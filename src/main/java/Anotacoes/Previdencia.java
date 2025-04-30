package Anotacoes;

class Informacao {
    @Deprecated
    public void Regras(){
        System.out.println("Regras antigas da previdência");
    }
    public void RegrasNovas(){
        System.out.println("Regras novas da previdência");
    }
}


public class Previdencia {
    public static void main(String[] args) {
        Informacao i = new Informacao();
        //i.Regras(); // Método obsoleto
        i.RegrasNovas(); // Método atualizado
    }
}
