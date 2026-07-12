package com.empresa.payroll.enums;

public enum TipoContrato {
    CLT(1680, 0.10, "Clt", 2000),
    PJ(300, 0, "Pj", 0),
    ESTAGIARIO(830, 0, "Estagiario", 0);


    private double salario;
    private double bonificacao;
    private String cargo;
    private double meta;

    TipoContrato(double salario, double bonificacao, String cargo, double meta) {
        this.salario = salario;
        this.bonificacao = bonificacao;
        this.cargo = cargo;
        this.meta = meta;
    }

    public void TipoContrato(){

    }


}