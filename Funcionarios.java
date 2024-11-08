package br.com.caian.funcionarios.impl;

public class Funcionarios {

    private String nomeFuncionario;
    private float salario;
    private int multiplicador = 1;

    public int getMultiplicador() {
        return multiplicador;
    }

    public void setMultiplicador(int multiplicador) {
        this.multiplicador = multiplicador;
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public Funcionarios(String nomeFuncionario, float salario) {
        this.salario = salario;
        this.nomeFuncionario = nomeFuncionario;
    }

}
