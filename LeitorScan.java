package AulasJavaBasico;

import java.util.Scanner;
public class LeitorScan {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um valor inteiro abaixo: ");
        int ValorDigitado = leitor.nextInt();
        System.out.println("O valor digitado foi : "+ ValorDigitado);

    }
}
