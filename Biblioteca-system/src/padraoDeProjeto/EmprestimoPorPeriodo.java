package padraoDeProjeto;

import java.time.LocalDate;

import entidades.Cliente;
import entidades.Livro;

public class EmprestimoPorPeriodo implements EstrategiaEmprestimo {
 private static final int diasDeEmprestimo = 9;

    @Override
    public void realizarEmprestimo(Cliente cliente, Livro livro) {
        LocalDate dataDevolucao = LocalDate.now().plusDays(diasDeEmprestimo);
        System.out.println("\nEmpréstimo por período de 9 dias: " + livro.getTitulo() +
                           "\npara: " + cliente.getNome() + "." +
                           "\nDevolução até " + dataDevolucao);
    }
}
