package ExercíciosTiago;

import java.util.Scanner;

public class Q19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double metC,litros;
        System.out.println("Digite o valor do volume em litros:");
        litros = scan.nextDouble();
        metC = litros/1000.0;
        System.out.println("O valor convertido em metros cúbicos(m³) é: "+metC);
    }
}
