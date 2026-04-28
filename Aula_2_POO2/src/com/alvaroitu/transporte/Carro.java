package com.alvaroitu.transporte;

public class Carro {

    private String cor;
    private String tamanho; // Exemplo: pequeno, médio, grande
    private int numeroPortas;
    private int potencia; // Potência em cavalos

    public Carro() {
    }

    // Construtor
    public Carro(String cor, String tamanho, int numeroPortas, int potencia) {
        this.cor = cor;
        this.tamanho = tamanho;
        this.numeroPortas = numeroPortas;
        this.potencia = potencia;
    }

    // Métodos getters e setters para cada atributo
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public int getNumeroPortas() {
        return numeroPortas;
    }

    public void setNumeroPortas(int numeroPortas) {
        this.numeroPortas = numeroPortas;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    // Método para ligar o carro
    public void ligar() {
        System.out.println("Carro ligado.");
    }

    // Método para desligar o carro
    public void desligar() {
        System.out.println("Carro desligado.");
    }

    // Método para acelerar o carro
    public void acelerar() {
        System.out.println("Acelerando o carro.");
    }

    // Método para frear o carro
    public void frear() {
        System.out.println("Freando o carro.");
    }
}

