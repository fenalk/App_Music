public class Musica implements Player {
    private String nome;
    private int duracao; // em segundos
    private Album album;

    public Musica(String nome, int duracao, Album album) {
        this.nome = nome;
        this.duracao = duracao;
        this.album = album;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public Album getAlbum() {
        return album;
    }

    //método da interface
    @Override
    public void play() {
        System.out.println("Tocando: " + nome);
    }

    @Override
    public void pause() {
        System.out.println("Pausando: " + nome);
    }

    @Override
    public void passar_musica() {
        System.out.println("Passando para a próxima música.");
    }

    @Override
    public void voltar_musica() {
        System.out.println("Voltando para a música anterior.");
    }

    @Override
    public void volume(int nivel) {
        System.out.println("Ajustando volume para: " + nivel);
    }

    @Override
    public void favoritar() {
        System.out.println(nome + " foi marcada como favorita!");
    }

    @Override
    public String toString() {
        return "Música: " + nome + " (" + duracao + " segundos)";
    }
}
