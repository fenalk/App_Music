public class Genero {
    private String generoArtista;

    public void tocarRock(){
        System.out.println("Tocando Rock");
    }

    public Genero(String generoArtista) {
        this.generoArtista = generoArtista;
    }

    public String getGeneroArtista() {
        return generoArtista;
    }

    public void setGeneroArtista(String generoArtista) {
        this.generoArtista = generoArtista;
    }

    @Override
    public String toString() {
        return generoArtista;
    }
}
