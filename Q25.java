package ExercíciosTiago;

import java.util.Scanner;

public class Q25 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double areaM,areaA;
        System.out.println("Digite o valor da área em acres:");
        areaA = scan.nextDouble();
        areaM = areaA*4048.58;
        System.out.println("O valor convertido em metros quadrados é: "+areaM);
    }
}
