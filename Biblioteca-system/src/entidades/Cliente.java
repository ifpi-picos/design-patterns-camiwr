package entidades;

public class Cliente {
    private int idUsuario;
    private String nome;
    private String email;
    private String endereço;

    public Cliente(int idUsuario, String nome, String email, String endereço) {
        this.idUsuario = idUsuario;
        this.nome = nome;
        this.email = email;
        this.endereço = endereço;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }
}
