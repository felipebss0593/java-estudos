package exercicio05;

public class Quadrado implements Forma{

    private double lado;

    public double getLado() {
        return lado;
    }

    public Quadrado(double lado){
        this.lado = lado;
    }


    @Override
    public double calcularArea() {
        return lado * lado;
    }
}
