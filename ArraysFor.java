package AulasJavaBasico;

public class ArraysFor {
    public static void main(String[] args) {

        int[] valores;
        valores = new int[10];

        for (int i = 0; i < valores.length; i++){
            valores[i] = i + 10;
        }

        for (int i = 0; i < valores.length; i++);{
            System.out.println(valores[0]);

        }
    }
}
