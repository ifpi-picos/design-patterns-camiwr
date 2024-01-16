import entidades.Biblioteca;
import entidades.Cliente;
import entidades.Livro;

public class App {
    public static void main(String[] args) throws Exception {
        Biblioteca biblioteca = new Biblioteca();

        Livro livro1 = new Livro(1, "O pequeno principe", "Antoine de Saint-Exupéry", 1943, true);
        Livro livro2 = new Livro(2, "Memórias Póstumas de Brás Cubas", "Machado de Assis", 1881, true);

        Cliente cliente1 = new Cliente(1, "Alice", "alice@gmail.com", "rua tal");
        Cliente cliente2 = new Cliente(2, "Paulo", "paulo@gmail.com", "rua taltal");

        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
        biblioteca.adicionarCliente(cliente1);

        //biblioteca.realizarEmprestimo(cliente1, livro1);
        //biblioteca.realizarEmprestimo(cliente2, livro2);
        
        //biblioteca.listarLivrosDisponiveis();
     
        //biblioteca.listarLivrosEmprestados();

        biblioteca.buscarLivroPorTitulo("O pequeno principe"); //add scanner, dizer status do livro
    }
}
