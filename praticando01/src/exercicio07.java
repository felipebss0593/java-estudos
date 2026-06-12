//7.06

public class exercicio07 {
    public static void main(String[] args) {
        double precoOriginal = 20.50;
        double percentualDeDesconto = 5;
        double calculoDesconto = precoOriginal *0.05;
        double desconto = precoOriginal - calculoDesconto;
        double valorFinal = desconto;

        System.out.println(String.format("O preço original é: %.2f$.\nmas com o desconto de 5 porcento fica no valor de %.2f$.", precoOriginal,valorFinal));
    }
}
