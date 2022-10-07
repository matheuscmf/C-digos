package ExercíciosTiago;

import java.util.Scanner;
public class Q36 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double raioC,altC,volumeC;
        System.out.println("Digite a altura e o raio do cilindro, respectivamente:");
        altC = scan.nextDouble();
        raioC = scan.nextDouble();
        volumeC = Math.PI*(Math.pow(raioC,2))*altC;
        System.out.println("O volume do cilindro corresponde a:"+volumeC);
    }
}
