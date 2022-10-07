package ExercíciosPryscilla;

import java.util.Scanner;

public class ListaCondEx4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double valorTotal,valorDesconto;
        int codigo;
        System.out.println("Bem vindo a Loja Vende Tudo!");
        System.out.println("Digite o valor total a ser pago :");
        valorTotal = scan.nextInt();
        System.out.println("Favor identificar seu status de comprador: Digite 1 se for cliente comum, " +
                "2 se for funcionário e 3 se for VIP");
        codigo = scan.nextInt();

        if (codigo == 1){
            System.out.println("O valor total a ser pago é de: "+valorTotal +"reais.");
        } else if (codigo == 2) {
            valorDesconto = valorTotal * 0.9;
            System.out.println("O valor total a ser pago é de: "+valorDesconto +"reais.");
        } else if (codigo == 3) {
            valorDesconto = valorTotal * 0.95;
            System.out.println("O valor total a ser pago é de: "+valorDesconto +"reais.");
        } else {
            System.out.println("Por favor digite um número válido entre 1 e 3!! ");
        }
    }
}
