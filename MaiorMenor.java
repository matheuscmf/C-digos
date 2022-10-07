package AulasJavaBasico;
import java.util.Scanner;
public class MaiorMenor {
    public static void main(String[] args) {
        int v1;
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um valor: ");
        v1 = scan.nextInt();
        if(v1>50){
            System.out.println("MAIOR QUE 50 ELE É!");
        }else {
            System.out.println("ESTE MAIOR NÃO É QUE 50!");
        }
    }
}
