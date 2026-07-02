package exercicio2;

public class Principal {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        Animal animal = (Animal) cachorro;

        System.out.println(animal);
    }
}
