package com.alvaroitu;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com valor de a: ");
        double a = scanner.nextDouble();
        System.out.println("Entre com valor de b: ");
        double b = scanner.nextDouble();
        System.out.println("Entre com valor de c: ");
        double c = scanner.nextDouble();

        double delta = b * b - 4.0 * a * c;
        double raizDelta = Math.sqrt(delta);

        if (delta > 0.0) {
            double r1 = (-b + raizDelta) / (2.0 * a);
            double r2 = (-b - raizDelta) / (2.0 * a);
            System.out.println("As raízes são:  " + r1 + " e " + r2);
        } else if (delta == 0.0) {
            double r1 = -b / (2.0 * a);
            System.out.println("As raízes são: " + r1);
        } else {
            System.out.println("Não existe raízes reais.");
        }

        scanner.close();

        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Alvaro");
        System.out.println(pessoa.getNome() + " está " + pessoa.falar());
    }
}
