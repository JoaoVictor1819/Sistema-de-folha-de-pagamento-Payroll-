package com.empresa.payroll.model;

import com.empresa.payroll.contratos.Bonificavel;
import com.empresa.payroll.contratos.Contratavel;

public abstract class Funcionario  {
    protected String nome;
    protected String dataAdmissao;
    protected int documento;
    protected double salario;

    public Funcionario(String nome, String dataAdmissao,int documento, double salario) {
        this.nome = nome;
        this.dataAdmissao = dataAdmissao;
        this.documento = documento;
        this.salario = salario;
    }


}
