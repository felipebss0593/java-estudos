public class Principal3 {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica();

        minhaMusica.titulo = "Sonhos e escuridão";
        minhaMusica.artista = "M4rkim";
        minhaMusica.anoDeLancamento = 2023;

        minhaMusica.exibeFichaTecnica();
        minhaMusica.avalia(10);
        minhaMusica.avalia(5);
        minhaMusica.avalia(7);
        System.out.println("Total de avaliações: " + minhaMusica.totalAvaliacoes);
        System.out.println("Soma das avaliações: " + minhaMusica.somaDasAvaliacao);
        System.out.println("Média das notas: " + minhaMusica.pegaMedia());
    }
}
