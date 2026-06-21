public class ConversorMoeda implements ConversaoFinanceira {
    @Override
    public double converterDolarParaReal(double valorDolar) {
        double cotacao = 5.50;
        double resultado = valorDolar*cotacao;
        return resultado;
    }
}