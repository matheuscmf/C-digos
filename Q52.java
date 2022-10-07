package ExercíciosTiago;

import java.util.Scanner;

public class Q52 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a1,a2,a3,premio,p1,p2,p3,aT,r1,r2,r3;

        System.out.println("Digite o valor do prêmio total em reais:");
        premio = scan.nextDouble();
        System.out.println("Digite o valor apostado pelo primeiro jogador: ");
        a1 = scan.nextDouble();
        System.out.println("Digite o valor apostado pelo segundo jogador: ");
        a2 = scan.nextDouble();
        System.out.println("Digite o valor apostado pelo terceiro jogador: ");
        a3 = scan.nextDouble();

        aT = a1+a2+a3;
        p1 = a1/aT;
        p2 = a2/aT;
        p3 = a3/aT;
        r1 = premio*p1;
        r2 = premio*p2;
        r3 = premio*p3;
        System.out.println(String.format("%.2f", r1)+" reais são recebidos pelo jogador1");
        System.out.println(String.format("%.2f", r2)+" reais são recebidos pelo jogador2");
        System.out.println(String.format("%.2f", r3)+" reais são recebidos pelo jogador3");
    }
}