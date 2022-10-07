package ExercíciosTiago;

import java.util.Scanner;

public class Q31 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num,ant,suc;
        System.out.println("Digite um número inteiro:");
        num = scan.nextInt();
        ant = num -1;
        suc = num +1;
        System.out.println("Os valores do número digitado, seu antecessor e sucessor são,respectivamente,estes:");
        System.out.println(num+", "+ant+", "+suc);

    }
}
