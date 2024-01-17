import entidades.Biblioteca;
import entidades.Cliente;
import entidades.Livro;
import padraoDeProjeto.EmprestimoBestSeller;
import padraoDeProjeto.EmprestimoPorPeriodo;
import padraoDeProjeto.EmprestimoPremium;

public class Main {
    public static void main(String[] args) throws Exception {
        Biblioteca biblioteca = new Biblioteca();

        Livro livroBestSeller = new Livro(1, "O pequeno principe", "Antoine de Saint-Exupéry", 1943, true, true);
        Livro livroNormal = new Livro(2, "Memórias Póstumas de Brás Cubas", "Machado de Assis", 1881, true, false);

        Cliente cliente1 = new Cliente(1, "Alice", "alice@gmail.com", "rua tal");
        Cliente cliente2 = new Cliente(2, "Paulo", "paulo@gmail.com", "rua taltal");
        Cliente cliente3 = new Cliente(3, "Victoria", "vic@gmail.com", "rua azul");

        biblioteca.adicionarLivro(livroBestSeller);
        biblioteca.adicionarLivro(livroNormal);

        biblioteca.adicionarCliente(cliente1);
        biblioteca.adicionarCliente(cliente2);
        biblioteca.adicionarCliente(cliente3);

        //biblioteca.realizarEmprestimo(cliente1, livro1);
        // biblioteca.realizarEmprestimo(cliente2, livro2);
        // biblioteca.realizarDevolucao(livro2);

        //cliente1.setEstrategiaEmprestimo(new EmprestimoPorPeriodo());
        cliente1.setEstrategiaEmprestimo(new EmprestimoBestSeller());
        //cliente1.setEstrategiaEmprestimo(new EmprestimoPremium());

        cliente1.realizarEmprestimo(livroBestSeller);

        livroBestSeller.devolverLivro();
        // biblioteca.listarClientes();
        //biblioteca.listarLivrosDisponiveis();
     
        //biblioteca.listarLivrosEmprestados();

        // biblioteca.buscarLivroPorTitulo("O pequeno principe"); //add scanner, dizer status do livro
    }
}
