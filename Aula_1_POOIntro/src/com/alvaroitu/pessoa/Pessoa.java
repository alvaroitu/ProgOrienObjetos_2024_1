package com.alvaroitu.pessoa;

public class Pessoa {

    private String nome;
    private String sobreNome;
    private int idade;

    public Pessoa() {
    }

    public Pessoa(String nome, String sobreNome, int idade) {
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String falar(){

        return "Pessoa falando";
    }

    public void falar2(){

        System.out.println("Pessoa falando2");
    }
//CRIE UM METODO QUE SOMA DOIS NUMEROS
    public String falar3(String texto){
        return "Pessoa falando: " + texto;
    }

    public int soma(int num1, int num2){
        return num1 + num2;
    }
}
