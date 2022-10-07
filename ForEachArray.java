package AulasJavaBasico;

public class ForEachArray {
    public static void main(String[] args) {

        int[] valores = {10,20,30,40,50};

        String[] nomes = {"Ricardo","João","Tiago","Lucas"};

        for (int val : valores){
            System.out.println(val);
        }

        for (String name: nomes){
            System.out.println(name);
        }
    }
}
