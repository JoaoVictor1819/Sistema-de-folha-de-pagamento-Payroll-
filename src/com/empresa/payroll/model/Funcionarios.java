package com.empresa.payroll.model;

import com.empresa.payroll.contratos.Bonificavel;

public abstract class Funcionarios extends Gerente {
    protected String nome;
    private int CPF;
    private int CNPJ;
    protected String dataEdimissao;


    public Funcionarios(CalcularSalarioCargos calcularSalarioCargos, String nome, int CPF, int CNPJ, String dataEdimissao) {
        super(calcularSalarioCargos);
        this.nome = nome;
        this.CPF = CPF;
        this.CNPJ = CNPJ;
        this.dataEdimissao = dataEdimissao;
    }

    public Funcionarios(CalcularSalarioCargos calcularSalarioCargos) {
        super(calcularSalarioCargos);

    }
}




