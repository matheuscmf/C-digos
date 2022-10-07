package ExercíciosTiago;

import java.util.Scanner;

public class Q18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double metC,litros;
        System.out.println("Digite o valor do volume em metros cúbicos(m³):");
        metC = scan.nextDouble();
        litros = metC*1000.0;
        System.out.println("O valor convertido em litros é: "+litros);
    }
}
