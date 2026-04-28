package com.alvaroitu.mamifero;

import com.alvaroitu.Animal;

public class Cachorro extends Lobo {

    @Override
    public void emitirSom() {
        // TODO Auto-generated method stub
        System.out.println("Au Au Au");

    }

    public void reagir(String frase) {
        if(frase == "ola") {
            System.out.println("abana o rabo");
        } else if(frase == "menino mau") {
            System.out.println("rosna");
        } else {
            System.out.println("faz nada");
        }
    }

    public void reagir(boolean dono) {
        if(dono) {
            System.out.println("fazer festa");
        } else {
            System.out.println("rosnar muito");
        }
    }

    public void reagir(int num) {
        if(num>=2) {
            System.out.println("aaaaaaaaaaa");
        } else {
            System.out.println("bbbbbbbbbbbb");
        }
    }
}
