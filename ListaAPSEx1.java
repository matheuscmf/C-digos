package ExercíciosPryscilla;

import java.util.Scanner;

public class ListaAPSEx1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double qtdM,qtdC;
        System.out.println("Digite a quantidade de metros a ser convertida: ");
        qtdM = scan.nextDouble();
        qtdC = qtdM*100;
        System.out.println("A quantidade convertida é : "+qtdC+" centímetros.");
    }
}