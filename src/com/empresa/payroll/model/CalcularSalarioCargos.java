package com.empresa.payroll.model;

import com.empresa.payroll.enums.TipoContrato;

public class CalcularSalarioCargos {

    private TipoContrato tipoContrato;

    public CalcularSalarioCargos(TipoContrato tipoContrato) {
        this.tipoContrato = tipoContrato;
    }

    @Override
    public String toString() {
        return "CalcularSalarioCargos{" +
                "tipoContrato=" + tipoContrato +
                '}';
    }
}
