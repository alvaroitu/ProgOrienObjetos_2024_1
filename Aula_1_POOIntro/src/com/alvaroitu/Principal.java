package com.alvaroitu;

import com.alvaroitu.combustivel.Combustivel;
import com.alvaroitu.empresa.Funcionario;
import com.alvaroitu.escritorio.Caneta;
import com.alvaroitu.pessoa.Pessoa;
import com.alvaroitu.temperaturas.ConversaoTemperaturas;
import com.alvaroitu.transporte.Carro;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
/*
        Pessoa p1 = new Pessoa("Alvaro", "José", 35);

        Pessoa p2 = new Pessoa();
        p2.setNome("José");
        p2.setSobreNome("pereira");
        p2.setIdade(25);

        System.out.println("Nome: " + p1.getNome()
                + " Sobrenome: " + p1.getSobreNome()
                + " Idade: " + p1.getIdade());

        System.out.println("Nome: " + p2.getNome()
                + " Sobrenome: " + p2.getSobreNome()
                + " Idade: " + p2.getIdade());

        p2.setNome("Augusto");
        p2.setSobreNome("Pereira");
        p2.setIdade(40);

        System.out.println("Nome: " + p2.getNome()
                + " Sobrenome: " + p2.getSobreNome()
                + " Idade: " + p2.getIdade());

        Pessoa pessoa1 = new Pessoa();

        System.out.println("COMECA AQUI");
        System.out.println(pessoa1.getNome());
        pessoa1.setNome("pedro");
        System.out.println(pessoa1.getNome());

        Pessoa pessoa2 = new Pessoa("marco", "antonio", 50);
        System.out.println(pessoa2.getNome());

        System.out.println(pessoa1.falar());
        pessoa1.falar2();
        System.out.println(pessoa1.falar3("Vai curinthians!!!"));

        System.out.println("Soma: " + pessoa1.soma(2,5));








        ConversaoTemperaturas cT = new ConversaoTemperaturas();

        double temperaturaCelsius300 = cT.convertoCelsius(300);
        double temperaturaFarheint = cT.convertoFahrenheit(148.88);

        double temperaturaCelsius400 = cT.convertoCelsius(400);

        System.out.println(cT.convertoCelsius(300));
        System.out.println(temperaturaFarheint);




        Double valorEmFareheint = cT.convertoFahrenheit(200);

        System.out.println("200 graus em Celsius tem o Valor em Fahrenheit de: " + valorEmFareheint);

*/
//        Scanner scanner = new Scanner(System.in);
//
//        ConversaoTemperaturas conversaoTemperaturas = new ConversaoTemperaturas();
//        System.out.println("digite a temperatura");
//        double tempDigitada = scanner.nextDouble();
//        double valorEmCelsius = conversaoTemperaturas.convertoCelsius(tempDigitada);
//
//        System.out.println("graus em Fahrenheit tem " +
//                "o Valor em Celsius de: " + valorEmCelsius);













//        Combustivel combustivel = new Combustivel();
//
//        double autonomia = 10;
//        double distancia = 200;
//
//        double consumoTotal = combustivel.consumoCombustivel(distancia, autonomia);
//
//        System.out.println("Se meu carro tem autonomina de : " + autonomia +
//        "\nkm por litro. Em uma viagem de " + distancia +
//        " km. Eu vou precisar  de " + consumoTotal + " litros de combustível.");






//        Scanner scanner = new Scanner(System.in);

//        System.out.println("Entre com a temperatura em Fahrenheit: ");
//        double tempFahrenheitRecebida = scanner.nextDouble();
//        double tempCelsiusCalculada = conversaoTemperaturas.convertoCelsius(tempFahrenheitRecebida);
//        System.out.println("A temperatura em Fahrenheit: " + tempFahrenheitRecebida + " graus, equivale a " + tempCelsiusCalculada + " graus Celsius." );
//
//        System.out.println();
//
//        System.out.println("Entre com a temperatura em Celsius: ");
//        double tempCelsiusRecebida = scanner.nextDouble();
//        double tempFahrenheitCalculada = conversaoTemperaturas.convertoFahrenheit(tempCelsiusRecebida);
//        System.out.println("A temperatura em Celsius: " + tempCelsiusRecebida + " graus, equivale a " + tempFahrenheitCalculada + " graus Fahrenheit." );

//        System.out.println();
//
//        Combustivel combustivel = new Combustivel();
//
//        System.out.println("Qual a autonomia do seu veiculo? ");
//        double autonomia = scanner.nextDouble();
//        System.out.println("Qual a distancia que vai percorrer na viagem? ");
//        double distanciaPercorrida = scanner.nextDouble();
//        double consumoCombustivel = combustivel.consumoCombustivel(distanciaPercorrida, autonomia);
//        System.out.println("Se meu carro tem autonomina de : " + autonomia +
//                " km por litro. Em uma viagem de " + distanciaPercorrida +
//                " km percorridos. Eu vou precisar  de " + consumoCombustivel + " litros de combustível.");

//        System.out.println();
//
//        CorridaTaxi corridaTaxi1 = new CorridaTaxi();
//        CorridaTaxi corridaTaxi2 = new CorridaTaxi(4.5, 7.5, 2.8);

        //NÃO PRECISA FAZER - DAQUI
//        System.out.println("1 " + corridaTaxi1.getValorBandeirada1());
//
//        corridaTaxi1.setValorBandeirada1(3);
//        corridaTaxi1.setValorPorKm(2.8);
//
//        System.out.println("2 " + corridaTaxi1.getValorBandeirada1());
//
//        System.out.println("3 " + corridaTaxi2.getValorBandeirada1());
        // ATÉ AQUI

//        System.out.println("Digite a distancia percorrida pelo taxi: ");
//        double kmRodado = scanner.nextDouble();
//        double valorCorrida1 = corridaTaxi1.corridaBandeira1(kmRodado);
//        double valorCorrida2 = corridaTaxi2.corridaBandeira1(kmRodado);
//
//        System.out.println("Valor da corrida 1 : " + valorCorrida1);
//        System.out.println("Valor da corrida 2 : " + valorCorrida2);

//        Funcionario funcionario = new Funcionario("analista",
//                "ti");
//        double salario = 5000;
//        System.out.println(funcionario.getCargo() + " "
//        + funcionario.getDepartamento());
//        System.out.println(funcionario.ocupado());
//        System.out.println("o desconto é: "
//                + funcionario.calculaDesconto(salario));

//        Caneta c1 = new Caneta();
//        Caneta c2 = new Caneta("vermelha", "fina", "gel");
//
//        c1.status();
//        c2.status();
//        c1.setCor("azul");
//        c1.setPonta("grossa");
//        c1.setTipo("esferografica");
//        c1.status();
//        Caneta c3 = new Caneta();
//        c3.setPonta("ddd");
//        System.out.println(c1.escreverCondicional());
//        System.out.println(c2.escreverCondicional());
//        System.out.println(c3.escreverCondicional());

        Carro carro1 = new Carro();
        Carro carro2 = new Carro("preto","BMW",5,330.8F);
        carro1.ligar();
        carro1.desligar();
        carro1.acelerar();
        carro1.frear();



    }
}
