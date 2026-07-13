package com.empresa.payroll.main;

import com.empresa.payroll.model.Clt;

public class Main {
    static void main(String[] args) {
        Clt clt = new Clt("Bruno", 12312312, 2123, true);
        System.out.println(clt);
        clt.calcularBonus();
        clt.gerarContrato();
        clt.calcularSalario();
    }
}
