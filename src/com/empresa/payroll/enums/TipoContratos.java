package com.empresa.payroll.enums;

import com.empresa.payroll.model.Clt;

public enum TipoContratos {
    GERENTE("GERENTE"),
    CLT("CLT"),
    PJ("PJ"),
    ESTAGIARIO("ESTAGIARIO");

    protected String tipoRegime;

    TipoContratos(String tipoRegime) {
        this.tipoRegime = tipoRegime;
    }
}


