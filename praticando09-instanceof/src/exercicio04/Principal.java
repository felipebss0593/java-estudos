package exercicio04;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Teclado",50);
        Produto produto2 = new Produto("Mouse", 80);
        Produto produto3 = new Produto("Monitor",400);

        ArrayList<Produto> listaDeProdutos = new ArrayList<>();
        listaDeProdutos.add(produto1);
        listaDeProdutos.add(produto2);
        listaDeProdutos.add(produto3);

        double somaDosProdutos = 0;

        for (Produto mediaProduto: listaDeProdutos) {
            somaDosProdutos += mediaProduto.getPreco();

        }
        double media = somaDosProdutos/listaDeProdutos.size();

        System.out.println("A média dos preços dos produtos é: " + media);
    }
}
