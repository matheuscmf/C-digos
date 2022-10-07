package ExercíciosTiago;

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double tempC,tempK;
        System.out.println("Digite a temperatura desejada em Kelvin :");
        tempK = scan.nextDouble();
        tempC = tempK - 273.15;
        System.out.println("A temperatura convertida em Celsius é: "+tempC);
    }
}
