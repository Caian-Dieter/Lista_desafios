package br.com.caian.funcionarios.impl;

import br.com.caian.impl.CalcularSalario;

public class Estagiario extends Funcionarios implements CalcularSalario {



    public Estagiario(String nomeFuncionario, float salario) {
        super(nomeFuncionario, salario);
    }

    @Override
    public float calcularSalario(float salario, int multiplicador) {
        return salario * multiplicador;
    }
}
