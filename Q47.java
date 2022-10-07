package ExercíciosTiago;

import java.util.Scanner;

public class Q47 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num,m,c,d,u;
        System.out.println("Digite um número inteiro entre 1000 e 9999:");
        num = scan.nextInt();
        m = num /1000 % 10;
        c = num /100 % 10;
        d = num /10 % 10;
        u = num  % 10;
        System.out.println("De acordo com o número inserido: ");
        System.out.println("Seu dígito de milhar é: "+m);
        System.out.println("Seu dígito de centena é: "+c);
        System.out.println("Seu dígito de dezena é: "+d);
        System.out.println("Seu dígito de unidade é: "+u);
    }
}
