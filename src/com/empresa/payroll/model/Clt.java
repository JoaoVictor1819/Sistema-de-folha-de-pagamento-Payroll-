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
    public double calcularSalario() {
        if (metaBatida == true){
            return calcularBonus();
        }
        return 0;
    }

    @Override
    public double calcularBonus() {
       double bonus = salario + salario * 0.10;
       return bonus;
    }

    @Override
    public String gerarContrato() {
        System.out.println("Contratado com clt");
        return "";
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


