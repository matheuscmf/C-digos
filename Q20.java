package ExercíciosTiago;

import java.util.Scanner;

public class Q20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double masL,masK;
        System.out.println("Digite o valor da massa em quilogramas:");
        masK = scan.nextDouble();
        masL = masK/0.45;
        System.out.println("O valor convertido em libras é: "+masL);

    }
}
