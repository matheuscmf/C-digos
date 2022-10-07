package ExercíciosTiago;

import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double disM,disK;
        System.out.println("Digite uma distância em quilômetros:");
        disK = scan.nextDouble();
        disM = disK/1.61;
        System.out.println("A distância convertida em milhas é: "+disM);
    }
}
