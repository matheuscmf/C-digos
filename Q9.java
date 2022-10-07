package ExercíciosTiago;

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double tempC,tempK;
        System.out.println("Digite a temperatura desejada em Celsius :");
        tempC = scan.nextDouble();
        tempK = tempC + 273.15;
        System.out.println("A temperatura convertida em Kelvin é: "+tempK);
    }
}
