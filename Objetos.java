package AulasJavaBasico;

import java.util.Scanner;
public class Objetos {

    public static void main(String[] args) {

       Integer valor = 30;

        System.out.println("Digite um valor: ");
        Scanner leitor = new Scanner(System.in);
        Integer valorDigitado = leitor.nextInt();

        if (valor.equals(valorDigitado)){
            System.out.println("O Valor Digitado é igual!");
        } else {
            System.out.println("O Valor Digitado é diferente!");
        }
    }
}
