package ExercíciosTiago;

import java.util.Scanner;

public class Q28 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int val1,val2,val3,somaQ;
        System.out.println("Digite 3 valores inteiros:");
        val1 = scan.nextInt();
        val2 = scan.nextInt();
        val3 = scan.nextInt();
        somaQ = (val1*val1)+(val2*val2)+(val3*val3);
        System.out.println("A soma dos quadrados dos valores inseridos é: "+somaQ);
    }
}
