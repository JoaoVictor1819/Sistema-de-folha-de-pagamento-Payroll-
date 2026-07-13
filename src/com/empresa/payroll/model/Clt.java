package com.empresa.payroll.model;

import com.empresa.payroll.contratos.Bonificavel;
import com.empresa.payroll.contratos.Contratavel;

public class Clt extends Funcionario implements Bonificavel, Contratavel {

   protected double salario;
   protected boolean metaBatida;


    public Clt(String nome, int documento, double salario, boolean metaBatida) {
        super(nome, documento);
        this.metaBatida = metaBatida;
        this.salario = salario;
    }

    @Override
    public void calcularSalario() {
        System.out.println(salario);
    }

    @Override
    public void calcularBonus() {
        double bonus = salario + salario * 0.10;
        System.out.println("O bonus pela meta batida: "+bonus);

    }

    @Override
    public void gerarContrato() {
        System.out.println("Contratado com clt");
    }

    @Override
    public String toString() {
        return "Clt{" +
                "documento=" + documento +
                ", nome='" + nome + '\'' +
                ", metaBatida=" + metaBatida +
                ", salario=" + salario +
                '}';
    }



}
