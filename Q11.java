package ExercíciosTiago;

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double velK,velM;
        System.out.println("Digite uma velocidade em m/s:");
        velM = scan.nextDouble();
        velK = velM*3.6;
        System.out.println("A velocidade convertida para Km/h é: "+velK);
    }
}
