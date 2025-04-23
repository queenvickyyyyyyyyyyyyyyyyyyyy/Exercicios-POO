public class Televisor{
    private int canal;
    private double volume;
    private boolean ligado;

    public Televisor(int canal, double volume, boolean ligado){
        this.canal = canal;
        this.volume = volume;
        this.ligado = ligado;
    }

    public boolean ligar(){
        return true;
    }

    public boolean desligar(){
        return false;
    }

    public double alumentarVolume(){
        return volume + 5;
    }

    public double diminuirVolume(){
        return volume - 5;
    }

    public int trocarCanal(){
        return canal + 1;
    }

    public String toString(){
        return "O talevisor esta "+ ligado +"no canal "+ canal +", com volume "+volume;
    }
}