public class ProdutoFisico implements Calculavel{
    private double valorProduto = 10;
    private double valorDesconto = 5;

    public double getValorProduto() {
        return valorProduto;
    }

    public double getValorDesconto() {
        return valorDesconto;
    }

    @Override
    public double calcularPrecoFinal() {
        double precoFinal = valorProduto - valorDesconto;
        System.out.println("O valor final deste produto é: " + precoFinal);
        return precoFinal;
    }


}
