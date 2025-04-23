public class Retangulo{
    private float comprimento;
    private float largura;

    public Retangulo(float comprimento, float largura){
        this.comprimento = comprimento;
        this.largura = largura;
    }
    public float calcularArea(){
        return comprimento * largura;
    }

    public float calcularPerimetro(){
        return 2 * comprimento + 2 * largura;
    }

    public void imprimir(){
        System.out.println("O comprimento do retangulo é " + comprimento);
        System.out.println("A largura do retangulo é " + largura);
        System.out.println("A área do retangulo é " + calcularArea());
        System.out.println("O pereimetro do retangulo é " + calcularPerimetro());
    }
    
}