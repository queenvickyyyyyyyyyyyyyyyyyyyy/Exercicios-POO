public class Circulo {
    private float raio;
    private final float PI = 3.1415f;

    public Circulo(float raio){
        this.raio = raio;
    }

    public float calcularArea(){
        return PI * raio * raio;
    }

    public float calcularPerimetro(){
        return 2 * PI * raio;
    }

    public void imprimir(){
        System.out.println("O valor do raio é " + raio);
        System.out.println("O valor da área é " + calcularArea());
        System.out.println("O valor do perimetro é " + calcularPerimetro());
    }
}
