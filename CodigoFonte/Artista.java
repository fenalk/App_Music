import java.util.ArrayList;
import java.util.List;

public class Artista {
    private String nomeArtista;
    private Genero genero;
    private List<Album> albuns;

    public Artista(String nomeArtista, Genero genero) {
        this.nomeArtista = nomeArtista;
        this.genero = genero;
        this.albuns = new ArrayList<>();
    }

    public String getNomeArtista() {
        return nomeArtista;
    }

    public void setNomeArtista(String nomeArtista) {
        this.nomeArtista = nomeArtista;
    }

    public Genero getGenero() {
        return genero;
    }

    public void adicionarAlbum(Album album) {
        albuns.add(album);
    }

    public List<Album> getAlbuns() {
        return albuns;
    }

    @Override
    public String toString() {
        return "Artista: " + nomeArtista + " - Gênero: " + genero;
    }
}
