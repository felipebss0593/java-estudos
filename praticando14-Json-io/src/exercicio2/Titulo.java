package exercicio2;
public class Titulo {
    private String nome;
    private int anoDeLancamento;
    private boolean incluindoNoPlano;
    private int duracaoEmMinutos;

    public Titulo(String nome, int anoDeLancamento, boolean incluindoNoPlano, int duracaoEmMinutos) {
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
        this.incluindoNoPlano = incluindoNoPlano;
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public String getNome() {
        return nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public boolean isIncluindoNoPlano() {
        return incluindoNoPlano;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }
}
