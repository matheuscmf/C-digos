package AulasJavaBasico;

import java.util.Scanner;

public class Exerc2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i,a,b,r = 0;
        System.out.println("Digite dois valores:");
        a = scan.nextInt();
        b = scan.nextInt();
        for (i=1;i<=b;i++) {
        r = r + a;
        }
        System.out.print("O resultado da multiplicação dos valores é: "+ r);
}
    }