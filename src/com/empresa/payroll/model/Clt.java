package com.empresa.payroll.model;

import com.empresa.payroll.contratos.Bonificavel;
import com.empresa.payroll.contratos.Contratavel;
import com.empresa.payroll.enums.TipoContratos;

public class Clt extends Funcionario implements Bonificavel, Contratavel{
    public static final double BONUSCLT = 0.10;

    protected TipoContratos tipoContratos = TipoContratos.CLT;

    public Clt(String nome, String dataAdmissao, int documento, double salario) {
        super(nome, dataAdmissao, documento, salario);
    }

    @Override
    public double calcularSalario() {
        return calcularBonus() + this.salario;
    }

    @Override
    public double calcularBonus() {
        return this.salario * BONUSCLT;
    }

    @Override
    public String gerarContrato() {
        return this.nome+ " Adimitido em " +this.dataAdmissao+ ", Tipo de regime "+tipoContratos.name()+ ", recebe um salario de "+this.salario+", Bonus clt caso bata a meta "+ calcularBonus()+", Total a ganhar "+calcularSalario();
    }

    @Override
    public String toString() {
        return "Clt{" +
                "tipoContratos=" + tipoContratos +
                ", nome='" + nome + '\'' +
                ", dataAdmissao='" + dataAdmissao + '\'' +
                ", documento=" + documento +
                ", salario=" + salario +
                '}';
    }
}


