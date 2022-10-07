package AulasJavaBasico;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class ListaArray {
    public static void main(String[] args) {

        List<String>lista = new ArrayList<>();
        lista.add("Carro");
        lista.add("Moto");
        lista.add("Bicicleta");
        lista.add("Avião");

        for (String TipoDeVeiculo: lista) {
            System.out.println(lista);
        }
    }
}
