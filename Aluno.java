package AulasJavaBasico;
import java.util.Scanner;

public class Aluno{
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        System.out.println("A média das três notas é de : "+ aluno.calcularMedia()+". ");
    }
    double calcularMedia(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite os valores das 3 notas : " );
        double nota1 = scan.nextDouble();
        double nota2 = scan.nextDouble();
        double nota3 = scan.nextDouble();
        double media = (nota1 + nota2 + nota3)/3;
        return media;
    }
}