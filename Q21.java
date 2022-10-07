package ExercíciosTiago;

import java.util.Scanner;

public class Q21 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double masL, masK;
        System.out.println("Digite o valor da massa em libras:");
        masL = scan.nextDouble();
        masK = masL * 0.45;
        System.out.println("O valor convertido em quilogramas é: " + masK);
    }
}