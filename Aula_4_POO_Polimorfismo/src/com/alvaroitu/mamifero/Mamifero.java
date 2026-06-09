package com.alvaroitu.mamifero;

import com.alvaroitu.Animal;

public class Mamifero extends Animal {

    String corPelo;

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }

    @Override
    public void locomover() {
        // TODO Auto-generated method stub
        System.out.println("Correndo");
    }

    @Override
    public void alimentar() {
        // TODO Auto-generated method stub
        System.out.println("Mamando");
    }

    @Override
    public void emitirSom() {
        // TODO Auto-generated method stub
        System.out.println("Som de mamífero");
    }

}
