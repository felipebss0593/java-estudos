package exercicio3;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Carro carro1 = new Carro();


        ArrayList<Veiculo> veiculos = new ArrayList<>();
        veiculos.add(carro1);

        Veiculo veiculo = veiculos.get(0);

        Carro veiculo1 = (Carro) veiculo;

        for (Veiculo lista: veiculos){
            System.out.println(lista);
        }
    }
}
