public class Player implements InterfacePlayer {
    //atributos
    //método construtor
    //métodos sobrescritos
    //getters e setters 
    private int volume;
    private boolean appAberto;
    private boolean tocando;

    public Player(int volume, boolean appAberto, boolean tocando) {
        this.volume = (volume >= 0 && volume <= 100) ? volume : 50;
        this.appAberto = appAberto; 
        this.tocando = tocando; 
    }

    @Override
    public void aumentarVolume() {
       if (isTocando() && isAppAberto()){
            this.setVolume(this.getVolume() + 5);
            System.out.println("Volume aumentado para: " + this.getVolume());

       }else if(volume >=  100){
            System.out.println("Volume máximo atingido.");
        
       }
        
    }

    @Override
    public void diminuirVolume() {
        if (isTocando() && isAppAberto()){
            this.setVolume(this.getVolume() - 5);
            System.out.println("Volume dimiuindo para: " + this.getVolume());

       }else if (volume <= 0){
            System.out.println("Volume minimo atingido.");
       }
        
    }

    @Override
    public void favoritar() {
        if(isAppAberto() && isTocando()){
            System.out.println("Favoritar música");
        }
        
    }

    @Override
    public void passar_musica() {
        if(isAppAberto() && isTocando()){
            System.out.println("Passar Música");
        }
        
    }

    @Override
    public void pause() {
        if(isAppAberto() && isTocando()){
            this.setTocando(false);
            System.out.println("Música pausada");
        }
        
    }

    @Override
    public void play() {
        if(isAppAberto() && !isTocando()){
            this.setTocando(true);
            System.out.println("Música Tocando");
        }
        
    }

    @Override
    public void voltar_musica() {
        if(isAppAberto() && isTocando()){
            System.out.println("Retornar para música anterior");
        }
        
    }


    //getters e setters
    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isAppAberto() {
        return appAberto;
    }

    public void setAppAberto(boolean appAberto) {
        this.appAberto = appAberto;
    }

    public boolean isTocando() {
        return tocando;
    }

    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }



}
