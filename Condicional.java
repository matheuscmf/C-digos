package AulasJavaBasico;

import java.util.Scanner;
public class Condicional {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um valor inteiro: ");
        int valor1 = leitor.nextInt();
        if (valor1 == 0){
            System.out.println("O valor digitado foi 0");
        } else if (valor1 >=0) {
            System.out.println("O valor digitado foi positivo!");
        } else  {
            System.out.println("o valor digitado foi negativo!");
        }

    }
}
