package ExercíciosTiago;

import java.util.Scanner;

public class Q43 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double valorT,valorP,valorD,comV,comP; // Valor total,parcelado,com desconto,Comissão a vista, Comissão a prazo//
        System.out.println("Insira o valor total da venda:");
        valorT = scan.nextDouble();
        valorD = valorT*0.9;
        valorP = valorT/3;
        comV = valorD*0.95;
        comP = valorT*0.95;
        System.out.println("De acordo com o valor total de venda:");
        System.out.println("Valor com desconto de 10%: "+valorD+" reais.");
        System.out.println("Valor da parcela(Parcelamento em 3x): "+valorP+" reais.");
        System.out.println("Comissão do vendedor,caso venda à vista: "+comV+" reais.");
        System.out.println("Comissão do vendedor,caso venda à prazo: "+comP+" reais.");


    }
}
