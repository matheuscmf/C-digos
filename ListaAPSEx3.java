package ExercíciosPryscilla;

import java.util.Scanner;

public class ListaAPSEx3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n1,n2,prod;
        double n3,cubo,soma;
        System.out.println("Digite dois números inteiros e um número real, respectivamente: ");
        n1 = scan.nextInt();
        n2 = scan.nextInt();
        n3 = scan.nextDouble();
        prod = (2*n1)*(n2/2);
        soma = (3*n1)+n3;
        cubo = (n3*n3*n3);
        System.out.println("O produto do dobro do primeiro com metade do segundo é: "+prod);
        System.out.println("a soma do triplo do primeiro com o terceiro é: "+soma);
        System.out.println("o terceiro elevado ao cubo é: "+cubo);
    }
}
