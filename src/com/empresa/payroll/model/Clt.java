package com.empresa.payroll.model;

<<<<<<< HEAD
public class Clt{

=======
public class Clt extends Funcionarios{
    protected String nome;
    protected double salaraioFixo;


    public Clt(String nome, int CPF, String dataEdimissao) {
        super(nome, CPF, dataEdimissao);
    }

    @Override
    public void calcularSalario() {

    }
>>>>>>> e26bb22016fb4c9725039233c54db9273159c15d
}
