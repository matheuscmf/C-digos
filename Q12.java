package ExercíciosTiago;

import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double disM,disK;
        System.out.println("Digite uma distância em milhas:");
        disM = scan.nextDouble();
        disK = disM*1.61;
        System.out.println("A distância convertida em quilômetros é: "+disK);
    }
}
