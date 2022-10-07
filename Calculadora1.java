package AulasJavaBasico;

import java.util.Scanner;

public class Calculadora1 {
    public static void main(String[] args) {
        double n1,n2,resultado;
        int op;
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite por favor a operação desejada:(1=soma, 2=subtração,3=multiplicação,4=divisão): ");
        op = scan.nextInt();
        if (op == 1){
            System.out.println("Digite os 2 números para somá-los: ");
            n1 = scan.nextDouble();
            n2 = scan.nextDouble();
            resultado = n1+n2;
            System.out.println("O resultado da soma é: " +resultado );
        } else if (op == 2) {
            System.out.println("Digite os 2 números para subtraí-los: ");
            n1 = scan.nextDouble();
            n2 = scan.nextDouble();
            resultado = n1-n2;
            System.out.println("O resultado da subtração é: " +resultado );
        } else if (op == 3) {
            System.out.println("Digite os 2 números para multiplicá-los: ");
            n1 = scan.nextDouble();
            n2 = scan.nextDouble();
            resultado = n1*n2;
            System.out.println("O resultado da multiplicação é: " +resultado );
        } else if (op == 4) {
            System.out.println("Digite os 2 números para dividí-los: ");
            n1 = scan.nextDouble();
            n2 = scan.nextDouble();
            resultado = n1/n2;
            System.out.println("O resultado da divisão é: " +resultado );
        }else {
            System.out.println("Por favor digite um número válido entre 1 e 4!");
    }
}
}
