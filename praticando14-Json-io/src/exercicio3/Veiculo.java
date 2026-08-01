package exercicio3;

public class Veiculo {
    private String nome;
    private int anoDoVeiculo;
    private double valorDoVeiculo;
    private String nomeDoDono;

    public Veiculo(String nome, int anoDoVeiculo, double valorDoVeiculo, String nomeDoDono) {
        this.nome = nome;
        this.anoDoVeiculo = anoDoVeiculo;
        this.valorDoVeiculo = valorDoVeiculo;
        this.nomeDoDono = nomeDoDono;
    }

    public String getNome() {
        return nome;
    }

    public int getAnoDoVeiculo() {
        return anoDoVeiculo;
    }

    public double getValorDoVeiculo() {
        return valorDoVeiculo;
    }

    public String getNomeDoDono() {
        return nomeDoDono;
    }
}
