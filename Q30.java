package ExercíciosTiago;

import java.util.Scanner;

public class Q30 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double real,dolar;
        System.out.println("Digite um valor em reais(R$):");
        real = scan.nextDouble();
        dolar = real/4.66;
        System.out.println("De acordo com a cotação do dólar hoje,você tem exatamente :"+dolar+" dólares!");
    }
}
