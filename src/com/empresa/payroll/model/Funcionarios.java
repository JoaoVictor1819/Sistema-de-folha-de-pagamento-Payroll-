package com.empresa.payroll.model;

public abstract class Funcionarios {
    protected String nome;
    private int CPF;
    private int CNPJ;
    protected String dataEdimissao;

    public Funcionarios(String nome, int CPF, String dataEdimissao) {
        this.nome = nome;
        this.CPF = CPF;
        this.dataEdimissao = dataEdimissao;
    }

    public Funcionarios(int cpf, int CNPJ) {
        this.CNPJ = CNPJ;
    }

    public abstract void calcularSalario();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCPF() {
        return CPF;
    }

    public int getCNPJ() {
        return CNPJ;
    }

    public String getDataEdimissao() {
        return dataEdimissao;
    }

    public void setDataEdimissao(String dataEdimissao) {
        this.dataEdimissao = dataEdimissao;
    }
}

