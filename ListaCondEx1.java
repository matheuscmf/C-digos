package ExercíciosPryscilla;

import java.util.Scanner;

public class ListaCondEx1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double salarioFixo,numeroCarros,comissaoFixa,valorTotalVendas,salarioFinal;
        System.out.println(" Bem vindo a Revendedora de Carros Usados Compre Bem ");
        System.out.println(" Vendedor, por favor digite a quantidade de carros vendidos : ");
        numeroCarros = scan.nextDouble();
        System.out.println(" Por favor digite seu salário fixo : ");
        salarioFixo = scan.nextDouble();
        System.out.println(" Por favor digite o valor total de suas vendas em reais : ");
        valorTotalVendas = scan.nextDouble();
        System.out.println(" Vendedor, por favor digite o valor recebido por carro vendido : ");
        comissaoFixa = scan.nextDouble();

        salarioFinal = salarioFixo + comissaoFixa + (0.05 * valorTotalVendas) ;
        System.out.println("Seu salário final, vendedor, é de : "+ salarioFinal + " reais.");
    }
}
