public class Musica {
    String titulo;
    String artista;
    int anoDeLancamento;
    double somaDasAvaliacao;
    int totalAvaliacoes;

    void exibeFichaTecnica(){
        System.out.println("Nome da música: " + titulo);
        System.out.println("Nome do artista: " + artista);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
    }

    void avalia(double nota){
        somaDasAvaliacao += nota;
        totalAvaliacoes++;
    }

    double pegaMedia(){
        return somaDasAvaliacao / totalAvaliacoes;
    }


}
