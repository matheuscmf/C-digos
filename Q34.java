package ExercíciosTiago;

import java.util.Scanner;

public class Q34 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double raioC,areaC;
        System.out.println("Digite o tamanho do raio do círculo:");
        raioC = scan.nextInt();
        areaC = Math.PI*(raioC*raioC);
        System.out.println("O valor da área do círculo é: "+areaC);
    }
}
