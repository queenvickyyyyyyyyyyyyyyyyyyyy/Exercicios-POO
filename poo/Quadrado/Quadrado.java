package Quadrado;
public class Quadrado {
    private float lado;

    public Quadrado(float lado){
        this.lado = lado;
    }

    public float calcularArea(){
        return lado * lado;
    }

    public float calcularPerimetro(){
        return 4 * lado;
    }

    public void imprimir(){
        System.out.println("O lado do quadrado é " + lado);
        System.out.println("A área do quadrado é " + calcularArea());
        System.out.println("O perimetro do quadrado é " + calcularPerimetro());
    }
}
