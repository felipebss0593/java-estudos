public class Principal05 {
    public static void main(String[] args) {
        Livro livro1 = new Livro();

        livro1.setTitulo("Jantar secreto");
        livro1.setAutor("Raphael Montes");

        Livro livro2 = new Livro();
        livro2.setTitulo("One piece");
        livro2.setAutor("Eichiro Oda");

        livro2.exibirDetalhes();
        livro1.exibirDetalhes();
    }
}
