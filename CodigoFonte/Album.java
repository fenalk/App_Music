import java.util.ArrayList;
import java.util.List;

public class Album {
    private String titulo;
    private int ano;
    private Artista artista;
    private List<Musica> musicas;
    private int duracaoTotal;

    public Album(String titulo, int ano, Artista artista) {
        this.titulo = titulo;
        this.ano = ano;
        this.artista = artista;
        this.musicas = new ArrayList<>();
        this.duracaoTotal = 0;
    }

    // Método para executar ações no álbum com base em uma opção
    public void executarAcao(int opcao) {
        if (opcao == 1) {
            realizarDownloadDoAlbum();
        } else if (opcao == 2) {
            apagarDaBiblioteca();
        } else if (opcao == 3) {
            adicionarNaPlaylist();
        } else if (opcao == 4) {
            adicionarAosFavoritos();
        } else if (opcao == 5) {
            reproduzirMusicaDoAlbumEmOrdem();
        } else if (opcao == 6) {
            reproduzirMusicaDoAlbumEmAleatorio();
        } else if (opcao == 7) {
            salvarEmBiblioteca();
        } else {
            System.out.println("Opção inválida. Tente novamente.");
        }
    }

    // Métodos para cada ação
    public void realizarDownloadDoAlbum() {
        System.out.println("Realizando download do álbum: " + titulo);
    }

    public void apagarDaBiblioteca() {
        System.out.println("Álbum removido da biblioteca: " + titulo);
    }

    public void adicionarNaPlaylist() {
        System.out.println("Álbum adicionado à playlist: " + titulo);
    }

    public void adicionarAosFavoritos() {
        System.out.println("Álbum adicionado aos favoritos: " + titulo);
    }

    public void reproduzirMusicaDoAlbumEmOrdem() {
        System.out.println("Reproduzindo as músicas do álbum em ordem");
        for (Musica musica : musicas) {
            System.out.println("Tocando: " + musica.getNome());
        }
    }

    public void reproduzirMusicaDoAlbumEmAleatorio() {
        System.out.println("Reproduzindo as músicas do álbum de forma aleatória");
        // Implementação para reprodução aleatória
    }

    public void salvarEmBiblioteca() {
        System.out.println("Álbum salvo na biblioteca: " + titulo);
    }

    // Getters e Setters
    public String getTitulo() {
        return titulo;
    }

    public int getAno() {
        return ano;
    }

    public Artista getArtista() {
        return artista;
    }

    public void adicionarMusica(Musica musica) {
        musicas.add(musica);
        duracaoTotal += musica.getDuracao();
    }

    public List<Musica> getMusicas() {
        return musicas;
    }

    public int getDuracaoTotal() {
        return duracaoTotal;
    }

    @Override
    public String toString() {
        return "Álbum: " + titulo + " (" + ano + ") - Artista: " + artista.getNomeArtista();
    }
}

