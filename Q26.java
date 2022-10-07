package ExercíciosTiago;

import java.util.Scanner;

public class Q26 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double areaM,areaH;
        System.out.println("Digite o valor da área em metros quadrados(m²) :");
        areaM = scan.nextDouble();
        areaH = areaM*0.0001;
        System.out.println("O valor convertido em hectares é: "+areaH);
    }
}
