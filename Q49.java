package ExercíciosTiago;

import java.util.Scanner;

public class Q49 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int h,m,s,hf,mf,sf,horas,minutos,segundos,duracaoExp,resto;

        System.out.println("Digite o horário do início do experimento em horas, minutos e segundos, respectivamente:");

        h = scan.nextInt();
        m = scan.nextInt();
        s = scan.nextInt();

        System.out.println("Digite o tempo do duração do experimento, em segundos:");

        duracaoExp = scan.nextInt();
        horas = duracaoExp / 3600;
        resto = duracaoExp % 3600;
        minutos = resto / 60;
        segundos = resto % 60;
        hf = h+horas;
        mf = m+minutos;
        sf = s+segundos;

        System.out.println("A experiência terminará às "+hf+" horas, "+mf+" minutos e "+sf+" segundos.");
    }
}
