package ExercíciosTiago;

import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double comC,comP;
        System.out.println("Digite o valor do comprimento em polegadas:");
        comP = scan.nextDouble();
        comC = comP*2.54;
        System.out.println("O valor convertido em centímetros é: "+comC);
    }
}
