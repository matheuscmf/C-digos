package ExercíciosTiago;

import java.util.Scanner;

public class Q17 {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    double comC,comP;
    System.out.println("Digite o valor do comprimento em centímetros:");
    comC = scan.nextDouble();
    comP = comC/2.54;
    System.out.println("O valor convertido em polegadas é: "+comP);
}
}
