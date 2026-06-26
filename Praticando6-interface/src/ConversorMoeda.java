public class ConversorMoeda implements ConversaoFinanceira {
    @Override
    public void converterDolarParaReal(double valorDolar) {
        double cotacao = 5.50;
        double resultado = valorDolar*cotacao;
        System.out.println("O valor em reais é: R$" + resultado);
    }
}