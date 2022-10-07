package ExercíciosTiago;

import java.util.Scanner;

public class Q46 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número inteiro :");
        int num = scan.nextInt();
        System.out.println("O número digitado foi: "+num);
        System.out.println("Seu inverso é: "+inversao(num,0));

    }

    private static int inversao(int n, int total) {
        if(n==0)
            return total;
        else return inversao(n/10,total*10+n%10);

    }
}
