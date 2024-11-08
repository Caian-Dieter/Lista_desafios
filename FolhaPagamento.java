package br.com.caian.funcionarios.impl;

import br.com.caian.impl.CalcularSalario;
import java.util.List;

public class FolhaPagamento {

    // Método que recebe uma lista de funcionários (ou estagiários) e imprime os salários
    public void imprimirSalarios(List<CalcularSalario> funcionarios) {
        for (CalcularSalario funcionario : funcionarios) {
            // Você pode chamar o método calcularSalario diretamente,
            // já que todos os funcionários (ou estagiários) implementam a interface CalcularSalario
            float salarioFinal = funcionario.calcularSalario(((Funcionarios) funcionario).getSalario(), ((Funcionarios) funcionario).getMultiplicador());

            // Imprimindo nome e salário final
            System.out.println("Nome: " + ((Funcionarios) funcionario).getNomeFuncionario());
            System.out.println("Salário Final: R$ " + salarioFinal);
        }
    }
}
