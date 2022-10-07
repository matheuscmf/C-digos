package ExercíciosPryscilla;

import java.util.Scanner;

public class ListaAPSEx8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double precoG,qtdRreais,qtdLitros;
        System.out.println("Quantos reais desejas pôr no tanque do carro? ");
        qtdRreais = scan.nextDouble();
        System.out.println("Quanto está o preço da gasolina em reais? ");
        precoG = scan.nextDouble();
        qtdLitros= qtdRreais/precoG;
        System.out.println("Parabéns, você colocou "+qtdLitros+" litros em seu possante!!!");
    }
}
