package com.empresa.payroll.model;

public abstract class Funcionario {
    protected String nome;
    protected int documento;

    public abstract void calcularSalario();


    public Funcionario(String nome, int documento) {
        this.nome = nome;
        this.documento = documento;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
