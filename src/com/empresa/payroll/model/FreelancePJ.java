package com.empresa.payroll.model;

import com.empresa.payroll.contratos.Contratavel;
import com.empresa.payroll.enums.TipoContratos;

public class FreelancePJ extends Funcionario implements Contratavel {
    private int horasTrabalhadas;
    private String dataInicioContrato;
    private String datafimContrato;
    private String objetivoDoTrabalho;

    protected TipoContratos tipoContratos = TipoContratos.PJ;

    public FreelancePJ(String nome, String dataAdmissao, int documento, double salario, int horasTrabalhadas, String dataInicioContrato, String objetivoDoTrabalho, String datafimContrato) {
        super(nome, dataAdmissao, documento, salario);
        this.horasTrabalhadas = horasTrabalhadas;
        this.dataInicioContrato = dataInicioContrato;
        this.datafimContrato = datafimContrato;
        this.objetivoDoTrabalho = objetivoDoTrabalho;
    }

    @Override
    public double calcularSalario() {
        return this.salario * horasTrabalhadas;
    }

    @Override
    public String gerarContrato() {
        return this.nome +
                " Contratado(a) como " +tipoContratos.name()+
                ", Com o objetivo de "+ this.objetivoDoTrabalho+
                ", data incial do contrato "+this.dataInicioContrato+
                ", data fim do contrato "+this.datafimContrato+
                ", Remuneracao por horas trabalhadas {"+this.salario+"R$ por horas}"+
                ", Total ao fim do contrato = "+ this.horasTrabalhadas +"hrs Trabalhadas | Total = "+calcularSalario();
    }

    @Override
    public String toString() {
        return "FreelancePJ{" +
                "nome='" + nome + '\'' +
                ", horasTrabalhadas=" + horasTrabalhadas +
                ", dataInicioContrato='" + dataInicioContrato + '\'' +
                ", datafimContrato='" + datafimContrato + '\'' +
                ", objetivoDoTrabalho='" + objetivoDoTrabalho + '\'' +
                ", tipoContratos=" + tipoContratos +
                ", documento=" + documento +
                ", salario=" + salario + "R$}";
    }
}
