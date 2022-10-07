package ExercíciosTiago;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double num,r;
        System.out.println("Digite um número real:");
        num = scan.nextDouble();
        r = num/5;
        System.out.println("A quinta parte do número digitado é: "+r);
    }
}
