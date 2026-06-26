public class Pessoa implements Saudacao{
    @Override
    public void cumprimentar(String nome) {
        System.out.println("Olà " + nome);
    }
}
