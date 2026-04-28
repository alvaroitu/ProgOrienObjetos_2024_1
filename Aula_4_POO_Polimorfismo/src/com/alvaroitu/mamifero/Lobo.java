package com.alvaroitu.mamifero;

public class Lobo extends Mamifero{

    String garras;

    public String getGarras() {
        return garras;
    }

    public void setGarras(String garras) {
        this.garras = garras;
    }

    @Override
    public void emitirSom() {
        // TODO Auto-generated method stub
        System.out.println("Auuuuuu");

    }
}
