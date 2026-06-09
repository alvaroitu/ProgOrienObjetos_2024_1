package com.alvaroitu;

public class Animal implements Acoes {
    double peso;
    String membros;

    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public String getMembros() {
        return membros;
    }
    public void setMembros(String membros) {
        this.membros = membros;
    }

    @Override
    public void locomover() { System.out.println("locomover"); }
    @Override
    public void alimentar() {
        System.out.println("alimentar");
    }
    @Override
    public void emitirSom() {
        System.out.println("emitir som");
    }
}
