package ExercíciosTiago;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double velK,velM;
        System.out.println("Digite uma velocidade em Km/h:");
        velK = scan.nextDouble();
        velM = velK/3.6;
        System.out.println("A velocidade convertida para m/s é: "+velM);
    }
}
