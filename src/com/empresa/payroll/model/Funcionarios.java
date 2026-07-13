package com.empresa.payroll.model;

<<<<<<< HEAD
import com.empresa.payroll.contratos.Bonificavel;

public abstract class Funcionarios extends Gerente {
=======
public abstract class Funcionarios {
>>>>>>> e26bb22016fb4c9725039233c54db9273159c15d
    protected String nome;
    private int CPF;
    private int CNPJ;
    protected String dataEdimissao;

<<<<<<< HEAD

    public Funcionarios(CalcularSalarioCargos calcularSalarioCargos, String nome, int CPF, int CNPJ, String dataEdimissao) {
        super(calcularSalarioCargos);
        this.nome = nome;
        this.CPF = CPF;
        this.CNPJ = CNPJ;
        this.dataEdimissao = dataEdimissao;
    }

    public Funcionarios(CalcularSalarioCargos calcularSalarioCargos) {
        super(calcularSalarioCargos);

    }
}




=======
    public Funcionarios(String nome, int CPF, String dataEdimissao) {
        this.nome = nome;
        this.CPF = CPF;
        this.dataEdimissao = dataEdimissao;
    }

    public Funcionarios(int cpf, int CNPJ) {
        this.CNPJ = CNPJ;
    }

    public abstract void calcularSalario();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCPF() {
        return CPF;
    }

    public int getCNPJ() {
        return CNPJ;
    }

    public String getDataEdimissao() {
        return dataEdimissao;
    }

    public void setDataEdimissao(String dataEdimissao) {
        this.dataEdimissao = dataEdimissao;
    }
}

>>>>>>> e26bb22016fb4c9725039233c54db9273159c15d
