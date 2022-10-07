package AulasJavaBasico;

import java.util.Scanner;
public class CondSwitch {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int valor1 = 10;
        int valor2 = 5;
        System.out.println("Insira 1 se quiser somar ");
        System.out.println("Insira 2 se quiser subtrair ");
        System.out.println("Insira 3 se quiser multiplicar ");
        System.out.println("Insira 4 se quiser dividir ");

        int operacao = leitor.nextInt();
        switch (operacao){
            case 1:
                int soma = valor1 + valor2;
                System.out.println("Valor da soma: "+ soma);
                break;
            case 2:
                int subtracao = valor1 + valor2;
                System.out.println("Valor da subtracao: "+ subtracao);
                break;
            case 3:
                int multiplicacao = valor1 + valor2;
                System.out.println("Valor da multiplicacao: "+ multiplicacao);
                break;
            case 4:
                int divisao = valor1 / valor2;
                System.out.println("Valor da divisao: "+ divisao);
                break;
            default:
                System.out.println("Operação impossível de ser realizada");
        }
    }
}
