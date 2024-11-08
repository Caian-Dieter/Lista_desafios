package br.com.caian.funcionarios.impl;

import br.com.caian.impl.CalcularSalario;

public class Diretor extends Funcionarios implements CalcularSalario {



    public Diretor(String nomeFuncionario, float salario) {
        super(nomeFuncionario, salario);
    }

    @Override
    public float calcularSalario(float salario, int multiplicador) {
        return salario * multiplicador;
    }
}
