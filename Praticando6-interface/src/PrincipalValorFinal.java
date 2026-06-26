public class PrincipalValorFinal {
    public static void main(String[] args) {
        Livro livro = new Livro();
        ProdutoFisico produtoFisico = new ProdutoFisico();

        livro.calcularPrecoFinal();
        produtoFisico.calcularPrecoFinal();
    }
}
