package ExercíciosPryscilla;

import java.util.Scanner;

public class ListaAPSEx7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double pratoM,valorP;
        System.out.println("Bem vindo ao restaurante Bem-Bão!");

        System.out.println("Por favor informe o peso do prato montado em quilos: ");

        pratoM = scan.nextDouble();
        valorP = pratoM*12.0;

        System.out.println("O valor total gasto foi de: "+valorP+" reais.");
    }
}
