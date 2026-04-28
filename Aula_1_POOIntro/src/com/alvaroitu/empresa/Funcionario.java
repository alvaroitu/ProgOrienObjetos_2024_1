package com.alvaroitu.empresa;

public class Funcionario {
    /* CRIE ATRIBUTOS
    CARGO TIPO TEXTO, DEPARTAMENTO TIPO TEXTO*/

    private String cargo;
    private String departamento;

    /*
    CRIE OS METODOS GET E SET E
    CRIE OS CONSTRUTORES VAZIO E COM ATRIBUTOS*/

    public Funcionario() {
    }

    public Funcionario(String cargo, String departamento) {
        this.cargo = cargo;
        this.departamento = departamento;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    /*
    CRIE METODO OCUPADO QUE RETORNA TEXTO "EM REUNIÃO"
    CRIE METODO QUE CALCULA O DESCONTO DE 10% DO SALÁRIO
         QUE A PESSOA DEFINIR (DIGITAR OU PARAMETRO)
         E QUE MOSTRA O VALOR DO DESCONTO*/

    public String ocupado(){
        return "Em reunião.";
    }

    public double calculaDesconto(double salario){
        return salario * 0.10;
    }

    /*
    CRIE OBJETOS DESSA CLASSE NA PRINCIPAL E USE OS METODOS
     */
}
