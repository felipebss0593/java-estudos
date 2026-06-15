public class Carro {
    String modelo;
    int anoDoCarro;
    String cor;
    int anoAtual;

    void exibirFichaTecnica(){
        System.out.println("Modelo do carro: " + modelo);
        System.out.println("Ano do carro: " + anoDoCarro);
        System.out.println("Cor do carro: " + cor);
    }

    int idade(int ano){
        return anoAtual -= anoDoCarro;
    }
}
