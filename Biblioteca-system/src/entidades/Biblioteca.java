package entidades;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Livro> livros;
    private List<Cliente> clientes;

    public Biblioteca() {
        this.livros = new ArrayList<>();
        this.clientes = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
        System.out.println("Novo livro adicionado: " + " ID: " + livro.getIdLivro() + " " + livro.getTitulo() + " de " + livro.getAutor() + " Ano: " + livro.getAnoPublicacao());
    }

    public void adicionarCliente(Cliente cliente) { 
        clientes.add(cliente);
        System.out.println("Novo cliente adicionado: " + cliente.getNome() + " Email: " + cliente.getEmail());
    }

    //* metodos para livro

    public void realizarEmprestimo(Cliente cliente, Livro livro) {
        if (livros.contains(livro) && clientes.contains(cliente)) {
            livro.emprestarLivro();
            System.out.println("Livro emprestado para " + cliente.getNome());
        } else {
            System.out.println("Cliente ou livro não cadastrado na biblioteca.");
        }
    }

    public void realizarDevolucao(Livro livro) {
        if (livros.contains(livro)) {
            livro.devolverLivro();
            System.out.println("Livro devolvido à biblioteca.");
        } else {
            System.out.println("Livro não cadastrado na biblioteca.");
        }
    }

    public void listarLivrosDisponiveis() {
        System.out.println("Livros Disponíveis na Biblioteca:");
        for (Livro livro : livros) {
            if (livro.isDisponivel()) {
                System.out.println("- " + livro.getTitulo() + " de " + livro.getAutor());
            }
        }
    }

    public Livro buscarLivroPorTitulo(String titulo) {
        for (Livro livro : livros) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                System.out.println("Livro encontrado.");
            }
        }
        return null;
        
    }

    public void listarLivrosEmprestados() {
        System.out.println("Livros Atualmente Emprestados:");
        for (Livro livro : livros) {
            if (!livro.isDisponivel()) {
                System.out.println("- " + livro.getTitulo() + " emprestado.");
            }
        }
    }

    // * metodos para clientes

    public void listarClientes() {
        System.out.println("Clientes Cadastrados na Biblioteca:");
        for (Cliente cliente : clientes) {
            System.out.println("- " + cliente.getNome());
        }
    }

    public Cliente buscarClientePorNome(String nome) {
        for (Cliente cliente : clientes) {
            if (cliente.getNome().equalsIgnoreCase(nome)) {
                return cliente;
            }
        }
        return null; 
    }
}
