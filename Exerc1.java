package AulasJavaBasico;

import java.util.Scanner;

public class Exerc1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int valor1,valor2,resParcial,qtdNum,resFinal;
        System.out.println("Calculando a soma de um intervalo de números:");
        System.out.println("Digite o menor e o maior valor:");
        valor1 = scan.nextInt();
        valor2 = scan.nextInt();

        qtdNum = (valor2/2);
        resParcial = (valor1 + valor2);
        resFinal = (resParcial * qtdNum);
        System.out.println(resFinal);

    }
}
