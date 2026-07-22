package com.empresa.payroll.model;

import com.empresa.payroll.contratos.Bonificavel;
import com.empresa.payroll.contratos.Contratavel;
import com.empresa.payroll.enums.TipoContratos;

public class Gerente extends Funcionario implements Bonificavel, Contratavel {
    public static final double BONUSGERENTE = 0.15;
    protected TipoContratos tipoContratos = TipoContratos.GERENTE;

    public Gerente(String nome, String dataAdmissao, int documento, double salario) {
        super(nome, dataAdmissao, documento, salario);
    }

    @Override
    public double calcularSalario() {
        return calcularBonus() + this.salario; // Retorna a soma entre o bonus e salario do => GERENTE
    }

    @Override
    public double calcularBonus() {
        return this.salario * BONUSGERENTE; // Calcula o Bonus do => GEREMTE
    }

    @Override
    public String gerarContrato() {
        // Exibe de maneira mais organizada os dados da classe
        return this.nome+ " Adimitido em " +this.dataAdmissao+ ", Tipo de regime "+tipoContratos.name()+ ", recebe um salario de "+this.salario+", Bonus gerente "+calcularBonus()+ ", Total a ganhar "+calcularSalario();
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "tipoContratos=" + tipoContratos +
                ", nome='" + nome + '\'' +
                ", dataAdmissao='" + dataAdmissao + '\'' +
                ", documento=" + documento +
                ", salario=" + salario +
                '}';
    }


}
