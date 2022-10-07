package ExercíciosTiago;

import java.util.Scanner;

public class Q37 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double valorP,valorD;
        System.out.println("Digite o valor do produto:");
        valorP = scan.nextDouble();
        valorD = valorP-(valorP*0.12);
        System.out.println("O valor do produto com o desconto de 12% é de: "+valorD);
    }
}
