import br.com.caian.funcionarios.impl.Estagiario;
import br.com.caian.funcionarios.impl.Funcionarios;
import br.com.caian.funcionarios.impl.FolhaPagamento;
import br.com.caian.funcionarios.impl.Gerente;
import br.com.caian.funcionarios.impl.Diretor;
import br.com.caian.impl.CalcularSalario;
import java.util.ArrayList;
import java.util.List;



public class Main {
    public static void main(String[] args) {

        Diretor diretor1 = new Diretor("Carlos", 1000.0f);
        Estagiario estagiario1 = new Estagiario("Ana", 1000.0f);
        Gerente gerente1 = new Gerente("Juam",1000.0f);

        gerente1.setMultiplicador(2);
        estagiario1.setMultiplicador(1);
        diretor1.setMultiplicador(3);

        List<CalcularSalario> funcionarios = new ArrayList<>();
        funcionarios.add(diretor1);
        funcionarios.add(estagiario1);
        funcionarios.add(gerente1);

        FolhaPagamento pagamento = new FolhaPagamento();

        pagamento.imprimirSalarios(funcionarios);


    }
}