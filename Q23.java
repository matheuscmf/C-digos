package ExercíciosTiago;

import java.util.Scanner;

public class Q23 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double compJ,compM;
        System.out.println("Digite o valor do comprimento em metros:");
        compM = scan.nextDouble();
        compJ = compM/0.91;
        System.out.println("O valor convertido em jardas é: "+compJ);
    }
}
