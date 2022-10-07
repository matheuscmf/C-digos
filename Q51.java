package ExercíciosTiago;

import java.util.Scanner;

public class Q51 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double x,y,dist;
        System.out.println("Insira os valores das coordenadas x e y, respectivamente:");
        x = scan.nextDouble();
        y = scan.nextDouble();
        dist = Math.sqrt((Math.pow(x,2)+Math.pow(y,2)));
        System.out.println("O valor da distância de origem é: "+dist);
    }
}
