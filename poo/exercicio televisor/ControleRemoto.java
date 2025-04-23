public class ControleRemoto {
    private Televisor tv;

    public ControleRemoto(Televisor tv){
        this.tv = tv;

    }

    public void ligar(){
        tv.ligar();
    }

    public void desligar(){
        tv.desligar();
    }

    public void alumentarVolume(){
        tv.alumentarVolume();
    }

    public void diminuirVolume(){
        tv.alumentarVolume();
    }

    public void trocarCanal(int canal){
        tv.trocarCanal();
    }

    public String toString(){
        return tv.toString();
    }
}
