package ExercíciosPryscilla;

import java.util.Scanner;

public class ListaAPSEx6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double tamA,lata,litro,galao,preco,preco2,preco3,mistL,mistG;
        System.out.println("Digite a o tamanho da área a ser pintada, em metros quadrados(m²): ");
        tamA = scan.nextDouble();
        litro =tamA/6;
        lata = litro/18;
        if (lata %18 !=0){
            lata += 1; // += é um operador composto de atribuição(total = total +1)
        }
        preco = lata * 80;
        galao = litro/3.6;
        if (galao%3.6 !=0){
            galao += 1;
        }
        preco2 = galao * 25;
        // mistura entre latas e galões!!!!
        mistL = litro/18;
        mistG = ((litro -(mistL*18))/3.6);
        if (litro -(mistL*18)%3.6 !=0){
            mistG += 1;
        }
        preco3 = (mistL*80)+(mistG*25);
        double lataA = (double)(Math.round((lata*100.0)/100.0));
        double precoA = (double)(Math.round((preco*100.0)/100.0));
        double galaoA = (double)(Math.round((galao*100.0)/100.0));
        double preco2A = (double)(Math.round((preco2*100.0)/100.0));
        double mistLA = (double)(Math.round((mistL*100.0)/100.0));
        double mistGA = (double)(Math.round((mistG*100.0)/100.0));
        double preco3A = (double)(Math.round((preco3*100.0)/100.0));

        System.out.println("Caso escolha comprar apenas latas de 18 litros, serão usadas "+lataA+" latas e o preço total será de : "+precoA+" reais.");
        System.out.println("Caso escolha comprar apenas galões de 3,6 litros, serão usados "+galaoA+" galões e o preço total será de : "+preco2A+" reais.");
        System.out.println("Caso escolha comprar latas e galões, serão usadas "+mistLA+" latas, "+mistGA+" galões e o preço total será de : "+preco3A+" reais.");
    }
}