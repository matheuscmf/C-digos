package ExercíciosPryscilla;

import java.util.Scanner;

public class ListaAPSEx9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double sal1,sal2,sal3;
        System.out.println("Bem vindo funcionário, digite seu salário em reais: ");
        sal1 = scan.nextDouble();
        sal2 = sal1*1.15;
        sal3 = sal2*0.92;
        System.out.println("Seu salário inicial era de: "+sal1+" reais.");
        System.out.println("Seu salário após receber aumento de 15%  era de: "+sal2+" reais.");
        System.out.println("Seu salário final após desconto de impostos é de: "+sal3+" reais.");
    }
}
