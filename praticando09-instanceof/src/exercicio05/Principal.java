package exercicio05;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(10);
        Quadrado quadrado = new Quadrado(10);

        ArrayList<Forma> listaDeFormas = new ArrayList<>();
        listaDeFormas.add(circulo);
        listaDeFormas.add(quadrado);


        for (Forma calcularArea: listaDeFormas) {
            double area = calcularArea.calcularArea();

            System.out.println(area);
        }

    }
}
