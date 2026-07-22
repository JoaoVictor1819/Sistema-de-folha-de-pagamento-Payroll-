package com.empresa.payroll.model;


import com.empresa.payroll.contratos.Contratavel;
import com.empresa.payroll.enums.TipoContratos;

public class Estagiario extends Funcionario implements Contratavel {
    public static final double AUXILIOTRANSPORTE = 100;
    private double bolsaFixa;

    protected TipoContratos tipoContratos = TipoContratos.ESTAGIARIO;

    public Estagiario(String nome, String dataAdmissao, int documento, double salario, double bolsaFixa) {
        super(nome, dataAdmissao, documento, salario);
        this.bolsaFixa = bolsaFixa;
    }

    @Override
    public double calcularSalario() {
        return bolsaFixa + AUXILIOTRANSPORTE;
    }

    @Override
    public String gerarContrato() {
        return this.nome+
                " contratado(a) como "+tipoContratos.name()+
                ", possui um bolsa fixa de "+this.bolsaFixa+
                " mais auxilio transporte de "+AUXILIOTRANSPORTE+ " Que no total = "+calcularSalario()+"R$";
    }

    @Override
    public String toString() {
        return "Estagiario{" +
                "nome='" + nome + '\'' +
                ", documento=" + documento + '\'' +
                ", tipoContratos=" + tipoContratos +
                ", dataAdmissao='" + dataAdmissao + '\'' +
                ", bolsa fixa="+ bolsaFixa + '\'' +
                ", auxilio transporte="+ AUXILIOTRANSPORTE + '\'' +
                ", total= " + calcularSalario()+"R$"+'}';
    }
}
