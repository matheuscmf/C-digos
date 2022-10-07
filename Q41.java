package ExercíciosTiago;

import java.util.Scanner;

public class Q41 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double horaT,numHora,valorPg;
        System.out.println("Insira o valor da sua hora de trabalho:");
        horaT = scan.nextDouble();
        System.out.println("Insira o número de horas trabalhadas no mês:");
        numHora = scan.nextDouble();
        valorPg = (horaT*numHora)*1.1;   // o valor adicionado é de 10%(0.1)aos 100%(1) do valor calculado,portanto,1.1
        System.out.println("O valor a ser pago a Vossa Senhoria é de: "+valorPg+" reais");
    }
}
