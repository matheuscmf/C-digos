package ExercíciosTiago;

import java.util.Scanner;

public class Q40 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double diaT =30.0,qtdDias,quantiaLiq;
        System.out.println("Bem vindo à calculadora salarial da empresa Encanados!");
        System.out.println("Informe a quantidade de dias trabalhados:");
        qtdDias = scan.nextDouble();
        quantiaLiq = (qtdDias*diaT)*0.92; // a quantia líquida pode ser inferida como 92% do valor total bruto//
        System.out.println("A quantia líquida recebida por Vossa Senhoria é de exatos: "+quantiaLiq+" reais.");
        System.out.println("A empresa Encanados agradece sua paciência, volte sempre!");
    }
}
