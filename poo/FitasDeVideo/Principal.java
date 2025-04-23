public class Principal {
    public static void main(String[] args) {
        FitasDeVideo fita1 = new FitasDeVideo("Clube da Luta", 5.50f);
        FitasDeVideo fita2 = new FitasDeVideo("Avatar", 3.99f);
        FitasDeVideo fita3 = new FitasDeVideo("Django Livre", 4.45f);
        FitasDeVideo fita4 = new FitasDeVideo("Jurassic Park", 2.75f);

        System.out.println(fita1);
        System.out.println("Valor do aluguel por 5 dias: R$" + fita1.getValorAluguel(5));
        System.out.println();

        System.out.println(fita2);
        System.out.println("Valor do aluguel por 3 dias: R$" + fita2.getValorAluguel(3));
        System.out.println();

        System.out.println(fita3);
        System.out.println("Valor do aluguel por 7 dias: R$" + fita3.getValorAluguel(7));
        System.out.println();

        System.out.println(fita4);
        System.out.println("Valor do aluguel por 2 dias: R$" + fita4.getValorAluguel(2));
    }
}
