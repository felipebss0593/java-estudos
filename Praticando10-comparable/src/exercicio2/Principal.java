package exercicio2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Principal {
    public static void main(String[] args) {
        Titulo titulo1 = new Titulo("Jujutso kaisen");
        Titulo titulo2 = new Titulo("Demon slayer");
        Titulo titulo3 = new Titulo("Solo leveling");

        ArrayList<Titulo> listaDeTitulos = new ArrayList<>();
        listaDeTitulos.add(titulo1);
        listaDeTitulos.add(titulo2);
        listaDeTitulos.add(titulo3);

        Collections.sort(listaDeTitulos);

        for(Titulo listaPercorrida: listaDeTitulos){
            System.out.println(listaPercorrida.getNome());
        }
    }
}
