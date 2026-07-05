package exercicio1;

import java.util.ArrayList;
import java.util.Collections;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Integer> listaDeNumeros = new ArrayList<>();
        listaDeNumeros.add(2);
        listaDeNumeros.add(1);
        listaDeNumeros.add(5);
        listaDeNumeros.add(4);
        listaDeNumeros.add(3);

        Collections.sort(listaDeNumeros);
        System.out.println(listaDeNumeros);

    }
}