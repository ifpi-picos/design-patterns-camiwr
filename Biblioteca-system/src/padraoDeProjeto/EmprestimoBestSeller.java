package padraoDeProjeto;

import entidades.Cliente;
import entidades.Livro;

public class EmprestimoBestSeller implements EstrategiaEmprestimo {
    @Override
    public void realizarEmprestimo(Cliente cliente, Livro livro) {
        if (livro.isBestSeller()) {
            livro.emprestarLivro();
            System.out.println("Livro best seller emprestado para " + cliente.getNome() +
                               " com taxa de reserva de 5%.");
        } else {
            System.out.println("Livro não é um best seller. Utilize a estratégia padrão.");
        }
    }
}
