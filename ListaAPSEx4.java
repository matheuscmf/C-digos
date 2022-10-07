package ExercíciosPryscilla;

import java.util.Scanner;

public class ListaAPSEx4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int tamArea,latas,preco;
        System.out.println("Digite o tamanho da área a ser pintada, em metros quadrados: ");

        tamArea = scan.nextInt();
        //se tamArea = Litros*3 e qtdLata = 18 litros logo uma lata cobre 54 metros quadrados;

        if (tamArea % 54 == 0){
            latas = tamArea /54;
        }else
            latas = (tamArea/54)+1;
        preco = latas * 80;     // preço da lata é de 80 reais.
        System.out.println("O total de latas usadas é: "+latas);
        System.out.println("O preço final é de: "+preco+" reais");
    }
}