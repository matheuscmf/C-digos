package ExercíciosTiago;

import java.util.Scanner;

public class Q48 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int num,h,m,s,resto;

            System.out.println("Digite um valor em segundos:");
            num = scan.nextInt();

            h = num / 3600;
            resto = num % 3600;
            m = resto /60;
            s = resto % 60;

            System.out.println("De acordo com a quantidade de segundos inserida: ");
            System.out.println("O número inserido contém: "+h+" horas, "+m+" minutos e "+s+" segundos.");
        }

    }
