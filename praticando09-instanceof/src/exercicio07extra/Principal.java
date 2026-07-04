package exercicio07extra;

public class Principal {
    public static void main(String[] args) {
        Funcionario funcionario = new Gerente();
        Funcionario funcionario2 = new Funcionario();

        if(funcionario2 instanceof Gerente) {
            Gerente funcionario1 = (Gerente) funcionario;
            funcionario1.gerenciar();
        }
    }
}
