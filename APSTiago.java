package ExercíciosTiago;

import java.util.Scanner;

public class APSTiago {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int digitos,dv1,dv2,menu;
        System.out.println("Bem vindo ao Identificador de CPFs,por favor escolha a operação a ser realizada:");
        System.out.println(" Digite 1 para calcular o dígito verificador do seu CPF:");
        System.out.println(" Digite 2 para obter informações sobre o desenvolvedor ");
        System.out.println(" Digite 3 para sair do Identificador de CPFs ");

        menu = scan.nextInt();
        if (menu == 1){
            ;
        } else if (menu == 2) {
            System.out.println("Informações sobre o desenvolvedor: ");
            System.out.println(" Matrícula: 1-2019113380 ");
            System.out.println("Nome: Matheus Marques Albuquerque ");
            System.out.println(" Conatus est clavis ad successus. ");
        } else if (menu == 3) {


        } else{
            System.out.println("por favor digite um número válido de 1 a 3.");

//        digitos = scan.nextInt();
//        System.out.println(digitos);
    }
}
}