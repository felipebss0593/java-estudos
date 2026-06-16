public class Principal02 {
    public static void main(String[] args) {
        idadePessoa infoPessoa1 = new idadePessoa();

        infoPessoa1.setNome("Felipe");
        infoPessoa1.setIdade(19);

        idadePessoa infopessoa2 = new idadePessoa();

        infopessoa2.setNome("Murilo");
        infopessoa2.setIdade(18);

        System.out.println("O nome da pessoa é: " + infoPessoa1.getNome());
        System.out.println("A idade da pessoa é: " + infoPessoa1.getIdade());

        System.out.println("O nome da pessoa é: " + infopessoa2.getNome());
        System.out.println("A idade da pessoa é: " + infopessoa2.getIdade());


        System.out.println(infoPessoa1.getNome() + " tem " + infoPessoa1.getIdade() + " anos.");
        infoPessoa1.verificarIdade();

        System.out.println(infopessoa2.getNome() + " tem " + infopessoa2.getIdade() + " anos.");
        infopessoa2.verificarIdade();
    }
}
