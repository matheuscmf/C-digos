package ExercíciosTiago;
import java.math.*;
import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double ang,rad;
        System.out.println("Digite o valor do ângulo em graus:");
        ang = scan.nextDouble();
        rad = (ang*Math.PI)/180.0;
        System.out.println("O valor convertido em radianos é: "+rad);
    }
}
