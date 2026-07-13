package com.empresa.payroll.model;

<<<<<<< HEAD
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

=======
public class Gerente extends Funcionarios{
    public Gerente(int cpf, int cnpj) {
        super(cpf, cnpj);
    }

    @Override
    public void calcularSalario() {

    }
}
>>>>>>> e26bb22016fb4c9725039233c54db9273159c15d
