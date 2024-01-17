package padraoDeProjeto;

import java.time.LocalDate;

import entidades.Cliente;
import entidades.Livro;

public class EmprestimoPremium implements EstrategiaEmprestimo {
    private static final int diasDeEmprestimo = 20;
    
    @Override
    public void realizarEmprestimo(Cliente cliente, Livro livro) {
        LocalDate dataDevolucao = LocalDate.now().plusDays(diasDeEmprestimo);
        if (livro.isDisponivel()) {
            livro.setDisponivel(false);
            livro.emprestarLivro();
            System.out.println("Livro emprestado por 20 dias para " + cliente.getNome() + 
            "\nDevolução até " + dataDevolucao + " \n(Estratégia Premium | taxa de emprestimo: 10%).");
        } else {
            System.out.println("Livro indisponível para empréstimo no momento.");
        }
    }

    @Override
    public void devolverLivro(Livro livro) {
        if (livro.isDisponivel()) {
            livro.setDisponivel(true);
            livro.devolverLivro();
            System.out.println("Livro devolvido à biblioteca (Estratégia Emprestimo Premium).");
        } else {
            System.out.println("Erro: O livro não está emprestado ou já foi devolvido.");
        }
    }
}
