package ExercíciosPryscilla;

import java.util.Scanner;

public class ListaCondEx2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int homem1,homem2,mulher1,mulher2,soma = 0,produto= 0;
        System.out.println("Digite a idade do primeiro homem: ");
        homem1 = scan.nextInt();
        System.out.println("Digite a idade do segundo homem: ");
        homem2 = scan.nextInt();
        System.out.println("Digite a idade do primeira mulher: ");
        mulher1 = scan.nextInt();
        System.out.println("Digite a idade do segunda mulher: ");
        mulher2 = scan.nextInt();
        if (homem1 > homem2 && mulher1 > mulher2){
        soma = homem1 + mulher2;
        produto = homem2 * mulher1;
        } else if (homem1 > homem2 && mulher2 > mulher1){
            soma = homem1 + mulher1;
            produto = homem2 * mulher2;
        } else if (homem2 > homem1 && mulher1 > mulher2){
            soma = homem2 + mulher2;
            produto = homem1 * mulher1;
        } else if (homem2 > homem1 && mulher2 > mulher1){
            soma = homem2 + mulher1;
            produto = homem1 * mulher2;
        } else {
            System.out.println("Digite valores válidos!");
        }
        System.out.println("A soma do homem mais velho com a mulher mais nova é: "+ soma );
        System.out.println("O produto do homem mais velho com a mulher mais nova é: "+produto );
}
}
