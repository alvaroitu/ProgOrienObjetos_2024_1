package com.alvaroitu;

import com.alvaroitu.escritorio.Caneta;
import com.alvaroitu.transporte.Carro;

public class Principal {

    public static void main(String[] args) {
        Caneta caneta1 = new Caneta();
        caneta1.escrever();
        caneta1.setCor("preta");
        caneta1.setPonta("fina");
        caneta1.setTipo("esferográfica");
        caneta1.status();

        Caneta caneta2 = new Caneta();
        caneta2.status();

        String resultado = caneta1.escreverCondicional();
        System.out.println(resultado);

        Carro carro = new Carro();
//
        carro.frear();

    }
}
