package AulasJavaBasico;

public class Metodos {
    public static void main(String[] args) {
        String msg = "Hello Javeiros";
        imprimeMsg(msg);
        System.out.println(soma(5,15));
    }
    public static void imprimeMsg(String msg){
        System.out.println(msg);
    }
    public static int soma(int valor1, int valor2){
        return valor1 + valor2;
    }
}
