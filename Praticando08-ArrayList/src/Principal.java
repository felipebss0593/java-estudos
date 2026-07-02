import java.util.ArrayList;

public class Principal extends Produto {
    public Principal(String nome, double preco, int quantidade) {
        super(nome, preco, quantidade);
    }

    public static void main(String[] args) {
        Produto produto1 = new Produto("Garrafa",30,1);
        Produto produto2 = new Produto("Whey", 130,1);
        Produto produto3 = new Produto("Regata", 40,2);

        Produto produtoPerecivel1 = new ProdutoPerecivel("Peixe",20,5);

        ArrayList<Produto> listaDeProdutos = new ArrayList<>();
        listaDeProdutos.add(produto1);
        listaDeProdutos.add(produto2);
        listaDeProdutos.add(produto3);
        listaDeProdutos.add(produtoPerecivel1);

        System.out.println("Tamanho da Lista: " + listaDeProdutos.size());
        System.out.println("Pimeiro produto da lista: " + listaDeProdutos.get(0).getNome());
        for(Produto produto: listaDeProdutos) {
            System.out.println(produto);
        }
    }
}
