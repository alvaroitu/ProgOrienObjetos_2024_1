package com.alvaroitu.revisao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        System.out.println("hello world!!!");


        int a = 10;
        double b = 10.5;
        String nome = "Álvaro";
        int idade = 35;
        int[] arrayIniciado = {12,32,54,6,8,89,64,74,6};
        int[] meuArray = new int[5];
        meuArray [0] = 100;
        meuArray [1] = 85;
        meuArray [2] = 88;
        meuArray [3] = 93;
        meuArray [4] = 123;
        List<Integer> list1 = Arrays.asList(1, 5, 6 , 8);
        List<Integer> list2 = new ArrayList<>();
        list2.add(10);
        list2.add(2);

        System.out.println(a);
        System.out.println(b);
        System.out.println(nome);
        System.out.println(idade);
        System.out.println(Arrays.toString(arrayIniciado));
        System.out.println(arrayIniciado.length);
        System.out.println(meuArray[0]);
        System.out.println(list1);
        System.out.println(list1.get(0));
        System.out.println(list2);
        System.out.println(list2.size());



        if ( a >= 10 ){
            System.out.println("valor maior ou igual a 10");
        } else{
            System.out.println("valor menor que 10");
        }

        System.out.println(nome + " tem " + idade + " anos.");

        System.out.println(Arrays.toString(arrayIniciado));

        for (int i = 0; i < 10 ; i++){
            System.out.print(i + " ");
        }
        System.out.println();
        for(int i=0; i< arrayIniciado.length; i++){
            System.out.print(arrayIniciado[i] + " ");
        }
        System.out.println();
        for (int x : arrayIniciado) {
            System.out.print(x + " ");
        }
        System.out.print("\n");


        for(int i=1; i<=3; i++){
            for(int j=1; j<=3; j++) {
                System.out.print(i + "," + j + " ");
            }
            System.out.println();
        }

        for(int i=1; i<=3; i++){
            for(int j=1; j<=3; j++) {
                if ( i == j){
                    System.out.print(i + "," + j + " ");
                } else {
                    System.out.print(i + "," + j + " ");
                }
            }
            System.out.println();
        }


        a = 1;
        while(a<5){
            System.out.println("valor de a: " + a);
            a++;
        }

        int dia = 3; // Suponha que 1 representa segunda-feira, 2 terça-feira, ..., 7 domingo
        switch (dia) {
            case 1:
                System.out.println("Segunda-feira");
                break;
            case 2:
                System.out.println("Terça-feira");
                break;
            case 3:
                System.out.println("Quarta-feira");
                break;
            case 4:
                System.out.println("Quinta-feira");
                break;
            case 5:
                System.out.println("Sexta-feira");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Dia inválido");
                break;
        }

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("digite ");
//        Double digitado = scanner.nextDouble();
//        System.out.println("valor " + digitado);
//
//        double nota1, nota2, nota3, nota4, media, soma, freq;
//        System.out.println("Digite nota 1:");
//        nota1 = scanner.nextDouble();
//        System.out.println("Digite nota 2:");
//        nota2 = scanner.nextDouble();
//        System.out.println("Digite nota 3:");
//        nota3 = scanner.nextDouble();
//        System.out.println("Digite nota 4:");
//        nota4 = scanner.nextDouble();
//        System.out.println("Digite frequencia:");
//        freq = scanner.nextDouble();
//        soma = nota1 + nota2 + nota3 + nota4;
//        System.out.println(soma);
//        media = soma / 4;
//        if(media >= 6 && freq >= 75){
//            System.out.println("aluno aprovado");
//        } else{
//            System.out.println("aluno reprovado");
//        }
//        scanner.close();

        int add = 1;
        System.out.println(add);
        add++; // add = add + 1
        System.out.println(add);
        add--; // add = add - 1
        System.out.println(add);

        double conta = 5 * (4 / 2);
        System.out.println(conta);

        int numero1 = 10, numero2 = 20;
        System.out.println(numero1 == numero2);
        System.out.println(numero1 != numero2);

        if (numero1 == numero2){
            System.out.println("sao iguais");
        } else {
            System.out.println("são diferentes");
        }

        boolean valor = true;

        if(!valor){
            System.out.println(1);
        }else{
            System.out.println(2);
        }

        int numero3 = 30;

        if(numero1 < numero2 || numero1 > numero3){
            System.out.println("expressão verdadeira");
        } else {
            System.out.println("expressão falsa");
        }

    }
}
