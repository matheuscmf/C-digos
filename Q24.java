package ExercíciosTiago;

import java.util.Scanner;

public class Q24 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double areaM,areaA;
        System.out.println("Digite o valor da área em metros quadrados:");
        areaM = scan.nextDouble();
        areaA = areaM*0.000247;
        System.out.println("O valor convertido em acres é: "+areaA);
    }
}
