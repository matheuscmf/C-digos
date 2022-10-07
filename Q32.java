package ExercíciosTiago;

import java.util.Scanner;

public class Q32 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num,ant2,suc3;
        System.out.println("Digite um número inteiro:");
        num = scan.nextInt();
        ant2 = (2*num)-1;
        suc3 = (3*num)+1;
        System.out.println("A soma do sucessor do triplo número digitado com o antecessor de seu dobro é: ");
        System.out.println(suc3+ant2);

    }
}
