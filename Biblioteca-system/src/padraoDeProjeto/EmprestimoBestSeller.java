package padraoDeProjeto;

import entidades.Cliente;
import entidades.Livro;

public class EmprestimoBestSeller implements EstrategiaEmprestimo {
    @Override
    public void realizarEmprestimo(Cliente cliente, Livro livro) {
        if (livro.isBestSeller()) {
            livro.setDisponivel(false);
            livro.emprestarLivro();
            System.out.println("Livro best seller emprestado para " + cliente.getNome() +
                               " com taxa de reserva de 5%.");
        } else {
            System.out.println("Livro não é um best seller. Utilize a estratégia padrão.");
        }
    }

    @Override
    public void devolverLivro(Livro livro) {
        if (livro.isDisponivel()) {
            livro.setDisponivel(true);
            livro.devolverLivro();
            System.out.println("Livro devolvido à biblioteca (Estratégia Emprestimo Best Seller).");
        } else {
            System.out.println("Erro: O livro não está emprestado ou já foi devolvido.");
        }
    }
}
