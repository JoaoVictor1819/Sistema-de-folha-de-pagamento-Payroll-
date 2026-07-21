package com.empresa.payroll.model;

import com.empresa.payroll.contratos.Bonificavel;
import com.empresa.payroll.contratos.Contratavel;
import com.empresa.payroll.enums.TipoContratos;

public class Gerente extends Funcionario implements Bonificavel, Contratavel {
    public static final double BONUSGERENTE = 0.15;
    protected TipoContratos tipoRegime;

    public Gerente(String nome, String dataAdmissao, int documento, double salario, String tipoRegime) {
        super(nome, dataAdmissao, documento, salario);
    }

    @Override
    public double calcularBonus() {
        return this.salario * BONUSGERENTE;
    }

    @Override
    public String gerarContrato() {
        return this.nome+ " Adimitido em " +this.dataAdmissao+ ", Tipo de regime "+tipoRegime+ ", recebe um salario de "+this.salario;
    }
}
