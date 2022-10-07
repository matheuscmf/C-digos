package ExercíciosTiago;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double tempC,tempF;
        System.out.println("Digite a temperatura desejada em Celsius:");
        tempC = scan.nextDouble();
        tempF = (tempC*(9.0/5.0))+32.0;
        System.out.println("A temperatura convertida em Fahrenheit é: "+tempF);
    }
}
