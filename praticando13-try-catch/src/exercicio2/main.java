package exercicio2;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String senha;
        try {
            System.out.println("Digite a senha que deseja criar: ");
            senha = scanner.nextLine();

            if (senha.length() < 8) {
                throw new SenhaInvalidaException("A senha não pode ter menos de 8 caracteres.");
            }

            if (senha.length() >= 8) {
                System.out.println("Senha criada com sucesso.");
            }
        } catch (SenhaInvalidaException e) {
            System.out.println(e.getMessage());
        }
    }
}
