import java.util.ArrayList;

public class Principal1 {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();

        pessoa1.setNome("Felipe");
        pessoa1.setIdade(20);

        Pessoa pessoa2 = new Pessoa();

        pessoa2.setNome("Murrilo");
        pessoa2.setIdade(19);

        Pessoa pessoa3 = new Pessoa();

        pessoa3.setNome("Miguel");
        pessoa3.setIdade(18);

        ArrayList<Pessoa> informaçoesDaPessoa = new ArrayList<>();
        informaçoesDaPessoa.add(pessoa1);
        System.out.println(informaçoesDaPessoa);

        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();
        listaDePessoas.add(pessoa1);
        listaDePessoas.add(pessoa2);
        listaDePessoas.add(pessoa3);

        System.out.println("Tamanho da lista: " + listaDePessoas.size());
        System.out.println("Primeira pessoa da lista: " + listaDePessoas.get(0).getNome());
        System.out.println(listaDePessoas);


    }
}
