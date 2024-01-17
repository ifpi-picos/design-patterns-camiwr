package padraoDeProjeto;

import entidades.Cliente;
import entidades.Livro;

public interface EstrategiaEmprestimo {
     void realizarEmprestimo(Cliente cliente, Livro livro);
}
