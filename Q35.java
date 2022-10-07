package ExercíciosTiago;

import java.math.*;
import java.util.Scanner;

public class Q35 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double catA,catB,hipC;
        System.out.println("Digite os valores dos catetos: ");
        catA = scan.nextDouble();
        catB = scan.nextDouble();
        hipC = Math.sqrt(Math.pow(catA,2)+Math.pow(catB,2));
        System.out.println("O valor da hipotenusa é: "+hipC);
    }
}
