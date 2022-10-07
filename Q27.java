package ExercíciosTiago;

import java.util.Scanner;

public class Q27 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double areaM,areaH;
        System.out.println("Digite o valor da área em hectares :");
        areaH = scan.nextDouble();
        areaM = areaH*10000.0;
        System.out.println("O valor convertido em metros quadrados(m²) é: "+areaM);
    }
}
