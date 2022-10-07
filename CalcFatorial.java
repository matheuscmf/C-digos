package AulasJavaBasico;

import java.util.Scanner;

public class CalcFatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x,f;
        System.out.println("Digite o valor inteiro para calcular seu resultado fatorial: ");
        x = scan.nextInt();
        f = x;
        while(x>1){
            f = f*(x-1);
            x--;
        }
        System.out.println("o valor fatorial final do número inserido é: "+ f);
    }
}
