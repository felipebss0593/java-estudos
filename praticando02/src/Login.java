import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do usuário:");
        String nome = scanner.nextLine();

        if(nome.equals("admin")) {
            System.out.println("Acesso permitdo.");
        }else {
            System.out.println("Acesso negado.");
        }
    }
}
