package com.empresa.payroll.main;

import com.empresa.payroll.enums.TipoContratos;
import com.empresa.payroll.model.Clt;
import com.empresa.payroll.model.FreelancePJ;
import com.empresa.payroll.model.Funcionario;
import com.empresa.payroll.model.Gerente;

public class Main {
    static void main(String[] args) {
        Gerente gerente = new Gerente("Algusto", "21/02/2010", 12312313, 4400);
        System.out.println(gerente.toString());
        System.out.println(gerente.gerarContrato());
        System.out.println("==========================");
        Clt clt = new Clt("Giovana", "10/12/2022", 123143234, 2400);
        System.out.println(clt.toString());
        System.out.println(clt.gerarContrato());
        System.out.println("========================");
        FreelancePJ freelancePJ = new FreelancePJ("Juliana", "21/05/2026", 123123312, 80, 6, "21/05/2026", "Adaptar sistema de empresa a um cliente expecifica", "12/06/2026");
        System.out.println(freelancePJ.toString());
        System.out.println(freelancePJ.gerarContrato());
    }
}
