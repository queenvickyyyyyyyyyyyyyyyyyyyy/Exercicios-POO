public class FitasDeVideo{
    private String titulo;
    private float aluguel;

    public FitasDeVideo(String titulo, float aluguel){
        this.titulo = titulo;
        this.aluguel  = aluguel;
    }

    public String getTitulo(){
        return titulo;
    }

    public float getAluguel(){
        return aluguel;
    }

    public float getValorAluguel(int DiasDeAluguel){
        return aluguel * DiasDeAluguel;
    }

    public String toString(){
        return "Titulo: " + titulo +", aluguel por dia: " + aluguel;
    }

}