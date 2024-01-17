package padraoDeProjeto;

import java.time.LocalDate;

import entidades.Cliente;
import entidades.Livro;

public class EmprestimoPorPeriodo implements EstrategiaEmprestimo {
 private static final int diasDeEmprestimo = 9;

    @Override
    public void realizarEmprestimo(Cliente cliente, Livro livro) {
        if (livro.isDisponivel()) {
            livro.setDisponivel(false);
            LocalDate dataDevolucao = LocalDate.now().plusDays(diasDeEmprestimo);
            System.out.println("\nEmpréstimo por período de 9 dias: " + livro.getTitulo() +
                               "\npara: " + cliente.getNome() + "." +
                               "\nDevolução até " + dataDevolucao);
        }else {
            System.out.println("Erro: O livro ja está emprestado.");
        }
    }

    @Override
    public void devolverLivro(Livro livro) {
        if (livro.isDisponivel()) {
            livro.setDisponivel(true);
            livro.devolverLivro();
            System.out.println("Livro devolvido à biblioteca (Estratégia por Período).");
        } else {
            System.out.println("Erro: O livro não está emprestado ou já foi devolvido.");
        }
    }
    
}
