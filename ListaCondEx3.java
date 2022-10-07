package ExercíciosPryscilla;

import java.util.Scanner;

public class ListaCondEx3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int qtdMax,qtdMin,qtdAtual,qtdMedia;
        System.out.println("Digite a quantidade atual do produto no estoque :");
        qtdAtual = scan.nextInt();
        System.out.println("Digite a quantidade máxima possível do produto no estoque :");
        qtdMax = scan.nextInt();
        System.out.println("Digite a quantidade mínima possível do produto no estoque :");
        qtdMin = scan.nextInt();
        qtdMedia = (qtdMax + qtdMin)/2;
        if (qtdAtual >= qtdMedia){
            System.out.println("Não efetuar compra!");
        } else{
            System.out.println("Efetuar compra!");
        }
    }
}
