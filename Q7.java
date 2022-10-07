package ExercíciosTiago;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double tempC,tempF;
        System.out.println("Digite a temperatura desejada em Fahrenheit :");
        tempF = scan.nextDouble();
        tempC = (tempF-32.0)*5.0/9.0;
        System.out.println("A temperatura convertida em Celsius é: "+tempC);
    }
}
