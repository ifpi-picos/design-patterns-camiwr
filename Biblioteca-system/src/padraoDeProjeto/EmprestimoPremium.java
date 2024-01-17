package padraoDeProjeto;

import java.time.LocalDate;

import entidades.Cliente;
import entidades.Livro;

public class EmprestimoPremium implements EstrategiaEmprestimo {
    private static final int diasDeEmprestimo = 30;
    
    @Override
    public void realizarEmprestimo(Cliente cliente, Livro livro) {
        LocalDate dataDevolucao = LocalDate.now().plusDays(diasDeEmprestimo);
        if (livro.isDisponivel()) {
            livro.emprestarLivro();
            System.out.println("Livro emprestado por 30 dias para " + cliente.getNome() + 
            "\nDevolução até " + dataDevolucao + " \n(Estratégia Premium | taxa de reserva: 10%).");
        } else {
            System.out.println("Livro indisponível para empréstimo no momento.");
        }
    }
}
