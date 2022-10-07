package ExercíciosTiago;

import java.util.Scanner;

public class Q33 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int tamL,aQ;
        System.out.println("Digite o tamanho do lado do quadrado:");
        tamL = scan.nextInt();
        aQ = tamL*tamL;
        System.out.println("O valor da área do quadrado é: "+aQ);

    }
}
