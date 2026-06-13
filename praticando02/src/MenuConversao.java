import java.util.Scanner;

public class MenuConversao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== MENU ===");
        System.out.println("1 - Converter metros para centímetros.");
        System.out.println("2 - Converter horas para minutos.");
        System.out.println("3 - Sair.");
        System.out.println("Escolha uma opção: ");
        int numero = scanner.nextInt();

        if(numero == 1) {
            System.out.println("Digite os metros: ");
            int metro = scanner.nextInt();
            System.out.println("Resultado: " + metro*100 + " centímetros");
        }else if(numero == 2) {
            System.out.println("Digite as horas: ");
            int hora = scanner.nextInt();
            System.out.println("Resultado: " + hora*60 + " minutos");
        }else if(numero == 3) {
            System.out.println("Programa encerrado.");
        }else {
            System.out.println("Você digitou um número errado, tente novamamente: ");
            numero = scanner.nextInt();
        }

    }
}
