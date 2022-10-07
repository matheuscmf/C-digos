package ExercíciosTiago;

import java.util.Scanner;

public class Q29 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double n1,n2,n3,n4,media;
        System.out.println("Digite as quatro notas:");
        n1 = scan.nextDouble();
        n2 = scan.nextDouble();
        n3 = scan.nextDouble();
        n4 = scan.nextDouble();
        media = (n1+n2+n3+n4)/4;
        System.out.println("A média das quatro notas é: "+media);
    }
}
