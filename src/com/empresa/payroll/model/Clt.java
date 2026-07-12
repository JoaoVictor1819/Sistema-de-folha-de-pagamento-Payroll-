package com.empresa.payroll.model;

public class Clt extends Funcionarios{
    protected String nome;
    protected double salaraioFixo;


    public Clt(String nome, int CPF, String dataEdimissao) {
        super(nome, CPF, dataEdimissao);
    }

    @Override
    public void calcularSalario() {

    }
}
