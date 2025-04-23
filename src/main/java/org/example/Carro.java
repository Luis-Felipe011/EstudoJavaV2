package org.example;

class Carro {
    private String marca;
    private String modelo;
    private int ano;

    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public Carro (String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
    }

    public Carro(){
        this.marca = "Honda";
        this.modelo = "Civic";
        this.ano = 2025;
    }

    public void exibir() {
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ano: " + this.ano);
    }

    public static void main(String[] args) {
        // exibi o terceiro construtor
        Carro carro1 = new Carro();
        carro1.exibir();
        //exibi o primeiro contrutor
        Carro carro2 = new Carro("Toyota", "Corolla", 2023);
        carro2.exibir();
        //exibi o segundo construtor
        Carro carro3 = new Carro("Ford", "Mustang");
        carro3.exibir();
    }
}
