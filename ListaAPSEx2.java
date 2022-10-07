package ExercíciosPryscilla;

import java.util.Scanner;

public class ListaAPSEx2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int ladoQ,dobroareaQ;
        System.out.println("Digite o tamanho do lado do quadrado: ");
        ladoQ = scan.nextInt();
        dobroareaQ = 2*(ladoQ*ladoQ);
        System.out.println("O valor do dobro da área do quadrado é: "+dobroareaQ);
    }
}
