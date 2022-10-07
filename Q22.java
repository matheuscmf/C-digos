package ExercíciosTiago;

import java.util.Scanner;

public class Q22 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double compJ,compM;
        System.out.println("Digite o valor do comprimento em jardas:");
        compJ = scan.nextDouble();
        compM = compJ*0.91;
        System.out.println("O valor convertido em metros é: "+compM);
    }
}
