public class Livro implements Calculavel{
    private double valorLivro = 30;
    private double valorDesconto = 10;

    public double getValorLivro() {
        return valorLivro;
    }

    public double getValorDesconto() {
        return valorDesconto;
    }

    @Override
    public double calcularPrecoFinal() {
        double precoFinal = valorLivro - valorDesconto;
        System.out.println("O valor do preço final deste livro é: " + precoFinal);
        return precoFinal;
    }

}
