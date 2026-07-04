package exercicio05;

public class Circulo implements Forma{

    private double raio;

    public double getRaio() {
        return raio;
    }

    public Circulo(double raio){
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }
}

