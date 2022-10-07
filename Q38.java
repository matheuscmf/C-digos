package ExercíciosTiago;

import java.util.Scanner;

public class Q38 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double sal,salA;
        System.out.println("Digite o valor do seu salário:");
        sal = scan.nextDouble();
        salA = sal+(sal*0.25);
        System.out.println("O seu novo salário com aumento de 25% é de:"+salA);
    }
}
