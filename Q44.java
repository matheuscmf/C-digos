package ExercíciosTiago;

import java.util.Scanner;

public class Q44 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double altEsc,altDeg,qtdDeg;
        System.out.println("Digite a altura do degrau da escada, em centímetros:");
        altDeg = scan.nextDouble();
        System.out.println("Digite a altura desejada da escada, em metros:");
        altEsc = scan.nextDouble();
        qtdDeg = (altEsc*100.0)/altDeg;// 1 metro = 100 centímetros//
        System.out.println("A quantidade de degraus necessária para alcançar o final da escada é de: "+qtdDeg+" degraus.");
    }
}
