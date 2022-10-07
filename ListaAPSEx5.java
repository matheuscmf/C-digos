package ExercíciosPryscilla;

import java.util.Scanner;

public class ListaAPSEx5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double tamArq,velInt,tempoGasto;
        System.out.println("Digite o tamanho do arquivo para download em megabytes(MB): ");
        tamArq = scan.nextDouble();

        System.out.println("Digite a velocidade do link da internet em megabits por segundo(Mbps): ");
        velInt = scan.nextDouble();

        tempoGasto = (tamArq*8)/(velInt*60);// 1 minuto = 60 segundos, 1 byte(B) = 8 bits(b).
        System.out.println("O tempo aproximado do download do arquivo é de: "+tempoGasto+" minutos.");
    }
}