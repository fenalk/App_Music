public class Conta {
    private String nome = "Usuário Padrão";
    private String email = "email@exemplo.com";

    // Exibe informações da conta
    public void mostrarTelaConta() {
        System.out.println("===== Informações da Conta =====");
        System.out.println("Nome: " + nome);
        System.out.println("Email: " + email);
    }

    // Getters e Setters
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
}
