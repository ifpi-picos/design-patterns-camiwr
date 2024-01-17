package entidades;

public class Livro {
    private int idLivro;
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private boolean bestSeller;
    private boolean disponivel; 

    public Livro(int idLivro, String titulo, String autor, int anoPublicacao, boolean bestSeller, boolean disponivel) {
        this.idLivro = idLivro;
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.bestSeller = true;
        this.disponivel = true;
    }

    public int getIdLivro() {
        return idLivro;
    }

    public void setIdLivro(int idLivro) {
        this.idLivro = idLivro;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public boolean isBestSeller() {
        return bestSeller;
    }
    public void setBestSeller(boolean bestSeller) {
        this.bestSeller = bestSeller;
    }
    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
    public boolean isDisponivel() {
        return disponivel;
    }

    public void emprestarLivro() {
        if (disponivel) {
            disponivel = false;
            System.out.println("Livro emprestado com sucesso.");
        } else {
            System.out.println("Livro indisponível no momento.");
        }
    }

    public void devolverLivro() {
        if (!disponivel) {
            disponivel = true;
            System.out.println("Livro devolvido com sucesso.");
        } else {
            System.out.println("Livro já foi devolvido/não foi emprestado.");
        }
    }
}
