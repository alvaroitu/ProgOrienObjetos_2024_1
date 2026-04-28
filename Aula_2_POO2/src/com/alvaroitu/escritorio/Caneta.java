package com.alvaroitu.escritorio;

public class Caneta {

    private String cor; // preta, azul, vermelha
    private String ponta; // fina, grossa
    private String tipo; // esferográfica, hidrográfica, gel, tinteiro
    // métodos get e set
    // mostrar status
    // escrever com ponta fina, escrever com ponta grossa
    // escrever com esferográfica, hidrográfica, gel, tinteiro

    public Caneta() {
    }

    public Caneta(String cor, String ponta, String tipo) {
        this.cor = cor;
        this.ponta = ponta;
        this.tipo = tipo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPonta() {
        return ponta;
    }

    public void setPonta(String ponta) {
        this.ponta = ponta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    // escrever com ponta fina, escrever com ponta grossa
    // escrever com esferográfica, hidrográfica, gel, tinteiro
    public void escrever(){
        System.out.println("Caneta escrevendo");
    }

    public void status(){
        System.out.println("Caneta cor: " + this.cor);
        System.out.println("Caneta ponta: " + this.ponta);
        System.out.println("Caneta tipo: " + this.tipo);
    }

    public String escreverCondicional(){
        switch (this.ponta){
            case "fina":
                return "Escrevendo com caneta fina.";
            case "grossa":
                return "Escrevendo com caneta grossa.";
            default:
                return "Ponta setada errado. ";
        }
    }
}
