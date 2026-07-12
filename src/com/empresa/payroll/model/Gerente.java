package com.empresa.payroll.model;

import com.empresa.payroll.contratos.Bonificavel;
import com.empresa.payroll.contratos.Contratavel;

public class Gerente implements  Contratavel, Bonificavel {
    private CalcularSalarioCargos calcularSalarioCargos;

    public Gerente(CalcularSalarioCargos calcularSalarioCargos) {
        this.calcularSalarioCargos = calcularSalarioCargos;
    }

    @Override
    public String gerarContrato() {
        return calcularSalarioCargos.toString();
    }

    @Override
    public void calcularBonus() {
        calcularSalarioCargos.toString();
    }
}

