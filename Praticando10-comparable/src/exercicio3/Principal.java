package exercicio3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("One piece");
        lista.add("Naruto");
        lista.add("Bleach");

        List<String> lista2 = new LinkedList<>();
        lista2.add("Gachiakuta");
        lista2.add("Solo leveling");
        lista2.add("Sakamoto days");

        for (String listaPercorrida: lista){
            System.out.println(listaPercorrida);
        }

        System.out.println("///////////////");

        for (String listaPercorrida: lista2){
            System.out.println(listaPercorrida);
        }
    }
}
