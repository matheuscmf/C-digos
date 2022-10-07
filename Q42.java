package ExercíciosTiago;

import java.util.Scanner;

public class Q42 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double salBase,salLiq;
        System.out.println("Insira o valor de seu salário-base:");
        salBase = scan.nextDouble();
        salLiq = salBase*0.98; // Como o aumento e desconto são feitos na mesma base(salário-base),//
                               // podemos simplemente calcular o valor total da porcentagem, que seria //
                               // de (+0.05(5%)SB -0.07(7%)SB) = -0.02%(2%)SB //
        System.out.println("Seu salário a receber é de: "+salLiq+" reais.");
    }
}
