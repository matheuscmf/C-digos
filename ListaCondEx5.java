package ExercíciosPryscilla;

import java.util.Scanner;

public class ListaCondEx5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int opcao1,numeroEscolhido,conversao;
        System.out.println("Bem vindo ao Programa de Conversão de Base Numérica!");
        System.out.println("Por favor escolha a conversão de base desejada: ");
        System.out.println("Opção 1 : Decimal para Hexadecimal ");
        System.out.println("Opção 2 : Hexadecimal para Decimal ");
        System.out.println("Opção 3 : Decimal para Octal ");
        System.out.println("Opção 4 : Octal para Decimal ");
        opcao1 = scan.nextInt();
        if(opcao1 == 1){
            numeroEscolhido = scan.nextInt();

        }
    }
}
