package ExercíciosTiago;

import java.util.Scanner;

public class Q50 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int anoNasc,idade;
        System.out.println("Digite o ano de seu nascimento:");
        anoNasc = scan.nextInt();
        idade = 2022-anoNasc;
        System.out.println("Vossa Senhoria possui exatos "+idade+" anos.");
    }
}
