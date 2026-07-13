package com.empresa.payroll.enums;

public enum TipoContrato {
    CLT(1680, 0.10, "Clt", 2000),
    PJ(300, 0, "Pj", 0),
    ESTAGIARIO(830, 0, "Estagiario", 0);


    private double salario;
    private double bonificacao;
    private String cargo;
    private double meta;

    TipoContrato(double salario, double bonificacao, String cargo, double meta) {
        this.salario = salario;
        this.bonificacao = bonificacao;
        this.cargo = cargo;
        this.meta = meta;
    }

<<<<<<< HEAD
    public void DirecionandoBeneficios(){
        TipoContrato tipoContrato = TipoContrato.CLT;

        switch (tipoContrato){
            case PJ:
                System.out.println(cargo+ " Freelancer/pj não tem direito a beneficio por meta");
                break;
            case CLT:
                System.out.println(cargo+ " Recebe o salario fixo: "+salario+" mais caso tenha meta alcançada: "+meta+ "Recebera um bonificação: "+bonificacao);
            case ESTAGIARIO:
                System.out.println(cargo+ " Recebe bolsa fixa " + salario +" Junto com auxilio transporte 100R$");
                break;
        }
    }

    public double getSalario() {
        return salario;
    }

    public double getBonificacao() {
        return bonificacao;
    }

    public String getCargo() {
        return cargo;
    }

    public double getMeta() {
        return meta;
    }
=======
    public void TipoContrato(){

    }


>>>>>>> e26bb22016fb4c9725039233c54db9273159c15d
}