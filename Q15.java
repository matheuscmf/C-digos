package ExercíciosTiago;

import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double ang,rad;
        System.out.println("Digite o valor do ângulo em radianos:");
        rad = scan.nextDouble();
        ang = (rad*180.0)/Math.PI;
        System.out.println("O valor convertido em graus é: "+ang);

    }
}
