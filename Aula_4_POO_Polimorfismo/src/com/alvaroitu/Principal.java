package com.alvaroitu;

import com.alvaroitu.mamifero.Cachorro;
import com.alvaroitu.mamifero.Lobo;
import com.alvaroitu.mamifero.Mamifero;

public class Principal {

    public static void main(String[] args) {
        Animal animal = new Animal();

        animal.locomover();
        animal.alimentar();
        animal.emitirSom();



        Mamifero mamifero = new Mamifero();

        mamifero.locomover();
        mamifero.alimentar();
        mamifero.emitirSom();

        Lobo lobo = new Lobo();

        lobo.emitirSom();

        Cachorro cachorro = new Cachorro();

        cachorro.emitirSom();

        cachorro.reagir(true);

        cachorro.reagir("ola");

        cachorro.reagir(1);
    }
}
