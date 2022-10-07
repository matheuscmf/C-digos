package ExercíciosTiago;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        int v1,v2,v3,r;
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite três valores inteiros:");
        v1 = scan.nextInt();
        v2 = scan.nextInt();
        v3 = scan.nextInt();
        r = (v1+v2+v3);
        System.out.println("O resultado da soma dos três valores é: "+r);

    }
}
