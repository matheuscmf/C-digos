package ExercíciosTiago;

import java.util.Scanner;

public class Q53 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double c,l,p,ml,custoT;

        System.out.println("Digite o comprimento e largura do terreno em metros, respectivamente:");
        c = scan.nextDouble();
        l = scan.nextDouble();

        System.out.println("Digite o valor do preço do metro da tela em reais:");

        p = scan.nextDouble();
        ml = (c+l)*2;
        custoT = p*ml;

        System.out.println("O custo total para o cercamento do terreno é: "+custoT+" reais.");
    }
}
